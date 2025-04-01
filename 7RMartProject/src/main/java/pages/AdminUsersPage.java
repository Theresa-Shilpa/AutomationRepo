package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUsersPage {
	public WebDriver driver;
	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//i[@class='nav-icon fas fa-users']")
private WebElement adminUserButton;
@FindBy(xpath="//p[text()='Manage Users']")
private WebElement manageUser;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
private WebElement newButton;
@FindBy(id="username")
private WebElement userNameBox;
@FindBy(id="password")
private WebElement passwordBox;
@FindBy(xpath="//select[@id='user_type']")
private WebElement userType1;
@FindBy(xpath="//i[@class='fa fa-save']")
private WebElement saveButton;
@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
private WebElement searchButton;
@FindBy(id="un")
private WebElement userNameSearch;
@FindBy(xpath="//i[@class='fa fa-search']")
private WebElement searchClick;
@FindBy(xpath = "//h1[text()='Admin Users']")
private WebElement adminUserText;

public void clickAdminUser() {
	adminUserButton.click();
}
public void clickManageUser() {
	manageUser.click();
}
public void clickNewButton() {
	newButton.click();
}
public void enterUserName(String usernamee) {
	userNameBox.sendKeys(usernamee);
}
public void enterPassword(String passwordd) {
	passwordBox.sendKeys(passwordd);
}
public void selectUserType() {
	userType1.click();
	PageUtility page = new PageUtility();
	page.dropDownSelectionByIndex(driver, 2, userType1);
}
public void clickOnSaveButton() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", saveButton);
}
public void searchBySearchOption() {
	searchButton.click();
}
public void enterUserNameForSearch(String username2) {
	userNameSearch.sendKeys(username2);
}
public void clickSearch() {
	searchClick.click();
}
public boolean isAdminUserDisplayed() {
	return adminUserText.isDisplayed();
}
public String getTextFromAdminUserText() {
	return adminUserText.getText();
}
public boolean isAdminUserSearchDisplayed() {
	return adminUserText.isDisplayed();
}
public String getTextFromAdminUser2Text() {
	return adminUserText.getText();
}
}
