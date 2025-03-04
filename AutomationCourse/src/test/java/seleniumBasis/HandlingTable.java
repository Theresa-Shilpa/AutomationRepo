package seleniumBasis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends Base{
	
	public void handlingTable() {
		
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement showMore = driver.findElement(By.xpath("//a[@id='showMoreLess']"));//WEBELEMENT FOR SHOW MORE BUTTON
		showMore.click();//BUTTON CLICKED
		WebElement wholeTable =driver.findElement(By.xpath("//table[@id='dataTable']"));//WEB ELEMENT FOR TABLE
		System.out.println(wholeTable.getText());//GETTING THE TABLE CONTENT USING getText()
		WebElement tableRow = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));//webelement creation for row
		System.out.println(tableRow.getText()
				);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingTable table = new HandlingTable();
		table.initializeBrowser();
		table.handlingTable();
		//table.closeAndQuit();
	}

}
