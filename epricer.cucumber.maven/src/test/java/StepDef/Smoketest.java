package StepDef;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.mail.EmailException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import javafx.scene.control.Alert;
import library.utility;


public class Smoketest {
	
	WebDriver driver;
	int invalidImageCount;
	
		
	public static void fnHighlightMe(WebDriver driver,WebElement element) throws InterruptedException{
		  //Creating JavaScriptExecuter Interface
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   for (int iCnt = 0; iCnt < 3; iCnt++) {
		      //Execute javascript
		         js.executeScript("arguments[0].style.border='4px groove green'", element);
		         Thread.sleep(1000);
		         js.executeScript("arguments[0].style.border=''", element);
		   }
	}
	
	@After
	public void teardowncucumber(Scenario s)
	{    System.gc(); 
	
		if(s.isFailed())
		{
			try {
				//fnHighlightMe(driver, null);
				utility.captureScreenshot(driver, s.getName());
				String str=s.getName();
				System.out.println("The following scenario has failed: "+str);
				
				File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
				FileInputStream fis = new FileInputStream(src);
				XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook

				String s1="Test production IBM GUI flow for AP";
				String s2="Test production NA BP PCS_SB flow";
				String s3="Test production IBM GUI flow for EMEA";
				String s4="Test production IBM GUI flow for LA";
				String s5="Test production IBM GUI flow for NA";
				String s6="Test Production DR error popup message";
				String s7="Test WebService link1";
				String s8="Test WebService link2";
				String s9="Test WebService link3";
				String s10="Test WebService link4";
				String s11="Test Authorization url for DR";
				String s12="Test Settings url for DR";
				String s13="Test Settings url";
				String s14="Test Authorization url";
				//String s15="Test production NA BP PCS_VS flow";
				String s16="Test production IBM GUI flow for TSS EMEA";
				
				if(str.equals(s1))
				{
				//	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
				//	FileInputStream fis = new FileInputStream(src);
				//	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
					XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel	
					sheet1.getRow(2).createCell(2).setCellValue("Test Scenario failed");
					FileOutputStream fout = new FileOutputStream(src);	
					wb.write(fout);
					System.out.println("AP Quote id is removed from excel sheet as it failed");
				}
				else if(str.equals(s2))
				{
					XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel	
					sheet1.getRow(6).createCell(2).setCellValue("Test Scenario failed");
					FileOutputStream fout = new FileOutputStream(src);	
					wb.write(fout);
					System.out.println("BP PCS NA_SB Quote id is removed from excel sheet as it failed");
				}
				else if(str.equals(s3))
				{
					XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel	
					sheet1.getRow(3).createCell(2).setCellValue("Test Scenario failed");
					FileOutputStream fout = new FileOutputStream(src);	
					wb.write(fout);
					System.out.println("EMEA Quote id is removed from excel sheet as it failed");
				}	
				else if(str.equals(s4))
				{
					XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel	
					sheet1.getRow(4).createCell(2).setCellValue("Test Scenario failed");
					FileOutputStream fout = new FileOutputStream(src);	
					wb.write(fout);
					System.out.println("LA Quote id is removed from excel sheet as it failed");
				}	
				else if(str.equals(s5))
				{
					XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel	
					sheet1.getRow(1).createCell(2).setCellValue("Test Scenario failed");
					FileOutputStream fout = new FileOutputStream(src);	
					wb.write(fout);
					System.out.println("NA Quote id is removed from excel sheet as it failed");
				}
				else if(str.equals(s6))
				{
					XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel	
					sheet1.getRow(7).createCell(2).setCellValue("FAIL");
					FileOutputStream fout = new FileOutputStream(src);	
					wb.write(fout);
					System.out.println("Prod DR failed");
				}
				
				else if(str.equals(s7)||str.equals(s8)||str.equals(s9)||str.equals(s10))
				{
					XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel	
					sheet1.getRow(8).createCell(2).setCellValue("FAIL");
					FileOutputStream fout = new FileOutputStream(src);	
					wb.write(fout);
					System.out.println("WebServices failed");
				}	
				
				else if(str.equals(s11)||str.equals(s12)||str.equals(s13)||str.equals(s14))
				{
					XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel	
					sheet1.getRow(9).createCell(2).setCellValue("FAIL");
					FileOutputStream fout = new FileOutputStream(src);	
					wb.write(fout);
					System.out.println("Settings and Auth failed");
				}
				
				else if(str.equals(s16))
				{
					XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel	
					sheet1.getRow(11).createCell(2).setCellValue("Test Scenario failed");
					FileOutputStream fout = new FileOutputStream(src);	
					wb.write(fout);
					System.out.println("EMEATSS Quote id is removed from excel sheet as it failed");
				}	
				/*
				else if(str.equals(s15))
				{
					XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel	
					sheet1.getRow(7).createCell(2).setCellValue("Test Scenario failed");
					FileOutputStream fout = new FileOutputStream(src);	
					wb.write(fout);
					System.out.println("BP PCS NA_VS Quote id is removed from excel sheet as it failed");
				}
				*/
				//System.out.println("Close the browser");
				
				utility.sendemail(str);
				System.out.println("Close the browser as it failed");
			//	utility.sendemail(str);
				driver.close();
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			}		
		}	
		
		else{
		
			try {
			System.out.println("The following scenario has passed: "+s.getName());
	//		String str=s.getName();
			/*String s6="Test Production DR error popup message";
			String s7="Test WebService link1";
			String s8="Test WebService link2";
			String s9="Test WebService link3";
			String s10="Test WebService link4";
			String s11="Test Authorization url for DR";
			String s12="Test Settings url for DR";
			String s13="Test Settings url";
			String s14="Test Authorization url";
			
			File src1 = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
			FileInputStream fis1 = new FileInputStream(src1);
			XSSFWorkbook wb1= new XSSFWorkbook(fis1); // .xlsx workbook	
			
			if(str.equals(s6))
			{
				XSSFSheet sheet2= wb1.getSheetAt(1);  // This is for sheet 1 in excel	
				sheet2.getRow(7).createCell(2).setCellValue("PASS");
				FileOutputStream foutz = new FileOutputStream(src1);	
				wb1.write(foutz);
				System.out.println("Prod DR PASS");
			}
			
			else if(str.equals(s7)&&str.equals(s8)&&str.equals(s9)&&str.equals(s10))
			{
				XSSFSheet sheet2= wb1.getSheetAt(1);  // This is for sheet 1 in excel	
				sheet2.getRow(8).createCell(2).setCellValue("PASS");
				FileOutputStream foutz = new FileOutputStream(src1);	
				wb1.write(foutz);
				System.out.println("WebServices PASS");
			}	
			
			else if(str.equals(s11)&&str.equals(s12)&&str.equals(s13)&&str.equals(s14))
			{
				XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel	
				sheet1.getRow(9).createCell(2).setCellValue("PASS");
				FileOutputStream fout = new FileOutputStream(src);	
				wb.write(fout);
				System.out.println("Settings and Auth PASS");
			}	
			
			*/
			
	//		utility.sendemailattachmentExcel();
//			System.out.println("Close the browser");
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	 }	
	}
	
	@Given("^Set excel sheet values$")
	public void set_excel_sheet_values() throws Throwable {
		utility.SetExcelData();
	}
	
	
	@Given("^Send excel in email$")
	public void send_excel_in_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			utility.deletefile();
			utility.zipfile();
			Thread.sleep(3000);
			utility.sendemailattachmentExcel();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
	}

	
	@Then("^Click on Admin tab$")
	public void click_on_Admin_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		driver.findElement(By.xpath(""));
	}
	
	
	
	//~~~~~~~~~~~~~~~~~~~~~~~~Checkout.feature NA testcase~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	@Given("^Open firefox and start application$")
	public void Open_firefox_and_start_application() throws Throwable {
		Thread.sleep(5000);
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://inmbz1164.in.dst.ibm.com/Rewrite%20index.php");
		Thread.sleep(5000);
	//	utility.captureScreenshot(driver,"startapp");
	}
			

	@When("^Click on CTD Dev link$")
	public void Click_on_CTD_Dev_link() throws Throwable {
		Thread.sleep(3000);
	//	Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AutoIT Script\\HandleAuthWindow.exe");
	//	driver.findElement(By.cssSelector("a[href='https://inmbzp4174.in.dst.ibm.com/services/epricer/v2/ibm/']")).click();

		driver.get("https://epbuild@in.ibm.com:epbuild102018@w3alpha-2.toronto.ca.ibm.com/services/epricer/v2/ibm/");
	
	/*	//Using sikuli
		Thread.sleep(2000);
		Screen screen=new Screen();	
		Pattern image1= new Pattern("C:\\Users\\IBM_ADMIN\\Desktop\\ePricer\\Sikuli images\\Username.PNG");
		Pattern image2= new Pattern("C:\\Users\\IBM_ADMIN\\Desktop\\ePricer\\Sikuli images\\Password.PNG");
		Pattern image3= new Pattern("C:\\Users\\IBM_ADMIN\\Desktop\\ePricer\\Sikuli images\\OKbuttonLogin.PNG");
		
		screen.type(image1, "epbuild@in.ibm.com");
		screen.type(image2, "March132017");
		screen.click(image3);
	*/	
		Thread.sleep(7000);
		Thread.sleep(7000);
		
	}

	
	@Then("^Click on SelectARole dropdown and select NA Transaction Quotes GTS Opp\\. Owner \\[View New Delegations\\]$")
	public void click_on_SelectARole_dropdown_and_select_NA_Transaction_Quotes_GTS_Opp_Owner_View_New_Delegations() throws Throwable {
		new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("NA Transaction Quotes GTS Opp. Owner [View New Delegations]");
	   	
		
	}	
	
	
	
	@When("^Click on 4174 India Lab GUI link$")
	public void Click_on_4174_India_Lab_GUI_link() throws Throwable {
		Thread.sleep(3000);
	//	Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AutoIT Script\\HandleAuthWindow.exe");
	//	driver.findElement(By.cssSelector("a[href='https://inmbzp4174.in.dst.ibm.com/services/epricer/v2/ibm/']")).click();

		driver.get("https://epbuild@in.ibm.com:epbuild102018@inmbzp4174.in.dst.ibm.com/services/epricer/v2/ibm/");
	
	/*	//Using sikuli
		Thread.sleep(2000);
		Screen screen=new Screen();	
		Pattern image1= new Pattern("C:\\Users\\IBM_ADMIN\\Desktop\\ePricer\\Sikuli images\\Username.PNG");
		Pattern image2= new Pattern("C:\\Users\\IBM_ADMIN\\Desktop\\ePricer\\Sikuli images\\Password.PNG");
		Pattern image3= new Pattern("C:\\Users\\IBM_ADMIN\\Desktop\\ePricer\\Sikuli images\\OKbuttonLogin.PNG");
		
		screen.type(image1, "epbuild@in.ibm.com");
		screen.type(image2, "March132017");
		screen.click(image3);
	*/	
		Thread.sleep(7000);
		Thread.sleep(7000);
		
	}
	

	
	@Then("^GUI home page should open$")
	public void GUI_home_page_should_open() throws Throwable {
		WebDriverWait wait= new WebDriverWait(driver, 85);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[name='SelectARole']")));
		System.out.println("The IBM GUI home page is displayed");
				
	   	}
	
	
	@Then("^Click on SelectARole dropdown and select GITC TRN NA role$")
	public void Click_on_SelectARole_dropdown_and_select_GITC_TRN_NA_role() throws Throwable {
		new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("GITC TRN NA");
   	
	}

	@Then("^Click on Start button$")
	public void Click_on_Start_button() throws Throwable {		
		driver.findElement(By.cssSelector(".btn.btn-success.btn-lg")).click();
		Thread.sleep(1000);
	   	}

	@Then("^Home page should open$")
	public void Home_page_should_open() throws Throwable {
		WebDriverWait wait= new WebDriverWait(driver, 85);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.createquote")));
		System.out.println("User Role page is opened");
	
		
	   	}

	@Then("^Click on Create quote button$")
	public void Click_on_Create_quote_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div.createquote")).click();
		Thread.sleep(5000);
	   	}
	
	
	@Then("^New quote page should open for NA$")
	public void New_quote_page_should_open_for_NA() throws Throwable {
		WebDriverWait wait= new WebDriverWait(driver, 85);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
		System.out.println("New Quote page is opened");
		String cssSelectorOfSameElements="div.col-md-3.ng-binding";
	    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
		String quoteid=a.get(1).getText();
		System.out.println( "Quote Id is " + quoteid);
		
	
	//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
		
		File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
		
	  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
		
		XSSFSheet sheet1= wb.getSheetAt(0);  // This is for sheet 1 in excel
		
		sheet1.getRow(1).createCell(2).setCellValue(quoteid);
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		sheet1.getRow(1).createCell(3).setCellValue(timeStamp);
		FileOutputStream fout = new FileOutputStream(src);
		
		wb.write(fout);
		
		System.out.println("NA Quote id " +quoteid+ " is successfully copied to excel sheet");
	}
	

@Then("^In Overview select country as United States$")
public void in_Overview_select_country_as_United_States() throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='Select Country']"))).selectByVisibleText("United States");
   	Thread.sleep(3000);
}

@Then("^Enter QuoteTitle OppID OppOwnerName$")
public void enter_QuoteTitle_OppID_OppOwnerName() throws Throwable {
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Thread.sleep(6000);
	driver.findElement(By.cssSelector("input[title ='Quote Name']")).sendKeys("TestTitle");
	driver.findElement(By.cssSelector("input[title='Opportunity Id']")).sendKeys("TestOppID");
	driver.findElement(By.cssSelector("input[title='Opportunity Owner Name']")).sendKeys("TestOppName");
	driver.findElement(By.cssSelector("input[title='Opportunity Owner Email']")).sendKeys("epbuild@in.ibm.com");
	

}
@Then("^Enter QuoteTitle OppID OppOwnerName phone no,ooname$")
public void enter_QuoteTitle_OppID_OppOwnerName_Phone_Channel() throws Throwable {
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Thread.sleep(6000);
	driver.findElement(By.cssSelector("input[title ='Quote Name']")).sendKeys("TestTitle");
	driver.findElement(By.cssSelector("input[title='Opportunity Id']")).sendKeys("TestOppID");
	driver.findElement(By.cssSelector("input[title='Opportunity Owner Name']")).sendKeys("TestOppName");
	driver.findElement(By.cssSelector("input[title='Opportunity Owner Email']")).sendKeys("epbuild@in.ibm.com");
	driver.findElement(By.cssSelector("input[title='Requester Phone']")).sendKeys("88888888");
	driver.findElement(By.cssSelector("input[title='Opportunity Owner Name']")).sendKeys("Test");
}

@Then("^Click on SelectARole dropdown and select Channel indicator$")
public void click_on_SelectARole_dropdown_and_select_Channel_indicator() throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='Select Channel Indicator']"))).selectByVisibleText("Telesales");
   
}
@Then("^Click on SelectARole dropdown and select Solution type$")
public void click_on_SelectARole_dropdown_and_select_Solution_type() throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='Select Solution type']"))).selectByVisibleText("BAAN: Application Server");
   
}


@Then("^Enter QuoteTitle OppID OppOwnerName for AP /LA$")
public void enter_QuoteTitle_OppID_OppOwnerNameAPLA() throws Throwable {
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Thread.sleep(6000);
	driver.findElement(By.cssSelector("input[title ='Quote Name']")).sendKeys("TestTitle");
	driver.findElement(By.cssSelector("input[title='Opportunity Id']")).sendKeys("TestOppID");
	//driver.findElement(By.cssSelector("input[title='Opportunity Owner Name']")).sendKeys("TestOppName");
	//driver.findElement(By.cssSelector("input[title='Opportunity Owner Email']")).sendKeys("epbuild@in.ibm.com");

}

@Then("^Click on Save and Continue$")
public void click_on_Save_and_Continue() throws Throwable {
   driver.findElement(By.cssSelector("strong[translate='Next']")).click();
   Thread.sleep(5000);
}


@Then("^On Customer information page click on Search Customer for NA$")
public void on_Customer_information_page_click_on_Search_Customer_for_NA() throws Throwable {
	
	// The below commented code is to select a new customer-- Writing new code to Search for an existing customer
	
	/*
	String cssSelectorOfSameElements=".btn.btn-primary.ng-scope";
    java.util.List<WebElement> a1=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	a1.get(2).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	*/
		

   //	 Search for a customer for NA:
	        Thread.sleep(3000);
		    String cssSelectorOfSameElements=".btn.btn-primary.ng-scope";
		    java.util.List<WebElement> a1=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
		 	a1.get(1).click();
		 	Thread.sleep(3000);
		 	driver.switchTo().activeElement();
		 	new Select (driver.findElement(By.cssSelector("select[name='customername']"))).selectByVisibleText("CMR customer number");
		    Thread.sleep(2000);
	// Enter the CMR number:	
		 	//*[text()='CMR customer']/following::input[1]
		 	driver.findElement(By.xpath("//*[text()='CMR customer']/following::input[1]")).sendKeys("1707011");
	// Click on the IBM master table radio button:
		 	//*[text()='ePricer customer table']/following::input[1]
		 	driver.findElement(By.xpath("//*[text()='ePricer customer table']/following::input[1]")).click();
   // Click on Search customer button:
		    //span[text()='Search Customer']	
		    driver.findElement(By.xpath("//span[text()='Search Customer']")).click();
		    Thread.sleep(6000);
	
/*	
 
//    Search customer for other countries other than NA:

			    String cssSelectorOfSameElements1=".btn.btn-primary.ng-scope";
			    java.util.List<WebElement> a2=driver.findElements(By.cssSelector(cssSelectorOfSameElements1)) ;
			 	a2.get(0).click();
			 	Thread.sleep(3000);
			 	driver.switchTo().activeElement();
			 	new Select (driver.findElement(By.cssSelector("select[name='customername']"))).selectByVisibleText("Company name 1");
			    Thread.sleep(2000);
		// Enter the Company name:	
			  //*[text()='Name *']/following::input[1]
			 	driver.findElement(By.xpath("//*[text()='Name *']/following::input[1]")).sendKeys("ba*");
		// Click on the IBM master table radio button:
			 	//*[text()='ePricer customer table']/following::input[1]
			 	driver.findElement(By.xpath("//*[text()='ePricer customer table']/following::input[1]")).click();
	  // Click on Search customer button:
			    //span[text()='Search Customer']	
		driver.findElement(By.xpath("//span[text()='Search Customer']")).click();  
		// Click on the first radio button		
		 WebDriverWait wait = new WebDriverWait(driver, 200);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='radio_PGCode0']")));
		 driver.findElement(By.xpath(".//*[@id='radio_PGCode0']")).click();
			Thread.sleep(2000);
		//Click on select customer button:
		//span[translate='select_customer']	
		driver.findElement(By.cssSelector("span[translate='select_customer']")).click();		
		Thread.sleep(4000); 
		    
*/

}


@Then("^On Customer information page click on Search Customer for EMEA$")
public void on_Customer_information_page_click_on_Search_Customer_for_EMEA() throws Throwable {
	
	// The below commented code is to select a new customer-- Writing new code to Search for an existing customer
	
	/*
	String cssSelectorOfSameElements=".btn.btn-primary.ng-scope";
    java.util.List<WebElement> a1=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	a1.get(2).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	*/
		

   //	 Search for a customer for EMEA:
	        Thread.sleep(5000);
		    String cssSelectorOfSameElements=".btn.btn-primary.ng-scope";
		    java.util.List<WebElement> a1=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
		 	a1.get(1).click();
		 	Thread.sleep(3000);
		 	driver.switchTo().activeElement();
		 	new Select (driver.findElement(By.cssSelector("select[name='customername']"))).selectByVisibleText("CMR customer number");
		    Thread.sleep(2000);
	// Enter the CMR number:	
		 	//*[text()='CMR customer']/following::input[1]
		 	driver.findElement(By.xpath("//*[text()='CMR customer']/following::input[1]")).sendKeys("001021");
	// Click on the IBM master table radio button:
		 	//*[text()='ePricer customer table']/following::input[1]
		 	driver.findElement(By.xpath("//*[text()='ePricer customer table']/following::input[1]")).click();
   // Click on Search customer button:
		    //span[text()='Search Customer']	
		    driver.findElement(By.xpath("//span[text()='Search Customer']")).click();
		    Thread.sleep(6000);

}


@Then("^Enter customer name$")
public void enter_customer_name() throws Throwable {
	//	Use the below code only when a New customer is added in the above step.For existing customer this will not work.
	    Thread.sleep(3000); 
	   driver.findElement(By.cssSelector("input[title='End user customer name :']")).sendKeys("IBMTestName");
}

