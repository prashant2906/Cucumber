package runner;

// Firefox version 38.0.1 & Java 1.8.0
// http://toolsqa.wpengine.com/cucumber/cucumber-options/

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"features"},
		glue={"StepDef"},
		plugin={"html:target/cucumber-html-report","pretty:target/cucumber-pretty.txt","json:target/cucumber.json","usage:target/cucmber-usage.json","junit:target/cucumber-results.xml"}
		,tags={"@ProdSanityAP,@ProdSanityPCS_SB,@ProdSanityEMEA,@ProdSanityLA,@ProdSanityNA,@SendExcel"})
		
//		tags={"@InitializeExcel,@ProdSanityAP,@ProdSanityPCS_SB,@ProdSanityEMEA,@ProdTSSSanityEMEA,@ProdSanityLA,@ProdSanityNA,@ProdSanitySettingsAuth,@ProdWebService,@SendExcel"})

//,tags={"@InitializeExcel,@ProdSanityAP,@ProdSanityPCS_SB,@ProdSanityPCS_VS,@ProdSanityEMEA,@ProdSanityLA,@ProdSanityNA,@ProdSanitySettingsAuth,@ProdWebService,@SendExcel"})

public class TestRunner {
	//"@InitializeExcel,@ProdSanityAP,@ProdSanityPCS,@ProdSanityEMEA,@ProdSanityLA,@ProdSanityNA,@ProdSanityDR,@ProdSanitySettingsAuth,@ProdWebService,@SendExcel"
//tags={"@InitializeExcel,@ProdWebService,@ProdSanity"}
	// @IN4174SanityAP @ProdSanityDR
	//@CDTDevSanityAP @SendExcel @ProdSanitySettingsAuth
	
/*
///////////////////////////		//////////////////////////practice////////////////////////////////////////////

public boolean isAlertPresent(){

try{
driver.switchTo().alert().accept();
driver.switchTo().alert().dismiss();
String text= driver.switchTo().alert().getText();
System.out.println(text);

driver.switchTo().frame(driver.findElement(By.cssSelector("")));	
driver.switchTo().frame(driver.findElement(By.xpath("")));


java.util.Set<String> allWindows =driver.getWindowHandles(); --- gives unquie window id
allWindows.iterator();
driver.switchTo().defaultContent(); -- go to first window

Implicit WAIT:
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); -- FOR FULL ENTIRE PAGE-- WILL WAIT FOR 30 SECS FOR THE PAGE TO LOAD

EXPLICIT WAIT:
WebDriverWait wait= new WebDriverWait(driver, 15);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(""));-- when a pop up will appear after 30 secs in a page..or anythng will happen after sometime after the full page is loaded..then we use expilicit wait..there impolicit wait does not work.
wait.until(ExpectedConditions.vis)

HOVER:
Actions builder= new Actions(driver); 
builder.moveToElement(element).build().perform();

DROP DOWN:	
Select sel=new Select(driver.findElement(By.xpath("")));
sel.selectByValue("");
sel.selectByVisibleText("");
List<WebElement> op= sel.getOptions();


DRAG DROP:
Actions act1=new Actions(driver);
act1.dragAndDrop(driver.findElement(xpath), driver.findElement(xpath));



Screenshot in selenium:

File abc= (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //----- to take screenshot we have to cast the driver with TakesScreenshot class;

driver.manage().window().getPosition();

driver.navigate().forward();

driver.getCurrentUrl();
driver.getTitle();


*/



}
