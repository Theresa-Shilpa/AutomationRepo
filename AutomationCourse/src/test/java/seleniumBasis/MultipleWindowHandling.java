package seleniumBasis;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base{

	public void multipleWindow() {
		driver.navigate().to(" https://demo.guru99.com/popup.php");
		 String parent_window_handleid=driver.getWindowHandle(); 
	 		System.out.println("Parent window handle id is: "+parent_window_handleid);
		WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		Set<String>handleids = driver.getWindowHandles();
		System.out.println(handleids);
		 Iterator<String>values=handleids.iterator(); 
	 		while(values.hasNext()) 
	 		{ 
	 			String current_id=values.next(); 
	 			if(!current_id.equals(parent_window_handleid)) 
	 			{ 
	 				driver.switchTo().window(current_id); //control switch to child window
	 				WebElement email_fld=driver.findElement(By.xpath("//input[@name='emailid']")); 
	 				email_fld.sendKeys("aishu123@gmail.com"); 
	 				WebElement submit_fld=driver.findElement(By.xpath("//input[@name='btnLogin']")); 
	 				submit_fld.click(); 
	 				driver.switchTo().defaultContent(); //to previous window
	 			} 
	 		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		MultipleWindowHandling multWind = new MultipleWindowHandling();
		multWind.initializeBrowser();
		multWind.multipleWindow();
		//multWind.closeAndQuit();
	}

}
