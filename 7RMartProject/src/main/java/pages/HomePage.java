package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']")
	private WebElement userNameField;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordField;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signIn;
	@FindBy(xpath="//a[@data-toggle='dropdown']")
	private WebElement adminButton;
	@FindBy(xpath = "//i[@class='ace-icon fa fa-power-off']")
	private WebElement logoutButton;
	@FindBy(xpath = "//b[text()='7rmart supermarket']")
	private WebElement homeText;
	
	public void enterUsernameOnUsernameField(String userName) {
		userNameField.sendKeys(userName);
	}

	public void enterPasswordOnPasswordField(String password) {
		passwordField.sendKeys(password);
	}

	public void clickOnSignInButton() {
		signIn.click();
	}
	
	public void clickOnAdminButton() {
		adminButton.click();
		}
	
	public void clickOnLogoutButton() {
		logoutButton.click();
	}
	public boolean isHomeDisplayed() {
		return homeText.isDisplayed();
	}
	public String getTextFromhomeText() {
		return homeText.getText();
	}
}
