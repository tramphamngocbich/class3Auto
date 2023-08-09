import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Login account with email
def email = 'trampnb@fireapps.vn'
def password = 'RigbBhfdqOBGNlJIWM1ClA=='

def LoginAdminShopify(email,password) {
	WebUI.setText(input_account_email, email)
	WebUI.click(btn_continue_email)
	WebUI.setEncryptedText(input_account_password, password)
	WebUI.click(btn_account_login)
}
//WebUI.openBrowser(GlobalVariable.url_login_admin_shopify)
LoginAdminShopify(email,password)

/*WebUI.openBrowser("https://storetest0707.myshopify.com/admin")
WebUI.setText(findTestObject('Object Repository/Login Admin Shopify/input_account_email'), 'trampnb@fireapps.vn')
WebUI.click(findTestObject('Object Repository/Login Admin Shopify/btn_continue_email'))////form[@id="account_lookup"]/descendant::button[@type="submit"]
WebUI.setText(findTestObject('Object Repository/Login Admin Shopify/input_account_password'), '12345678')
WebUI.click(findTestObject('Object Repository/Login Admin Shopify/btn_account_login')) */
//WebUI.closeBrowser()
