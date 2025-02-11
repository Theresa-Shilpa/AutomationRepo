package seleniumBasis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public WebDriver driver; // to initialize globally

	public void initializeBrowser() {// method creation
		//driver = new ChromeDriver();// no need to write WebDriver driver = new ChromeDriver(); bcs we declared it
									// globally in the above step
		
		//driver = new FirefoxDriver();
		
		driver = new EdgeDriver();
		
		driver.get("https://selenium.qabible.in/"); // url up using get method...to launch the web app
		driver.manage().window().maximize();//to maximize the screen
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Base();
		base.initializeBrowser();
	}

}
