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

def store_name = WebUI.callTestCase(findTestCase('Shopify/TC02_CreateStoreTest'), [('btn_login_account_gg') : findTestObject('Login Admin Shopify/btn_login_account_gg')
        , ('btn_login_account_fb') : findTestObject('Login Admin Shopify/btn_login_account_fb'), ('btn_login_account_apple') : findTestObject('Login Admin Shopify/btn_login_account_apple')
        , ('btn_account_login') : findTestObject('Login Admin Shopify/btn_account_login'), ('btn_continue_email') : findTestObject('Login Admin Shopify/btn_continue_email')
        , ('input_account_password') : findTestObject('Login Admin Shopify/input_account_password'), ('input_account_email') : findTestObject('Login Admin Shopify/input_account_email')
        , ('radio_client_store') : findTestObject('Create Store Test Shopify/radio_client_store'), ('radio_test_store') : findTestObject('Create Store Test Shopify/radio_test_store')
        , ('input_store_url') : findTestObject('Create Store Test Shopify/input_store_url'), ('input_store_name') : findTestObject('Create Store Test Shopify/input_store_name')
        , ('radio_latest_build') : findTestObject('Create Store Test Shopify/radio_latest build'), ('radio_developer_store') : findTestObject('Create Store Test Shopify/radio_developer_preview')
        , ('btn_create_new_store') : findTestObject('Create Store Test Shopify/btn_create_new_store'), ('div_store_url_unavailable') : findTestObject('Create Store Test Shopify/div_store_url_unavailable')
        , ('radio_test_data') : findTestObject('Create Store Test Shopify/radio_test_data'), ('radio_empty_data') : findTestObject('Create Store Test Shopify/radio_empty_data')
        , ('img_logo_shopify') : findTestObject('Login Admin Shopify/img_logo_shopify'), ('div_select_account') : findTestObject('Create Store Test Shopify/div_select_account')], 
    FailureHandling.STOP_ON_FAILURE)

//    WebUI.openBrowser(GlobalVariable.url_app_alireview)
InstallAppAliReview(store_name)

WebUI.click(div_select_account, FailureHandling.OPTIONAL)



def InstallAppAliReview(def store_name) {
	
    WebUI.navigateToUrl(GlobalVariable.url_app_alireview)

    WebUI.sendKeys(input_store_name, store_name)
	
    WebUI.click(btn_login_store_name)
	
	WebUI.click(div_select_account, FailureHandling.OPTIONAL)
	
    WebUI.click(btn_install_app)
}

