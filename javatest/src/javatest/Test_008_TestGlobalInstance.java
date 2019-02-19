package javatest;

import org.junit.Test;


import Selectors.CommonSelectors;

import mainJava.Driver;
import mainJava.Login;




public class Test_008_TestGlobalInstance extends Login {
		
	@Test
	public void GlobalInstanceTest()   {
      
		Driver.getInstance().findElement(CommonSelectors.clearButton);
		
    }

	
	
	
		
}
