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

WebUI.waitForPageLoad(15)

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.waitForElementPresent(findTestObject('Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'), 15)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.waitForElementPresent(findTestObject('Page_CURA Healthcare Service/a_Login'), 15)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), 'Paloma Blanca')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), 'XS6wHrpNKMo=')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_Demo account_input-group'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_Password_col-sm-8'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Login failed Please ensure the username a_eb55b5'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Please login to make appointment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Login'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_infokatalon.com'))

WebUI.waitForElementPresent(findTestObject('Page_CURA Healthcare Service/i_infokatalon.com_fa fa-facebook fa-fw fa-3x'), 
    15)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_infokatalon.com_fa fa-facebook fa-fw fa-3x'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_infokatalon.com_fa fa-twitter fa-fw fa-3x'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_infokatalon.com_fa fa-dribbble fa-fw fa-3x'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Home'))

WebUI.closeBrowser()

