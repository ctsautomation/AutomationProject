package mainJava;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Selectors.loginPageSelectors;
import testUtility.Data;


public class LoginMethod extends Driver {
	
	public static WebDriver driver ;
	
	@Before
	public void LoginStarts(){
		
		System.out.println("Running " + getClass().getSimpleName());
		System.setProperty("webdriver.ie.driver","C:\\Users\\719403\\Desktop\\Project Documents\\Automation\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		
		driver = Driver.getInstance();
		
		driver.navigate().to(testUtility.Data.ATSQAURL);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		//perform Login
		this.performLogin();
		
		//add wait for headers link
		CommonPage comPage = new CommonPage();
		comPage.waitForPageToLoad(30);
		
	}
	
	public void performLogin(){
		WebElement username = driver.findElement(loginPageSelectors.username);
		username.sendKeys(testUtility.Data.username);
		WebElement password = driver.findElement(loginPageSelectors.password);
		password.sendKeys(testUtility.Data.password);
		WebElement login = driver.findElement(loginPageSelectors.login);
		login.click();
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
	}
	@After
	public void screenshotAfterExecution(){
		System.out.println("Capturing Screenshot");
		// Take screenshot and store as a file format
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		// now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("C:/selenium/" + getClass().getSimpleName() + "_" + Data.timeStamp + ".png"));
		System.out.println("Screenshot is saved");
		//driver.close();
		driver.quit();
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());		 
		 }
	}
	
}
