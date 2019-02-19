package javatest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	
	Test_008_TestGlobalInstance.class,
	Test_005_TestWaitMethod.class
})
public class RunSelectedTest {

}
