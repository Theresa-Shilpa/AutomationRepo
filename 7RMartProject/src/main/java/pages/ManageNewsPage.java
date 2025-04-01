package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//input[@type='text']")
	private WebElement userNameField;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordField;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signIn;
	@FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")
	private WebElement manageNewsButton;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newButton;
	@FindBy(xpath = "//textarea[@id='news']")
	private WebElement newsBox;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	private WebElement saveButton;
	@FindBy(xpath="//h3[text()='Enter News Informations']")
	private WebElement manageNewsText;
	
	public void enterUsernameOnUsernameField(String userName) {
		userNameField.sendKeys(userName);
	}

	public void enterPasswordOnPasswordField(String password) {
		passwordField.sendKeys(password);
	}

	public void clickOnSignInButton() {
		signIn.click();
	}
	
	public void clickOnNewsManageButton() {
		manageNewsButton.click();
	}
	public void clickOnNewButton() {
		newButton.click();
	}
	public void enterNewsInNewsBox(String newsColumn ) {
		newsBox.sendKeys(newsColumn);
	}
	public void clickOnSaveButton() {
		saveButton.click();
	}
	public boolean isManageNewsDisplayed() {
		return manageNewsText.isDisplayed();
	}
	public String getTextFromManageNewsText() {
		return manageNewsText.getText();
	}
}
