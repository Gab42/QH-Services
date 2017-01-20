package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_ClientProfilePage extends utils.Driver{
	private pageObjects.CommonElements commonEls;
	private pageObjects.ClientProfilePage cliProfileEls;
	
	public TC_ClientProfilePage(WebDriver driver, WebDriverWait wait) {
		super();	
		commonEls = new pageObjects.CommonElements(driver, wait);	
		cliProfileEls = new pageObjects.ClientProfilePage(driver, wait);
	}
}
