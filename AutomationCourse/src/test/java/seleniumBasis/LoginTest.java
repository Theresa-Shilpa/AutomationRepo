package seleniumBasis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends TestNGBase{

	@Test
	public void verifyUserLoginWithValidCredentials() {
		WebElement usernameField = driver.findElement(By.xpath("//input[@id='user-name']"));
		usernameField.sendKeys("visual_user");
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
		passwordField.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
	}
	@Test
	public void verifyUserLoginWithInvalidUsernameValidPassword() {
		WebElement usernameField2 = driver.findElement(By.xpath("//input[@id='user-name']"));
		usernameField2.sendKeys("User_user");
		WebElement passwordField2 = driver.findElement(By.xpath("//input[@id='password']"));
		passwordField2.sendKeys("secret_sauce");
		WebElement loginButton2 = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton2.click();
	}
	@Test
	public void verifyUserLoginWithValidUsernameInValidPassword() {
		WebElement usernameField3 = driver.findElement(By.xpath("//input[@id='user-name']"));
		usernameField3.sendKeys("visual_user");
		WebElement passwordField3 = driver.findElement(By.xpath("//input[@id='password']"));
		passwordField3.sendKeys("secret");
		WebElement loginButton3 = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton3.click();
	}
	@Test
	public void verifyUserLoginWithInvalidCredentials() {
		WebElement usernameField4 = driver.findElement(By.xpath("//input[@id='user-name']"));
		usernameField4.sendKeys("User_user");
		WebElement passwordField4 = driver.findElement(By.xpath("//input[@id='password']"));
		passwordField4.sendKeys("secret_sa");
		WebElement loginButton4 = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton4.click();
}
}
