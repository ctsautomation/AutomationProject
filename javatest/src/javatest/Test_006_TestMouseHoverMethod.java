package javatest;

import java.util.Set;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import mainJava.CommonPage;
import mainJava.LoginMethod;




public class Test_006_TestMouseHoverMethod extends LoginMethod {
		
	@Test
	public void MouseHoverMethodTest()   {
      
		
		CommonPage comPage = new CommonPage();
		
		String PODName = "POD - DOOR LUI Reworking";
		
		WebElement PODLink = comPage.findPODElement(PODName);
		
		//Scrolling the page till element is found
		comPage.scrollThePageTillElementFound(PODLink);
		
		//right click and open the URL in new tab
		comPage.openLinkInNewTab(PODLink);
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String newWindow: allWindows){
			driver.switchTo().window(newWindow);
			System.out.println("Window Switched");	
		}
		
		driver.manage().window().maximize();
		
    }

	
	
	
		
}
