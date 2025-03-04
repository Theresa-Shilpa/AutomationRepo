package seleniumBasis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{

	public void handlingLocators() {
		
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
	driver.findElement(By.id("single-input-field"));
	driver.findElement(By.className("btn btn-primary"));
	driver.findElement(By.name("viewport"));
	driver.findElement(By.tagName("meta"));
	driver.findElement(By.linkText("Simple Form Demo"));
	driver.findElement(By.partialLinkText("Simple Form"));
	driver.findElement(By.cssSelector("button[id='button-one']"));
	
	driver.findElement(By.xpath("//button[@id='button-one']"));
	
	driver.findElement(By.xpath("//button[@id='button-two']"));
	
	driver.findElement(By.xpath("//input[@id='single-input-field']"));//@ for attribute

	driver.findElement(By.xpath("//button[text()='Show Message']"));//by using text
	
	driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]"));//if we want to search by the first word of a long sentence or a paragraph.
	
	driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));//and in here used to locate with multiple attributes for a clear 1 of 1
	
	driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));//any of them matches
	
	driver.findElement(By.xpath(" //div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));//using parent
	
	driver.findElement(By.xpath(" //div[@class='card']//child::button[@id='button-one']"));//using child
	
	driver.findElement(By.xpath(" //button[@id='button-one']//following::div[@class='card']"));//using following...the tags below the considered tag
	
	driver.findElement(By.xpath(" //button[@id='button-one']//preceding::div[@class='card']"));//using preceding...the tags above the considered tag
	
	driver.findElement(By.xpath(" //button[@id='button-one']//ancestor::div"));
	
	driver.findElement(By.xpath(" //div[@class='card']//descendant::div"));
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locator = new Locators();
		locator.initializeBrowser();
		locator.handlingLocators();
		//locator.closeAndQuit();
		
	}

}
