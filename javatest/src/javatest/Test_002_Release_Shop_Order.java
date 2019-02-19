package javatest;


import org.junit.Test;
import mainJava.CommonPage;
import mainJava.LoginMethod;
import mainJava.MenuPage;
import mainJava.ShopOrderMaintenance;
import mainJava.ShopOrderReleasePage;
import testUtility.Data;



public class Test_002_Release_Shop_Order extends LoginMethod {
	
	
	@Test
	public void Test_002_Test() {
	
		String shopOrderNumber = "Test_002" + Data.timeStamp;
		MenuPage menuPage = new MenuPage();
		CommonPage comPage = new CommonPage();
		ShopOrderMaintenance shopMaintPage = new ShopOrderMaintenance();
		ShopOrderReleasePage SRPage = new ShopOrderReleasePage();
	
		//Click Shop order maintenance
		menuPage.clickShopOrderMaintainanceLink();
				
		//Create Shop Order
		shopMaintPage.createShopOrder(shopOrderNumber);
				
		//Save the Shop Order
		comPage.clickSaveButton();
				
		menuPage.clickShopOrderReleaseLink();
		SRPage.releaseShopOrder(shopOrderNumber);
		
		
				
		
	
	}
	


	
	
	
		
}
