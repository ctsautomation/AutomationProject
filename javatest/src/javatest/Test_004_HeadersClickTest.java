package javatest;

import java.util.Set;
import org.junit.Test;
import mainJava.LoginMethod;
import mainJava.PageHeader;



public class Test_004_HeadersClickTest extends LoginMethod {
		
	@Test
	public void headerlinkTest()   {
      
		PageHeader header = new PageHeader();
		header.clickAboutHeaderLink();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String newWindow: allWindows){
			driver.switchTo().window(newWindow);
			System.out.println("Window Switched");	
		}
		
		driver.close(); //closing the new window and getting back to main window
		driver.switchTo().window(parentWindow);
		header.clickLogoutHeaderLink();
		
    }

	
	
	
		
}