@Then("^Click on Save and Continue on customer tab$")
public void click_on_Save_and_Continue_on_customer_tab() throws Throwable {
	Thread.sleep(1000);
	String cssSelectorOfSameElements="strong[translate='Next']";
    java.util.List<WebElement> a2=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	a2.get(1).click();
	Thread.sleep(4000);
}	
	
	
	@Then("^In Configuration tab upload cfr file$")
	public void in_Configuration_tab_upload_cfr_file() throws Throwable {
		Thread.sleep(2000);
		String cssSelectorOfSameElements1="input[title='Upload file']";
	    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements1)) ;
		a.get(0).click();
		Thread.sleep(3000);
	//To upload the cfr file using AutoIT- but i have commented this out as this was not a G2O approved software
	//	Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AutoIT Script\\FileUpload.exe");
	
	//Using sikuli to upload a file
		//Thread.sleep(2000);
		Screen screen=new Screen();	
		Pattern image1= new Pattern("C:\\Users\\IBM_ADMIN\\Desktop\\ePricer\\Sikuli images\\FileName.PNG");
		Pattern image2= new Pattern("C:\\Users\\IBM_ADMIN\\Desktop\\ePricer\\Sikuli images\\Open1.PNG");
		screen.type(image1, "C:\\Users\\IBM_ADMIN\\Desktop\\ePricer\\CFR\\Aegon GB VEBsnH6064 FC4016nFC4017mes 24aug15.cfr");
		Thread.sleep(2000);
		screen.click(image2);
		Thread.sleep(5000);
		
		//Disable checksum
		String cssSelectorOfSameElements6="input[title='Disable Checksum']";
	    java.util.List<WebElement> a6=driver.findElements(By.cssSelector(cssSelectorOfSameElements6)) ;
	    
	  
		if ( !a6.get(0).isSelected() )
		{
			a6.get(0).click();
		}
		
		 String cssSelectorOfSameElements7="input[title='Work with other country CFR']";
		 java.util.List<WebElement> a7=driver.findElements(By.cssSelector(cssSelectorOfSameElements7)) ;
			
		
		//Work with other country CFR
		if ( !a7.get(0).isSelected() )
		{
			a7.get(0).click();
		}
		
		
		//Click on upload CFR button
		
		String cssSelectorOfSameElements3="span[translate='Upload_CFR(s)']";
	    java.util.List<WebElement> a3=driver.findElements(By.cssSelector(cssSelectorOfSameElements3)) ;
		a3.get(0).click();
		Thread.sleep(4000);
	
	}

	@Then("^In Configuration tab upload TSS cfr file$")
	public void in_Configuration_tab_upload_TSS_cfr_file() throws Throwable {
		Thread.sleep(2000);
		//String cssSelectorOfSameElements1="input[title='Upload file']";
	    //java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements1)) ;
		//a.get(0).click();
		//Thread.sleep(3000);
	//To upload the cfr file using AutoIT- but i have commented this out as this was not a G2O approved software
	//	Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AutoIT Script\\FileUpload.exe");
	
	//Using sikuli to upload a file
		//Thread.sleep(2000);
		//Screen screen=new Screen();	
		//Pattern image1= new Pattern("C:\\Users\\IBM_ADMIN\\Desktop\\ePricer\\Sikuli images\\FileName.PNG");
		//Pattern image2= new Pattern("C:\\Users\\IBM_ADMIN\\Desktop\\ePricer\\Sikuli images\\Open1.PNG");
		//WebElement uploadElement = driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteconfig-page/div/div/div[5]/div/div[2]/div[1]/input"));
		WebElement uploadElement1 = driver.findElement(By.xpath("//input[@title='Upload file']"));
		String filename = System.getProperty("user.dir")+"\\TSS.cfr";
		uploadElement1.sendKeys(filename);
		//WebElement uploadElement2 = driver.findElement(By.xpath("//div[@class='ibm-columns ng-scope']//div[@class='well drop-zone ng-scope'][contains(text(),'Drop Files Here')]"));
		//uploadElement1.sendKeys("C:\\Users\\IBM_ADMIN\\Documents\\SametimeFileTransfers\\8335GTG_New_France_2.cfr");
		//uploadElement2.sendKeys("C:\\Users\\IBM_ADMIN\\Documents\\oxygen\\epricer.cucumber.maven\\features\\TSS.cfr");
		
		
		//uploadElement2.sendKeys("\\\\TSS.cfr");
		//uploadElement1.sendKeys("\\\\TSS.cfr");
		//driver.findElement(By.name("send")).click();
		//screen.type(image1, "C:\\Users\\IBM_ADMIN\\Documents\\SametimeFileTransfers\\8335GTG_New_France_2.cfr");
		
	  
		Thread.sleep(2000);
		//screen.click(image2);
		Thread.sleep(5000);
		
		//Disable checksum
		String cssSelectorOfSameElements6="input[title='Disable Checksum']";
	    java.util.List<WebElement> a6=driver.findElements(By.cssSelector(cssSelectorOfSameElements6)) ;
	    
	  
		if ( !a6.get(0).isSelected() )
		{
			a6.get(0).click();
		}
		
		 String cssSelectorOfSameElements7="input[title='Work with other country CFR']";
		 java.util.List<WebElement> a7=driver.findElements(By.cssSelector(cssSelectorOfSameElements7)) ;
			
		
		//Work with other country CFR
		if ( !a7.get(0).isSelected() )
		{
			a7.get(0).click();
		}
		
		
		//Click on upload CFR button
		
		String cssSelectorOfSameElements3="span[translate='Upload_CFR(s)']";
	    java.util.List<WebElement> a3=driver.findElements(By.cssSelector(cssSelectorOfSameElements3)) ;
		a3.get(0).click();
		Thread.sleep(30000);
	
	}
	
	
	@Then("^Add product manually$")
	
	public void add_product_manually() throws Throwable {
		Thread.sleep(5000);
		String cssSelectorOfSameElements4="span[translate=Add_product_manually]";
	    java.util.List<WebElement> a5=driver.findElements(By.cssSelector(cssSelectorOfSameElements4)) ;
		a5.get(0).click();
//		Thread.sleep(8000);
		
//		driver.switchTo().activeElement();
		Thread.sleep(4000);
		
		//Selecting type
		driver.findElement(By.xpath("//*[text()='*Type']/following::input[1]")).sendKeys("7014");
	  
		//Selecting Model
		driver.findElement(By.xpath("//*[text()='*Model:']/following::input[1]")).sendKeys("T42");
		Thread.sleep(1000);
		
		//Click on Add and Close
		//driver.findElement(By.cssSelector("input[value='Add and Close']")).click();
		WebElement addbutton =driver.findElement(By.id("addComponenttrue"));
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addbutton);
		addbutton.click();
		// EMEA Discal alert check 
			try
			{
				Alert alert = driver.switchTo().alert();
				alert.accept();
			}
			catch(Exception e)
			{
				System.out.println("No Alert Present");
			}
		
		Thread.sleep(7000);
		
	//	driver.switchTo().defaultContent();

	
	}

	@Then("^click on collect pricing$")
	public void click_on_collect_pricing() throws Throwable {
		
		Thread.sleep(10000);
		String cssSelectorOfSameElements1="input[title='CheckAll']";
	    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements1)) ;
		a.get(0).click();
		Thread.sleep(3000);

		String cssSelectorOfSameElements2="span[translate='Collect_Pricing']";
	    java.util.List<WebElement> a1=driver.findElements(By.cssSelector(cssSelectorOfSameElements2)) ;
		a1.get(0).click();
		Thread.sleep(25000);
		
	}

	@Then("^Click on Save and Continue on Configuration tab$")
	public void click_on_Save_and_Continue_on_Configuration_tab() throws Throwable {
		Thread.sleep(5000);
		String cssSelectorOfSameElements="strong[translate='Next']";
	    java.util.List<WebElement> a2=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
		a2.get(1).click();		
		Thread.sleep(4000);    	
	}

	
	
@Then("^Inside pricing tab Apply Discount to the line items$")
public void inside_pricing_tab_Apply_Discount_to_the_line_items() throws Throwable {

WebDriverWait wait= new WebDriverWait(driver, 120);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='pricingCheckbox']/input")));
	
//Select all from the checkbox using the xpath:   
driver.findElement(By.xpath(".//*[@id='pricingCheckbox']/input")).click();


//Select the first one for Quick apply button.. there are 4 matching nodes:

String cssSelectorOfSameElements1="b[translate='Quick_apply']";
java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements1));
a.get(0).click();
Thread.sleep(5000);


//Then switch to active element:
driver.switchTo().activeElement();
Thread.sleep(2000);


//Enter the discount amount
//input[name='comapprovedpercent']
driver.findElement(By.cssSelector("input[name='comapprovedpercent']")).clear();
driver.findElement(By.cssSelector("input[name='comapprovedpercent']")).sendKeys("10");

//Click on apply button:
//b[translate='Apply_quoted_price']
driver.findElement(By.cssSelector("b[translate='Apply_quoted_price']")).click();
Thread.sleep(5000);
WebDriverWait wait1= new WebDriverWait(driver, 120);
//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='pricingCheckbox']/input")));
wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='pricingCheckbox']/input")));
}


@Then("^Click on Request Approval and send the quote for approval$")
public void click_on_Request_Approval_and_send_the_quote_for_approval() throws Throwable {
	//Click on Request approval tab ---
	//a[contains(text(),'Request approval')]
	 //use xpath:
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Request approval')]")).click();
	 Thread.sleep(3000);
	 driver.switchTo().alert().accept();
	Thread.sleep(3000);
	 
	//Click on Save and continue button:
	String cssSelectorOfSameElements="strong[translate='Next']";
    java.util.List<WebElement> a2=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	a2.get(1).click();
	Thread.sleep(3000);

	//driver.findElement(By.xpath("//a[contains(text(),'Request approval')]")).click();
	 
//	Inside send Notification popup:
	Thread.sleep(5000);
	driver.switchTo().activeElement();
//	Enter email address manually::::
	driver.findElement(By.xpath(".//*[@id='manualemail']")).sendKeys("epbuild@in.ibm.com");
//	Click on Add to button:
	//button[@data-ng-click='notificationAddEmail('ATO','M');']
	//textarea[@id='manualemail']/following::button[1]
	driver.findElement(By.xpath("//textarea[@id='manualemail']/following::button[1]")).click();
//	Click on Send button:
	//strong[@translate='Send']
	driver.findElement(By.xpath("//strong[@translate='Send']")).click();
	Thread.sleep(7000);
	driver.switchTo().alert().accept();
	Thread.sleep(5000);
	
}

@Then("^Approve the quote using Approval tab$")
public void approve_the_quote_using_Approval_tab() throws Throwable {
//	Click on approval tab:
	//	a[contains(text(),'Approval')]
	 //Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Approval')]")).click();
		Thread.sleep(3000);


		 
//		Click on approve radio button
//		.//*[@id='radio_Approval_approve']
		driver.findElement(By.xpath(".//*[@id='radio_Approval_approve']")).click();

//		Enter the email id:
//		.//*[@id='CUE_BUE_RTL_ID']
		driver.findElement(By.xpath(".//*[@id='CUE_BUE_RTL_ID']")).sendKeys("epbuild@in.ibm.com");

//		Select one SBC:
		new Select (driver.findElement(By.id("backupgroupnameid1"))).selectByValue("0");

//		Click on submit:
		driver.findElement(By.xpath("//strong[@translate='Submit']")).click();
		Thread.sleep(5000);

//Send email notification		
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		//	Select email address:
		driver.findElement(By.xpath(".//*[@id='manualemail']")).click();
		Thread.sleep(1000);
		String xpathOfSameElements="//input[@class='ng-pristine ng-untouched ng-valid'][@type='checkbox'][@data-ng-model='id.flag']";
	    java.util.List<WebElement> a=driver.findElements(By.xpath(xpathOfSameElements)) ;
	    fnHighlightMe(driver,a.get(0));
	    a.get(0).click();		
	    Thread.sleep(2000);
		
//		Click on Send button:
//		//strong[@translate='Send']
		driver.findElement(By.xpath("//strong[@translate='Send']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
}

@Then("^Verify the quote status and check the reports$")
public void verify_the_quote_status_and_check_the_reports() throws Throwable {

//Verify the status of the quote:
//css selector: span[class='text-center text-success']

//String cssSelectorOfSameElements1="span[class='text-center text-success']";
String cssSelectorOfSameElements1="span[class='ng-binding ng-scope']";

java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements1)) ;
//a.get(0).getText();
a.get(0).getText();
System.out.println(a.get(0).getText());
//Thread.sleep(2000);
if(a.get(0).getText().contains("Approved"))
{
System.out.println("Quote is approved");
}
else
{
System.out.println("Quote failed");
}

//For Bottom line customer offer letter

driver.findElement(By.xpath("//*[contains(text(),'Bottom line customer offer letter')]")).click();
//driver.findElement(By.xpath("//*[contains(text(),'Standard report')]").click();
Thread.sleep(5000);
		
String parentWindow = driver.getWindowHandle();
Set<String> handles =  driver.getWindowHandles();
for(String windowHandle  : handles)
{
if(!windowHandle.equals(parentWindow))
{
driver.switchTo().window(windowHandle);
Thread.sleep(1000);
String s3=driver.getTitle();
Assert.assertEquals("IBM e-Pricer | Customer Offer Letter", s3);
System.out.println("Bottom line customer offer is opened");
Thread.sleep(1000);
driver.close(); //closing child window
driver.switchTo().window(parentWindow); //cntrl to parent window
Thread.sleep(3000);
}
}
//For standard report:

driver.findElement(By.xpath("//*[contains(text(),'Standard report')]")).click();
	//driver.findElement(By.xpath("//*[contains(text(),'Standard report')]").click();
	Thread.sleep(6000);
			
	String parentWindow3 = driver.getWindowHandle();
	Set<String> handles3 =  driver.getWindowHandles();
	for(String windowHandle  : handles3)
	{
	if(!windowHandle.equals(parentWindow3))
	{
	driver.switchTo().window(windowHandle);
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	WebElement	s2= driver.findElement(By.xpath("//*[contains(text(),'Standard report')]"));
	Thread.sleep(2000);
	if(s2.getText().contains("Standard report"))
	{
	System.out.println("Standard report is opened");
	}
	else
	{
	System.out.println("Standard report is not opened");
	}	
	driver.close(); //closing child window
	driver.switchTo().window(parentWindow3); //cntrl to parent window
	Thread.sleep(3000);
	}
	}

//	For History Report:
		//*[contains(text(),'History report')]
		driver.findElement(By.xpath("//*[contains(text(),'History report')]")).click();
		Thread.sleep(6000);
				
		String parentWindow1 = driver.getWindowHandle();
		Set<String> handles1 =  driver.getWindowHandles();
		for(String windowHandle  : handles1)
		{
		if(!windowHandle.equals(parentWindow1))
		{
		driver.switchTo().window(windowHandle);
		Thread.sleep(3000);

		System.out.println(driver.getTitle());

		WebElement	s2= driver.findElement(By.xpath("//*[contains(text(),'History report')]"));
		//Thread.sleep(2000);
		if(s2.getText().contains("History report"))
		{
		System.out.println("History report is opened");
		}
		else
		{
		System.out.println("History report is not opened");
		}	
		driver.close(); //closing child window
		driver.switchTo().window(parentWindow1); //cntrl to parent window
		Thread.sleep(3000);
		
		}
		}
}


@Then("^Verify the TSS quote status and check the reports$")
public void verify_the_TSS_quote_status_and_check_the_reports() throws Throwable {

//Verify the status of the quote:
//css selector: span[class='text-center text-success']

//String cssSelectorOfSameElements1="span[class='text-center text-success']";
String cssSelectorOfSameElements1="//*[@id=\"ibm-pagetitle-h1\"]/div[3]/div[2]/quoteedit-page/div/div/quoteheader-page/div[2]/div/div[2]/div[1]/div[5]/span";

java.util.List<WebElement> a=driver.findElements(By.xpath(cssSelectorOfSameElements1)) ;
//a.get(0).getText();
a.get(0).getText();
System.out.println(a.get(0).getText());
//Thread.sleep(2000);
if(a.get(0).getText().contains("Ongoing quote - Approved"))
{
System.out.println("Quote is approved");
}
else
{
System.out.println("Quote failed");
}

//For Bottom line customer offer letter

driver.findElement(By.xpath("//*[contains(text(),'Bottom line customer offer letter')]")).click();
//driver.findElement(By.xpath("//*[contains(text(),'Standard report')]").click();
Thread.sleep(5000);
		
String parentWindow = driver.getWindowHandle();
Set<String> handles =  driver.getWindowHandles();
for(String windowHandle  : handles)
{
if(!windowHandle.equals(parentWindow))
{
driver.switchTo().window(windowHandle);
Thread.sleep(1000);
String s3=driver.getTitle();
Assert.assertEquals("IBM e-Pricer | Customer Offer Letter", s3);
System.out.println("Bottom line customer offer is opened");
Thread.sleep(1000);
driver.close(); //closing child window
driver.switchTo().window(parentWindow); //cntrl to parent window
Thread.sleep(3000);
}
}
//For standard report:

driver.findElement(By.xpath("//*[contains(text(),'Standard report')]")).click();
	//driver.findElement(By.xpath("//*[contains(text(),'Standard report')]").click();
	Thread.sleep(6000);
			
	String parentWindow3 = driver.getWindowHandle();
	Set<String> handles3 =  driver.getWindowHandles();
	for(String windowHandle  : handles3)
	{
	if(!windowHandle.equals(parentWindow3))
	{
	driver.switchTo().window(windowHandle);
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	WebElement	s2= driver.findElement(By.xpath("//*[contains(text(),'Standard report')]"));
	Thread.sleep(2000);
	if(s2.getText().contains("Standard report"))
	{
	System.out.println("Standard report is opened");
	}
	else
	{
	System.out.println("Standard report is not opened");
	}	
	driver.close(); //closing child window
	driver.switchTo().window(parentWindow3); //cntrl to parent window
	Thread.sleep(3000);
	}
	}

//	For History Report:
		//*[contains(text(),'History report')]
		driver.findElement(By.xpath("//*[contains(text(),'History report')]")).click();
		Thread.sleep(6000);
				
		String parentWindow1 = driver.getWindowHandle();
		Set<String> handles1 =  driver.getWindowHandles();
		for(String windowHandle  : handles1)
		{
		if(!windowHandle.equals(parentWindow1))
		{
		driver.switchTo().window(windowHandle);
		Thread.sleep(3000);

		System.out.println(driver.getTitle());

		WebElement	s2= driver.findElement(By.xpath("//*[contains(text(),'History report')]"));
		//Thread.sleep(2000);
		if(s2.getText().contains("History report"))
		{
		System.out.println("History report is opened");
		}
		else
		{
		System.out.println("History report is not opened");
		}	
		driver.close(); //closing child window
		driver.switchTo().window(parentWindow1); //cntrl to parent window
		Thread.sleep(3000);
		
		}
		}
}





@Then("^Search for the created quote$")
public void search_for_the_created_quote() throws Throwable {
	
	String cssSelectorOfSameElements2="div.col-md-3.ng-binding";
    java.util.List<WebElement> a2=driver.findElements(By.cssSelector(cssSelectorOfSameElements2)) ;
	String quoteid=a2.get(0).getText();

//Click on search quote 
//div [class='quotesearch']
driver.findElement(By.xpath("//div[@class='quotesearch']")).click();
Thread.sleep(6000);
driver.findElement(By.cssSelector("input[title='Enter quoteid(s)'][class='ng-pristine ng-untouched ng-valid ng-scope input-control focusedRed']")).sendKeys(quoteid);

//span[contains(text(),'Search')and@class='btn btn-primary btn-lg']
driver.findElement(By.xpath("//span[contains(text(),'Search')and@class='btn btn-primary btn-lg']")).click();
Thread.sleep(5000);

String cssSelectorOfSameElements3="div.col-md-3.ng-binding";
    java.util.List<WebElement> a1=driver.findElements(By.cssSelector(cssSelectorOfSameElements3)) ;
	String quoteidexpected=a1.get(1).getText();
	System.out.println("Quote id from the system is: "+quoteidexpected);
	if(quoteidexpected.equals(quoteid))
	{
	System.out.println("Search PASS");
	}
	else
	{
		System.out.println("Search FAILED");
		Assert.assertEquals(quoteidexpected,quoteid);
	
	}
	driver.close();
}
				



//~~~~~~~~~~~~~~~~~~~~~~~~Checkout.feature AP testcase~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



@Then("^Click on SelectARole dropdown and select GITC TRN AP role$")
public void Click_on_SelectARole_dropdown_and_select_GITC_TRN_AP_role() throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("GITC TRN AP");
	
}

@Then("^New quote page should open for AP$")
public void New_quote_page_should_open_for_AP() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);
	

	
	

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(0);  // This is for sheet 1 in excel
	
	sheet1.getRow(2).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(2).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	wb.write(fout);
	System.out.println("AP Quote id " +quoteid+ " is successfully copied to excel sheet");
}




