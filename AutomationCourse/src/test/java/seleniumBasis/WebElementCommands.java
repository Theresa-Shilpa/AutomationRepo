package seleniumBasis;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base{

	public void WebElements() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");//navigate to the input form from home page
		WebElement textBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));//create web element and locate the field where we need to add text
		textBox.sendKeys("You are a good performer");//give the input that needs to be in the input field using sendKeys()
		//WebElement textBox1 = driver.findElement(By.xpath("//input[@id='value-a']"));
		//textBox1.sendKeys("70%");
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));//locating the element
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); 
		 	wait.until(ExpectedConditions.elementToBeClickable(showMessageButton));//explicit wait
		 	showMessageButton.click();
		System.out.println(showMessageButton.isEnabled());
		System.out.println(showMessageButton.isDisplayed());
		WebElement yourMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(yourMessage.getText());//TO GET THE TEXT IN CONSOLE
		System.out.println(showMessageButton.getCssValue("background-color"));//to get the styling
		textBox.clear();
		System.out.println(showMessageButton.getSize());
		System.out.println(showMessageButton.getTagName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebElementCommands commands = new WebElementCommands();
		commands.initializeBrowser();
		commands.WebElements();
		//commands.closeAndQuit();
	}

}
