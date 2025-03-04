package seleniumBasis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base{
	
	public void handlingDropdowns() {
		driver.navigate().to(" https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		//WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));//web element creation
		//Select select = new Select(dropdown1);//predefined class for selecting
		//select.selectByIndex(2);
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select select1 = new Select(dropdown2);
		select1.selectByValue("maven");
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		Select select2 = new Select(dropdown3);
		select2.selectByVisibleText("JQuery");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingDropdown dropdown = new HandlingDropdown();
		dropdown.initializeBrowser();
		dropdown.handlingDropdowns();
		//dropdown.closeAndQuit();
	}

}
