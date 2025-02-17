package seleniumBasis;

public class BrowserCommands extends Base{

	public void browserCommands()//method creation
	{
		String url = driver.getCurrentUrl();//TO GET THE URL IN CONSOLE BELOW
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		String handleId = driver.getWindowHandle();
		System.out.println(handleId);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	
	public void navigationCommands() {
		driver.navigate().to("https://www.flipkart.com/");//to navigate to another page or app, here it is fk
		driver.navigate().back();// to go back to amazon
		driver.navigate().forward();//to go to fk again
		driver.navigate().refresh();//to refresh
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserCommands browser = new BrowserCommands();
		browser.initializeBrowser();
		//browser.browserCommands();
		browser.navigationCommands();
		//browser.closeAndQuit();
	}

}
