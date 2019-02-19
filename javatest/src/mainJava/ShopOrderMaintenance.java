package mainJava;

import org.openqa.selenium.WebElement;

import Selectors.mainPageSelectors;


public class ShopOrderMaintenance extends LoginMethod {

	//Create shop Order
	public void createShopOrder(String shopOrderNumber){
		Driver.getInstance().switchTo().frame("mainFrame");
		System.out.println("Frame Switched");
		WebElement shopOrderInput = Driver.getInstance().findElement(mainPageSelectors.shopOrderInput);
		shopOrderInput.sendKeys(shopOrderNumber);
		System.out.println("Shop Order name entered");
		WebElement plannedMaterialInput = Driver.getInstance().findElement(mainPageSelectors.plannedMaterialInput);
		
		plannedMaterialInput.sendKeys(testUtility.Data.ATSMaterial);
		System.out.println("Material Entered");
		WebElement buildQtyInput = Driver.getInstance().findElement(mainPageSelectors.buildQuantityInput);
		buildQtyInput.sendKeys("5");
		System.out.println("Build Quantity Entered");
	
		Driver.getInstance().switchTo().defaultContent();
	}
	
	
	
}
