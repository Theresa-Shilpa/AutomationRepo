package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
public WebDriver driver;//globally initialized constructor
public LoginPage(WebDriver driver) { //locally initialized constructor
	this.driver = driver;
	PageFactory.initElements(driver, this);//PageFactory is a class and here initializing elements is a method from page factory
}
@FindBy(xpath="//input[@type='text']")
private WebElement userNameField;//Annotation for finding element by using PageFactory
@FindBy(xpath = "//input[@type='password']")
private WebElement passwordField;
@FindBy(xpath = "//button[@type='submit']")
private WebElement signIn;
@FindBy(xpath = "//p[text()='Dashboard']")
private WebElement dashBoard;
@FindBy(xpath = "//b[text()='7rmart supermarket']")
private WebElement loginText;

public void enterUsernameOnUsernameField(String userName) {
	userNameField.sendKeys(userName);
}

public void enterPasswordOnPasswordField(String password) {
	passwordField.sendKeys(password);
}

public void clickOnSignInButton() {
	signIn.click();
}
public boolean isDashboardDisplayed() {
	return dashBoard.isDisplayed();
}
public String getTextFromLoginText() {
	return loginText.getText();
}
}
