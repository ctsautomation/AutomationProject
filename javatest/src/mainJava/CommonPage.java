package mainJava;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Selectors.CommonSelectors;
import Selectors.HeaderSelectors;
import Selectors.loginPageSelectors;
import Selectors.mainPageSelectors;


public class CommonPage extends LoginMethod {

	
	public void clickSaveButton(){
		Driver.getInstance().switchTo().frame("mainFrame");
		System.out.println("Frame Switched");
		WebElement saveButton = Driver.getInstance().findElement(CommonSelectors.saveButton);
		saveButton.click();
		System.out.println("Save Button is clicked");
		Driver.getInstance().switchTo().defaultContent();
		
	}
	
	public void clickRetrieveButton(){
		Driver.getInstance().switchTo().frame("mainFrame");
		System.out.println("Frame Switched");
		WebElement retrieveButton = Driver.getInstance().findElement(CommonSelectors.retrieveButton);
		retrieveButton.click();
		System.out.println("Retrieve Button is clicked");
		Driver.getInstance().switchTo().defaultContent();
		
	}
	
	public void clickClearButton(){
		Driver.getInstance().switchTo().frame("mainFrame");
		System.out.println("Frame Switched");
		WebElement clearButton = Driver.getInstance().findElement(CommonSelectors.clearButton);
		clearButton.click();
		System.out.println("Clear Button is clicked");
		Driver.getInstance().switchTo().defaultContent();
		
	}
	
	public void clickDeleteButton(){
		Driver.getInstance().switchTo().frame("mainFrame");
		System.out.println("Frame Switched");
		WebElement deleteButton = Driver.getInstance().findElement(CommonSelectors.deleteButton);
		deleteButton.click();
		System.out.println("Delete Button is clicked");
		Driver.getInstance().switchTo().defaultContent();
		
	}
	
	public void PODLUIAssemblyInNewWidow(){
		
		Actions action = new Actions(Driver.getInstance());
		Driver.getInstance().switchTo().frame("appFrame");
		System.out.println("Frame Switched");
		WebElement PODDoorLUIAssemblyLink = Driver.getInstance().findElement(mainPageSelectors.PODDoorLUIAssemblyLink);
		action.contextClick(PODDoorLUIAssemblyLink).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		Driver.getInstance().switchTo().defaultContent();
	}
	
	public void openLinkInNewTab(WebElement PODURL){
		
		Actions action = new Actions(Driver.getInstance());
		action.contextClick(PODURL).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		//String parentWindow = driver.getWindowHandle();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String newWindow: allWindows){
			Driver.getInstance().switchTo().window(newWindow);
			System.out.println("Window Switched");	
		}
		Driver.getInstance().manage().window().maximize();
		
		try{
			Driver.getInstance().findElement(loginPageSelectors.username);
			System.out.println("Login to be performed");
			performLogin();
			System.out.println("Re-Login in the Pod");
			
		}
		catch(Exception e){
			System.out.println("Next Page is displayed");
		}
	}
	
	public void closeOpenedWindowAndNavigateBackToParentWindow(String parentWindow){
		Driver.getInstance().close();
		Driver.getInstance().switchTo().window(parentWindow);
		
	}
	public void scrollThePageTillElementFound(WebElement PODURL){
		Driver.getInstance().switchTo().frame("appFrame");
		//driver.switchTo().frame("appFrame");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", PODURL);
		System.out.println("Scolled down");
		Driver.getInstance().switchTo().defaultContent();
	}
	
	public WebElement findPODElement(String PODName){
		Driver.getInstance().switchTo().frame("appFrame");
		System.out.println("Frame Switched");
		WebElement PODDoorLUIAssemblyLink = Driver.getInstance().findElement(mainPageSelectors.getElementPOD(PODName));
		System.out.println("Element found");
		Driver.getInstance().switchTo().defaultContent();
		return PODDoorLUIAssemblyLink;
		
	}
	
	public String getOperationValue(){
		String operation = Driver.getInstance().findElement(CommonSelectors.operation).getText();
		System.out.println("operation is " + operation );
		return operation;
	}
	
	public String getResourceValue(){
		String resource = Driver.getInstance().findElement(CommonSelectors.resource).getText();
		System.out.println("operation is " + resource );
		return resource;
	}
	
	public void waitForPODToReload(int seconds){
		new WebDriverWait(Driver.getInstance(), seconds).until(ExpectedConditions.visibilityOfElementLocated(CommonSelectors.operation));
		System.out.println("Operation is displayed");
	}
	
	//wait for Home Link to be display
	public void waitForPageToLoad(int seconds){
		Driver.getInstance().switchTo().frame("topNavigation");
		new WebDriverWait(Driver.getInstance(), 30).until(ExpectedConditions.visibilityOfElementLocated(HeaderSelectors.homeLink));
		System.out.println("Menu Header is displayed");
		Driver.getInstance().switchTo().defaultContent();
	}
}
