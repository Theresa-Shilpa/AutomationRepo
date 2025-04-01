package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtility;

public class SubCategoryTest extends Base{
	
@Test(description = "whether user is able to add new subcategory to the subcategory list")
	public void verifyWhetherUserIsAbleToAddNewSubCategoryToTheSubCategoryList() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnSignInButton();
		
		SubCategoryPage subCategory = new SubCategoryPage(driver);
		subCategory.clickOnSubCategoryOption();
		subCategory.clickOnNewButton();
		WebElement categorySelect = driver.findElement(By.id("cat_id"));
		Select select = new Select(categorySelect);
		select.selectByIndex(4);
		//String category = ExcelUtility.getStringData(0, 0, "SubCategoryPage");
		//subCategory.enterCategoryName(category);
		String subCategoryBox = ExcelUtility.getStringData(1, 0, "SubCategoryPage");
		subCategory.enterSubCategoryName(subCategoryBox);
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='main_img']"));
		chooseFile.sendKeys("C:\\Users\\HP\\eclipse-workspace\\7RMartProject\\src\\test\\resources\\dinosaurs.jpg");
		subCategory.clickOnSaveButton();
		boolean subCategoryDisplayed = subCategory.isSubCategoryDisplayed();
		Assert.assertTrue(subCategoryDisplayed, Messages.FORSUBCATEGORYPAGE);
}
@Test(description = "whether user is able to search subcategory from the subcategory list")
public void verifyWhetherUserIsAbleToSearchSubCategory() throws IOException {
	String username = ExcelUtility.getStringData(0, 0, "LoginPage");
	String password = ExcelUtility.getStringData(0, 1, "LoginPage");
	LoginPage login = new LoginPage(driver);
	login.enterUsernameOnUsernameField(username);
	login.enterPasswordOnPasswordField(password);
	login.clickOnSignInButton();
	SubCategoryPage subCategory = new SubCategoryPage(driver);
	subCategory.clickOnSubCategoryOption();
	subCategory.clickSearchButton();
	subCategory.clickOnCategorySelect();
	
}
}
