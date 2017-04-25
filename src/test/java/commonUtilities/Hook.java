package commonUtilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import stepsDefinition.AmazonBusinessFlow;

/**
 * @author Abhishek
 * POINT-1: define hook.java 
 * -->this file will be JUNIT file which will be used for initial setup and post procedure of the test.
 * INITIALIZING test:
 * 	--	instantiating WebDriver with any browser
 * 	--	deleting cookies
 * 	--	maximizing
 * 	--	navigate to the application under test
 * EXIT test:
 * 	--	closing the test.
 * NOTE: this class is not executed or called directly by JUNIT
 */
public class Hook extends MyDriver{
	
	private static MyDriver driver;
	
	public Hook(MyDriver driver){
		Hook.driver = driver;
		driver = PageFactory.initElements(driver, MyDriver.class);
	}
	
	@Before
	public void initSetup() throws IOException{
		driver.initDriver();
	}
		
	@After
	public void endTest(){
		driver.quit();// closes the instance opened by JUnit
	}
}
