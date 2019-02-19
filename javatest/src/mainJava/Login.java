package mainJava;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;




public class Login extends Driver {
	
	//public static WebDriver driver ;
	
	@Before
	public void loginMethod(){
		System.out.println("Before starts");
		System.setProperty("webdriver.ie.driver","C:\\Users\\719403\\Desktop\\Project Documents\\Automation\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver = Driver.getInstance();
		try{
				
				driver.navigate().to("https://www.google.co.in");
				driver.manage().window().maximize();
				String title = driver.getTitle();
				System.out.println(title);
				
			}
		catch(Exception e){
				System.out.println("something went wrong!!");
				
		}
		
		
		}
	@After
	public void screenshotAfterExecution(){
		System.out.println("Starts Screenshot");
		// Take screenshot and store as a file format
				File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try {
				 // now copy the  screenshot to desired location using copyFile //method
				//FileUtils.copyFile(src, new File("C:/selenium/Test_001_Screensot_" + Data.timeStamp + ".png"));
				FileUtils.copyFile(src, new File("C:/selenium/Sample.png"));
				driver.close();
				}
				catch (IOException e)
				 {
				  System.out.println(e.getMessage());		 
				 }
	}
}
