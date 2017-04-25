package stepsDefinition;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import commonUtilities.Hook;
import commonUtilities.ReadPropertiesFile;
import pageObjects.AmazonHomePage;

public class AmazonBusinessFlow extends Hook{
	/**
	 * POINT-2:	this is one of test case or Step Definition to test the application.
	 * 	--	this file automatically calls Hook.java file for initialization.
	 * 	--	this is done by inheriting Hook.java.
	 * 	--	NOTE: driver is not defined on step definition class, it uses the driver of Hook.java and pass it between page objects
	 * @throws IOException 
	 * 
	 */
	@Test
	public void testSteps() throws IOException{
		
		System.out.println("I am on Step Definition");
		AmazonHomePage pageObj = new AmazonHomePage(driver);
		String username = ReadPropertiesFile.returnValueOfKey("loginPage.properties", "userName");
		String password = ReadPropertiesFile.returnValueOfKey("loginPage.properties", "password");
		System.out.println( username + "   " + password);
		pageObj
		.navigateToSignInPage()
		.enterAmazonCredential(username, password)
		.signInToAmazon();
		
	}

}
