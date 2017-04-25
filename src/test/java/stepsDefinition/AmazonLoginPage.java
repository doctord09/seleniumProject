package stepsDefinition;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import commonUtilities.MyDriver;
import commonUtilities.ReadPropertiesFile;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AmazonHomePage;

/**
 * @author Abhishek
 *
 */
public class AmazonLoginPage {
	//change 1 - done in localAbhiBranch
	private MyDriver driver;
	private AmazonHomePage amazonLoginPageObj;
	
	public AmazonLoginPage(MyDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		amazonLoginPageObj = PageFactory.initElements(driver, AmazonHomePage.class);
	}

	@Given("^I open home page of Amazon$")
	public void i_open_home_page_of_Amazon(){
	}

	@When("^I click on sign in button$")
	public void i_click_on_sign_in_button() throws IOException {
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

	@When("^input valid username and password$")
	public void input_valid_username_and_password(){
	}

	@When("^click on login$")
	public void click_on_login() {
	}

	@Then("^I should be able to login$")
	public void i_should_be_able_to_login(){
	}
}
