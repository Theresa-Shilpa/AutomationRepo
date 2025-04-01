package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.HomePage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
@Test(description = "whether user is able to add new news to the manage news page")
	public void verifyWhetherUserIsAbleToAddNewNewsToTheManageNewsPage() throws IOException {
		
		String userName=ExcelUtility.getStringData(0, 0, "LoginPage");
		String password=ExcelUtility.getStringData(0, 1, "LoginPage");
		ManageNewsPage manageNews = new ManageNewsPage(driver);
		manageNews.enterUsernameOnUsernameField(userName);
		manageNews.enterPasswordOnPasswordField(password);
		manageNews.clickOnSignInButton();
		manageNews.clickOnNewsManageButton();
		manageNews.clickOnNewButton();
		String newsColumn = ExcelUtility.getStringData(0, 0, "ManageNewsPage");
		manageNews.enterNewsInNewsBox(newsColumn);
		manageNews.clickOnSaveButton();
		boolean manageNewsDisplayed = manageNews.isManageNewsDisplayed();
		Assert.assertTrue(manageNewsDisplayed, Messages.FORMANAGENEWS);
		
	}
}
