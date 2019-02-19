package mainJava;


import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver  {

	  public static InternetExplorerDriver driver = null;
	
	    public static InternetExplorerDriver getInstance() {
	        if (driver == null) {
	        	driver = new InternetExplorerDriver();
	        }
	        return driver;
	    }
	
}
