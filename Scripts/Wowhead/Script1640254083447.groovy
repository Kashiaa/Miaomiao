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

WebUI.navigateToUrl('https://fr.wowhead.com/')

WebUI.waitForElementPresent(findTestObject('Page_Wowhead  Trouvez la femme de Mankrik g_4b955e/button_Jaccepte_cookies'), 
    15)

WebUI.click(findTestObject('Page_Wowhead  Trouvez la femme de Mankrik g_4b955e/button_Jaccepte_cookies'))

WebUI.waitForElementPresent(findTestObject('Page_Wowhead  Trouvez la femme de Mankrik g_4b955e/button_Refuser_notifs'), 
    5)

WebUI.click(findTestObject('Page_Wowhead  Trouvez la femme de Mankrik g_4b955e/button_Refuser_notifs'))

WebUI.setText(findTestObject('Page_Wowhead  Trouvez la femme de Mankrik g_4b955e/Search_bar'), 'Lardeur')

WebUI.sendKeys(findTestObject('Page_Wowhead  Trouvez la femme de Mankrik g_4b955e/Search_bar'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Page_Lardeur - Recherche Wowhead/a_Button_Lardeur'), 15)

WebUI.click(findTestObject('Page_Lardeur - Recherche Wowhead/a_Button_Lardeur'))

WebUI.waitForElementPresent(findTestObject('Page_Lardeur - PNJ - World of Warcraft/a_Chahuteurs de cadavre'), 15)

WebUI.click(findTestObject('Object Repository/Page_Lardeur - PNJ - World of Warcraft/a_Chahuteurs de cadavre'))

WebUI.click(findTestObject('Page_Chahuteurs de cadavre - Objet - World _4f6cc4/td_Détails_Chahuteurs de cadavre'))

WebUI.verifyElementPresent(findTestObject('Page_Chahuteurs de cadavre - Objet - World of Warcraft/Chahuteurs de cadavre'), 
    5)

WebUI.verifyElementPresent(findTestObject('Page_Chahuteurs de cadavre - Objet - World of Warcraft/span_Niveau dobjet 57'), 
    5)

WebUI.verifyElementPresent(findTestObject('Page_Chahuteurs de cadavre - Objet - World of Warcraft/Lié quand ramassé'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Chahuteurs de cadavre - Objet - World of Warcraft/Pieds'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Chahuteurs de cadavre - Objet - World of Warcraft/span_Tissu'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Chahuteurs de cadavre - Objet - World of Warcraft/span_Armure  2'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Chahuteurs de cadavre - Objet - World of Warcraft/Intelligence'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Chahuteurs de cadavre - Objet - World of Warcraft/Endurance'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Chahuteurs de cadavre - Objet - World of Warcraft/span_Augmente votre score de hte de 13 (0.39 au niveau 70)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Chahuteurs de cadavre - Objet - World of Warcraft/Versatilité'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Chahuteurs de cadavre - Objet - World of Warcraft/Au_niveau'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Chahuteurs de cadavre - Objet - World of Warcraft/Durabilité'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Chahuteurs de cadavre - Objet - World of Warcraft/Niveau'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Chahuteurs de cadavre - Objet - World of Warcraft/Prix_de_Vente'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

