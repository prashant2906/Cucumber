package AutoITDemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindow {

	
	public static void main(String[] args) throws IOException{
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\AutoIT Script\\HandleAuthWindow.exe");
	
	}
}
