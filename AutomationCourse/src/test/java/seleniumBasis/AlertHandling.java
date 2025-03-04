package seleniumBasis;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{

	public void handlingSimpleAlert() {
	 
		driver.navigate().to(" https://demoqa.com/alerts");
		WebElement clickMe = driver.findElement(By.xpath("//button[@id='alertButton']"));//locating
		clickMe.click();//to click the button
		Alert alert = driver.switchTo().alert();//to switch to the popup message box
		alert.accept();//to accept and click the ok button
	}
	
	public void handlingConfirmAlert() {
		driver.navigate().to(" https://demoqa.com/alerts");
		WebElement clickMe2 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		clickMe2.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		//alert.dismiss();
	}
	public void handlingPromptAlert() {
		driver.navigate().to(" https://demoqa.com/alerts");
		WebElement clickMe3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		clickMe3.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Shilpa Theresa");
		alert.accept();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlertHandling alerting = new AlertHandling();
		alerting.initializeBrowser();
		//alerting.handlingSimpleAlert();
		alerting.handlingConfirmAlert();
		//alerting.handlingPromptAlert();
	}

}