@Then("^In Overview select country as India$")
public void in_Overview_select_country_as_India() throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='Select Country']"))).selectByVisibleText("India");
   	Thread.sleep(3000);
}

@Then("^On Customer information page click on Search Customer for others$")
public void on_Customer_information_page_click_on_Search_Customer_for_others() throws Throwable {
	
	 
//    Search customer for other countries other than NA:
				Thread.sleep(2000);
			    String cssSelectorOfSameElements1=".btn.btn-primary.ng-scope";
			    java.util.List<WebElement> a2=driver.findElements(By.cssSelector(cssSelectorOfSameElements1)) ;
			 	a2.get(0).click();
			 	Thread.sleep(4000);
			 	driver.switchTo().activeElement();
			 	new Select (driver.findElement(By.cssSelector("select[name='customername']"))).selectByVisibleText("Company name 1");
			    Thread.sleep(2000);
		// Enter the Company name:	
			  //*[text()='Name *']/following::input[1]
			 	driver.findElement(By.xpath("//*[text()='Name *']/following::input[1]")).sendKeys("ba*");
		// Click on the IBM master table radio button:
			 	//*[text()='ePricer customer table']/following::input[1]
			 	driver.findElement(By.xpath("//*[text()='ePricer customer table']/following::input[1]")).click();
	  // Click on Search customer button:
			    //span[text()='Search Customer']	
		driver.findElement(By.xpath("//span[text()='Search Customer']")).click();  
		Thread.sleep(3000);
		// Click on the first radio button		
		 WebDriverWait wait = new WebDriverWait(driver, 200);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='radio_PGCode0']")));
		 driver.findElement(By.xpath(".//*[@id='radio_PGCode0']")).click();
			Thread.sleep(2000);
		//Click on select customer button:
		//span[translate='select_customer']	
		driver.findElement(By.cssSelector("span[translate='select_customer']")).click();		
		Thread.sleep(6000); 
		    
}


@Then("^Inside pricing tab Apply Discount to the line items for the role below deligation level$")
public void inside_pricing_tab_Apply_Discount_to_the_line_items_for_the_role_below_deligation_level() throws Throwable {

//Select all from the checkbox using the xpath:   
driver.findElement(By.xpath(".//*[@id='pricingCheckbox']/input")).click();


//Select the first one for Quick apply button.. there are 4 matching nodes:

String cssSelectorOfSameElements1="b[translate='Quick_apply']";
java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements1)) ;
a.get(0).click();
Thread.sleep(4000);


//Then switch to active element:
driver.switchTo().activeElement();
Thread.sleep(2000);


//Enter the discount amount
//input[name='comapprovedpercent']
driver.findElement(By.cssSelector("input[name='comapprovedpercent']")).clear();
driver.findElement(By.cssSelector("input[name='comapprovedpercent']")).sendKeys("10");

//Click on apply button:
//b[translate='Apply_quoted_price']
driver.findElement(By.cssSelector("b[translate='Apply_quoted_price']")).click();
Thread.sleep(2000);

driver.switchTo().alert().accept();
Thread.sleep(5000);

}

@Then("^Click on Request Approval and send the quote for approval for the role below deligation level$")
public void click_on_Request_Approval_and_send_the_quote_for_approval_for_the_role_below_deligation_level() throws Throwable {
	//Click on Request approval tab ---
	//a[contains(text(),'Request approval')]
	 //use xpath:
	Thread.sleep(2000); 
	driver.findElement(By.xpath("//a[contains(text(),'Request approval')]")).click();
	 Thread.sleep(5000);
	/* driver.switchTo().alert().accept();
	Thread.sleep(3000);*/
	 
	//Click on Save and continue button:
	String cssSelectorOfSameElements="strong[translate='Next']";
    java.util.List<WebElement> a2=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	a2.get(1).click();
	Thread.sleep(4000);

	//driver.findElement(By.xpath("//a[contains(text(),'Request approval')]")).click();
	 
//	Inside send Notification popup:
	Thread.sleep(3000);
	driver.switchTo().activeElement();
//	Enter email address manually::::
	driver.findElement(By.xpath(".//*[@id='manualemail']")).sendKeys("epbuild@in.ibm.com");
//	Click on Add to button:
	//button[@data-ng-click='notificationAddEmail('ATO','M');']
	//textarea[@id='manualemail']/following::button[1]
	driver.findElement(By.xpath("//textarea[@id='manualemail']/following::button[1]")).click();
//	Click on Send button:
	//strong[@translate='Send']
	driver.findElement(By.xpath("//strong[@translate='Send']")).click();
	Thread.sleep(5000);
	Thread.sleep(4000);
	driver.switchTo().alert().accept();
	Thread.sleep(5000);
	
}



@Then("^Approve the quote using Approval tab for AP$")
public void approve_the_quote_using_Approval_tab_for_AP() throws Throwable {
//	Click on approval tab:
	Thread.sleep(2000);
	//	a[contains(text(),'Approval')]
		driver.findElement(By.xpath("//a[contains(text(),'Approval')]")).click();
		Thread.sleep(3000);


		 
//		Click on approve radio button
//		.//*[@id='radio_Approval_approve']
		driver.findElement(By.xpath(".//*[@id='radio_Approval_approve']")).click();

//		Enter the email id:
//		.//*[@id='CUE_BUE_RTL_ID']
		driver.findElement(By.xpath(".//*[@id='CUE_BUE_RTL_ID']")).sendKeys("epbuild@in.ibm.com");

/*//		Select one SBC:
		new Select (driver.findElement(By.id("backupgroupnameid1"))).selectByValue("0");
*/
//		Click on submit:
		driver.findElement(By.xpath("//strong[@translate='Submit']")).click();
		Thread.sleep(7000);

//Send email notification		
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		//	Select email address:
		driver.findElement(By.xpath(".//*[@id='manualemail']")).click();
		Thread.sleep(1000);
		String xpathOfSameElements="//input[@class='ng-pristine ng-untouched ng-valid'][@type='checkbox'][@data-ng-model='id.flag']";
	    java.util.List<WebElement> a=driver.findElements(By.xpath(xpathOfSameElements)) ;
	    fnHighlightMe(driver,a.get(0));
	    a.get(0).click();		
	    Thread.sleep(2000);
		
//		Click on Send button:
//		//strong[@translate='Send']
		driver.findElement(By.xpath("//strong[@translate='Send']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
}




@Then("^Approve the quote using Approval tab for EMEA with error pop up$")
public void approve_the_quote_using_Approval_tab_for_EMEA_with_error_pop_up() throws Throwable {
//	Click on approval tab:
	Thread.sleep(3000);
	//click on the OK button on error pop up
//	driver.switchTo().alert().accept();
	Thread.sleep(3000); 
	
	//	a[contains(text(),'Approval')]
		driver.findElement(By.xpath("//a[contains(text(),'Approval')]")).click();
		Thread.sleep(3000);
		
	

//		Click on approve radio button
//		.//*[@id='radio_Approval_approve']
		driver.findElement(By.xpath(".//*[@id='radio_Approval_approve']")).click();

//		Enter the email id:
//		.//*[@id='CUE_BUE_RTL_ID']
		driver.findElement(By.xpath(".//*[@id='CUE_BUE_RTL_ID']")).sendKeys("epbuild@in.ibm.com");

/*//		Select one SBC:
		new Select (driver.findElement(By.id("backupgroupnameid1"))).selectByValue("0");
*/
//		Click on submit:
		driver.findElement(By.xpath("//strong[@translate='Submit']")).click();
		Thread.sleep(7000);

//Send email notification		
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		//	Select email address:
		driver.findElement(By.xpath(".//*[@id='manualemail']")).click();
		Thread.sleep(1000);
		String xpathOfSameElements="//input[@class='ng-pristine ng-untouched ng-valid'][@type='checkbox'][@data-ng-model='id.flag']";
	    java.util.List<WebElement> a=driver.findElements(By.xpath(xpathOfSameElements)) ;
	    fnHighlightMe(driver,a.get(0));
	    a.get(0).click();		
	    Thread.sleep(2000);
		
//		Click on Send button:
//		//strong[@translate='Send']
		driver.findElement(By.xpath("//strong[@translate='Send']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
}


@Then("^Navigate to COPRA screen and mark as COPRA PRICED$")
public void Navigate_to_COPRA_screen_and_mark_as_COPRA_PRICED() throws Throwable {
	
	driver.findElement(By.xpath(".//*[text()='Pricing']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[text()='COPRA']")).click();
	Thread.sleep(2000);
driver.findElement(By.linkText("Apply Approved Price")).click();

	Thread.sleep(3000);
driver.switchTo().alert().accept();
	

	Thread.sleep(3000);
	
	System.out.println("after approved price button click");
		
		
	
}

@Then("^Navigate to COPRA screen for NA$")
public void Navigate_to_COPRA_screen_for_NA() throws Throwable {
	
	driver.findElement(By.xpath(".//*[text()='Pricing']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[text()='COPRA']")).click();
	Thread.sleep(2000);
	
}

/////////////////////////////////~~~~~~~~~~~~~~~~~~~~~~~~Checkout.feature EMEA testcase~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


@Then("^Click on SelectARole dropdown and select GITC TRN EMEA role$")
public void Click_on_SelectARole_dropdown_and_select_GITC_TRN_EMEA_role() throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("GITC TRN EMEA");
	
}

@Then("^New quote page should open for EMEA$")
public void New_quote_page_should_open_for_EMEA() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);
	

	
	
	

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(0);  // This is for sheet 1 in excel
	
	sheet1.getRow(3).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(3).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("EMEA Quote id " +quoteid + " is successfully copied to excel sheet");
}



@Then("^In Overview select country as United Kingdom$")
public void in_Overview_select_country_as_United_Kingdom() throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='Select Country']"))).selectByVisibleText("United Kingdom");
   	Thread.sleep(3000);
}

@Then("^Inside pricing change the Table View to component view$")
public void inside_pricing_change_the_Table_View_to_component_view() throws Throwable {
	Thread.sleep(8000);
	new Select (driver.findElement(By.xpath("//*[contains(text(),'Table View:')]/following::select[1]"))).selectByVisibleText("Component");
	Thread.sleep(1000);
	}
@Then("^Insert sleep time$")
public void insert_sleep_time() throws Throwable {
	Thread.sleep(90000);
}








///////////////// EMEA Prod RW testing////////////////////////////////////////////////////////////

@When("^Click on Prod Rewrite GUI link$")
public void click_on_Prod_Rewrite_GUI_link() throws Throwable {
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	System.out.println("Waiting for pageloadtimeout");
	driver.manage().timeouts().pageLoadTimeout(85, TimeUnit.SECONDS);
	
try{	
	//Thread.sleep(5000);
	//	Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AutoIT Script\\HandleAuthWindow.exe");
	//	driver.findElement(By.cssSelector("a[href='https://inmbzp4174.in.dst.ibm.com/services/epricer/v2/ibm/']")).click();

	driver.get("https://epbuild@in.ibm.com:ebuild012019@w3-01.ibm.com/services/epricer/v2/ibm/");
	
	//Thread.sleep(5000);
	Thread.sleep(3000);

	//driver.manage().timeouts().pageLoadTimeout(85, TimeUnit.SECONDS);
	System.out.println("Waited for pageloadtimeout and the page has loaded now");

	
	/*String s3=driver.findElement(By.cssSelector("h3")).getText();
	//Assert.assertEquals(s3,"Launching ePricer, please wait.");
	WebDriverWait wait = new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.invisibilityOfElementWithText(By.cssSelector("h3"),"Launching ePricer, please wait."));
	System.out.println("Launching ePricer, please wait. message is removed");
	*/
	
	/*WebDriverWait wait = new WebDriverWait(driver, 85);
	System.out.println("Waiting for Java script page load to execute");
    wait.until(new ExpectedCondition<Boolean>() {
        public Boolean apply(WebDriver driver) {
            return ((JavascriptExecutor) driver).executeScript(
                "return document.readyState"
            ).equals("complete");
        }
    }
   	);
    System.out.println("Java script page load is complete");
	*/
	WebDriverWait wait=new WebDriverWait(driver,85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[name='SelectARole']")));
}
	catch (TimeoutException eTO) {
		
		 System.out.println("Page load Timeout failure after 85 seconds");
		 System.out.println("Refresh the browser");
		 driver.navigate().refresh();
		 Thread.sleep(6000);
		WebDriverWait wait=new WebDriverWait(driver,85);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[name='SelectARole']")));
		// eTO.printStackTrace();
		// Assert.fail();
	}	
}



@Then("^Click on SelectARole dropdown and select EU Transaction Quotes GTS Opportunity Owner ZZ$")
public void click_on_SelectARole_dropdown_and_select_EU_Transaction_Quotes_GTS_Opportunity_Owner_ZZ() throws Throwable {
		new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("EU Transaction Quotes GTS Opportunity Owner ZZ");
   
}

@Then("^New quote page should open for prod rw EMEA$")
public void new_quote_page_should_open_for_prod_rw_EMEA() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);
	

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel
	
	sheet1.getRow(3).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(3).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("EMEA Quote id " +quoteid+ " is successfully copied to excel sheet");

    
}

@Then("^New quote page should open for prod rw EMEATSS$")
public void new_quote_page_should_open_for_prod_rw_EMEATSS() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);
	

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel
	
	sheet1.getRow(11).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(11).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("EMEA Quote id " +quoteid+ " is successfully copied to excel sheet");

    
}

@Then("^On Customer information page click on Add a new Customer$")
public void on_Customer_information_page_click_on_Add_a_new_Customer() throws Throwable {
	
	// The below commented code is to select a new customer-- Writing new code to Search for an existing customer
	Thread.sleep(3000);
	String cssSelectorOfSameElements=".btn.btn-primary.ng-scope"; 
    java.util.List<WebElement> a1=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	a1.get(2).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	
}

/*
@Then("^On Customer information page click on Search a Customer$")
public void on_Customer_information_page_click_on_Search_a_Customer() throws Throwable {
	
	// The below commented code is to select a new customer-- Writing new code to Search for an existing customer
	Thread.sleep(3000);
	String cssSelectorOfSameElements=".btn. btn-primary ng-scope"; 
    java.util.List<WebElement> a1=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	a1.get(2).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	
}
*/

@Then("^Verify the status of the quote$")
public void verify_the_status_of_the_quote() throws Throwable {

Thread.sleep(2000);	
//String String1=driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteheader-page/div/div[2]/div[1]//strong[contains(text(),'Waiting for approval')]")).getText();
//String String1=driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteheader-page/div/div[2]/div[1]//span[contains(text(),'Waiting for approval')]")).getText();
String String1=driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteheader-page/div[2]/div/div[2]/div[1]/div[5]//span[contains(text(),'Waiting for approval')]")).getText();




System.out.println(String1);
Assert.assertEquals("Waiting for approval",String1);

}

@Then("^close the window$")
public void close_the_window() throws Throwable {
   driver.close();
   Thread.sleep(1000);
}

@Then("^Click on SelectARole dropdown and select TRPR-EU Pricer ZZ-Dummy-France$")
public void click_on_SelectARole_dropdown_and_select_TRPREU_Pricer_ZZ_Dummy_France() throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("TRPR-EU Pricer ZZ-Dummy-France");
   
}

@Then("^Click on SelectARole dropdown and select EU Transaction Quotes GTS Approver ZZ$")
public void click_on_SelectARole_dropdown_and_select_EU_Transaction_Quotes_GTS_Approver_ZZ() throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("EU Transaction Quotes GTS Approver ZZ");
   
}



@Then("^Search for the quoteID from excel sheet for EMEA prod rw$")
public void search_for_the_quoteID_from_excel_sheet_for_EMEA_prod_rw() throws Throwable {
    
	Thread.sleep(5000);
	
/*	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
//	HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel
	
	String EMEAQuoteID = sheet1.getRow(3).getCell(2).getStringCellValue(); //get data from  3 row and 2 coloumn
	
	System.out.println("Data from Excel is " + EMEAQuoteID);

	fis.close();*/
	
	utility obj=new utility();
	String EMEAQuoteID= obj.getData(1, 3, 2);
	System.out.println("Data from Excel is " + EMEAQuoteID);
	
	
	Thread.sleep(6000);
	
	//Click on search quote 

	driver.findElement(By.xpath("//div[@class='quotesearch']")).click();
	Thread.sleep(6000);
	//driver.findElement(By.cssSelector("input[title='Enter quoteid(s)'][class='ng-pristine ng-untouched ng-valid input-control focusedRed']")).sendKeys(EMEAQuoteID);

	driver.findElement(By.cssSelector("input[title='Enter quoteid(s)'][class='ng-pristine ng-untouched ng-valid ng-scope input-control focusedRed']")).sendKeys(EMEAQuoteID);

	//Click on Search button
	//span[contains(text(),'Search')and@class='btn btn-primary btn-lg']
	driver.findElement(By.xpath("//span[contains(text(),'Search')and@class='btn btn-primary btn-lg']")).click();
	Thread.sleep(5000);
	
}
@Then("^Click on pricing tab$")
public void click_on_pricing_tab() throws Throwable {
	
	driver.findElement(By.xpath(".//*[text()='Pricing']")).click();
	Thread.sleep(2000);
}


@Then("^Inside Copra tab close the pop up and click on prices tab$")
public void inside_Copra_tab_close_the_pop_up_and_click_on_prices_tab() throws Throwable {
	Thread.sleep(4000);
//	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	/*//click on Prices tab
	driver.findElement(By.xpath("//a[contains(text(),'Prices')]")).click();
	Thread.sleep(4000);*/
}

@Then("Open the TSS Maintenance tab and verify it")
public void Open_the_TSS_Maintenance_tab_and_verifyit() throws Throwable {
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"ibm-pagetitle-h1\"]/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/div[1]/ul/li[3]/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"ibm-pagetitle-h1\"]/div[3]/div[2]/quoteedit-page/div/div/quoteprices-page/div/tssmaintenance-page/div/div/div[1]/font/a"));
	System.out.println("TSS Maintainence tab verified ");
}

@Then("^Click on Request Approval and send the quote for approval for EMEA with COPRA failing error pop up$")
public void click_on_Request_Approval_and_send_the_quote_for_approval_for_EMEA_with_COPRA_failing_error_pop_up() throws Throwable {
	//Click on Request approval tab ---
		//a[contains(text(),'Request approval')]
		 //use xpath:
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Request approval')]")).click();
		 Thread.sleep(3000);
		 driver.switchTo().alert().accept();
		Thread.sleep(3000);
		 
		//Click on Save and continue button:
		String cssSelectorOfSameElements="strong[translate='Next']";
	    java.util.List<WebElement> a2=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
		a2.get(1).click();
		Thread.sleep(3000);

		//driver.findElement(By.xpath("//a[contains(text(),'Request approval')]")).click();
		
		// Close the error popup
	//	driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
//		Inside send Notification popup:
		Thread.sleep(5000);
		driver.switchTo().activeElement();
//		Enter email address manually::::
		driver.findElement(By.xpath(".//*[@id='manualemail']")).sendKeys("epbuild@in.ibm.com");
//		Click on Add to button:
		//button[@data-ng-click='notificationAddEmail('ATO','M');']
		//textarea[@id='manualemail']/following::button[1]
		driver.findElement(By.xpath("//textarea[@id='manualemail']/following::button[1]")).click();
//		Click on Send button:
		//strong[@translate='Send']
		driver.findElement(By.xpath("//strong[@translate='Send']")).click();
		Thread.sleep(7000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
	}




///////////////////////////////////////////////Testcases for AP prod rw//////////////////////////

@Then("^Click on SelectARole dropdown and select TROOPPRV(\\d+)-AP OO on profit plan \\(V(\\d+)-Dummy-Singapore\\)$")
public void click_on_SelectARole_dropdown_and_select_TROOPPRV_AP_OO_on_profit_plan_V_Dummy_Singapore(int arg1, int arg2) throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("TROOPPRV1-AP OO on profit plan (V1-Dummy-Singapore)");

}

@Then("^New quote page should open for prod rw AP$")
public void new_quote_page_should_open_for_prod_rw_AP() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);
	

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel
	
	sheet1.getRow(2).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(2).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("AP Quote id " +quoteid+ " is successfully copied to excel sheet");

}

@Then("^Click on SelectARole dropdown and select TRPRV(\\d+)-AP Pricer \\(V(\\d+)-Dummy-Singapore\\)$")
public void click_on_SelectARole_dropdown_and_select_TRPRV_AP_Pricer_V_Dummy_Singapore(int arg1, int arg2) throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("TRPRV1-AP Pricer (V1-Dummy-Singapore)");

}

