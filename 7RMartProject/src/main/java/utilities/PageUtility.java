package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class PageUtility {

	public void dropDownSelectionByIndex(WebDriver driver,int index, WebElement element) {
		
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void dropDownSelectionByValue(WebDriver driver, String value) {
	WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
	Select select1 = new Select(dropdown2);
	select1.selectByValue(value);
	
}
	public void dropDownSelectionByVisibleText(WebDriver driver) {
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		Select select2 = new Select(dropdown3);
		select2.selectByVisibleText("JQuery");
}
	public void checkBoxSelection(WebDriver driver) {
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='option-1']"));
		 Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver) //fluent wait
		 			.withTimeout(Duration.ofSeconds(10)) 
		 			.pollingEvery(Duration.ofSeconds(3)) 
		 			.ignoring(NoSuchElementException.class); 
		 			fluentWait.until(ExpectedConditions.elementToBeClickable(checkbox1));
		checkbox1.click();
		System.out.println(checkbox1.isSelected());
	}
	public void radioButtonSelection(WebDriver driver) {
		WebElement radiobutton1 = driver.findElement(By.xpath("//input[@value='purple']"));
		radiobutton1.click();
	}
	public void ScrollDown(WebDriver driver) {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		 WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']")); 
		 	JavascriptExecutor js = (JavascriptExecutor)driver; 
		 	js.executeScript("arguments[0].click();", showMessageButton);
		 	 js.executeScript("window.scrollBy(0,350)", "");
		 	 js.executeScript("window.scrollBy(0,-350)", "");
	}
	}
