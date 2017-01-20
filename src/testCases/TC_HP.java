package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Links;

public class TC_HP extends utils.Driver{
	private pageObjects.CommonElements commonEls;
	private pageObjects.HomePage homePage;
	private pageObjects.SignupPage signupEls;
	
	public TC_HP(WebDriver driver, WebDriverWait wait) {
		super();	
		commonEls = new pageObjects.CommonElements(driver, wait);
		homePage = new pageObjects.HomePage(driver,wait);	
		signupEls = new pageObjects.SignupPage(driver, wait);	
	}
	
	public void verifyFooter(){
		driver.get(utils.Links.homepageLink);
		commonEls.clickRegisterButton();
		signupEls.clickSignupCons();
		/*
		String column3f = commonEls.getColumns3fText();
		String column3 = commonEls.getColumns3Text();
		String column3mid = commonEls.getColumns3midText();
		
		Assert.assertTrue(column3f,column3f.contains("� Quality House 2017"));
		Assert.assertTrue(column3,column3.contains("More info"));
		Assert.assertTrue(column3mid,column3mid.contains("E-mail: info@mysite.com"));
		*/
	}
	
	public void verifyNavigationContent (){
		driver.get(utils.Links.homepageLink);
		String backgroundColor = "rgb(0, 89, 92)";
		
		Assert.assertTrue("Home button background color", homePage.homeBtnColor().equals(backgroundColor));
		Assert.assertTrue("Services button background color", homePage.servicesBtnColor().equals(backgroundColor));
		Assert.assertTrue("About Us button background color", homePage.aboutUsBtnColor().equals(backgroundColor));
		Assert.assertTrue("Contacts button background color", homePage.contactsBtnColor().equals(backgroundColor));
		Assert.assertTrue("Log In button background color", homePage.logInBtnColor().equals(backgroundColor));
		Assert.assertTrue("Register button background color", homePage.registerBtnColor().equals(backgroundColor));
		
		Assert.assertTrue("Home button", homePage.homeBtnIsDisplayed());
		Assert.assertTrue("Services button", homePage.servicesBtnIsDisplayed());
		Assert.assertTrue("About Us button", homePage.aboutUsBtnIsDisplayed());
		Assert.assertTrue("Contacts button", homePage.contactsBtnIsDisplayed());
		Assert.assertTrue("Log In button", homePage.logInBtnIsDisplayed());
		Assert.assertTrue("Register button", homePage.registerBtnIsDisplayed());
		
	}
	
	public void verifyNavButtonsAreClickable(){
		driver.get(utils.Links.homepageLink);
		
		commonEls.clickContactsButton();
	}
	
	public void verifyJoinUsBtnWorks (){
		driver.get(utils.Links.homepageLink);
		
		homePage.clickJoinUsButton();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Assert.assertTrue("Redirect from Join us click", driver.getCurrentUrl().equals(utils.Links.signupLink));
	}

}
