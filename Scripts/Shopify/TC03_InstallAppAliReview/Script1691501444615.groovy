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

def store_name = 'smallstrore03'


def InstallAppAliReview( store_name) {
    WebUI.openBrowser(GlobalVariable.url_app_alireview)
    WebUI.sendKeys(input_store_name, store_name)
	WebUI.click(btn_login_store_name)
	WebUI.callTestCase(findTestCase('Shopify/TC01_LoginAdminShopify'), [('input_account_email') : findTestObject('Login Admin Shopify/input_account_email')
		, ('btn_continue_email') : findTestObject('Login Admin Shopify/btn_continue_email'), ('input_account_password') : findTestObject('Login Admin Shopify/input_account_password')
		, ('btn_account_login') : findTestObject('Login Admin Shopify/btn_account_login'), ('btn_login_account_fb') : findTestObject('Login Admin Shopify/btn_login_account_fb')
		, ('btn_login_account_gg') : findTestObject('Login Admin Shopify/btn_login_account_gg'), ('btn_login_account_apple') : findTestObject('Login Admin Shopify/btn_login_account_apple')],
	FailureHandling.OPTIONAL)
  
	WebUI.click(btn_install_app)
}
InstallAppAliReview( store_name)
