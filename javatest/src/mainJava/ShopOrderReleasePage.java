package mainJava;

import org.openqa.selenium.WebElement;

import Selectors.mainPageSelectors;
import Selectors.shopOrderReleaseSelectors;


public class ShopOrderReleasePage extends CommonPage {

	
	
	public void releaseShopOrder(String shopOrderNumber){
		enterShopOrderNumber(shopOrderNumber);
		clickRetrieveButton();
		enterQTYToRelease();
		clickReleaseButton();
	}
	
	public void enterShopOrderNumber(String shopOrderNumber){
		Driver.getInstance().switchTo().frame("mainFrame");
		System.out.println("Frame Switched");
		WebElement shopOrderInput = Driver.getInstance().findElement(mainPageSelectors.shopOrderInput);
		shopOrderInput.sendKeys(shopOrderNumber);
		System.out.println("Shop Order Number entered");
		Driver.getInstance().switchTo().defaultContent();	
	}
	
	public void enterQTYToRelease(){
		Driver.getInstance().switchTo().frame("mainFrame");
		WebElement QtyToReleaseInput = Driver.getInstance().findElement(shopOrderReleaseSelectors.QTYToReleaseInput);
		QtyToReleaseInput.sendKeys("1");
		System.out.println("Quantity to release Entered");
		Driver.getInstance().switchTo().defaultContent();
	}
	
	public void clickReleaseButton(){
		Driver.getInstance().switchTo().frame("mainFrame");
		WebElement releaseBtn = Driver.getInstance().findElement(shopOrderReleaseSelectors.releaseButton);
		releaseBtn.click();
		System.out.println("Release Button is clicked");
		Driver.getInstance().switchTo().defaultContent();
	}
	
}
