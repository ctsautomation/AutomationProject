package Selectors;

import org.openqa.selenium.By;

public class loginPageSelectors {

	
	public static final By username = By.id("logonuidfield");
	public static final By password = By.id("logonpassfield");
	public static final By login = By.xpath(".//*[@name = 'uidPasswordLogon']");
	
}
