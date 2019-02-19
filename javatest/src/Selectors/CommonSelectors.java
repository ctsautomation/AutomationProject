package Selectors;

import org.openqa.selenium.By;

public class CommonSelectors {

	
	public static final By retrieveButton = By.xpath(".//button[@id='retrieve_button' and @title='Choose to retrieve the record']");
	public static final By saveButton = By.xpath(".//button[@id='save_button' and @title ='Choose to save the current record']");
	public static final By clearButton = By.xpath(".//button[@id='clear_button' and @title='Choose to clear screen']");
	public static final By deleteButton = By.xpath(".//button[@id='delete_button' and @title='Choose to delete the current record']");
	
	public static final By operation = By.xpath(".//td/a[contains(@id, 'OPERATION')]");
	public static final By resource = By.xpath(".//td/a[contains(@id, 'RESOURCE')]");
}
