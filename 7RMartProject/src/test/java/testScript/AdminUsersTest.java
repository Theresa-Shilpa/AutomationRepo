package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.RandomDataUtility;

public class AdminUsersTest extends Base{
	@Test(description = "whether user is able to add new user to the user's list")

	public void verifyWhetherTheUserIsAbleToAddNewUserToTheUsersList() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnSignInButton();
		AdminUsersPage adminUsers = new AdminUsersPage(driver);
		adminUsers.clickAdminUser();
		adminUsers.clickManageUser();
		adminUsers.clickNewButton();
		
		RandomDataUtility faker = new RandomDataUtility();
		
		String usernamee = faker.createRandomUsername();
		adminUsers.enterUserName(usernamee);
		String passwordd = faker.createRandomPassword();
		adminUsers.enterPassword(passwordd);
		adminUsers.selectUserType();
		
		adminUsers.clickOnSaveButton();
		boolean adminUserDisplayed = adminUsers.isAdminUserDisplayed();
		Assert.assertTrue(adminUserDisplayed, Messages.FORADMINUSERSPAGE);
}
	@Test(description = "whether user is able to search admin user in the user's list")
	public void verifyWhetherUserIsAbleToSearchAdminUser() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnSignInButton();
		AdminUsersPage adminUsers = new AdminUsersPage(driver);
		adminUsers.clickAdminUser();
		adminUsers.clickManageUser();
		adminUsers.searchBySearchOption();
		String username2 = ExcelUtility.getStringData(1, 0, "AdminUsersPage");
		adminUsers.enterUserNameForSearch(username2);
		
		WebElement userTypee = driver.findElement(By.id("ut"));
		Select select = new Select(userTypee);
		select.selectByIndex(2);
		adminUsers.clickSearch();
		boolean adminUserSearchDisplayed = adminUsers.isAdminUserSearchDisplayed();
		Assert.assertTrue(adminUserSearchDisplayed, Messages.FORSEARCHINGINADMINUSERSPAGE);
	}
}