@Then("^Search for the quoteID from excel sheet for AP prod rw$")
public void search_for_the_quoteID_from_excel_sheet_for_AP_prod_rw() throws Throwable {
Thread.sleep(5000);
	
	/*File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
//	HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel
	
	String APQuoteID = sheet1.getRow(2).getCell(2).getStringCellValue(); //get data from  2 row and 2 coloumn
	
	System.out.println("Data from Excel is " + APQuoteID);
	fis.close();
*/
	utility obj=new utility();
	String APQuoteID= obj.getData(1, 2, 2);
	System.out.println("Data from Excel is " + APQuoteID);
	
	
	Thread.sleep(6000);
	
	//Click on search quote 

	driver.findElement(By.xpath("//div[@class='quotesearch']")).click();
	Thread.sleep(6000);
	//driver.findElement(By.cssSelector("input[title='Enter quoteid'][class='ng-pristine ng-untouched ng-valid input-control focusedRed']")).sendKeys(APQuoteID);
	driver.findElement(By.cssSelector("input[title='Enter quoteid(s)'][class='ng-pristine ng-untouched ng-valid ng-scope input-control focusedRed']")).sendKeys(APQuoteID);

	//Click on Search button
	//span[contains(text(),'Search')and@class='btn btn-primary btn-lg']
	driver.findElement(By.xpath("//span[contains(text(),'Search')and@class='btn btn-primary btn-lg']")).click();
	Thread.sleep(5000);
	}


/////////////////////////////////////NA testcases for prod rw///////////////////////////////////////



@Then("^Click on SelectARole dropdown and select X(\\d+) Channel Pricer$")
public void click_on_SelectARole_dropdown_and_select_X_Channel_Pricer(int arg1) throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("X1 Channel Pricer");	

}

@Then("^New quote page should open for prod rw NA$")
public void new_quote_page_should_open_for_prod_rw_NA() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);
	

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel
	
	sheet1.getRow(1).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(1).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("NA Quote id " +quoteid+ " is successfully copied to excel sheet");

}






//////////////////////////////////////////////LA testcases prod rw///////////////////////////////////




@Then("^DUMMY Y(\\d+) Transaction Quotes Profit Opportunity Owner$")
public void dummy_Y_Transaction_Quotes_Profit_Opportunity_Owner(int arg1) throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("DUMMY Y1 Transaction Quotes Profit Opportunity Owner");	

}

@Then("^New quote page should open for prod rw LA$")
public void new_quote_page_should_open_for_prod_rw_LA() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);
	

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel
	
	sheet1.getRow(4).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(4).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("LA Quote id " +quoteid+ " is successfully copied to excel sheet");

}

@Then("^Click on Request Approval and send the quote for approval for LA$")
public void click_on_Request_Approval_and_send_the_quote_for_approval_for_LA() throws Throwable {
	//Click on Request approval tab ---
	//a[contains(text(),'Request approval')]
	 //use xpath:
	 driver.findElement(By.xpath("//a[contains(text(),'Request approval')]")).click();
	 Thread.sleep(3000);
	 driver.switchTo().alert().accept();
	Thread.sleep(3000);
	 
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[1] ")).sendKeys("IBM epricer");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[2] ")).sendKeys("9879987");
	//driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[3] ")).sendKeys("ibm");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[4] ")).click();
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[8] ")).click();
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[10] ")).click();
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[13] ")).click();
	//driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[14] ")).click();
	//driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[16] ")).click();
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[15] ")).sendKeys("india");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[16] ")).click();
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[18] ")).sendKeys("abc");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[19] ")).sendKeys("yes");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[20] ")).click();
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[22] ")).click();
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[24] ")).click();
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[26] ")).sendKeys("rtyr");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[27] ")).click();
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[29] ")).click();
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[31] ")).click();
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[33] ")).click();
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[35] ")).sendKeys("Onshore");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[36] ")).sendKeys("No");
	/*
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[18] ")).sendKeys("india");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[19] ")).sendKeys("yes");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[20] ")).sendKeys("1000");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[21] ")).sendKeys("2000");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[22] ")).sendKeys("sd");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[23] ")).sendKeys("sdf");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[24] ")).sendKeys("ds");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[25] ")).sendKeys("sdff");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[26] ")).sendKeys("rtyr");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[27] ")).sendKeys("fgdf");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[28] ")).sendKeys("tyuyt");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[29] ")).sendKeys("sds");
	driver.findElement(By.xpath("//*[contains(text(),'Customer Corporate Name')]//following::input[30] ")).sendKeys("sdfds");
	*/
			
	//Click on Save and continue button:
	String cssSelectorOfSameElements="strong[translate='Next']";
    java.util.List<WebElement> a2=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	a2.get(1).click();
	Thread.sleep(3000);

	//driver.findElement(By.xpath("//a[contains(text(),'Request approval')]")).click();
	 
//	Inside send Notification popup:
	Thread.sleep(3000);
	driver.switchTo().activeElement();
//	Enter email address manually::::
	driver.findElement(By.xpath(".//*[@id='manualemail']")).sendKeys("epbuild@in.ibm.com");
//	Click on Add to button:
	//button[@data-ng-click='notificationAddEmail('ATO','M');']
	//textarea[@id='manualemail']/following::button[1]
	driver.findElement(By.xpath("//textarea[@id='manualemail']/following::button[1]")).click();
//	Click on Send button:
	//strong[@translate='Send']
	driver.findElement(By.xpath("//strong[@translate='Send']")).click();
	Thread.sleep(7000);
	driver.switchTo().alert().accept();
	Thread.sleep(6000);
	
}

@Then("^Approve the quote using Approval tab for LA$")
public void approve_the_quote_using_Approval_tab_for_LA() throws Throwable {
//	Click on approval tab:
	//	a[contains(text(),'Approval')]
		driver.findElement(By.xpath("//a[contains(text(),'Approval')]")).click();
		Thread.sleep(3000);


		 
//		Click on approve radio button
//		.//*[@id='radio_Approval_approve']
		driver.findElement(By.xpath(".//*[@id='radio_Approval_approve']")).click();

//		Enter the email id:
//		.//*[@id='CUE_BUE_RTL_ID']
		driver.findElement(By.xpath(".//*[@id='CUE_BUE_RTL_ID']")).sendKeys("epbuild@in.ibm.com");

//		Select one SBC:
		new Select (driver.findElement(By.id("backupgroupnameid1"))).selectByValue("0");

      // In LA there is no Submit button - so sanity ends here..... in waiting for approval state
		Thread.sleep(5000);
}


@Then("^Click on SelectARole dropdown and select DUMMY Y(\\d+) Transaction Quotes Administrative Pricer$")
public void click_on_SelectARole_dropdown_and_select_DUMMY_Y_Transaction_Quotes_Administrative_Pricer(int arg1) throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("DUMMY Y1 Transaction Quotes Administrative Pricer");	

}

@Then("^Search for the quoteID from excel sheet for LA prod rw$")
public void search_for_the_quoteID_from_excel_sheet_for_LA_prod_rw() throws Throwable {
Thread.sleep(5000);
	
	/*File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
//	HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel
	
	String LAQuoteID = sheet1.getRow(4).getCell(2).getStringCellValue(); //get data from 4 row and 2 coloumn
	
	System.out.println("Data from Excel is " + LAQuoteID);

	fis.close();
*/	
	utility obj=new utility();
	String LAQuoteID= obj.getData(1, 4, 2);
	System.out.println("Data from Excel is " + LAQuoteID);
	Thread.sleep(6000);
	
	//Click on search quote 

	driver.findElement(By.xpath("//div[@class='quotesearch']")).click();
	Thread.sleep(6000);
	//driver.findElement(By.cssSelector("input[title='Enter quoteid'][class='ng-pristine ng-untouched ng-valid input-control focusedRed']")).sendKeys(LAQuoteID);

	driver.findElement(By.cssSelector("input[title='Enter quoteid(s)'][class='ng-pristine ng-untouched ng-valid ng-scope input-control focusedRed']")).sendKeys(LAQuoteID);

	//Click on Search button
	//span[contains(text(),'Search')and@class='btn btn-primary btn-lg']
	driver.findElement(By.xpath("//span[contains(text(),'Search')and@class='btn btn-primary btn-lg']")).click();
	Thread.sleep(5000);
	
	//Close the pop up in LA
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	

}




////////////////////////////////////Prod rw PCS NA BP////////////////////////////////////////////////////////////

@When("^Click on PCS Prod rw link$")
public void click_on_PCS_Prod_rw_link() throws Throwable {
	
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	//	Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AutoIT Script\\HandleAuthWindow.exe");
	//	driver.findElement(By.cssSelector("a[href='https://inmbzp4174.in.dst.ibm.com/services/epricer/v2/ibm/']")).click();

	driver.get("https://www-304.ibm.com/partnerworld/commerce/programs/portal/active/home/signin.jsp ");
	Thread.sleep(9000);
	
	/* 
	 * Ashutosh Valivade: Now IBM PartnerCommerce page comes first before login page
	 */
	//click on IBM PartnerCommerce / Servers radiobutton
	driver.findElement(By.xpath(".//*[@id='pcs']")).click();

	//Select united states from the drop down
	new Select (driver.findElement(By.xpath(".//*[@id='lbl_country']"))).selectByVisibleText("United States - English");	
	
	//Click on continue button
	driver.findElement(By.cssSelector("input[name='PartnerCommerce.Settings.Continue']")).click();
	Thread.sleep(7000);
	
	//Generic Id credentials
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("epbuild@in.ibm.com");
	driver.findElement(By.xpath(".//*[@type='password']")).sendKeys("epbuild102017");
	driver.findElement(By.xpath(".//*[@id='signinbutton']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.findElement(By.xpath(".//*[@id='continuebutton']")).click();
	//Thread.sleep(8000);
	//driver.findElement(By.xpath(".//*[@id='desktop']")).sendKeys("epbuild@in.ibm.com");
	//driver.findElement(By.xpath(".//*[@type='password']")).sendKeys("epbuild102017");
	//driver.findElement(By.xpath(".//*[@id='signinbutton']")).click();
	//driver.findElement(By.xpath(".//*[@id='btn_signin']")).click();
	Thread.sleep(7000);
	
	/*
	// W3 Login ID Details
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("epbuild@in.ibm.com");
		driver.findElement(By.xpath(".//*[@id='continuebutton']")).click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		//Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='desktop']")).sendKeys("epbuild@in.ibm.com");
		driver.findElement(By.xpath(".//*[@type='password']")).sendKeys("epbuild102017");
		driver.findElement(By.xpath(".//*[@id='btn_signin']")).click();
		Thread.sleep(7000);
	*/

	/*
	 * PCS Credentials
	 *
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("mbhatna2@in.ibm.com");
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("shuchi@42b");
	driver.findElement(By.xpath(".//*[@id='signinbutton']")).click();
	Thread.sleep(7000);
	*/
	
}


@Then("^Prod rw PCS page should open$")
public void Prod_rw_PCS_page_should_open() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='PartnerCommerce Program']")));
	System.out.println("The PCS BP page is displayed");
   	}


@Then("^Enter all the details to rediect to IBM PCS page$")
public void Enter_all_the_details_to_rediect_to_IBM_PCS_page() throws Throwable {

	/*
	 *Ashutosh Valivade: For IBMid Changes, PartnerCommerce page comes first
	 *
	//click on IBM PartnerCommerce / Servers radiobutton
	driver.findElement(By.xpath(".//*[@id='pcs']")).click();

	//Select united states from the drop down
	new Select (driver.findElement(By.xpath(".//*[@id='lbl_country']"))).selectByVisibleText("United States - English");	
	
	//Click on continue button
	driver.findElement(By.cssSelector("input[name='PartnerCommerce.Settings.Continue']")).click();
	
	Thread.sleep(2000);
	*/
	
	//Select profile
	String expectedTitle = "IBM PartnerCommerce/Servers";
	String actualTitle = driver.getTitle();
	
	if(expectedTitle.equals(actualTitle)) {
	System.out.println("Page title is : "+ actualTitle);
	WebElement profile = driver.findElement(By.xpath("//*[text()='Select profile']"));
	profile.click();
	Thread.sleep(2000);
	
	//Select first radio button- manas epricer
	driver.findElement(By.xpath(".//*[@id='lbl_profile0']")).click();
	
		//Click on continue button
		driver.findElement(By.xpath("//input[@type='image'][@value='Continue']")).click();
		Thread.sleep(2000);


		//Click on epricer link button
		driver.findElement(By.xpath("//a[text()='e-Pricer']")).click();
		Thread.sleep(9000);
		driver.manage().timeouts().pageLoadTimeout(85, TimeUnit.SECONDS);
			try{
			WebDriverWait wait= new WebDriverWait(driver, 85);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[name='SelectARole']")));
			System.out.println("The IBM GUI home page is displayed");
			System.out.println("Waited for pageloadtimeout and the page has loaded now");
			}
			catch(TimeoutException eTO)
			{
				System.out.println("PCS Page load Timeout failure after 85 seconds");
				System.out.println("Refresh the PCS browser");
				 driver.navigate().refresh();
				 Thread.sleep(6000);
				 WebDriverWait wait= new WebDriverWait(driver, 85);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[name='SelectARole']")));
				System.out.println("The IBM GUI home page is displayed after a page refresh"); 
				//eTO.printStackTrace();
				//Assert.fail();
			}
			
		}
	
	else {
	//Click on epricer link button
	driver.findElement(By.xpath("//a[text()='e-Pricer']")).click();
	Thread.sleep(9000);
	driver.manage().timeouts().pageLoadTimeout(85, TimeUnit.SECONDS);
		try{
		WebDriverWait wait= new WebDriverWait(driver, 85);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[name='SelectARole']")));
		System.out.println("The IBM GUI home page is displayed");
		System.out.println("Waited for pageloadtimeout and the page has loaded now");
		}
		catch(TimeoutException eTO)
		{
			System.out.println("PCS Page load Timeout failure after 85 seconds");
			System.out.println("Refresh the PCS browser");
			 driver.navigate().refresh();
			 Thread.sleep(6000);
			 WebDriverWait wait= new WebDriverWait(driver, 85);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[name='SelectARole']")));
			System.out.println("The IBM GUI home page is displayed after a page refresh"); 
			//eTO.printStackTrace();
			//Assert.fail();
		}
		

	}
}

@Then("^Click on SelectARole dropdown and select SP(\\d+) Maint - COV TR X(\\d+)$")
public void click_on_SelectARole_dropdown_and_select_SP_Maint_COV_TR_X(int arg1, int arg2) throws Throwable {
	
	new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("SP1 Maint - COV TR X1");	
}

@Then("^In Overview tab enter the required details_SB$")
public boolean in_Overview_tab_enter_the_required_details_SB() throws Throwable { 
	Thread.sleep(5000);
	boolean createquoteopened= false;
	WebDriverWait wait = new WebDriverWait(driver, 15 /*timeout in seconds*/);
	
	try {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Quote ID: ']//following::div[1]")));
		createquoteopened = true;
		System.out.println("Inside try block---New Quote page is opened in first attempt");

				
	} catch (TimeoutException eTO) {
		// TODO Auto-generated catch block
		eTO.printStackTrace();
		createquoteopened= false;
		System.out.println("New Quote page is still loding");
		System.out.println("Inside catch block");
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		WebDriverWait wait1= new WebDriverWait(driver, 85);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[name='SelectARole']")));
		System.out.println("The IBM GUI home page is displayed");
		new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("SP1 Maint - COV TR X1");
		driver.findElement(By.cssSelector("span.btn.btn-success.btn-lg")).click();
		Thread.sleep(1000);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.createquote")).click();
		Thread.sleep(7000);
		System.out.println("Now New Quote page is should opened now- after catch block otherwise it should fail");
	}
	
	System.out.println("New Quote page is now opened");
	String quoteid=driver.findElement(By.xpath(".//*[text()='Quote ID: ']//following::div[1]")).getText();
	System.out.println( "Quote Id is " + quoteid);

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel

	sheet1.getRow(6).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(6).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("PCS BP NA_SB Quote id " +quoteid+ " is successfully copied to excel sheet");

	
	//Quote title: .//*[@title='Quote title']
	driver.findElement(By.xpath(".//*[@title='Quote title']")).sendKeys("TestIBMPCS");

//	Select bid type:  .//*[@name='Select bid type']
	new Select (driver.findElement(By.xpath(".//*[@name='Select bid type']"))).selectByVisibleText("Standard");
	return createquoteopened;
}

/*
@Then("^In Overview tab enter the required details_VS$")
public boolean in_Overview_tab_enter_the_required_details_VS() throws Throwable { 
	Thread.sleep(5000);
	boolean createquoteopened= false;
	WebDriverWait wait = new WebDriverWait(driver, 15 /*timeout in seconds*///);
/*	
	try {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Quote ID: ']//following::div[1]")));
		createquoteopened = true;
		System.out.println("Inside try block---New Quote page is opened in first attempt");

				
	} catch (TimeoutException eTO) {
		// TODO Auto-generated catch block
		eTO.printStackTrace();
		createquoteopened= false;
		System.out.println("New Quote page is still loding");
		System.out.println("Inside catch block");
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		WebDriverWait wait1= new WebDriverWait(driver, 85);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[name='SelectARole']")));
		System.out.println("The IBM GUI home page is displayed");
		new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("SP1 Maint - COV TR X1");
		driver.findElement(By.cssSelector("span.btn.btn-success.btn-lg")).click();
		Thread.sleep(1000);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.createquote")).click();
		Thread.sleep(7000);
		System.out.println("Now New Quote page is should opened now- after catch block otherwise it should fail");
	}
	
	System.out.println("New Quote page is now opened");
	String quoteid=driver.findElement(By.xpath(".//*[text()='Quote ID: ']//following::div[1]")).getText();
	System.out.println( "Quote Id is " + quoteid);

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel

	sheet1.getRow(7).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(7).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("PCS BP NA_VS Quote id " +quoteid+ " is successfully copied to excel sheet");
	
	//Quote title: .//*[@title='Quote title']
	driver.findElement(By.xpath(".//*[@title='Quote title']")).sendKeys("TestIBMPCS");

//	Select bid type:  .//*[@name='Select bid type']
	new Select (driver.findElement(By.xpath(".//*[@name='Select bid type']"))).selectByVisibleText("Standard");
	return createquoteopened;
}
*/

@Then("^Add product manually for PCS$")

public void add_product_manually_for_PCS() throws Throwable {
	Thread.sleep(4000);
    driver.findElement(By.cssSelector("span[translate='Add_product_manually']")).click();
	Thread.sleep(5000);
	
	driver.switchTo().activeElement();
	Thread.sleep(1000);
	
	//Selecting hardware
	new Select (driver.findElement(By.xpath(".//*[@id='categoryselected']"))).selectByVisibleText("Hardware");
	
	//Selecting type
	driver.findElement(By.xpath(".//*[@id='type']")).sendKeys("7014");
  
	//Selecting Model
	driver.findElement(By.xpath(".//*[@id='model']")).sendKeys("T42");
	Thread.sleep(2000);
	
	//Click on Add and Close
	driver.findElement(By.xpath("//span[text()='Add and close']")).click();
	
	Thread.sleep(6000);
	
	
//	driver.switchTo().defaultContent();
	/*
	//Ashutosh Valivade: CFR Upload changes
	WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));

    // enter the file path onto the file-selection input field
    uploadElement.sendKeys("C:\\Users\\IBM_ADMIN\\Desktop\\Goodyear_PROD2_5lpars_40c_2662gbRAM(1).cfr");
    System.out.println("File Selected Successfully !!!");
    
    // check on "Upload CFR(s)" button
    driver.findElement(By.xpath("//span[text()='Upload CFR(s)']")).click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    System.out.println("File Uploaded Successfully !!!");
    */
}

@Then("^click on collect pricing for PCS$")
public void click_on_collect_pricing_for_PCS() throws Throwable {
	Thread.sleep(2000);
	String cssSelectorOfSameElements1="input[title='CheckAll']";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements1)) ;
	a.get(0).click();
	Thread.sleep(3000);

	String cssSelectorOfSameElements2="span[translate='Collect_Pricing']";
    java.util.List<WebElement> a1=driver.findElements(By.cssSelector(cssSelectorOfSameElements2)) ;
	a1.get(0).click();
	Thread.sleep(6000);
	
	
	String cssSelectorOfSameElements="strong[translate='Next']";
    java.util.List<WebElement> a2=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	a2.get(1).click();		
	Thread.sleep(4000);  

}

@Then("^fill details inside Registration and customer tab$")
public void fill_details_inside_Registration_and_customer_tab() throws Throwable {
	driver.findElement(By.xpath("//span[@translate='search_customer']")).click();	


	Thread.sleep(3000);

		driver.switchTo().activeElement();
//		Enter CMR number:
		driver.findElement(By.xpath(".//*[@id='SearchFor']")).sendKeys("2098624");	
		driver.findElement(By.xpath(".//*[@id='SearchFor']//following::span[@translate='search_customer']")).click();	

		Thread.sleep(9000);
		Thread.sleep(9000);
		//BP company name:
		driver.findElement(By.xpath(".//*[@id='bpCompanyName']")).sendKeys("IBM test");	
		Thread.sleep(1000);
		String cssSelectorOfSameElements="strong[translate='Next']";
	    java.util.List<WebElement> a2=driver.findElements(By.cssSelector(cssSelectorOfSameElements));
		a2.get(2).click();		
		Thread.sleep(3000); 
}

