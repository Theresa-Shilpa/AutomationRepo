package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class SubCategoryPage {
	public WebDriver driver;
	public SubCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//p[text()='Sub Category']")
	private WebElement subCategoryButton;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newButton;
	@FindBy(xpath = "//select[@id='cat_id']")
	private WebElement categoryBox;
	@FindBy(xpath = "//input[@id='subcategory']")
	private WebElement subCategoryField;
	@FindBy (xpath="//button[@type='submit']")
	private WebElement saveButton;
	@FindBy(xpath="//h1[text()='Add Sub Category']")
	private WebElement subCategoryText;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	private WebElement searchButton;
	@FindBy(xpath="//select[@id='un']")
	private WebElement categorySelect;
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement subCategoryBox;
	
	public void clickOnSubCategoryOption() {
		subCategoryButton.click();
	}
	public void clickOnNewButton() {
		newButton.click();
	}
	public void enterCategoryName(String category) {
		categoryBox.sendKeys(category);
	}
	public void enterSubCategoryName(String subCategoryBox) {
		subCategoryField.sendKeys(subCategoryBox);
	}
	public void clickOnSaveButton() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", saveButton);
	}
	public void clickSearchButton() {
		searchButton.click();
	}
	public void clickOnCategorySelect() {
		categorySelect.click();
		PageUtility page = new PageUtility();
		page.dropDownSelectionByIndex(driver, 2, categorySelect);
	}
	public void clickOnSubCategoryBox(String subCategoryy) {
		subCategoryBox.sendKeys( subCategoryy);
		
		
	}
	public boolean isSubCategoryDisplayed() {
		return subCategoryText.isDisplayed();
	}
	public String getTextFromSubCategoryText() {
		return subCategoryText.getText();
	}
}


