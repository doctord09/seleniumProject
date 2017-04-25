package pageObjects;


import org.openqa.selenium.WebDriver;


/**
 * @author Abhishek
 * Description: This method is common method which is inherited by all the pages. 
 * 				Driver is defined and initialized by parameterized constructor. 
 * 				Each page should have their own constructor, which should in turn call super class constructor.
 */
public class VirtualSuperPage {
	
	WebDriver driver;
	public VirtualSuperPage(WebDriver driver){
		this.driver = driver;
	}	
	
	
	/**
	 * 
	*@author 			: Abhishek
	*@createdDate		: 16 04 2017
	*@lastUpdatedDate	:
	*@version			: 0.1
	*Desc				: This method is used
	*Change History		: -	Initial Definition
	 * @throws IOException 
	 */
	/*public AmazonHomePage launchHomePage() throws IOException{
		String autUrl = ReadPropertiesFile.returnValueOfKey("url");
		driver.get(autUrl);
		return PageFactory.initElements(driver, AmazonHomePage.class);
	}*/
}
