package automationCore;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.Constants;
import utilities.ScreenShotUtility;
import utilities.WaitUtility;

public class Base {
	public WebDriver driver;
	Properties prop;
	FileInputStream fs;

	@BeforeMethod(alwaysRun=true)
	@Parameters("browser")
	public void initializeBrowser(String browser) throws Exception {
		prop=new Properties();
		fs=new FileInputStream(Constants.CONFIGFILE);
		prop.load(fs);
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			throw new Exception("invalid browser");
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		WaitUtility wait=new WaitUtility();
		wait.implicitWait(driver);
	}

	@AfterMethod(alwaysRun=true)
	public void driverQuit(ITestResult iTestResult) throws IOException

	{

		if (iTestResult.getStatus() == ITestResult.FAILURE)

		{

			ScreenShotUtility screenShot = new ScreenShotUtility();

			screenShot.getScreenshot(driver, iTestResult.getName());

		}

		driver.quit();

	}
}
