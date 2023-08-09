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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.entity.global.GlobalVariableEntity

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//WebUI.openBrowser('https://auto2023.myshopify.com')
//WebUI.maximizeWindow()
//WebUI.click(findTestObject('Object Repository/Shopify/a_page_contact'))
//WebUI.sendKeys(findTestObject('Object Repository/Shopify/input_Email'), 'dunglq@gmail.com')
//WebUI.setText(findTestObject('Object Repository/Shopify/textarea_comment'), 'hello')
//WebUI.selectOptionByValue(findTestObject('Object Repository/Shopify/select_name'), 'firegroup', false)
def email = 'dungql@gmail.com'
def comment = 'hello'
def name_value = 'firegroup'

WebUI.openBrowser(GlobalVariable.Url)
WebUI.maximizeWindow()
WebUI.click(contact)
//WebUI.sendKeys(input_email, email)
//WebUI.setText(textarea_coment,comment)
//WebUI.selectOptionByValue(select_name,name_value, false)
//WebUI.click(btn_send)
//WebUI.delay(15)
//WebUI.verifyElementPresent(icon_success, 15)
WebUI.verifyElementPresent(h1_iframe_tester,15)
