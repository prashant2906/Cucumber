package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.Zip;
import org.testng.annotations.Test;


public class utility {
	

	XSSFWorkbook wb;
	XSSFSheet sheet1;
	

	public utility()
	

	{
	

	    try {


	    	File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
			

			FileInputStream fis = new FileInputStream(src);
			

			wb= new XSSFWorkbook(fis); // .xlsx workbook
			

			fis.close();
			

  //	HSSFWorkbook wb= new HSSFWorkbook(fis); // .xls workbook
			
			

		} catch (Exception e) {
			

			System.out.println(e.getMessage());
		}
	
		

	}
	

	public String getData(int sheetnumber,int row,int column)
	{
		sheet1= wb.getSheetAt(sheetnumber);
		

		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		

		return data;
		

	}

	
	
	public static void captureScreenshot(WebDriver driver,String screenshotname)
	{
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			

			File source= ts.getScreenshotAs(OutputType.FILE);
			

			String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			

			FileUtils.copyFile(source,new File("./Screenshots/"+screenshotname+"_"+timeStamp+".png"));
			

			System.out.println("Error Screenshot taken");
		} 
		catch (Exception e) {
			

		System.out.println("Exception while taking screenshot: "+ e.getMessage());
		} 



	}
	

	public static void sendemail(String str) throws EmailException
	{

		System.out.println("~~~~~~~Sending error Report started~~~~~~~~~~~~~~~");
		EmailAttachment attachment = new EmailAttachment();
		Email email = new SimpleEmail();
		//MultiPartEmail email = new MultiPartEmail();
		//email.setHostName("smtp.gmail.com");
		email.setHostName("emea.relay.ibm.com");
		

		//email.setSmtpPort(465);
		email.setSmtpPort(25);
		
		

		//email.setAuthenticator(new DefaultAuthenticator("asdsadffw@gmail.com", "Jenkin123"));



		email.setSSLOnConnect(false);
		email.setFrom("AutomationResults@in.ibm.com");
		email.setSubject("Selenium cucumber report for failed test : " + str);
		email.setMsg("Test Scenario failed: " + str + ".\nTest team please execute this scenario manually.");

		email.addTo("prashgoe@in.ibm.com");


		 //attachment.setPath("C:/Users/IBM_ADMIN/Desktop/epricer cucumber proj May222017/epricer.cucumber.maven/target/cucumber-html-report/index.html");
		 //attachment.setDisposition(EmailAttachment.ATTACHMENT);
		 // attachment.setDescription("Html Report");
		  //attachment.setName("Index.html");
		
		//email.addTo("mbhatna2@in.ibm.com");
		 
		/*	
		email.addTo("sanjulsi@in.ibm.com");
		email.addTo("ashish.mandal@in.ibm.com");
		email.addTo("parulrathi@in.ibm.com");
		email.addTo("ritkhare@in.ibm.com");
		email.addTo("caparrhb@ph.ibm.com");
		email.addTo("sulin@cn.ibm.com");
		email.addTo("deenkuma@in.ibm.com");
		email.addTo("vikjain3@in.ibm.com");
		email.addTo("bwshell@us.ibm.com");
		email.addTo("rklute@us.ibm.com");
		email.addTo("abhissin@in.ibm.com");
		email.addTo("reynoscb@ph.ibm.com");
		email.addTo("vergarec@ph.ibm.com");
		email.addTo("kejundl@cn.ibm.com");
		email.addTo("mbhatna2@in.ibm.com");
		email.addTo("meendixi@in.ibm.com");
		email.addTo("prashgoe@in.ibm.com");
		email.addTo("shivanigaur@in.ibm.com");
		email.addTo("simranka@in.ibm.com");
		email.addTo("taggarw2@in.ibm.com");
		email.addTo("zwenjiao@cn.ibm.com");
		email.addTo("bhissin@in.ibm.com");

		email.addTo("avalivad@in.ibm.com");























		email.addTo("bhissin@in.ibm.com");


		email.addTo("zhaoxiaz@cn.ibm.com");
		email.addTo("haagarwa@in.ibm.com");	
		


		*/
		

		//email.attach(attachment);
		email.send();
		System.out.println("~~~~~~~Error Report sent successfully~~~~~~~~~~~~~~~");
	}
	
	
