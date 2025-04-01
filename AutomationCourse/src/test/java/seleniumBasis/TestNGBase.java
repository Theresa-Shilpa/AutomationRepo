package seleniumBasis;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGBase {

	public WebDriver driver; // to initialize globally, we can't create obj for interface so we create a reference for the interface
	@BeforeMethod
	public void initializeBrowser() {// method creation
		driver = new ChromeDriver();// no need to write WebDriver driver = new ChromeDriver(); bcs we declared it
									// globally in the above step
		
		//driver = new FirefoxDriver();
		
		//driver = new EdgeDriver();
		
		driver.get(" https://www.saucedemo.com/"); // url up using get method...to launch the web app
		driver.manage().window().maximize();//to maximize the screen
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
	}
	@AfterMethod
	public void closeAndQuit() {
		//driver.close();//only closes current page
		//driver.quit();//closes entire pages
	}
}