/*
// PCS NA VS
@Then("^in Details pricing tab click on Accept value seller offer$")
public void in_Details_pricing_tab_click_on_Accept_value_seller_offer() throws Throwable {
	
	//Click on Accept value seller offer button

	   String cssSelectorOfSameElements="strong[translate='Accept_Value_Seller_Offer']";
	    java.util.List<WebElement> a3=driver.findElements(By.cssSelector(cssSelectorOfSameElements));
		a3.get(0).click();
		Thread.sleep(5000);

}

// PCS NA VS
@Then ("^Click on Addendum$")
public void Click_on_Addendum() throws Throwable{
	
	// Click on Addendum button
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[contains(text(),'Addendum')]")).click();
	Thread.sleep(4000);
	
}
*/

// PCS NA SB
@Then("^in Details pricing tab click on Submit price request$")
public void in_Details_pricing_tab_click_on_Submit_price_request() throws Throwable {
	
	//Click on submit price request button

	   String cssSelectorOfSameElements="strong[translate='Submit_Price_Request']";
	    java.util.List<WebElement> a2=driver.findElements(By.cssSelector(cssSelectorOfSameElements));
		a2.get(0).click();
		Thread.sleep(2000);

//decision maker name

driver.findElement(By.cssSelector("input[id='decisionmakername']")).sendKeys("Ashutosh");	

//email

driver.findElement(By.cssSelector("input[id='decisionmakeremail']")).sendKeys("epbuild@in.ibm.com");	

//title
driver.findElement(By.cssSelector("input[id='decisionmakertitle']")).sendKeys("Valivade");	

//project name
driver.findElement(By.cssSelector("input[id='projectname']")).sendKeys("epricer");


//////IBM channel contact:

driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Ashutosh");

driver.findElement(By.cssSelector("input[id='phoneNumber']")).sendKeys("9999999999");

driver.findElement(By.cssSelector("input[id='enterContactEmail']")).sendKeys("epbuild@in.ibm.com");
/*
driver.switchTo().frame("ui-tinymce-0_ifr");
driver.findElement(By.id("tinymce")).sendKeys("Sanity Test");
driver.switchTo().defaultContent();
*/
driver.findElement(By.cssSelector("button[id='submitandsendnotification']")).click();

Thread.sleep(3000);


}


@Then("^Search for the quoteID from excel sheet for PCS NA BP prod rw$")
public void search_for_the_quoteID_from_excel_sheet_for_PCS_NA_BP_prod_rw() throws Throwable {
Thread.sleep(5000);
	
	/*File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
//	HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel
	
	String NA_BP_PCSQuoteID = sheet1.getRow(6).getCell(2).getStringCellValue(); //get data from  2 row and 2 coloumn
	
	System.out.println("Data from Excel is " + NA_BP_PCSQuoteID);

	fis.close();
	
*/	
	utility obj=new utility();
	String NA_BP_PCSQuoteID= obj.getData(1, 6, 2);
	System.out.println("Data from Excel is " + NA_BP_PCSQuoteID);
	Thread.sleep(6000);
	
	//Click on search quote 

	driver.findElement(By.xpath("//div[@class='quotesearch']")).click();
	Thread.sleep(6000);
	//driver.findElement(By.cssSelector("input[title='Enter quoteid'][class='ng-pristine ng-untouched ng-valid input-control focusedRed']")).sendKeys(NA_BP_PCSQuoteID);

	driver.findElement(By.cssSelector("input[title='Enter quoteid(s)'][class='ng-pristine ng-untouched ng-valid ng-scope input-control focusedRed']")).sendKeys(NA_BP_PCSQuoteID);

	//Click on Search button
	//span[contains(text(),'Search')and@class='btn btn-primary btn-lg']
	driver.findElement(By.xpath("//span[contains(text(),'Search')and@class='btn btn-primary btn-lg']")).click();
	Thread.sleep(5000);
	}


@Then("^inside submit and send popup enter email id and send email$")
public void inside_submit_and_send_popup_enter_email_id_and_send_email() throws Throwable {
	
	Thread.sleep(6000);
	
	driver.switchTo().activeElement();
	
	Thread.sleep(4000);

	driver.findElement(By.xpath(".//*[text()='To:']//following::input[1]")).sendKeys("epbuild@in.ibm.com");

	driver.findElement(By.xpath(".//*[@translate='send']")).click();

	Thread.sleep(8000);
}

@Then("^Click on comments and status and remove the quote from on hold status$")
public void click_on_comments_and_status_and_remove_the_quote_from_on_hold_status() throws Throwable {
	Thread.sleep(10000);

	driver.findElement(By.xpath("//a[contains(text(),'Comments/Status')]")).click();	
	//driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/div[2]/div/ul/li[4]/div/div/a")).click();
		
	Thread.sleep(2000);

	//click on change status radio button
	driver.findElement(By.xpath(".//*[@id='commentsIdRfh']")).click();
/*
	driver.findElement(By.xpath(".//*[@id='commentsId']")).click();

	//Select a status:
	new Select (driver.findElement(By.xpath("//select[@title='Selected Status is']"))).selectByVisibleText("Request pricing");

	//Select reason code:

	new Select (driver.findElement(By.xpath("//select[@title='Select the reason code']"))).selectByVisibleText("Pricer");
*/
	//enter some comments:

	driver.switchTo().frame("ui-tinymce-0_ifr");
	driver.findElement(By.id("tinymce")).sendKeys("Sanity Test");
	driver.switchTo().defaultContent();

	//click on apply button

  	driver.findElement(By.xpath("//strong[@translate='Apply']")).click();
	Thread.sleep(20000);
/*
	WebDriverWait wait = new WebDriverWait(driver, 5 /*timeout in seconds/);
	if(wait.until(ExpectedConditions.alertIsPresent())==null) {
		System.out.println("alert was not present");
	}
	else {
		driver.switchTo().alert().dismiss();
	    System.out.println("alert was present");
	}
	Thread.sleep(7000);
	
	//Verify status of the quote:
//new
	//String String1=driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteheader-page/div/div[2]/div[1]//span[contains(text(),'Request pricing')]")).getText();

	String String1=driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteheader-page/div[2]/div/div[2]/div[1]/div[5]//span[contains(text(),'Request pricing')]")).getText();
	System.out.println(String1);
	Assert.assertEquals("Request pricing - Pricer",String1);
*/
}

@Then("^Click on pricing tab and approve the quote$")
public void click_on_pricing_tab_and_approve_the_quote() throws Throwable {
	//click on pricing
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//div[contains(text(),'Configuration')]//following::div[1]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Pricing')]")).click();
	Thread.sleep(3000);

	
	//Click on approval tab:
	driver.findElement(By.xpath("//a[contains(text(),'Approval')]")).click();
	Thread.sleep(5000);
			 
   //Click on approve radio button
   //.//*[@id='radio_Approval_approve']
	//driver.findElement(By.xpath(".//*[@id='approvalCode_approve']")).click();
	//driver.findElement(By.id("approvalCode_approve")).click();
	
	
	// click on submit button
	driver.findElement(By.xpath(".//*[@id='submitForm']")).click();
	Thread.sleep(6000);

	//Verify status of the quote:
	//new updated xpath from strong to span
	//String String1=driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteheader-page/div/div[2]/div[1]//span[contains(text(),'IBM approved')]")).getText();

	String String1=driver.findElement(By.xpath(".//*[@id='ibm-pagetitle-h1']/div[3]/div[2]/quoteedit-page/div/div/quoteheader-page/div[2]/div/div[2]/div[1]/div[5]//span[contains(text(),'IBM approved')]")).getText();


	System.out.println(String1);
	Assert.assertEquals("IBM approved - Manual",String1);
}


@Then("^verify reports for BP$")
public void verify_reports_for_BP() throws Throwable {
	//For Bottom line customer offer letter
	driver.findElement(By.xpath("//a[contains(text(),'Reports/Letters')]")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//strong[@translate='Addendum']")).click();
	Thread.sleep(4000);
			
	String parentWindow = driver.getWindowHandle();
	Set<String> handles =  driver.getWindowHandles();
	for(String windowHandle  : handles)
	{
	if(!windowHandle.equals(parentWindow))
	{
	driver.switchTo().window(windowHandle);
	Thread.sleep(1000);
	String s3=driver.findElement(By.cssSelector("h1")).getText();
	Assert.assertEquals("IBM Confidential", s3);
	System.out.println("Addendum is opened");

	//Thread.sleep(2000);
	driver.close(); //closing child window
	driver.switchTo().window(parentWindow); //cntrl to parent window
	Thread.sleep(3000);
	}
	}

	//For standard report:

	driver.findElement(By.xpath("//*[contains(text(),'Standard report')]")).click();
		//driver.findElement(By.xpath("//*[contains(text(),'Standard report')]").click();
		Thread.sleep(4000);
				
		String parentWindow3 = driver.getWindowHandle();
		Set<String> handles3 =  driver.getWindowHandles();
		for(String windowHandle  : handles3)
		{
		if(!windowHandle.equals(parentWindow3))
		{
		driver.switchTo().window(windowHandle);
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		WebElement	s2= driver.findElement(By.cssSelector("h2"));
		//Thread.sleep(2000);
		if(s2.getText().contains("Standard Report"))
		{
		System.out.println("Standard Report is opened");
		}
		else
		{
		System.out.println("Standard report is not opened");
		}	
		driver.close(); //closing child window
		driver.switchTo().window(parentWindow3); //cntrl to parent window
		Thread.sleep(2000);
		}
		}

//		For History Report:
			//*[contains(text(),'History report')]
			driver.findElement(By.xpath("//strong[@translate='Report_History_Report']")).click();
			Thread.sleep(4000);
					
			String parentWindow1 = driver.getWindowHandle();
			Set<String> handles1 =  driver.getWindowHandles();
			for(String windowHandle  : handles1)
			{
			if(!windowHandle.equals(parentWindow1))
			{
			driver.switchTo().window(windowHandle);
			Thread.sleep(2000);

			System.out.println(driver.getTitle());

			WebElement	s2= driver.findElement(By.cssSelector("h2"));
			//Thread.sleep(1000);
			if(s2.getText().contains("History Report"))
			{
			System.out.println("History Report is opened");
			}
			else
			{
			System.out.println("History report is not opened");
			}	
			driver.close(); //closing child window
			driver.switchTo().window(parentWindow1); //cntrl to parent window
			Thread.sleep(2000);
		    	}
			}
		}
			
			
/////////////////////////////////////////Prod DR sanity testcases/////////////////////////////////////////////////


@When("^Click on Prod DR link$")
public void click_on_Prod_DR_link() throws Throwable {
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	System.out.println("Waiting for pageloadtimeout");
	driver.manage().timeouts().pageLoadTimeout(85, TimeUnit.SECONDS);
	try{
	//	Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AutoIT Script\\HandleAuthWindow.exe");
	//	driver.findElement(By.cssSelector("a[href='https://inmbzp4174.in.dst.ibm.com/services/epricer/v2/ibm/']")).click();
	driver.get("https://epbuild@in.ibm.com:epbuild102018@w3-03.ibm.com/services/epricer/v2/ibm/");
	Thread.sleep(7000);
	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[name='SelectARole']")));
	driver.navigate().refresh();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[name='SelectARole']")));
}
	catch (TimeoutException eTO) {
		
		 System.out.println("Page load Timeout failure after 85 seconds");
		 System.out.println("Refreshing Prod DR homepage");
		 driver.navigate().refresh();
		 WebDriverWait wait= new WebDriverWait(driver, 85);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[name='SelectARole']")));
		 /*eTO.printStackTrace();
		 Assert.fail();*/
	}	
}


@Then("^verify if alert is present$")
public boolean verify_if_alert_is_present() throws Throwable {
	boolean foundAlert= false;
	WebDriverWait wait = new WebDriverWait(driver, 5 /*timeout in seconds*/);
	try{
		
		wait.until(ExpectedConditions.alertIsPresent());
		foundAlert = true;
		System.out.println("Prod DR Alert was present");
		System.out.println("Alert pop up message is : "+driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.close();
		}
	catch(TimeoutException eTO){
		foundAlert = false;
		System.out.println("Prod DR Alert was not present");
		Assert.fail();
		}
	return foundAlert;
	}



////////////////////////////////////////Webservice links check////////////////////////////////

@When("^Click on WS link1 and verify if it is working$")
public void click_on_WS_link1_and_verify_if_it_is_working() throws Throwable {
	
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://epbuild@in.ibm.com:epbuild102018@w3-gz.ieb.ibm.com/services/epricer/v2/ws/EpricerRetrieveQuoteData_PortType");
	Thread.sleep(2000);
	String s3=driver.findElement(By.cssSelector("h3")).getText();
	Assert.assertEquals(s3,"Hello! This is an Axis2 Web Service!");
	System.out.println("WebService 1 is working");
//	driver.close();
	Thread.sleep(3000);
}
	@And("^Click on WS link2 and verify if it is working$")
	public void click_on_WS_link2_and_verify_if_it_is_working() throws Throwable {
	
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://epbuild@in.ibm.com:epbuild102018@w3-bz.ieb.ibm.com/services/epricer/v2/ws/EpricerRetrieveQuoteData_PortType");
	Thread.sleep(2000);
	String s3=driver.findElement(By.cssSelector("h3")).getText();
	Assert.assertEquals(s3,"Hello! This is an Axis2 Web Service!");
	System.out.println("WebService 2 is working");
	//driver.close();
	Thread.sleep(3000);
}
	@And("^Click on WS link3 and verify if it is working$")
	public void click_on_WS_link3_and_verify_if_it_is_working() throws Throwable {
	
	
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://epbuild@in.ibm.com:epbuild102018@w3-gz.ieb.ibm.com/services/epricer/v2/ws/RetrieveBPQuotePricingApproval_PortType");
	Thread.sleep(2000);
	String s3=driver.findElement(By.cssSelector("h3")).getText();
	Assert.assertEquals(s3,"Hello! This is an Axis2 Web Service!");
	System.out.println("WebService 3 is working");
	//driver.close();
	Thread.sleep(2000);
}	
	
	@And("^Click on WS link4 and verify if it is working$")
	public void click_on_WS_link4_and_verify_if_it_is_working() throws Throwable {
	
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://epbuild@in.ibm.com:epbuild102018@w3-bz.ieb.ibm.com/services/epricer/v2/ws/RetrieveBPQuotePricingApproval_PortType");
	Thread.sleep(2000);
	String s3=driver.findElement(By.cssSelector("h3")).getText();
	Assert.assertEquals(s3,"Hello! This is an Axis2 Web Service!");
	System.out.println("WebService 4 is working");
	//driver.close();
	Thread.sleep(3000);
}


///////////////////////////////////////Authorization testcases//////////////////////////////////

@When("^Click on Auth url$")
public void click_on_Auth_url() throws Throwable {
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://epbuild@in.ibm.com:epbuild102018@w3-01.ibm.com/services/epricer/v2/auth/");
	Thread.sleep(12000);
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[title='Select groups from dropdown']")));
	System.out.println("Auth page is opened");
}

@Then("^select AUTHVIEW-WW Administrator for Registration \\(VIEW ONLY\\) from the list$")
public void select_AUTHVIEW_WW_Administrator_for_Registration_VIEW_ONLY_from_the_list() throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[title='Select groups from dropdown']"))).selectByVisibleText("AUTHVIEW-WW Administrator for Registration (VIEW ONLY)");
   	Thread.sleep(3000);
}

@Then("^click on launch application$")
public void click_on_launch_application() throws Throwable {
	WebElement s=driver.findElement(By.xpath("//a[contains(text(),'Launch authorization')]"));
	s.click();
	/*Actions action=new Actions(driver);
	action.doubleClick(s);*/
	Thread.sleep(4000);
}

@Then("^Check if all the links are working fine in auth$")
public void check_if_all_the_links_are_working_fine_in_auth() throws Throwable {
	//Check if all the links are working fine:
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='ibm-primary-links']/li[2]/a")).click();
	Thread.sleep(5000);

	//Verify if the table is present:
	driver.findElement(By.xpath(".//*[@id='ibm-content-main']/div[5]/div[4]/div/div/table")).isDisplayed();

	driver.findElement(By.xpath(".//*[@id='ibm-primary-links']/li[3]/a")).click();
	Thread.sleep(5000);
	//Verify if the table is present:
	driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[5]/div/div/table")).isDisplayed();

	driver.findElement(By.xpath(".//*[@id='ibm-primary-links']/li[4]/a")).click();
	Thread.sleep(5000);

	//Verify if the table is present:
	driver.findElement(By.xpath(".//*[@id='allChain']")).isDisplayed();

}



///////////////////////////////////////Settings testcases//////////////////////////////////


@When("^Click on Settings url$")
public void click_on_Settings_url() throws Throwable {
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
driver.get("https://epbuild@in.ibm.com:epbuild102018@w3-01.ibm.com/services/epricer/v2/settings/");
Thread.sleep(12000);
WebDriverWait wait= new WebDriverWait(driver, 85);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ibm-content-main']/p[2]/select")));
System.out.println("Settings page is opened");

}
@Then("^select GMCADMIN - AP Grid Manager Country \\(V(\\d+)-DUMMY-SINGAPORE\\) from the list$")
public void select_GMCADMIN_AP_Grid_Manager_Country_V_DUMMY_SINGAPORE_from_the_list(int arg1) throws Throwable {
	new Select (driver.findElement(By.xpath(".//*[@id='ibm-content-main']/p[2]/select"))).selectByValue("APV1_GMCADMIN");
   	Thread.sleep(3000);

}

@Then("^click on launch epricer settings$")
public void click_on_launch_epricer_settings() throws Throwable {
	WebElement s=driver.findElement(By.xpath(".//*[@id='ibm-content-main']/p[2]/span/a"));
	s.click();
	/*Actions action=new Actions(driver);
	action.doubleClick(s);*/
	Thread.sleep(4000);
}

@Then("^Check if all the links are working fine in settings$")
public void check_if_all_the_links_are_working_fine_in_settings() throws Throwable {
	//Check if all the links are working fine:
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='ibm-primary-links']/li[2]/a")).click();
	Thread.sleep(5000);

	//Verify if the table is present:
	driver.findElement(By.xpath(".//*[@id='ibm-content']/div[4]/table")).isDisplayed();

	driver.findElement(By.xpath(".//*[@id='ibm-primary-links']/li[3]/a")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath(".//*[@id='selectedGeographyList']")).isDisplayed();

	driver.findElement(By.xpath(".//*[@id='ibm-primary-links']/li[4]/a")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath(".//*[@id='selectedGeographyList']")).isDisplayed();

}


@Then("^Click on Reviwer tab and add a reviwer$")
public void click_on_Reviwer_tab_and_add_a_reviwer() throws Throwable {
	
	//Click on reviewers tab

	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[text()='Reviewers']")).click();

	//Click on show selected reviewer:

	//span[contains(text(),'Show Selected reviewer')]
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'Show Selected reviewer')]")).click();
	Thread.sleep(1000);
	
	//Click on add reviewer manually:
	driver.findElement(By.cssSelector("input[title='quotemanagerchange']")).sendKeys("epbuild@in.ibm.com");
	Thread.sleep(2000);
    
	//Click on add to list:

	driver.findElement(By.xpath("//*[text()='Add to list']")).click();

	//Click on save and submit:

	driver.findElement(By.xpath("//*[text()='Save and submit']")).click();
	Thread.sleep(9000);
	System.out.println("An email has been sent to the reviwer");
}



////////////////////////////////////////////////// CDT Dev AP ///////////////////////////////////////

@When("^Click on CDT Dev India Lab GUI link$")
public void Click_on_CDT_Dev_India_Lab_GUI_link() throws Throwable {
	Thread.sleep(3000);
//	Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AutoIT Script\\HandleAuthWindow.exe");
//	driver.findElement(By.cssSelector("a[href='https://inmbzp4174.in.dst.ibm.com/services/epricer/v2/ibm/']")).click();

	driver.get("https://meendixi@in.ibm.com:march@2017@w3alpha-2.toronto.ca.ibm.com/services/epricer/v2/ibm/");

Thread.sleep(9000);
Thread.sleep(5000);
}

@Then("^New quote page should open for AP CDT Dev$")
public void New_quote_page_should_open_for_AP_CDT_Dev() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);
	

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(2);  // This is for sheet 3 in excel
	
	sheet1.getRow(2).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(2).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	wb.write(fout);
	System.out.println("AP Quote id " +quoteid+ " is successfully copied to excel sheet");
}


