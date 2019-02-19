package Selectors;

import org.openqa.selenium.By;

public class HeaderSelectors {

	
	public static final By homeLink = By.xpath(".//a[@id='home']");
	public static final By logoutLink = By.xpath(".//a[@id='logout']");
	public static final By aboutLink = By.xpath(".//a[@id='about']");
	public static final By helpLink = By.xpath(".//a[@id='help']");
	
	//About
	public static final By spanText = By.xpath(".span[contains(text(), 'See SAP')]");
	
	
}
