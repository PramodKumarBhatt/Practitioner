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

WebUI.navigateToUrl('https://www.airbnb.co.in/')

WebUI.click(findTestObject('Object Repository/Airbnb_OR/Page_Airbnb  Holiday rentals, cabins, beach_81905a/svg'))

WebUI.setText(findTestObject('Object Repository/Airbnb_OR/Page_Airbnb  Holiday rentals, cabins, beach_81905a/input_Where_query'), 
    city)

WebUI.click(findTestObject('Object Repository/Airbnb_OR/Page_Airbnb  Holiday rentals, cabins, beach_81905a/b_Atlanta'))

WebUI.click(findTestObject('Object Repository/Airbnb_OR/Page_Airbnb  Holiday rentals, cabins, beach_81905a/button_22'))

WebUI.click(findTestObject('Object Repository/Airbnb_OR/Page_Airbnb  Holiday rentals, cabins, beach_81905a/div_Add dates'))

WebUI.click(findTestObject('Object Repository/Airbnb_OR/Page_Airbnb  Holiday rentals, cabins, beach_81905a/div_Check out'))

WebUI.click(findTestObject('Object Repository/Airbnb_OR/Page_Airbnb  Holiday rentals, cabins, beach_81905a/button_27'))

WebUI.click(findTestObject('Object Repository/Airbnb_OR/Page_Airbnb  Holiday rentals, cabins, beach_81905a/div_Search'))

WebUI.click(findTestObject('Object Repository/Airbnb_OR/Page_Rooms on Rent Atlanta - Airbnb Atlanta_6f5dd6/span_Over 1,000 places in Atlanta'))

WebUI.verifyTextPresent(expectedResult, false)

//Print( WebUI.concatenate(((['Bhatt', 'Kumar', 'Pramod']) as String[])))
WebUI.closeBrowser()