///////////////////////////////////////// CDT Dev NA /////////////////////////////////////////////

@Then("^New quote page should open for NA CDT Dev$")
public void New_quote_page_should_open_for_NA_CDT_Dev() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);
	

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(2);  // This is for sheet 3 in excel
	
	sheet1.getRow(1).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(1).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("NA Quote id " +quoteid+ " is successfully copied to excel sheet");
}



////////////////////////////////// CDT Dev IBM GUI EMEA//////////////////////////////////////////////////

@Then("^New quote page should open for EMEA CDT Dev$")
public void New_quote_page_should_open_for_EMEA_CDT_Dev() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);


//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(2);  // This is for sheet 1 in excel
	
	sheet1.getRow(3).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(3).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	wb.write(fout);	
	System.out.println("EMEA Quote id " +quoteid + " is successfully copied to excel sheet");

}


//////////////////////////////////////IL4174 IBM GUI Japan//////////////////////////////////////////////

@Then("^New quote page should open for Japan$")
public void New_quote_page_should_open_for_Japan() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(0);  // This is for sheet 1 in excel
	
	sheet1.getRow(5).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(5).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("Japan Quote id " +quoteid + " is successfully copied to excel sheet");
}

@Then("^Click on SelectARole dropdown and select GITC TRN AP-Japan role$")
public void Click_on_SelectARole_dropdown_and_select_GITC_TRN_AP_Japan_role() throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("GITC TRN AP-Japan");	
}


@Then("^In Overview select country as Japan$")
public void in_Overview_select_country_as_Japan() throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='Select Country']"))).selectByVisibleText("Japan");
   	Thread.sleep(3000);
}

@Then("^On Customer information page click on Search Customer for JP$")
public void on_Customer_information_page_click_on_Search_Customer_for_JP() throws Throwable {
	
	 
//    Search customer for other countries other than NA:
				Thread.sleep(2000);
			    String cssSelectorOfSameElements1=".btn.btn-primary.ng-scope";
			    java.util.List<WebElement> a2=driver.findElements(By.cssSelector(cssSelectorOfSameElements1)) ;
			 	a2.get(0).click();
			 	Thread.sleep(3000);
			 	driver.switchTo().activeElement();
			 	new Select (driver.findElement(By.cssSelector("select[name='customername']"))).selectByVisibleText("Company name 1");
			    Thread.sleep(2000);
		// Enter the Company name:	
			  //*[text()='Name *']/following::input[1]
			 	driver.findElement(By.xpath("//*[text()='Name *']/following::input[1]")).sendKeys("ba*");
		// Click on the IBM master table radio button:
			 	//*[text()='ePricer customer table']/following::input[1]
			 	driver.findElement(By.xpath("//*[text()='ePricer customer table']/following::input[1]")).click();
	  // Click on Search customer button:
			    //span[text()='Search Customer']	
		driver.findElement(By.xpath("//span[text()='Search Customer']")).click();  
		Thread.sleep(7000);
		// Click on the first radio button		
		 WebDriverWait wait = new WebDriverWait(driver, 200);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='radio_PGCode0']")));
		 driver.findElement(By.xpath(".//*[@id='radio_PGCode0']")).click();
		 driver.findElement(By.xpath(".//*[@id='radio_PGCode0']")).click();
		Thread.sleep(2000);
		//Click on select customer button:
		//span[translate='select_customer']	
		driver.findElement(By.cssSelector("span[translate='select_customer']")).click();		
		Thread.sleep(5000); 
		    
}



/////////////////////////////////////////// CDT Dev IBM GUI Japan///////////////////////////////////////////

@Then("^Click on SelectARole dropdown and select JP Channel Pricer role$")
public void Click_on_SelectARole_dropdown_and_select_JP_Channel_Pricer() throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("JP Channel Pricer");	
}


@Then("^New quote page should open for Japan CDT Dev$")
public void New_quote_page_should_open_for_Japan_CDT_Dev() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(2);  // This is for sheet 3 in excel
	
	sheet1.getRow(5).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(5).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("Japan Quote id " +quoteid + " is successfully copied to excel sheet");
}

@Then("^Enter ReqPhn QuoteTitle OppID OppOwnerName ChannelInd SolType$")
public void enter_ReqPhn_QuoteTitle_OppID_OppOwnerName_ChannelInd_SolType() throws Throwable {
	driver.findElement(By.cssSelector("input[title ='Requester Phone']")).clear();
	driver.findElement(By.cssSelector("input[title ='Requester Phone']")).sendKeys("9876543212");
	driver.findElement(By.cssSelector("input[title ='Quote Name']")).sendKeys("TestTitle");
	driver.findElement(By.cssSelector("input[title='Opportunity Id']")).sendKeys("TestOppID");
	driver.findElement(By.cssSelector("input[title='Opportunity Owner Name']")).sendKeys("TestOppName");
	new Select (driver.findElement(By.cssSelector("select[name='Select Channel Indicator']"))).selectByVisibleText("Other");
	new Select (driver.findElement(By.cssSelector("select[name='Select Solution type']"))).selectByVisibleText("5.Other");
}

@Then("^Click on Save and Continue on Configuration tab for CDT Dev JP$")
public void click_on_Save_and_Continue_on_Configuration_tab_for_CDT_Dev_JP() throws Throwable {

	Thread.sleep(5000);
	String cssSelectorOfSameElements="strong[translate='Next']";
    java.util.List<WebElement> a2=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	a2.get(2).click();		
	Thread.sleep(4000);    	
}



///////////////////////////////////////////////////// IL4174 IBM GUI LA /////////////////////////////////////////

@Then("^Click on SelectARole dropdown and select GITC TRN LA role$")
public void Click_on_SelectARole_dropdown_and_select_GITC_TRN_LA_role() throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("GITC TRN LA");	
}


@Then("^New quote page should open for LA$")
public void New_quote_page_should_open_for_LA() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);
	

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(0);  // This is for sheet 1 in excel
	
	sheet1.getRow(4).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(4).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("LA Quote id " +quoteid+ " is successfully copied to excel sheet");
}


@Then("^In Overview select country as Colombia$")
public void in_Overview_select_country_as_Colombia() throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='Select Country']"))).selectByVisibleText("Colombia");
   	Thread.sleep(3000);
}



/////////////////////////////////////////////// CDT Dev IBM GUI LA///////////////////////////////////////////////

@Then("^New quote page should open for LA CDT Dev$")
public void New_quote_page_should_open_for_LA_CDT_Dev() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(2);  // This is for sheet 3 in excel
	
	sheet1.getRow(4).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(4).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("LA Quote id " +quoteid + " is successfully copied to excel sheet");
}



////////////////////////////////////// CDT Maint AP////////////////////////////////////////////////

@When("^Click on CDT Maint India Lab GUI link$")
public void Click_on_CDT_Maint_India_Lab_GUI_link() throws Throwable {
	Thread.sleep(3000);
//	Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AutoIT Script\\HandleAuthWindow.exe");
//	driver.findElement(By.cssSelector("a[href='https://inmbzp4174.in.dst.ibm.com/services/epricer/v2/ibm/']")).click();

	driver.get("https://meendixi@in.ibm.com:march@2017@w3beta-2.toronto.ca.ibm.com/services/epricer/v2/ibm/");

Thread.sleep(9000);
Thread.sleep(5000);
}

@Then("^New quote page should open for AP CDT Maint$")
public void New_quote_page_should_open_for_AP_CDT_Maint() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);
	

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(3);  // This is for sheet 4 in excel
	
	sheet1.getRow(2).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(2).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	wb.write(fout);
	System.out.println("AP Quote id " +quoteid+ " is successfully copied to excel sheet");
}


/////////////////////////////////////////////////CDT Maint IBM GUI NA/////////////////////////////////////////////


@Then("^New quote page should open for NA CDT Maint$")
public void New_quote_page_should_open_for_NA_CDT_Maint() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);
	

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(3);  // This is for sheet 4 in excel
	
	sheet1.getRow(1).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(1).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("NA Quote id " +quoteid+ " is successfully copied to excel sheet");
}


/////////////////////////////////////////////////CDT Maint IBM GUI EMEA/////////////////////////////////////////////

@Then("^New quote page should open for EMEA CDT Maint$")
public void New_quote_page_should_open_for_EMEA_CDT_Maint() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);


//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(3);  // This is for sheet 4 in excel
	
	sheet1.getRow(3).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(3).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	wb.write(fout);	
	System.out.println("EMEA Quote id " +quoteid + " is successfully copied to excel sheet");

}



///////////////////////////////////////// IBM GUI CDT Maint Japan////////////////////////////////////

@Then("^New quote page should open for Japan CDT Maint$")
public void New_quote_page_should_open_for_Japan_CDT_Maint() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(3);  // This is for sheet 4 in excel
	
	sheet1.getRow(5).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(5).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("Japan Quote id " +quoteid + " is successfully copied to excel sheet");
}



//////////////////////////////////// CDT Maint IBM GUI LA//////////////////////////////////////////////////////////

@Then("^New quote page should open for LA CDT Maint$")
public void New_quote_page_should_open_for_LA_CDT_Maint() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(3);  // This is for sheet 4 in excel
	
	sheet1.getRow(4).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(4).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("LA Quote id " +quoteid + " is successfully copied to excel sheet");
}


////////////////////////////////////////// IL1109 IBM GUI LA////////////////////////////////////////////////


@When("^Click on 1109 India Lab GUI link$")
public void Click_on_1109_India_Lab_GUI_link() throws Throwable {
	Thread.sleep(3000);
//	Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AutoIT Script\\HandleAuthWindow.exe");
//	driver.findElement(By.cssSelector("a[href='https://inmbzp4174.in.dst.ibm.com/services/epricer/v2/ibm/']")).click();

	driver.get("https://epbuild@in.ibm.com:epbuild102018@inmbz1109.in.dst.ibm.com/services/epricer/v2/ibm");

Thread.sleep(7000);
Thread.sleep(7000);
}

@Then("^New quote page should open for LA IL1109$")
public void New_quote_page_should_open_for_LA_IL1109() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);
	

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(4);  // This is for sheet 5 in excel
	
	sheet1.getRow(4).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(4).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("LA Quote id " +quoteid+ " is successfully copied to excel sheet");
}


/////////////////////////////////////////////IBM GUI NA IL1109///////////////////////////////////////////////////

@Then("^New quote page should open for NA IL1109$")
public void New_quote_page_should_open_for_NA_IL1109() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);
	

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(4);  // This is for sheet 5 in excel
	
	sheet1.getRow(1).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(1).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("NA Quote id " +quoteid+ " is successfully copied to excel sheet");
}



/////////////////////////////////////////////IL1109 IBM GUI AP////////////////////////////////////////


@Then("^New quote page should open for AP IL1109$")
public void New_quote_page_should_open_for_AP_IL1109() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);
	

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(4);  // This is for sheet 5 in excel
	
	sheet1.getRow(2).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(2).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	wb.write(fout);
	System.out.println("AP Quote id " +quoteid+ " is successfully copied to excel sheet");
}



////////////////////////////////////////////IL1109 IBM GUI EMEA//////////////////////////////////////////
@Then("^New quote page should open for EMEA IL1109$")
public void New_quote_page_should_open_for_EMEA_IL1109() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);


//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(4);  // This is for sheet 5 in excel
	
	sheet1.getRow(3).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(3).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	wb.write(fout);	
	System.out.println("EMEA Quote id " +quoteid + " is successfully copied to excel sheet");

}

/////////////////////////////////////////IL1109 IBM GUI Japan//////////////////////////////////////

@Then("^New quote page should open for Japan IL1109$")
public void New_quote_page_should_open_for_Japan_IL1109() throws Throwable {
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.jsclosurestab.btn.ng-scope")));
	System.out.println("New Quote page is opened");
	String cssSelectorOfSameElements="div.col-md-3.ng-binding";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	String quoteid=a.get(1).getText();
	System.out.println( "Quote Id is " + quoteid);

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(4);  // This is for sheet 5 in excel
	
	sheet1.getRow(5).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(5).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("Japan Quote id " +quoteid + " is successfully copied to excel sheet");
}





/////////////////////////////////Settings for DR //////////////////////////////////////////////

///////////////////////////////////////Settings testcases/////////////////////////////////////


@When("^Click on Settings url for DR$")
public boolean click_on_Settings_url_for_DR() throws Throwable {
driver= new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://epbuild@in.ibm.com:epbuild102018@w3-03.ibm.com/services/epricer/v2/settings/");
Thread.sleep(15000);
boolean foundAlert= false;
WebDriverWait wait = new WebDriverWait(driver, 35 /*timeout in seconds*/);
try{
	wait.until(ExpectedConditions.alertIsPresent());
	foundAlert = true;
System.out.println("Alert was present");
driver.switchTo().alert().accept();
driver.navigate().refresh();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ibm-content-main']/p[2]/select")));
System.out.println("Settings DR page is opened");
}
catch(TimeoutException eTO){
	foundAlert = false;
	System.out.println("Alert was not present");
	//driver.switchTo().alert().accept();
	driver.navigate().refresh();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ibm-content-main']/p[2]/select")));
	System.out.println("Settings DR page is opened");
}
    
return foundAlert;}


///////////////////////////////////////Authorization testcases for DR//////////////////////////////////

@When("^Click on Auth url for DR$")
public void click_on_Auth_url_for_DR() throws Throwable {
	
driver= new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://epbuild@in.ibm.com:epbuild102018@w3-03.ibm.com/services/epricer/v2/auth/");
Thread.sleep(15000);
try{
WebDriverWait wait= new WebDriverWait(driver, 85);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[title='Select groups from dropdown']")));
System.out.println("Auth DR page is opened");
}
catch(Exception e)
{
	System.out.println("The roles in Prod DR auth are not loaded yet so refreshing the browser");
	driver.navigate().refresh();
	WebDriverWait wait= new WebDriverWait(driver, 85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[title='Select groups from dropdown']")));
	System.out.println("Auth DR page is opened after a refresh");	
}
}


////////////////////CDT Dev PCS////////////////////////////////////////////

@When("^Click on CDT Dev BP Bypass link$")
public void Click_on_CDT_Dev_BP_Bypass_link() throws Throwable {
Thread.sleep(3000);
//Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AutoIT Script\\HandleAuthWindow.exe");
//driver.findElement(By.cssSelector("a[href='https://inmbzp4174.in.dst.ibm.com/services/epricer/v2/ibm/']")).click();

driver.get("https://meendixi@in.ibm.com:march@2017@wwwalpha-2.toronto.ca.ibm.com/services/partners/epricer/v2/redirection.html");

//Thread.sleep(9000);
Thread.sleep(6000);
}


@Then("^Click on PCS and Distirbutor radio button and click on ePricer$")
public void click_on_PCS_and_Distirbutor_radio_button_and_click_on_ePricer() throws Throwable {
  driver.findElement(By.xpath(".//*[@id='P']")).click();
  driver.findElement(By.xpath(".//*[@id='bpType_dist']")).click();
  driver.findElement(By.xpath("//input[@type='submit']")).click();
  }


@Then("^Click on SelectARole dropdown and select NA Distributor: Avnet Hall-Mark, all quotes$")
public void click_on_SelectARole_dropdown_and_select_NA_Distributor_Avnet_Hall_Mark_all_quotes() throws Throwable {
	new Select (driver.findElement(By.cssSelector("select[name='SelectARole']"))).selectByVisibleText("NA Distributor: Avnet Hall-Mark, all quotes");
}


@Then("^In Overview tab enter the required details for CDT Dev$")
public void in_Overview_tab_enter_the_required_details_for_CDT_Dev() throws Throwable {
	
	Thread.sleep(3000);
	System.out.println("New Quote page is opened");
	String quoteid=driver.findElement(By.xpath(".//*[text()='Quote ID: ']//following::div[1]")).getText();
	System.out.println( "Quote Id is " + quoteid);
	

//	The below code is to write in excel sheet the quote id but it is not working with maven..need to do more research on it
	
	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
	
  //  HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
	
	XSSFSheet sheet1= wb.getSheetAt(2);  // This is for sheet 3 in excel
	
	sheet1.getRow(6).createCell(2).setCellValue(quoteid);
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	sheet1.getRow(6).createCell(3).setCellValue(timeStamp);
	FileOutputStream fout = new FileOutputStream(src);
	
	wb.write(fout);
	
	System.out.println("PCS BP NA Quote id " +quoteid+ " is successfully copied to excel sheet");
		
	//Quote title: .//*[@title='Quote title']
	driver.findElement(By.xpath(".//*[@title='Quote title']")).sendKeys("TestIBMPCS");

//	Select bid type:  .//*[@name='Select bid type']
	new Select (driver.findElement(By.xpath(".//*[@name='Select bid type']"))).selectByVisibleText("Standard");

}

@Then("^In Configuration tab upload cfr file for PCS$")
public void in_Configuration_tab_upload_cfr_file_for_PCS() throws Throwable {
	Thread.sleep(1000);
	String cssSelectorOfSameElements1="input[title='Upload file']";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements1)) ;
	a.get(0).click();
	Thread.sleep(3000);
//To upload the cfr file using AutoIT- but i have commented this out as this was not a G2O approved software
//	Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AutoIT Script\\FileUpload.exe");

//Using sikuli to upload a file
	//Thread.sleep(2000);
	Screen screen=new Screen();	
	Pattern image1= new Pattern("C:\\Users\\IBM_ADMIN\\Desktop\\ePricer\\Sikuli images\\FileName.PNG");
	Pattern image2= new Pattern("C:\\Users\\IBM_ADMIN\\Desktop\\ePricer\\Sikuli images\\Open1.PNG");
	screen.type(image1, "C:\\Users\\IBM_ADMIN\\Desktop\\ePricer\\CFR\\Aegon GB VEBsnH6064 FC4016nFC4017mes 24aug15.cfr");
	Thread.sleep(2000);
	screen.click(image2);
	Thread.sleep(5000);
	
	//Disable checksum
	String cssSelectorOfSameElements6="input[title='Disable Checksum']";
    java.util.List<WebElement> a6=driver.findElements(By.cssSelector(cssSelectorOfSameElements6)) ;
    
  
	if ( !a6.get(0).isSelected() )
	{
		a6.get(0).click();
	}
	
	 String cssSelectorOfSameElements7="input[title='Work with other country CFR']";
	 java.util.List<WebElement> a7=driver.findElements(By.cssSelector(cssSelectorOfSameElements7)) ;
		
	
	//Work with other country CFR
	if ( !a7.get(0).isSelected() )
	{
		a7.get(0).click();
	}
	
	
	//Click on upload CFR button
	
	String cssSelectorOfSameElements3="span[translate='Upload_CFR(s)']";
    java.util.List<WebElement> a3=driver.findElements(By.cssSelector(cssSelectorOfSameElements3)) ;
	a3.get(0).click();
	Thread.sleep(4000);

}
    
@Then("^fill details inside Registration and customer tab for PCS$")
public void fill_details_inside_Registration_and_customer_tab_for_PCS() throws Throwable {
	Thread.sleep(5000);
	String xpathOfSameElements3=".//*[@id='x.id_0']";
    java.util.List<WebElement> a3=driver.findElements(By.xpath(xpathOfSameElements3)) ;
	a3.get(0).sendKeys("smalldeal");
	//a3.get(0).sendKeys("smalldeal");
	System.out.println("After entering dealreg");
	
	//driver.findElement(By.xpath(".//*[@id='x.id']")).sendKeys("smalldeal");	
	
	String xpathOfSameElements4=".//strong[@translate='Retrieve']";
    java.util.List<WebElement> a4=driver.findElements(By.xpath(xpathOfSameElements4)) ;
	a4.get(1).click();
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//span[@translate='search_customer']")).click();	
	Thread.sleep(3000);

		driver.switchTo().activeElement();
//		Enter CMR number:
		driver.findElement(By.xpath(".//*[@id='SearchFor']")).sendKeys("2098624");	
		driver.findElement(By.xpath(".//*[@id='SearchFor']//following::span[@translate='search_customer']")).click();	

		Thread.sleep(9000);
		Thread.sleep(9000);
		//BP company name:
		driver.findElement(By.xpath(".//*[@id='bpCompanyName']")).sendKeys("IBM test");	
		Thread.sleep(1000);
		String cssSelectorOfSameElements="strong[translate='Next']";
	    java.util.List<WebElement> a2=driver.findElements(By.cssSelector(cssSelectorOfSameElements));
		a2.get(2).click();		
		Thread.sleep(3000); 
}