// Ashutosh Valivade: File TimeStamp Changes
// Get current system time
	public static String GetCurrentTimeStamp() {
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;
	}
	
	
	public static void sendemailattachmentExcel() throws EmailException
	{
		

		// Create the attachment
		  EmailAttachment attachment = new EmailAttachment();


		  EmailAttachment attachment1 = new EmailAttachment();
		  attachment.setPath("C:/Users/IBM_ADMIN/Desktop/Sanity/Production/ProdAllGeo/epricer.cucumber.maven/target/CucumberReports.zip");
		  attachment1.setPath("C:/Users/IBM_ADMIN/Desktop/Cucumber jars/Excel Data/ReadTestData.xlsx");
		










		  //attachment.setPath("C:/Users/IBM_ADMIN/Desktop/epricer cucumber proj May222017/epricer.cucumber.maven/target/cucumber-report-html/cucumber-html-reports/CDT_Maint-feature.html");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("Results of test automation");
		  attachment1.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment1.setDescription("Results of test automation");
		  
		  //attachment1.setName("Result Excel.xlsx");
		  //attachment.setName("Reports.zip");
		// Ashutosh Valivade: File TimeStamp Changes
		File file = new File(attachment + "\\" + GetCurrentTimeStamp().replace(":", "_").replace(".", "_") + ".zip");
		System.out.println("Report name is: " + file.getName());

		File file1 = new File(attachment1 + "\\" + GetCurrentTimeStamp().replace(":", "_").replace(".", "_") + ".xlsx");
		System.out.println("File name is: " + file1.getName());

		attachment.setName(file.getName());
		attachment1.setName(file1.getName());













		MultiPartEmail email = new MultiPartEmail();
		System.out.println("~~~~~~~Sending email attachment started~~~~~~~~~~~~~~~");
		//Email email = new SimpleEmail();
		//email.setHostName("smtp.gmail.com");
		//email.setSmtpPort(465);
		//email.setAuthenticator(new DefaultAuthenticator("asdsadffw@gmail.com", "Jenkin123"));


		//email.setSSLOnConnect(true);
		email.setHostName("emea.relay.ibm.com");
		//email.setSmtpPort(465);
		email.setSmtpPort(25);
		//email.setAuthenticator(new DefaultAuthenticator("asdsadffw@gmail.com", "Jenkin123"));


		email.setSSLOnConnect(false);
		email.setFrom("AutomationResults@in.ibm.com");
		email.setSubject("Automation Production Sanity Report");
	  //email.setMsg("Hi Team,\nePricer Production sanity is completed successfully.Please find quote id's in attachment below.\nNote: For the failed testcases, a seperate email will be sent and also the quote id field will be 'Test Scenario failed' in this excel sheet:\n");










	   email.setMsg("Hi Team,\nThis is an automated message for performing sanity on ePricer Production servers implemented by ePricer testing team.\nThe business objective is to monitor Month Ending sanity task starting from 28th Oct 4:30 AM ET till 30 Oct 12:30 AM ET equals ( 28th Oct 2:00 PM IST till 30 Oct 10:00 AM IST ) for an interval of 4 hours.\nPlease refer an attached Excel for more information and feel free to get in touch with ' ePricerTestTeam ' when required.\nThanks , ePricer Testing Team.");
		

		//	email.setMsg("This is an automated message for performing sanity on ePricer Production servers implemented by ePricer testing team.  The business objective is to monitor Month Ending sanity task starting from 30th May 2017 10:00 AM IST till 03 June 2017 10:00 AM IST for an interval of 4 hours.\nPlease refer an attached Excel for more information and feel free to get in touch with ' ePricerTestTeam ' when required. \nThanks , ePricer Testing Team. ");







	//	email.addTo("mbhatna2@in.ibm.com");
		
	
		//email.addTo("sanjulsi@in.ibm.com");
	   







	   //email.addTo("prashgoe@in.ibm.com");
	
		/*

		email.addTo("sanjulsi@in.ibm.com");
		email.addTo("ashish.mandal@in.ibm.com");
		email.addTo("parulrathi@in.ibm.com");
		email.addTo("ritkhare@in.ibm.com");
		email.addTo("caparrhb@ph.ibm.com");
		email.addTo("sulin@cn.ibm.com");
		email.addTo("deenkuma@in.ibm.com");
		email.addTo("vikjain3@in.ibm.com");
		email.addTo("bwshell@us.ibm.com");
		email.addTo("rklute@us.ibm.com");
		email.addTo("abhissin@in.ibm.com");
		email.addTo("reynoscb@ph.ibm.com");
		email.addTo("vergarec@ph.ibm.com");
		email.addTo("kejundl@cn.ibm.com");
		email.addTo("mbhatna2@in.ibm.com");
		email.addTo("meendixi@in.ibm.com");
		email.addTo("prashgoe@in.ibm.com");
		email.addTo("shivanigaur@in.ibm.com");
		email.addTo("simranka@in.ibm.com");
		email.addTo("taggarw2@in.ibm.com");
		email.addTo("zwenjiao@cn.ibm.com");
		email.addTo("bhissin@in.ibm.com");

		email.addTo("avalivad@in.ibm.com");























		email.addTo("bhissin@in.ibm.com");


		email.addTo("zhaoxiaz@cn.ibm.com");
		email.addTo("haagarwa@in.ibm.com");	
		


			*/
		
		

		// add the attachment
		email.attach(attachment);
		email.attach(attachment1);
		email.send();
		System.out.println("~~~~~~~Email attachment sent successfully~~~~~~~~~~~~~~~");

	}










	public static void SetExcelData() throws IOException
	{
		File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber jars\\Excel Data\\ReadTestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis); // .xlsx workbook
		XSSFSheet sheet1= wb.getSheetAt(1);  // This is for sheet 1 in excel
		

		sheet1.getRow(2).createCell(2).setCellValue(" ");
		sheet1.getRow(2).createCell(3).setCellValue(" ");
		System.out.println("AP Quote id is removed from excel sheet");
			

		sheet1.getRow(6).createCell(2).setCellValue(" ");
		sheet1.getRow(6).createCell(3).setCellValue(" ");
		System.out.println("PCS BP Quote id is removed from excel sheet");
			

		sheet1.getRow(3).createCell(2).setCellValue(" ");
		sheet1.getRow(3).createCell(3).setCellValue(" ");
		System.out.println("EMEA Quote id is removed from excel sheet");
		

		sheet1.getRow(4).createCell(2).setCellValue(" ");
		sheet1.getRow(4).createCell(3).setCellValue(" ");
		System.out.println("LA Quote id is removed from excel sheet");
		
		

		sheet1.getRow(1).createCell(2).setCellValue(" ");
		sheet1.getRow(1).createCell(3).setCellValue(" ");
		System.out.println("NA Quote id is removed from excel sheet");
		
		

		sheet1.getRow(7).createCell(2).setCellValue("PASS");
		System.out.println("Making Prod DR PASS");
		

		sheet1.getRow(8).createCell(2).setCellValue("PASS");
		System.out.println("Making WebServices PASS");
		

		sheet1.getRow(9).createCell(2).setCellValue("PASS");
		FileOutputStream fout = new FileOutputStream(src);	
		wb.write(fout);
		System.out.println("Making Settings and Auth PASS");
		
		sheet1.getRow(11).createCell(2).setCellValue(" ");
		sheet1.getRow(11).createCell(3).setCellValue(" ");
		System.out.println("EMEA TSS Quote id is removed from excel sheet");

	}
	
	
