package seleniumBasis;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base{

	public void fileUploadingUsingSendKeys() {
	
		driver.navigate().to(" https://demo.guru99.com/test/upload/");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		chooseFile.sendKeys("C:\\Users\\HP\\git\\AutomationRepo\\AutomationCourse\\src\\test\\resources\\STUDENT DETAILS.xlsx");//copy as path of the file needed to be uploaded
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='terms']"));
		checkbox.click();
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
	}
	public void fileUploadingUsingRobot() throws AWTException {
		
		driver.navigate().to(" https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPdf = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectPdf.click();
		 StringSelection s = new StringSelection("C:\\Users\\HP\\git\\AutomationRepo\\AutomationCourse\\src\\test\\resources\\header and footer menu listing.xlsx - final header menu.pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);  
			
			Robot robot = new Robot(); 
			robot.delay(3000);
			 robot.keyPress(KeyEvent.VK_ENTER); 
		      //releasing enter 
		      robot.keyRelease(KeyEvent.VK_ENTER); 
		      robot.keyPress(KeyEvent.VK_CONTROL); 
		      robot.keyPress(KeyEvent.VK_V);
		      robot.keyRelease(KeyEvent.VK_CONTROL); 
 		      robot.keyRelease(KeyEvent.VK_V); 
 		      robot.keyPress(KeyEvent.VK_ENTER); 
 		       
 		 
 		      robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileUpload fileUp = new FileUpload();
		fileUp.initializeBrowser();
		//fileUp.fileUploadingUsingSendKeys();
		try {
			fileUp.fileUploadingUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fileUp.closeAndQuit();
	}

}
