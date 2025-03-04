package seleniumBasis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base{
	
	public void handlingFrames() {
		driver.navigate().to(" https://demoqa.com/frames");
		List<WebElement>iframe = driver.findElements(By.tagName("iframe"));
		int iframeCount = iframe.size();
		System.out.println(iframeCount);
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame1);//to switch the control to the required frame
		WebElement sampleHeading = driver.findElement(By.id("sampleHeading"));//TO VERIFY THE CONTROL HAS COME TO THAT FRAME
		System.out.println(sampleHeading.getText());
		driver.switchTo().defaultContent();//to get back to previous web page
		System.out.println(driver.getTitle());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingFrames frames = new HandlingFrames();
		frames.initializeBrowser();
		frames.handlingFrames();
		//frames.closeAndQuit();
	}

}