/*
	public static void sendHTMLemail(String str) throws EmailException
	{
		
		System.out.println("~~~~~~~Sending email started~~~~~~~~~~~~~~~");
		EmailAttachment attachment = new EmailAttachment();
		//Email email = new SimpleEmail();
		HtmlEmail email = new HtmlEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("asdsadffw@gmail.com", "Jenkin123"));
		email.setSSLOnConnect(true);
		email.setFrom("dhruv@gmail.com");
		email.setSubject("Selenium cucumber report for failed test : " + str);
		email.setMsg("Test Scenario failed: " + str);
		 attachment.setPath("C:/Users/IBM_ADMIN/Desktop/epricer cucumber proj May222017/epricer.cucumber.maven/target/cucumber-html-report/index.html");
		 attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("Html Report");
		  attachment.setName("Index.html");
		 
		email.addTo("dhruvfarswan@gmail.com");
		email.attach(attachment);
		email.send();
		System.out.println("~~~~~~~Email sent successfully~~~~~~~~~~~~~~~");














































	}
*/	
	
	public static void zipfile() throws IOException
	{
		System.out.println("Compressing the file");
		Zip compress=new Zip();compress.zip(new File("C:/Users/IBM_ADMIN/Desktop/Sanity/Production/ProdAllGeo/epricer.cucumber.maven/target/cucumber-report-html"), new File("C:/Users/IBM_ADMIN/Desktop/Sanity/Production/ProdAllGeo/epricer.cucumber.maven/target/CucumberReports.zip"));











		System.out.println("~~~~~~~~~~~~~ZIP complete~~~~~~~~~~~~~~~~~~~~~");
	}
	

	public static void deletefile() throws IOException 
	{

		//Set the path of file to be created
		// In this case Code.txt file will be created in path C:/Javaseleniumworld


		File file =new File("C:/Users/IBM_ADMIN/Desktop/Sanity/Production/ProdAllGeo/epricer.cucumber.maven/target/CucumberReports.zip");
		// if file  exists, then create it
		 if (file.exists()) 
		 {
             file.delete();
             System.out.println("File is deleted");
		 }
         
		


		//	File.delete();

		//Zip compress=new Zip();compress.zip(new File("C:/Users/IBM_ADMIN/Desktop/Sanity/Production/ProdAllGeo/epricer.cucumber.maven/target/cucumber-report-html"), new File("C:/Users/IBM_ADMIN/Desktop/Sanity/Production/ProdAllGeo/epricer.cucumber.maven/target/CucumberReports.zip"));
	









	}
	
}	
