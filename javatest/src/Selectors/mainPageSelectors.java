package Selectors;

import org.openqa.selenium.By;

public class mainPageSelectors {

	public static final By masterDataReportsTitle = By.xpath(".//li[@title = 'Master Data Reports']");
	public static final By ProductTitle = By.xpath(".//li[@title = 'Product']");
	public static final By BOMReportLink = By.xpath(".//li[@title = 'BOM Report']/a");
	public static final By ShopOrderMaintLink = By.xpath(".//li[@title = 'Shop Order Maintenance']/a");
	public static final By ShopOrderReleaseLink = By.xpath(".//li[@title = 'Shop Order Release']/a");
	public static final By PODMaintenanceLink = By.xpath(".//li[@title = 'POD Maintenance']/a");
	public static final By activityMaintenanceLink = By.xpath(".//a[contains(., 'Carrier')]");
	public static final By PODDoorLUIAssemblyLink =  By.xpath(".//li[@title= 'POD - DOOR LUI Assembly']/a");
	public static final By home = By.xpath(".//a[@id = 'home']");
	
	public static final By shopOrderInput = By.xpath(".//input[@name='SHOP_ORDER']");
	public static final By plannedMaterialInput = By.xpath(".//input[@name='PLANNED_ITEM']");
	public static final By buildQuantityInput = By.xpath(".//input[@name='BUILD_QTY']");
	//public static final By login = By.xpath(".//*[@name = 'uidPasswordLogon']");
	//.//li[@title = 'Substep Maintenance']
	public static final By saveButton = By.xpath(".//button[@title='Choose to save the current record']");
	
	public static By getElementPOD(String PODName){
		return By.xpath(".//li[@title = '" + PODName + "']/a");
	}
	
}
