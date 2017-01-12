package testCases;

import org.openqa.selenium.WebDriver;
import utils.Links;

public class TC_HP extends utils.Driver{
	private pageObjects.CommonElements commonEls;

	public TC_HP(WebDriver driver) {
		super(driver);	
		commonEls = new pageObjects.CommonElements(driver);
	}
	
	public void DoTest(){
		driver.get(utils.Links.homepageLink);
		VerifyFooter();		
	}
	
	public void VerifyFooter(){
		String column3f = commonEls.getColumns3fText();
		String column3 = commonEls.getColumns3Text();
		String column3mid = commonEls.getColumns3midText();
		
		System.out.println(column3f + " " + column3 + " " + column3mid);
	}
}
