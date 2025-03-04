package seleniumBasis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingCheckbox extends Base{

	public void handlingCheckbox() {
		
		driver.navigate().to(" https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox1.click();
		System.out.println(checkbox1.isSelected());
	}
	
	public void handlingRadioButton() {
		driver.navigate().to(" https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton1 = driver.findElement(By.xpath("//input[@value='purple']"));
		radiobutton1.click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingCheckbox checkbox = new HandlingCheckbox();
		checkbox.initializeBrowser();
		checkbox.handlingCheckbox();
		//checkbox.closeAndQuit();
		checkbox.handlingRadioButton();
	}

}
