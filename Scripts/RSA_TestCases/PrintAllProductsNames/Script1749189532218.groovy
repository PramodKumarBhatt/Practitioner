import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('RSA_TestCases/Login_Valid'), [:], FailureHandling.STOP_ON_FAILURE)

List allProd = WebUI.findWebElements(findTestObject('RSA_OR/Home Page/AllProducts_OR'), 10)


int numOfProd=allProd.size();

println("Total product found on the page::" +  numOfProd)

for(int i=0;i<numOfProd;i++)
{
println(	WebUI.findWebElements(findTestObject('RSA_OR/Home Page/AllProducts_OR +"[" + i + "]"'), 10) )
//	println("Product name is>>>>"+allProd.get(i))
	
}
