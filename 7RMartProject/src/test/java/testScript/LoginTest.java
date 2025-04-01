package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
	@Test(description = "whether user is able to login successfully with valid credentials",groups= {"smoke"},priority=1)
	public void verifyUserLoginWithValidCredentials() throws IOException {
		String userName=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);//constructor invoking,parameterized constructor
		login.enterUsernameOnUsernameField(userName);
		login.enterPasswordOnPasswordField(password);
		login.clickOnSignInButton();
		boolean isDashboardDisplayed = login.isDashboardDisplayed();
		Assert.assertTrue(isDashboardDisplayed, Messages.VALIDCREDENTIALERROR);
	}
	@Test(description = "whether user is unable to login with valid username and invalid password",groups= {"smoke"},priority=2)
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String userName=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);//constructor invoking,parameterized constructor
		login.enterUsernameOnUsernameField(userName);
		login.enterPasswordOnPasswordField(password);
		login.clickOnSignInButton();
		String expectedResult = "7rmart supermarket";
		String actualResult = login.getTextFromLoginText();
		Assert.assertEquals(actualResult, expectedResult,Messages.VALIDUSERNAMEANDINVALIDPASSWORD);
	}
	@Test(description = "whether user is unable to login with invalid username and valid password",priority=3)
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException {
		String userName=ExcelUtility.getStringData(2, 0, "LoginPage");
		String password=ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);//constructor invoking,parameterized constructor
		login.enterUsernameOnUsernameField(userName);
		login.enterPasswordOnPasswordField(password);
		login.clickOnSignInButton();
		String expectedResult = "7rmart supermarket";
		String actualResult = login.getTextFromLoginText();
		Assert.assertEquals(actualResult, expectedResult,Messages.INVALIDUSERNAMEANDVALIDPASSWORD);
	}
	@Test(description = "whether user is unable to login with invalid credentials",priority=4)
	public void verifyUserLoginWithInvalidUsernameAndInvalidPassword() throws IOException {
		String userName=ExcelUtility.getStringData(3, 0, "LoginPage");
		String password=ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);//constructor invoking,parameterized constructor
		login.enterUsernameOnUsernameField(userName);
		login.enterPasswordOnPasswordField(password);
		login.clickOnSignInButton();
		String expectedResult = "7rmart supermarket";
		String actualResult = login.getTextFromLoginText();
		Assert.assertEquals(actualResult, expectedResult,Messages.INVALIDCREDENTIALS);
	}
}
