package mainJava;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Selectors.BOMReportSelectors;


public class BOMReportPage extends LoginMethod {
	

	public void waitForBOMReportToReload(int seconds) {
		new WebDriverWait(Driver.getInstance(), seconds).until(ExpectedConditions.visibilityOfElementLocated(BOMReportSelectors.BOMReportTitle));
		System.out.println("BOM Report is displayed");
	}
	
}
