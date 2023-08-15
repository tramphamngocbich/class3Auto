import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.SetupTestCase as SetupTestCase
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.entity.global.GlobalVariableEntity as GlobalVariableEntity
import internal.GlobalVariable as GlobalVariable
import oracle.jdbc.proxy.annotation.SetDelegate as SetDelegate
import org.openqa.selenium.Keys as Keys

def email = 'trampnb@fireapps.vn'

def password = 'RigbBhfdqOBGNlJIWM1ClA=='

def store_name = 'storetestdemo'

def rand_store= new Random();
//Create Store test
WebUI.openBrowser(GlobalVariable.url_partner_login)
if (WebUI.verifyElementNotPresent(img_logo_shopify, 10)) {
   LoginAdminShopify(email, password)
}
//WebUI.navigateToUrl(GlobalVariable.url_partner_login)
//
//WebUI.click(div_select_account,FailureHandling.OPTIONAL)

CreateStoreTest(store_name,rand_store)


//Login AdminShopify
def LoginAdminShopify(def email, def password) {
    WebUI.setText(input_account_email, email)

    WebUI.click(btn_continue_email)

    WebUI.setEncryptedText(input_account_password, password)

    WebUI.click(btn_account_login)
}

def CreateStoreTest(def store_name, def rand_store) {
    WebUI.click(radio_test_store)

    WebUI.setText(input_store_name, store_name)

    WebUI.click(radio_latest_build)

    WebUI.click(radio_test_data)

    WebUI.click(btn_create_new_store)
	
	def i=0
	def store_create=store_name
	
	def num_store = 0
    while (WebUI.verifyElementPresent(div_store_url_unavailable,10) == true &&  i< 15) {
		i++
		println(WebUI.verifyElementPresent(div_store_url_unavailable, 15))
		 num_store = rand_store.nextInt(200);
	
       WebUI.setText(input_store_name,''+ num_store)	
		if(WebUI.verifyElementNotPresent(div_store_url_unavailable,10))
		{
			break;
		}
		
		
    }
	WebUI.click(btn_create_new_store)
	
   return store_create+num_store
//   WebUI.closeBrowser()
}

//create store test
//login partner
//WebUI.openBrowser("https://partners.shopify.com/1949917/stores/new")
//WebUI.setText(findTestObject('Object Repository/Login Admin Shopify/input_account_email'), 'trampnb@fireapps.vn')
//WebUI.click(findTestObject('Object Repository/Login Admin Shopify/btn_continue_email'))////form[@id="account_lookup"]/descendant::button[@type="submit"]
//WebUI.setText(findTestObject('Object Repository/Login Admin Shopify/input_account_password'), '12345678')
//WebUI.click(findTestObject('Object Repository/Login Admin Shopify/btn_account_login'))
//
//WebUI.navigateToUrl("https://partners.shopify.com/1949917/stores/new")
//WebUI.click(findTestObject('Object Repository/Create Store Test Shopify/radio_test_store'))
//WebUI.setText(findTestObject('Object Repository/Create Store Test Shopify/input_store_name'), 'store1234_5678')
//WebUI.setText(findTestObject('Object Repository/Create Store Test Shopify/input_store_url'), 'store1234_56728')
//WebUI.click(findTestObject('Object Repository/Create Store Test Shopify/radio_latest build'))
//WebUI.click(findTestObject('Object Repository/Create Store Test Shopify/radio_test_data'))
//WebUI.click(findTestObject('Object Repository/Create Store Test Shopify/btn_create_new_store'))
//WebUI.closeBrowser()