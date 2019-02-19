package mainJava;

import org.openqa.selenium.WebElement;

import Selectors.mainPageSelectors;

public class MenuPage extends LoginMethod {
	
	//1: Menu under Master Data Reports
	
	public void clickBOMReportLink(){
		//navigating to the frame
		Driver.getInstance().switchTo().frame("appFrame");
		System.out.println("Frame Switched");
		WebElement BOMReportLink = Driver.getInstance().findElement(mainPageSelectors.BOMReportLink);
		System.out.println("BOM Report link found");
		BOMReportLink.click();
		System.out.println("BOM Report link is clicked");
		Driver.getInstance().switchTo().defaultContent();
		//wait for BOM Report to generate
		BOMReportPage bomPage = new BOMReportPage();
		bomPage.waitForBOMReportToReload(30);
	}
	//2: Menu under Custom PODs for Executable Launch
	//3: Menu under Maintenance
		//POD Maintenance
		public void clickPODMaintenanceLink(){
			//navigating to the frame
			Driver.getInstance().switchTo().frame("appFrame");
			System.out.println("Frame Switched");
			WebElement PODMaintenanceLink = Driver.getInstance().findElement(mainPageSelectors.PODMaintenanceLink);
			System.out.println("POD Maintenance link found");
			PODMaintenanceLink.click();
			System.out.println("POD Maintenance link is clicked");
			Driver.getInstance().switchTo().defaultContent();
		}
	
	//4: Menu under Production
		//Shop Order Release
		public void clickShopOrderReleaseLink(){
			//navigating to the frame
			Driver.getInstance().switchTo().frame("appFrame");
			System.out.println("Frame Switched");
			WebElement ShopOrderReleaseLink = Driver.getInstance().findElement(mainPageSelectors.ShopOrderReleaseLink);
			System.out.println("Shop Order Release link found");
			ShopOrderReleaseLink.click();
			System.out.println("Shop Order Release link is clicked");
			Driver.getInstance().switchTo().defaultContent();
		}
	
	public void clickShopOrderMaintainanceLink(){
			Driver.getInstance().switchTo().frame("appFrame");
//			driver.switchTo().frame("appFrame");
			System.out.println("Frame Switched");
			WebElement ShopOrderMaintainanceLink = Driver.getInstance().findElement(mainPageSelectors.ShopOrderMaintLink);
			System.out.println("Shop Order Maintenance link found");
			ShopOrderMaintainanceLink.click();
			System.out.println("Shop Order Maintenance link is clicked");
			Driver.getInstance().switchTo().defaultContent();
			
		}
	//5: Menu under Reports
	//6: Menu under Product Geneology
	//7: Menu under Quality Management
	//8: Menu under Site-To-Site
	//9: Menu under Labour Tracking
	//10: Menu under AQM SA PODS
	//11: Menu under AQM FA PODS
	
	
	//
	
}
