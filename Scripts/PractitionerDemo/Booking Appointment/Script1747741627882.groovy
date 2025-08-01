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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/Make Appointment Button'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/UserName_TextBox'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/Password_TextBox'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/Login_Button'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/Facility TextBox'), 'Seoul CURA Healthcare Center', 
    true)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/Apply for hospital readmission_Checkbox'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/Healthcare Program_RadioButton'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/Visit Date'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/td_31'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/Comment_TextBox'), 'Hey my appointment')

