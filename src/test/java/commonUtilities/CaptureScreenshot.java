/**
/**
 * 
 */
package commonUtilities;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

/**
 * @author Abhishek
 *
 */
public class CaptureScreenshot {
	
	/**
	 * 
	*@author 			: Abhishek
	*@createdDate		: 22 04 2017
	*@lastUpdatedDate	: 22 04 2017
	*@version			: 0.1
	*Desc				: This method is used to capture the entire screenshot 
	*					  of the application,ignore this method if the application is too long.
	*Change History		: Abhi -	Initial Definition
	 */
	public static void captureScreenShotAndSave(WebDriver driver, String filename) throws IOException{
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(), "PNG", new   File("f:\\Work\\backups_automation\\Gmail\\target\\Screenshot\\"+filename));	
	}
	
	/**
	 * 
	*@author 			: Abhishek
	*@createdDate		: 22 04 2017
	*@lastUpdatedDate	: 22 04 2017
	*@version			: 0.1
	*Desc				: This method is used to capture the active viewport only
	*Change History		: Abhi -	Initial Definition
	 */
	public static void capturViewPortAndSave(WebDriver driver,String filename){
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("f:\\Work\\backups_automation\\Gmail\\target\\Screenshot\\"+filename));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
		 }

}