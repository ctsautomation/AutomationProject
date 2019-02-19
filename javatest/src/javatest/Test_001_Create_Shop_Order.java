package javatest;

import org.junit.Test;
import mainJava.ShopOrderMaintenance;
import testUtility.Data;
import mainJava.CommonPage;
import mainJava.LoginMethod;
import mainJava.MenuPage;


public class Test_001_Create_Shop_Order extends LoginMethod {
	
	
	@Test
	public void Test_Test_001_Create_Shop_Order()  {
		
		String shopOrderNumber = "Test_001" + Data.timeStamp;
		
		CommonPage comPage = new CommonPage();
		MenuPage menuPage = new MenuPage();
		ShopOrderMaintenance shopMaintPage = new ShopOrderMaintenance();
		
		//Click Shop order maintenance
		menuPage.clickShopOrderMaintainanceLink();
		
		//Create Shop Order
		shopMaintPage.createShopOrder(shopOrderNumber);																												
		
		//Save the Shop Order
		comPage.clickSaveButton();
		
		
		
	}

		
}
