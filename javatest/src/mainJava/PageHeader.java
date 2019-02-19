package mainJava;

import org.openqa.selenium.WebElement;

import Selectors.HeaderSelectors;



public class PageHeader extends CommonPage {


	
	public void clickHomeHeaderLink(){
		Driver.getInstance().switchTo().frame("topNavigation");
		WebElement homeLink = Driver.getInstance().findElement(HeaderSelectors.homeLink);
		homeLink.click();
		System.out.println("Home Link clicked");
		Driver.getInstance().switchTo().defaultContent();	
	}
	
	public void clickLogoutHeaderLink(){
		Driver.getInstance().switchTo().frame("topNavigation");
		WebElement homeLink = Driver.getInstance().findElement(HeaderSelectors.logoutLink);
		homeLink.click();
		System.out.println("Logout Link clicked");
		Driver.getInstance().switchTo().defaultContent();	
	}
	
	public void clickAboutHeaderLink(){
		Driver.getInstance().switchTo().frame("topNavigation");
		WebElement homeLink = Driver.getInstance().findElement(HeaderSelectors.aboutLink);
		homeLink.click();
		System.out.println("About Link clicked");
		Driver.getInstance().switchTo().defaultContent();	
	}
	
	public void clickHelpHeaderLink(){
		Driver.getInstance().switchTo().frame("topNavigation");
		WebElement homeLink = Driver.getInstance().findElement(HeaderSelectors.helpLink);
		homeLink.click();
		System.out.println("Help Link clicked");
		Driver.getInstance().switchTo().defaultContent();	
	}
	

}
