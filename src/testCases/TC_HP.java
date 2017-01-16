package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.SignupPage;
import utils.Links;

public class TC_HP extends utils.Driver{
	private pageObjects.CommonElements commonEls;
	private pageObjects.SignupPage signupEls;
	
	public TC_HP(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);	
		commonEls = new pageObjects.CommonElements(driver, wait);
	}	
	
	public boolean doTest(){
		boolean check = false;
		driver.get(utils.Links.homepageLink);
		check = verifyFooter();	
		return check;
	}
	
	private boolean verifyFooter(){
		String column3f = commonEls.getColumns3fText();
		String column3 = commonEls.getColumns3Text();
		String column3mid = commonEls.getColumns3midText();
		
		if (!column3f.equals("© Quality House 2017") || 
				!column3.equals("More info Call us today on 1-800-000-0000") || 
					!column3mid.equals("E-mail: info@mysite.com")){
			return true;
		} else {
			return false;
		}
	}
}