@Then("^in Details pricing tab click on Submit price request for PCS$")
public void in_Details_pricing_tab_click_on_Submit_price_request_for_PCS() throws Throwable {
	
	//Click on submit price request button

	   String cssSelectorOfSameElements="strong[translate='Submit_Price_Request']";
	    java.util.List<WebElement> a2=driver.findElements(By.cssSelector(cssSelectorOfSameElements));
		a2.get(0).click();
		Thread.sleep(4000);

//decision maker name

driver.findElement(By.cssSelector("input[id='decisionmakername']")).sendKeys("dhruv");	

//email

driver.findElement(By.cssSelector("input[id='decisionmakeremail']")).sendKeys("epbuild@in.ibm.com");	

//title
driver.findElement(By.cssSelector("input[id='decisionmakertitle']")).sendKeys("farswan");	

//project name
driver.findElement(By.cssSelector("input[id='projectname']")).sendKeys("epricer");


//////IBM channel contact:
driver.findElement(By.cssSelector("input[id='name']")).clear();
driver.findElement(By.cssSelector("input[id='name']")).sendKeys("manas");
driver.findElement(By.cssSelector("input[id='phoneNumber']")).clear();
driver.findElement(By.cssSelector("input[id='phoneNumber']")).sendKeys("9999999999");
driver.findElement(By.cssSelector("input[id='enterContactEmail']")).clear();
driver.findElement(By.cssSelector("input[id='enterContactEmail']")).sendKeys("epbuild@in.ibm.com");

//Enter discount

driver.findElement(By.xpath(".//*[@id='currentQuote.quotePriceRequest.checkAllFlag']")).click();
driver.findElement(By.xpath("//*[@title='quick apply percent']")).sendKeys("5");
driver.findElement(By.xpath("//*[@title='Quick apply percent button']")).click();
Thread.sleep(9000);
driver.findElement(By.cssSelector("button[id='submitandsendnotification']")).click();
Thread.sleep(7000);
}


@When("^Click on CDT Dev IBM GUI link$")
public void click_on_CDT_Dev_IBM__GUI_link() throws Throwable {
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://meendixi@in.ibm.com:march@2017@w3alpha-2.toronto.ca.ibm.com/services/epricer/v2/ibm/");
	Thread.sleep(7000);
	Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver,85);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[name='SelectARole']")));

}

@Then("^Search for the quoteID from excel sheet for CDT Dev PCS NA BP$")
public void search_for_the_quoteID_from_excel_sheet_for_CDT_Dev_PCS_NA_BP() throws Throwable {
Thread.sleep(5000);
	
	utility obj=new utility();
	String NA_BP_PCSQuoteID= obj.getData(2, 6, 2);
	System.out.println("Data from Excel is " + NA_BP_PCSQuoteID);
	Thread.sleep(6000);
	
	//Click on search quote 

	driver.findElement(By.xpath("//div[@class='quotesearch']")).click();
	Thread.sleep(6000);
	//driver.findElement(By.cssSelector("input[title='Enter quoteid'][class='ng-pristine ng-untouched ng-valid input-control focusedRed']")).sendKeys(NA_BP_PCSQuoteID);

	driver.findElement(By.cssSelector("input[title='Enter quoteid(s)'][class='ng-pristine ng-untouched ng-valid ng-scope input-control focusedRed']")).sendKeys(NA_BP_PCSQuoteID);

	//Click on Search button
	//span[contains(text(),'Search')and@class='btn btn-primary btn-lg']
	driver.findElement(By.xpath("//span[contains(text(),'Search')and@class='btn btn-primary btn-lg']")).click();
	Thread.sleep(6000);
	}












































































































































































































































































































































































































































































	////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////// MYER CODE//////////////////////////////////////////////////
	
		
	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void I_enter_valid_username_and_valid_password(String uname, String pass) throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.id("header-login")).click();
		driver.findElement(By.id("logonId")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}


	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.id("submit")).click();
		Thread.sleep(5000);
		driver.close();
	}
	
	
	@When("^I enter all the required fields$")
	public void I_enter_all_the_required_fields() throws Throwable {
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		driver.findElement(By.id("header-join")).click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		driver.findElement(By.id("firstName")).sendKeys("testrr");
		driver.findElement(By.id("lastName")).sendKeys("lname");
		String cssSelectorOfSameElements="input[id='logonId'][class='field-required']";
	    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
		a.get(0).sendKeys("tsrame412@gmail.com");
		driver.findElement(By.id("confirmLogonId")).sendKeys("tsrame412@gmail.com");
		driver.findElement(By.id("logonPassword")).sendKeys("Myer123");
		driver.findElement(By.id("logonPasswordVerify")).sendKeys("Myer123");
		driver.findElement(By.className("not-found")).click();
		driver.findElement(By.id("address1")).sendKeys("ABC street");
		driver.findElement(By.id("city")).sendKeys("Melbourne");
		driver.findElement(By.id("zipCode")).sendKeys("3004");
		Thread.sleep(3000);
		new Select (driver.findElement(By.id("phoneType1"))).selectByVisibleText("Mobile");
		Thread.sleep(5000);
		driver.findElement(By.id("phone1")).sendKeys("9878787873");
		Thread.sleep(5000);
	}


	@Then("^user should be able to register successfully$")
	public void user_should_be_able_to_register_successfully() throws Throwable {
		driver.findElement(By.id("create-account")).click();
		Thread.sleep(7000); 
		Thread.sleep(5000);
		String bodyText = driver.findElement(By.cssSelector("span.myriad-light")).getText();
		Assert.assertTrue("Account not created!!", bodyText.contains("my account"));
		Thread.sleep(5000);
		driver.close();
	}
	

	//Checkout.feature paypal guest user ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	
	@When("^I search for an item example \"([^\"]*)\"$")
	public void I_search_for_an_item_example(String searchitem) throws Throwable {
		Thread.sleep(7000);
		driver.findElement(By.cssSelector("input#SimpleSearchForm_SearchTerm")).sendKeys(searchitem);
		driver.findElement(By.xpath(".//*[@id='header-search']/fieldset/div/input[2]")).click();
	}

	
	@Then("^Search Results page should be displayed$")
	public void Search_Results_page_should_be_displayed() throws Throwable {
	
		String bodyText1 = driver.findElement(By.cssSelector("div.banner")).getText();
		Assert.assertTrue("Search page is not displayed", bodyText1.contains("Your search for"));
	}

	
	@When("^I click on an item$")
	public void I_click_on_an_item() throws Throwable {
		String cssSelectorOfSameElements="div[class='item first']";
	    java.util.List<WebElement> a1=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
		a1.get(0).click();
	    Thread.sleep(5000);
	}

	
	@Then("^PDP page should open$")
	public void PDP_page_should_open() throws Throwable {

		 WebElement primaryimage = driver.findElement(By.cssSelector("img.zoom-icon.pngfix"));
		 Assert.assertEquals(true, primaryimage.isDisplayed());
		 Thread.sleep(3000);
	}
	

	@Then("^Add an item to bag and click on View bag page$")
	public void Add_an_item_to_bag_and_click_on_View_bag_page() throws Throwable {
	
	driver.findElement(By.cssSelector("a#view-more")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("a#add-to-bag")).click();
	Thread.sleep(4000);
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("span#mybag-icon")).click();
	Thread.sleep(4000);
	}

	
	@Then("^Shopping Bag page should open$")
	public void Shopping_Bag_page_should_open() throws Throwable {
	Thread.sleep(5000);
	//String bodyText2 = driver.findElement(By.cssSelector("h1.h3.txt-upper.title-bag")).getText();
	//Assert.assertTrue("Search page is not displayed", bodyText2.contains("Your bag"));
	Assert.assertTrue(driver.getTitle().contains("shopping bag"));
	driver.findElement(By.cssSelector("a.cta.persimmon.push.checkout-securely")).click();
	Thread.sleep(5000);
	}
	
	
	@When("^Click on Contiue as a guest button$")
	public void Click_on_Contiue_as_a_guest_button() throws Throwable {
	driver.findElement(By.cssSelector("a.cta.persimmon")).click(); 
	Thread.sleep(5000);    
	}

	
	@Then("^Details and pay page should open$")
	public void Details_and_pay_page_should_open() throws Throwable {
		Assert.assertTrue(driver.getTitle().contains("Myer Online - Myer Checkout"));
	}

	
	@When("^Enter delivery address and click on Paypal$")
	public void enter_delivery_address_and_click_on_Paypal() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.id("firstName")).sendKeys("testrr");
		driver.findElement(By.id("lastName")).sendKeys("lname");
		driver.findElement(By.id("email1")).sendKeys("testguestpaypal@gmail.com");
		driver.findElement(By.id("mobilePhone1")).sendKeys("9878787878");
		driver.findElement(By.id("address")).sendKeys("Melbourne Grammer School");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#abn")).click();
		driver.findElement(By.id("address")).sendKeys("Melbourne Grammer School, 47 Domain Road, MELBOURNE");
		Thread.sleep(5000);
		String cssSelectorOfSameElements="li.ui-menu-item";
		java.util.List<WebElement> a1=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
		a1.get(0).click();	
		driver.findElement(By.cssSelector("input#card_paypal_1")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#TermsAndConditionsHtmlInputCheckBox")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a#paynow")).click();
		Thread.sleep(9000);
		Thread.sleep(5000);
		
		
	}

	
	@Then("^Paypal login screen should appear and order should be placed successfully$")
	public void Paypal_login_screen_should_appear_and_order_should_be_placed_successfully() throws Throwable {
		Thread.sleep(9000);
		Thread.sleep(9000);
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("PayPal Checkout - Log In"));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='injectedUl']")));
		driver.findElement(By.cssSelector("input#email")).sendKeys("qwerty.dsfsdfs@myer.com.au");
		driver.findElement(By.cssSelector("input#password")).sendKeys("My3rT3sT4cc0unt");
		driver.findElement(By.cssSelector("button#btnLogin")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#confirmButtonTop")).click();
		Thread.sleep(6000);
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Myer Online - Order Confirmation"));
		String bodyText = driver.findElement(By.cssSelector("p.txt-lrg")).getText();
		System.out.println("The order id using P2P guest checkout flow is---   "+bodyText);	
		driver.close();
		Thread.sleep(5000);
	}

	
	// Testcheckout P2P Registered User Securepay```````````````````````````````````````````````
	
	@When("^Click on registered user using valid id \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void Click_on_registered_user_using_valid_id_and_password(String uname, String passwd) throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#logonEmail")).sendKeys(uname);
		driver.findElement(By.cssSelector("input#userPassword")).sendKeys(passwd);
		driver.findElement(By.cssSelector("a#submit-login")).click();
		Thread.sleep(5000);
		
	}

	@When("^Select Securepay and order should be placed successfully$")
	public void Select_Securepay_and_order_should_be_placed_successfully() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#card_visa_1")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#TermsAndConditionsHtmlInputCheckBox")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a#paynow")).click();
		Thread.sleep(9000);
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#spIframeId")));
		driver.findElement(By.cssSelector("input#_SBILL_IN_cc_holder")).sendKeys("asdad");
		driver.findElement(By.cssSelector("input#_SBILL_IN_cc_no1")).sendKeys("1111");
		driver.findElement(By.cssSelector("input#_SBILL_IN_cc_no2")).sendKeys("1111");
		driver.findElement(By.cssSelector("input#_SBILL_IN_cc_no3")).sendKeys("1111");
		driver.findElement(By.cssSelector("input#_SBILL_IN_cc_no4")).sendKeys("1111");
		new Select (driver.findElement(By.id("expiry_month"))).selectByVisibleText("03");
		new Select (driver.findElement(By.cssSelector("select[name=_SBILL_IN_exp_year]"))).selectByVisibleText("19");
		driver.findElement(By.cssSelector("input#_SBILL_IN_cvv")).sendKeys("1234");
		driver.findElement(By.cssSelector("input.button.submit.continue")).click();
		Thread.sleep(6000);
		driver.close();
	}
	
	  // ~~~~~~~~~~~~~~~Test checkout Click and Collect flow from bag page~~~~~~~~~~~~~~~~~~~~~
	
	@Then("^Select Click and Collect option$")
	public void Select_Click_and_Collect_option() throws Throwable {
		driver.findElement(By.cssSelector("input#btn_cart_clickAndCollect")).click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("shopping bag"));
		driver.findElement(By.cssSelector("a.cta.persimmon.push.checkout-securely")).click();
		Thread.sleep(5000);
		}
		
	@Then("^Search by Postcode$")
	public void Search_by_Postcode() throws Throwable {
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#postcode-search")).clear();
		driver.findElement(By.cssSelector("#postcode-search")).sendKeys("3000");
		driver.findElement(By.cssSelector("div.search-btn")).click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
	}

	@Then("^Click on VISA radiobutton$")
	public void Click_on_VISA_radiobutton() throws Throwable {
		String cssSelectorOfSameElements="input#payMethodId_1";
	    java.util.List<WebElement> a1=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
		a1.get(2).click();
		driver.findElement(By.cssSelector("input#TermsAndConditionsHtmlInputCheckBox")).click();
		Thread.sleep(3000);
		Thread.sleep(3000);
	}

	@Then("^Click on  Pay Securely Now checkbox$")
	public void Click_on_Pay_Securely_Now_checkbox() throws Throwable {
		driver.findElement(By.cssSelector("a#pay-securebtn")).click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
	}

	@Then("^Pay Using VISA$")
	public void Pay_Using_VISA() throws Throwable {
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#spIframeId")));
		driver.findElement(By.cssSelector("input#_SBILL_IN_cc_holder")).sendKeys("asdad");
		driver.findElement(By.cssSelector("input#_SBILL_IN_cc_no1")).sendKeys("1111");
		driver.findElement(By.cssSelector("input#_SBILL_IN_cc_no2")).sendKeys("1111");
		driver.findElement(By.cssSelector("input#_SBILL_IN_cc_no3")).sendKeys("1111");
		driver.findElement(By.cssSelector("input#_SBILL_IN_cc_no4")).sendKeys("1111");
		new Select (driver.findElement(By.id("expiry_month"))).selectByVisibleText("03");
		new Select (driver.findElement(By.cssSelector("select[name=_SBILL_IN_exp_year]"))).selectByVisibleText("19");
		driver.findElement(By.cssSelector("input#_SBILL_IN_cvv")).sendKeys("1234");
		driver.findElement(By.cssSelector("input.button.submit.continue")).click();
		Thread.sleep(6000);
		driver.close();
	}

	
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Multi Bag~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	@Then("^Click on Multibag$")
	public void Click_on_Multibag() throws Throwable {
		driver.findElement(By.cssSelector("input#btn_cart_multibag")).click();
		Thread.sleep(5000);
		Thread.sleep(5000);
	}
	
	
	@Then("^Click on checkout securely$")
	public void Click_on_checkout_securely() throws Throwable {
		driver.findElement(By.cssSelector("a#checkout-btn")).click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		
	}
	
	
	
	//~~~~~~~~~~~~~~~~~~~~~~~ Verify images on all pages~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	@Then("^All page images should be loaded$")
	public void All_page_images_should_be_loaded() throws Throwable {
		Thread.sleep(7000);

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~test images~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		try {
			invalidImageCount = 0;
			java.util.List<WebElement> imagesList = driver.findElements(By.tagName("img"));
			System.out.println("Total no. of images are " + imagesList.size());
			for (WebElement imgElement : imagesList) {
				if (imgElement != null) {
					verifyimageActive(imgElement);
				}
			}
			System.out.println("Total no. of broken images are "	+ invalidImageCount);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		}
			
		public void verifyimageActive(WebElement imgElement) {
			
			try {
				HttpClient client = HttpClientBuilder.create().build();
				HttpGet request = new HttpGet(imgElement.getAttribute("src"));
				org.apache.http.HttpResponse response = client.execute(request);
				// verifying response code he HttpStatus should be 200 if not,
				// increment as invalid images count
				if (response.getStatusLine().getStatusCode() != 200)
					invalidImageCount++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
				
		@Then("^Click on Myer icon$")
		public void Click_on_Myer_icon() throws Throwable {
			Thread.sleep(7000);
			System.out.println("~~~~~~~~~~Testing Home page images~~~~~~~~~~~");
			driver.findElement(By.cssSelector("a.logo.printhide")).click();
			Thread.sleep(5000);
		}

	@Then("^Click on men category$")
	public void Click_on_men_category() throws Throwable {
		Thread.sleep(7000);
		System.out.println("~~~~~~~~~~~~~Inside Men category~~~~~~~~~~~~~~~");
		driver.findElement(By.cssSelector("a.level1-a[href='https://www.myer.com.au/shop/mystore/men']")).click();
		Thread.sleep(5000);
		
	}

	
	@Then("^Click on women category$")
	public void Click_on_women_category() throws Throwable {
		Thread.sleep(7000);
		System.out.println("~~~~~~~~~~~~Inside Women category~~~~~~~~~~~~~~");
		driver.findElement(By.cssSelector("a.level1-a[href='https://www.myer.com.au/shop/mystore/women']")).click();
		Thread.sleep(5000);
	   
	}

@Then("^Click on miss shop category$")
public void Click_on_miss_shop_category() throws Throwable {
	Thread.sleep(7000);
	System.out.println("~~~~~~~~~~~~~Inside Miss Shop category~~~~~~~~~~~~~~~");
	driver.findElement(By.cssSelector("a.level1-a[href='https://www.myer.com.au/shop/mystore/miss-shop']")).click();
	Thread.sleep(5000);
}

@Then("^Click on beauty category$")
public void Click_on_beauty_category() throws Throwable {
	Thread.sleep(7000);
	System.out.println("~~~~~~~~~~~~~~~Inside beauty category~~~~~~~~~~~~~~~");
	driver.findElement(By.cssSelector("a.level1-a[href='https://www.myer.com.au/shop/mystore/beauty']")).click();
	Thread.sleep(5000);   
}

@Then("^Click on kids and toys category$")
public void Click_on_kids_and_toys_category() throws Throwable {
	Thread.sleep(7000);
	System.out.println("~~~~~~~~~~~~~~Inside kids and toys category~~~~~~~~~~~~~~~~");
	driver.findElement(By.cssSelector("a.level1-a[href='https://www.myer.com.au/shop/mystore/kids-toys']")).click();
	Thread.sleep(5000);
}

@Then("^Click on home category$")
public void Click_on_home_category() throws Throwable {
	Thread.sleep(7000);
	System.out.println("~~~~~~~~~~~~~~~Inside Home category~~~~~~~~~~~~~~~~~~~");
	driver.findElement(By.cssSelector("a.level1-a[href='https://www.myer.com.au/shop/mystore/home']")).click();
	Thread.sleep(5000);
}

@Then("^Click on electrical category$")
public void Click_on_electrical_category() throws Throwable {
	Thread.sleep(7000);
	System.out.println("~~~~~~~~~~~~~~~Inside Electrical category~~~~~~~~~~~~~~~~");
	driver.findElement(By.cssSelector("a.level1-a[href='https://www.myer.com.au/shop/mystore/electrical']")).click();
	Thread.sleep(5000);
}

@Then("^Click on giftorium category$")
public void Click_on_giftorium_category() throws Throwable {
	Thread.sleep(7000);
	System.out.println("~~~~~~~~~~~~~~~Inside Giftorium category~~~~~~~~~~~~~~~");
	driver.findElement(By.cssSelector("a.level1-a[href='https://www.myer.com.au/shop/mystore/gifts']")).click();
	Thread.sleep(5000);
}

@Then("^Click on sale category$")
public void Click_on_sale_category() throws Throwable {
	Thread.sleep(7000);
	System.out.println("~~~~~~~~~~~~~~~Inside Sale category~~~~~~~~~~~~~~~~~~~`");
	driver.findElement(By.cssSelector("a.level1-a[href='https://www.myer.com.au/shop/mystore/offers']")).click();
	Thread.sleep(5000);
}

@Then("^Click on myer one category$")
public void Click_on_myer_one_category() throws Throwable {
	Thread.sleep(7000);
	System.out.println("~~~~~~~~~~~~~~~Inside Myer One page~~~~~~~~~~~~~~~~~~~");
	driver.findElement(By.cssSelector("a.level1-a[href='http://www.myerone.com.au/']")).click();
	Thread.sleep(5000);
	driver.close();
}

@Then("^Click on blog category$")
public void Click_on_blog_category() throws Throwable {
	Thread.sleep(7000);
	System.out.println("~~~~~~~~~~~~~~Inside Blog page~~~~~~~~~~~~~~~~");
	driver.findElement(By.cssSelector("a.level1-a[href='http://blog.myer.com.au']")).click();
	Thread.sleep(5000);
	driver.close();
}
	    
	@Then("^Verify footer is present$")
	public void Verify_footer_is_present() throws Throwable {
		
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#footer-links")));
		if((driver.findElements(By.cssSelector("div#footer-links"))).size() != 0){
			System.out.println("Footer is Present");
			}
		else{
			System.out.println("Footer is not Present");
			}			        
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~ Verify Mens All Clothing PLP page~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	@Then("^Click on All clothing$")
	public void Click_on_All_clothing() throws Throwable {
		String cssSelectorOfSameElements="a[href='https://www.myer.com.au/shop/mystore/men/mens-clothing']";
	    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
		a.get(0).click();
		Thread.sleep(5000);
	}

	@Then("^All the products should be visible$")
	public void All_the_products_should_be_visible() throws Throwable {
		if( driver.findElement(By.cssSelector("div.item-container")).isDisplayed()){
			System.out.println("The products are Visible");
			}else{
			System.out.println("The products are Invisible");
			
			}
		driver.close();
		}
	
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Verify Quick View~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	

@Then("^Click on Quick View$")
public void Click_on_Quick_View() throws Throwable {
	Thread.sleep(5000);
	Thread.sleep(3000);
	String cssSelectorOfSameElements1="div[class='item-img']";
    java.util.List<WebElement> a1=driver.findElements(By.cssSelector(cssSelectorOfSameElements1)) ;
    WebElement element = a1.get(0);
	String cssSelectorOfSameElements=".ir.ov_quickview";
    java.util.List<WebElement> a=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
    WebElement elementToClick = a.get(0);
	Actions builder = new Actions(driver);
	builder.moveToElement(element).build().perform();  //mouse hover
	builder.moveToElement(elementToClick).build().perform();
	elementToClick.click();
	Thread.sleep(5000);
	Thread.sleep(5000);
}

@Then("^Verify if Quick view pop up is displayed$")
public void Verify_if_Quick_view_pop_up_is_displayed() throws Throwable {
	Thread.sleep(5000);
	if( driver.findElement(By.cssSelector("div#myerQuickView")).isDisplayed()){
		System.out.println("Quick view pop up is displayed");
		}else{
		System.out.println("Quick view pop up is not displayed");
		}
		
}

@Then("^Click on Add to Bag from Quick View$")
public void Click_on_Add_to_Bag_from_Quick_View() throws Throwable {
    driver.findElement(By.cssSelector("a#add-to-bag")).click();
    Thread.sleep(7000);
    String itemaddedincart= driver.findElement(By.cssSelector("div#count2")).getText();
    System.out.println("The number of items added in cart is---   " +itemaddedincart);	
    Thread.sleep(5000);
    Thread.sleep(3000);
    driver.close();
}


	
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Verify PDP page~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


@Then("^Verify if Delivery Options is displayed$")
public void Verify_if_Delivery_Options_is_displayed() throws Throwable {
	if( driver.findElement(By.cssSelector("div#delivery-options-panel")).isDisplayed()){
		System.out.println("Delivery options is displayed");
		}else{
		System.out.println("Delivery options is not displayed");
		}
}

@Then("^Verify if Short details panel is dislpayed$")
public void Verify_if_Short_details_panel_is_dislpayed() throws Throwable {
	Thread.sleep(2000);
	if( driver.findElement(By.cssSelector("div#short-details-panel")).isDisplayed()){
		System.out.println("Details panel is displayed");
		}else{
		System.out.println("Details panel is not displayed");
		}
}


@Then("^Verify if Returns panel is displayed$")
public void Verify_if_Returns_panel_is_displayed() throws Throwable {
	driver.findElement(By.cssSelector("div#returns-tabarrow")).click();
	Thread.sleep(2000);
	if( driver.findElement(By.cssSelector("div#returns-panel")).isDisplayed()){
		System.out.println("Returns panel is displayed");
		}else{
		System.out.println("Returns panel is not displayed");
		}
		
}


@Then("^Verify if Review panel is displayed$")
public void Verify_if_Review_panel_is_displayed() throws Throwable {
	driver.findElement(By.cssSelector("div#reviews-tabarrow")).click();
	Thread.sleep(2000);
	if( driver.findElement(By.cssSelector("div#reviews-panel")).isDisplayed()){
		System.out.println("Review panel is displayed");
		}else{
		System.out.println("Review panel is not displayed");
		}
}



@Then("^Verify if Baynote is dislpayed$")
public void Verify_if_Baynote_is_dislpayed() throws Throwable {
	if( driver.findElement(By.cssSelector(".merch-assoc-list")).isDisplayed()){
		System.out.println("Baynote is displayed");
		}else{
		System.out.println("baynote is not displayed");
		}
	driver.close();
}

@Then("^verify Find in Store Availabilty$")
public void verify_Find_in_Store_Availabilty() throws Throwable {
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("button#check-availability")).click();
	driver.findElement(By.cssSelector("#postcode-search")).sendKeys("3000");
	driver.findElement(By.cssSelector("a#StoreName_button_link")).click();
	Thread.sleep(5000);
	if( driver.findElement(By.cssSelector("div#store-list")).isDisplayed()){
	System.out.println("Product is available");
	}else{
	System.out.println("Product is not available");
	
	}
	
}



//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Wishlist ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

@Then("^I click on Add to Wishlist$")
public void I_click_on_Add_to_Wishlist() throws Throwable {
	driver.findElement(By.cssSelector("a#view-more")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("a#add-to-wishlist")).click();
	Thread.sleep(5000);
    
}

@Then("^I click on View Wishlist$")
public void I_click_on_View_Wishlist() throws Throwable {
	driver.findElement(By.cssSelector("span#mywl-icon")).click();
	Thread.sleep(5000);
   
}

@Then("^I change the quantity of the item$")
public void I_change_the_quantity_of_the_item() throws Throwable {
	driver.findElement(By.cssSelector("input#quantity")).sendKeys("2");
	
    
}

@Then("^I Add to Bag form Wishlist$")
public void I_Add_to_Bag_form_Wishlist() throws Throwable {
	driver.findElement(By.cssSelector("a#addAllToCart")).click();
    Thread.sleep(4000);
    String itemaddedincart= driver.findElement(By.cssSelector("div#count2")).getText();
    System.out.println("The number of items added in cart is---   " +itemaddedincart);	
    driver.close();    
}





// ~~~~~~~~~~~~~~~~~~~~~~~~~~~ Mobile testcases~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//~~~~~~~~~~~~~~~ MobileMyApplication- registration and login~~~~~~~~~~~~~~~~~~~~~~~~~~~~

@Given("^Open firefox and start mobile application$")
public void Open_firefox_and_start_mobile_application() throws Throwable {
	Thread.sleep(5000);
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://m.myer.com.au/shop/mobile/mystore");
	Thread.sleep(6000);
}


@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\" in mobile site$")
public void I_enter_valid_and_valid_in_mobile_site(String uname1, String pass1) throws Throwable {
	driver.findElement(By.cssSelector("span.ir.ico_user")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("log in")).click();
    Thread.sleep(7000);
    Thread.sleep(5000);
    Thread.sleep(5000);
	driver.findElement(By.id("login_id")).sendKeys(uname1);
	driver.findElement(By.id("password")).sendKeys(pass1);
}

@Then("^user should be able to login successfully in mobile site$")
public void user_should_be_able_to_login_successfully_in_mobile_site() throws Throwable {
	driver.findElement(By.id("login_button")).click();
	Thread.sleep(7000);
	driver.close();
}

@When("^I enter all the required fields in mobile site$")
public void I_enter_all_the_required_fields_in_mobile_site() throws Throwable {
	driver.findElement(By.cssSelector("span.ir.ico_user")).click();
    Thread.sleep(5000);
    driver.findElement(By.linkText("join")).click();
    Thread.sleep(7000);
    Thread.sleep(5000);
    Thread.sleep(5000);
    Thread.sleep(5000);
    Thread.sleep(5000);
    driver.findElement(By.name("firstName")).sendKeys("testrr");
	driver.findElement(By.name("lastName")).sendKeys("lnamew");
	Thread.sleep(5000);
	driver.findElement(By.id("logonId")).sendKeys("lnamewsdf@gmail.com");
	driver.findElement(By.id("confirmLogonId")).sendKeys("lnamewsdf@gmail.com");
	new Select (driver.findElement(By.id("phoneType1"))).selectByVisibleText("Mobile");
	Thread.sleep(5000);
	driver.findElement(By.id("phone1")).sendKeys("9878787873");
	Thread.sleep(5000);
	driver.findElement(By.className("not-found")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("address1")).sendKeys("ABC street");
	driver.findElement(By.id("city")).sendKeys("Melbourne");
	driver.findElement(By.id("zipCode")).sendKeys("3004");
	Thread.sleep(3000);
	driver.findElement(By.id("logonPassword")).sendKeys("Myer123");
	driver.findElement(By.id("logonPasswordVerify")).sendKeys("Myer123");
	Thread.sleep(3000);
}

@Then("^user should be able to register successfully in mobile site$")
public void user_should_be_able_to_register_successfully_in_mobile_site() throws Throwable {
	driver.findElement(By.id("create-account")).click();
	Thread.sleep(7000); 
	Thread.sleep(5000);
	String bodyText = driver.findElement(By.cssSelector("div#banner")).getText();
	Assert.assertTrue("Account not created!!", bodyText.contains("my account"));
	Thread.sleep(5000);
	driver.close();
}


//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Checkout Mobile~~~~~~~~~~~~~~~~~~~~~~~~~~~

// ~~~~~~~~~~~~~~~~~~ Checkout mobile click and collect registered user~~~~~~~~~~~~~~~~~


@When("^I search for an item example \"([^\"]*)\" in mobile$")
public void I_search_for_an_item_example_in_mobile(String searchitem) throws Throwable {
	//Explicit wait
	WebDriverWait wait=new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#product_search")));
	
	driver.findElement(By.cssSelector("input#product_search")).sendKeys(searchitem);
	driver.findElement(By.cssSelector("input#product_search_submit")).click();
	Thread.sleep(7000);
}

@Then("^Search Results page should be displayed for mobile$")
public void Search_Results_page_should_be_displayed_for_mobile() throws Throwable {
		String bodyText1 = driver.findElement(By.cssSelector("div#banner")).getText();
		Assert.assertTrue("Search page is not displayed", bodyText1.contains("search results for"));
}

@When("^I click on an item in mobile site$")
public void I_click_on_an_item_in_mobile_site() throws Throwable {
    driver.findElement(By.xpath("html/body/div[1]/div[5]/div[3]/ul/li[3]/a/img")).click();
   // Thread.sleep(5000);
   // Thread.sleep(5000);
   // Thread.sleep(5000);
}

@Then("^PDP page should open in mobile$")
public void PDP_page_should_open_in_mobile() throws Throwable {
	WebDriverWait wait=new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[id='productMainImage'][alt='item Image']")));
	 
	WebElement primaryimage = driver.findElement(By.cssSelector("img[id='productMainImage'][alt='item Image']"));
	 Assert.assertEquals(true, primaryimage.isDisplayed());
	 Thread.sleep(3000);    
}

@Then("^Add an item to bag and click on View bag page in mobile$")
public void Add_an_item_to_bag_and_click_on_View_bag_page_in_mobile() throws Throwable {
	driver.findElement(By.cssSelector("a#add_to_cart")).click();
	WebDriverWait wait=new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#checkout")));

	String cssSelectorOfSameElements="a#checkout";
    java.util.List<WebElement> a1=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
	a1.get(0).click();
    Thread.sleep(5000);
    Thread.sleep(5000);
    
}

@When("^Click on registered user using valid id \"([^\"]*)\" and password \"([^\"]*)\" in mobile$")
public void Click_on_registered_user_using_valid_id_and_password_in_mobile(String uname, String passwd) throws Throwable {
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("input#login_id")).sendKeys(uname);
	driver.findElement(By.cssSelector("input#password")).sendKeys(passwd);
	driver.findElement(By.cssSelector("input#log-btn")).click();
	Thread.sleep(5000);
	Thread.sleep(5000);
	Thread.sleep(5000);
	
}

@Then("^Select Click and Collect option in mobile$")
public void Select_Click_and_Collect_option_in_mobile() throws Throwable {
	WebDriverWait wait=new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#pickup-tab")));
	
	driver.findElement(By.cssSelector("div#pickup-tab")).click();
	Thread.sleep(5000);
	Thread.sleep(5000);
	
}


@Then("^Search by Postcode in mobile$")
public void Search_by_Postcode_in_mobile() throws Throwable {
	Thread.sleep(5000);
	Thread.sleep(5000);
	Thread.sleep(7000);
	Thread.sleep(9000);
	driver.findElement(By.cssSelector("input#postcode-search")).clear();
	driver.findElement(By.cssSelector("input#postcode-search")).sendKeys("3000");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("a#StoreName_button_link")).click();
	Thread.sleep(5000);
	Thread.sleep(5000);
	Thread.sleep(5000);
	Thread.sleep(5000);
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("div#select-button3>a")).click();
	Thread.sleep(5000);
	Thread.sleep(5000);
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("a#payment-next")).click();
	Thread.sleep(5000);
	Thread.sleep(5000);
	Thread.sleep(5000);
	Thread.sleep(5000);
}

