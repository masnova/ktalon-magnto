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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.click(findTestObject('Object Repository/Page_Home Page/button_Create New Account'))

WebUI.setText(findTestObject('Object Repository/Page_Create New Account/input_First Name'), 'ehan')

WebUI.setText(findTestObject('Object Repository/Page_Create New Account/input_Last Name'), 'nova')

WebUI.click(findTestObject('Object Repository/Page_Create New Account/checkbox_is Subscribed'))

WebUI.setText(findTestObject('Object Repository/Page_Create New Account/input_Email'), 'asal@aja.oke')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create New Account/input_Password'), 'Qo9/CJGmAVxNHEJKs0WSRg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create New Account/input_Password Confirm'), 'Qo9/CJGmAVxNHEJKs0WSRg==')

WebUI.click(findTestObject('Page_Create New Account/button_Create an Account'))

WebUI.waitForPageLoad(2)

