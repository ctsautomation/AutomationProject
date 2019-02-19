package javatest;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import mainJava.CommonPage;
import mainJava.LoginMethod;
import mainJava.MenuPage;
import testUtility.Data;




public class Test_007_Verify_Operation_And_Resource extends LoginMethod {
	
	@Test
	public void verify_Operation_And_Resource()   {
  
		CommonPage comPage = new CommonPage();
		String PODName = "POD - DOOR LUI Assembly";
		WebElement PODLink = comPage.findPODElement(PODName);
		
		//Scrolling the page till element is found
		comPage.scrollThePageTillElementFound(PODLink);
		String parentWindow = driver.getWindowHandle();
		
		//right click and open the URL in new tab
		comPage.openLinkInNewTab(PODLink);
		
		//wait till POD page is loaded
		comPage.waitForPODToReload(30);
		
		//retrieving operation and resource value
		String operation = comPage.getOperationValue();
		String resource = comPage.getResourceValue();
		
		Assert.assertTrue("Operation is displayed as expected", operation.equalsIgnoreCase(Data.op_DOOR_LUI_Assembly));
		Assert.assertTrue("Resource is displayed as expected", resource.equalsIgnoreCase(Data.res_DOOR_LUI));
		
		//navigate back to main page
		comPage.closeOpenedWindowAndNavigateBackToParentWindow(parentWindow);
		
		//click on the BOM Report link
		MenuPage menuPage = new MenuPage();
		menuPage.clickBOMReportLink();
		
    }
	
	
	
		
}