@Then("^Click on VISA radiobutton in mobile$")
public void Click_on_VISA_radiobutton_in_mobile() throws Throwable {
	Thread.sleep(3000);
	WebElement element= driver.findElement(By.cssSelector("a#giftcard-add-btn"));
	fnHighlightMe(driver,element);
	Thread.sleep(3000);
	element.click();
	
	WebElement element1=driver.findElement(By.cssSelector("div.radiodeck:nth-child(3) > label:nth-child(3)"));
	fnHighlightMe(driver,element1);
	Thread.sleep(3000);
	element1.click();
	Thread.sleep(3000);
	
	WebElement element2 = driver.findElement(By.cssSelector("label.floatLeft > span:nth-child(1)"));
	fnHighlightMe(driver,element2);
	Thread.sleep(3000);
	Thread.sleep(3000);
	element2.click();
	Thread.sleep(3000);
	Thread.sleep(5000);
	Thread.sleep(3000);
	
	// Pay securely Now button
	driver.findElement(By.cssSelector("a#pay-securebtn")).click();
	Thread.sleep(5000);
	Thread.sleep(3000);
}

@Then("^Pay Using VISA in mobile$")
public void Pay_Using_VISA_in_mobile() throws Throwable {
	Thread.sleep(5000);
	Thread.sleep(5000);
	WebDriverWait wait=new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[style='display: block; width: 100%; height: 55em;']")));

	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[style='display: block; width: 100%; height: 55em;']")));
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input#_SBILL_IN_cc_holder")).sendKeys("asdad");
	driver.findElement(By.cssSelector("input#_SBILL_IN_cc_no1")).sendKeys("1111");
	driver.findElement(By.cssSelector("input#_SBILL_IN_cc_no2")).sendKeys("1111");
	driver.findElement(By.cssSelector("input#_SBILL_IN_cc_no3")).sendKeys("1111");
	driver.findElement(By.cssSelector("input#_SBILL_IN_cc_no4")).sendKeys("1111");
	new Select (driver.findElement(By.id("expiry_month"))).selectByVisibleText("03");
	new Select (driver.findElement(By.cssSelector("select[name=_SBILL_IN_exp_year]"))).selectByVisibleText("19");
	driver.findElement(By.cssSelector("input#_SBILL_IN_cvv")).sendKeys("1234");
	driver.findElement(By.cssSelector("input.button.submit.continue")).click();
	Thread.sleep(6000);
	driver.close();
	
}


//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Mobile paypal guest user~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

@Then("^Enter guest email id in mobile and click on continue button$")
public void Enter_guest_email_id_in_mobile_and_click_on_continue_button() throws Throwable {
	driver.findElement(By.cssSelector("input#guest_email_id")).sendKeys("sadsdfgde@gmail.com");
	driver.findElement(By.cssSelector("a.gray-btn.continue-btn")).click();
	Thread.sleep(5000);
	Thread.sleep(5000);
	
	
}

@Then("^Shipping and Billing Display page should open$")
public void Shipping_and_Billing_Display_page_should_open() throws Throwable {
	Assert.assertTrue(driver.getTitle().contains("Myer Online - Shipping and Billing Display"));
}

@When("^Enter contact details and click on Next button$")
public void Enter_contact_details_and_click_on_Next_button() throws Throwable {
	driver.findElement(By.id("shippingFirstName")).sendKeys("testrr");
	driver.findElement(By.id("shipping_last-name")).sendKeys("slname");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector(".float-right.add-nt-found")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("address1")).sendKeys("ABC street");
	driver.findElement(By.id("city")).sendKeys("Melbourne");
	driver.findElement(By.id("zipCode")).sendKeys("3000");
	Thread.sleep(3000);
	new Select (driver.findElement(By.id("phoneType1"))).selectByVisibleText("Mobile");
	Thread.sleep(5000);
	driver.findElement(By.id("phone1")).sendKeys("9878787873");
	Thread.sleep(5000);
	driver.findElement(By.id("guestSubmit")).click();
	Thread.sleep(5000);
	Thread.sleep(5000);
	Thread.sleep(5000);
	Thread.sleep(5000);	
}

@Then("^Home delivery page should open and click on Next$")
public void Home_delivery_page_should_open_and_click_on_Next() throws Throwable {
	Assert.assertTrue(driver.getTitle().contains("Myer Online - Myer Checkout"));
	driver.findElement(By.id("payment-next")).click();
	Thread.sleep(5000);
	Thread.sleep(5000);
	Thread.sleep(5000);
	
}

@Then("^Checkout Payment page should open and select paypal and click on pay secureply now$")
public void Checkout_Payment_page_should_open_and_select_paypal_and_click_on_pay_secureply_now() throws Throwable {
	Assert.assertTrue(driver.getTitle().contains("Checkout Payment"));
	
	
	
	Thread.sleep(3000);
	WebElement element= driver.findElement(By.cssSelector("a#giftcard-add-btn"));
	fnHighlightMe(driver,element);
	Thread.sleep(3000);
	element.click();
	
	WebElement element1=driver.findElement(By.cssSelector("div.radiodeck:nth-child(6) > label:nth-child(3)"));
	fnHighlightMe(driver,element1);
	Thread.sleep(3000);
	element1.click();
	Thread.sleep(3000);
	
	WebElement element2 = driver.findElement(By.cssSelector("label.floatLeft > span:nth-child(1)"));
	fnHighlightMe(driver,element2);
	Thread.sleep(3000);
	Thread.sleep(3000);
	element2.click();
	Thread.sleep(3000);
	Thread.sleep(5000);
	Thread.sleep(3000);

	driver.findElement(By.cssSelector("a#pay-securebtn")).click();
	Thread.sleep(5000);
	Thread.sleep(3000);
	Thread.sleep(5000);
	Thread.sleep(3000);
	Thread.sleep(5000);
	Thread.sleep(3000);
	
}

@Then("^Paypal page should open and enter paypal login details and complete the payment$")
public void Paypal_page_should_open_and_enter_paypal_login_details_and_complete_the_payment() throws Throwable {
	Thread.sleep(9000);
	Thread.sleep(5000);
	Assert.assertTrue(driver.getTitle().equalsIgnoreCase("PayPal Checkout - Log In"));
	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='injectedUl']")));
	driver.findElement(By.cssSelector("input#email")).sendKeys("qwerty.dsfsdfs@myer.com.au");
	driver.findElement(By.cssSelector("input#password")).sendKeys("My3rT3sT4cc0unt");
	driver.findElement(By.cssSelector("button#btnLogin")).click();
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("input#confirmButtonTop")).click();
	Thread.sleep(6000);
	Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Myer Online - Order Confirmation"));
	String bodyText = driver.findElement(By.cssSelector("p.txt-lrg")).getText();
	System.out.println("The order id using P2P guest checkout flow is---   "+bodyText);	
	driver.close();
	Thread.sleep(5000);

	/*
	///////////////////////////////////////////////////////////////////////////////
	//The below code is only for testing. Remove it
	
	///////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////
	//Drag and drop
	Actions act =new Actions(driver);
	WebElement source = driver.findElement(By.xpath("p.txt-lrg")); //source ele which you want to drag
	 
	 WebElement target = driver.findElement(By.xpath("p.txt-lrg")); //target where you want to drop
	 
	 act.dragAndDrop(source, target).perform();
	 
	
	 //// Select menu item in a drop down list:
	 
	new Select (driver.findElement(By.id("phoneType1"))).selectByVisibleText("Mobile");
	//selectByVisibleText
	//selectByValue
	//selectByIndex
	
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.getCurrentUrl();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	String typedtext =driver.findElement(By.xpath("")).getAttribute("value");
	driver.findElement(By.xpath("")).clear();
	
	WebDriverWait wait= new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	
	java.util.List<WebElement> movies=driver.findElements(By.xpath(""));
	int noofmovies= movies.size();
	
	driver.findElement(By.xpath("")).isSelected();
	
	Actions action =new Actions(driver);
	WebElement src= driver.findElement(By.xpath(""));
	WebElement trgt= driver.findElement(By.xpath(""));
	action.dragAndDrop(src, trgt).perform();
	
	driver.findElement(By.xpath("")).isDisplayed();
	driver.findElement(By.xpath("")).isEnabled();
	driver.findElement(By.xpath("")).getText();
	
	
	
	driver.navigate().forward();
	
	
	
*/	

}

}

