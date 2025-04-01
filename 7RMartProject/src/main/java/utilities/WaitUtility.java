package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	public WebDriver driver;
public int IMPLECITWAIT = 5;
public int EXPLECITWAIT = 5;

public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(EXPLECITWAIT)); 
 	wait.until(ExpectedConditions.elementToBeClickable(element));
}
public void waitForElementToBeSelected(WebDriver driver, WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(EXPLECITWAIT)); 
 	wait.until(ExpectedConditions.elementToBeSelected(element));
}
public void waitForVisibilityOf(WebDriver driver, WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(EXPLECITWAIT)); 
 	wait.until(ExpectedConditions.visibilityOf(element));
}
public void waitForInvisibilityOf(WebDriver driver, WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(EXPLECITWAIT)); 
 	wait.until(ExpectedConditions.invisibilityOf(element));
}
public void implicitWait(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
public void fluentWaitElements(WebDriver driver, WebElement element, String attribute, String attributeValue,

		int total) {

	Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(total))

			.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

	fluentWait.until(ExpectedConditions.attributeContains(element, attribute, attributeValue));

}
}
