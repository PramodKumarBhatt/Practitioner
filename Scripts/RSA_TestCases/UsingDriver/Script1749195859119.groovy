import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import dev.failsafe.internal.util.Assert




WebUI.openBrowser('')
//WebUI.navigateToUrl('https://rahulshettyacademy.com/client')
WebDriver driver=DriverFactory.getWebDriver();
driver.get("https://rahulshettyacademy.com/client")
driver.manage().window().maximize()
driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("bhattpramod123@gmail.com")
driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Tester")
driver.findElement(By.xpath("//input[@id='login']")).click()

List<WebElement> allProdNames=driver.findElements(By.xpath("(//div[@class='card-body']/h5/b)"));

int numOfProd=allProdNames.size();

/*
 * for(WebElement prod:allProdNames) { println(prod.getText())
 * if(prod.getText().equals('ADIDAS ORIGINAL')) {
 * driver.findElement(By.xpath("//div[@class='card-body']/button[2]")).click() }
 * }
 */

String prodName= "IPHONE 13 PRO"  //ZARA COAT 3 //ADIDAS ORIGINAL   //IPHONE 13 PRO
for(int i=0;i<numOfProd;i++)
{
	if(allProdNames.get(i).getText().equals(prodName)) 
	{
		driver.findElement(By.xpath("(//div[@class='card-body']/button[2])["+ (i+1) +"]")).click()
	}
}

driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click()

List<WebElement> allProdNameOnCart= driver.findElements(By.xpath("//div[@class='cartSection']/h3"));

int numOfProdInCartPage=allProdNameOnCart.size()

println(numOfProdInCartPage)

for(int i=0;i<numOfProdInCartPage;i++)
{
	if(allProdNameOnCart.get(i).getText().equals(prodName))
	{
		String prodFound=driver.findElement(By.xpath("(//div[@class='cartSection']/h3)[" + (i+1) +"]")).getText()
		println("Product found in Cart page:>>>>>>>>>>" +  prodFound)
	WebUI.verifyMatch(prodName, prodFound, false);
	}
	
	
}



