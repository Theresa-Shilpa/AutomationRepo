package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base{
	
	@Test(description = "whether user is able to logout successfully from home page",retryAnalyzer=retry.Retry.class)
	public void verifyWhetherUserCanLogoutafterSuccessfullyloggedin() throws IOException {
		
		String userName=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password=ExcelUtility.getStringData(0, 1, "LoginPage");
		HomePage home = new HomePage(driver);
		home.enterUsernameOnUsernameField(userName);
		home.enterPasswordOnPasswordField(password);
		home.clickOnSignInButton();
		home.clickOnAdminButton();
		home.clickOnLogoutButton();
		boolean HomeDisplayed = home.isHomeDisplayed();
		Assert.assertTrue(HomeDisplayed, Messages.FORHOMEPAGE);
	}
}
