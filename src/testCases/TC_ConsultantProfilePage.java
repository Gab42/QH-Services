package testCases;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ReadFromFile;

public class TC_ConsultantProfilePage extends utils.Driver{

		private pageObjects.CommonElements commonEls;
		private pageObjects.ConsProfilePage consProfileEls;
		private pageObjects.LoginPage loginPageEls;
		//private ReadFromFile rff = new ReadFromFile();
		//private HashMap<String, String> profile;
		private final String tcName = "Consultant Profile Page";
		private final String DIR = "src\\sources\\ExpectedValues\\ConsProfilePage\\";
		//private final String profString = "Profile.txt";
		
		public TC_ConsultantProfilePage() {
			super();	
			commonEls = new pageObjects.CommonElements(driver, wait);	
			consProfileEls = new pageObjects.ConsProfilePage(driver, wait);	
			loginPageEls = new pageObjects.LoginPage(driver, wait);	
			//profile = rff.setValues(rff.getFilePath(DIR, profString));
			//login();
		}
		
		@Rule
		public ErrorCollector collector = new ErrorCollector();
		
		/*public void test_ConsProfilePage(){
			login();
			pageRedirect();	
			navigationMenu();
			profileTitle();
		}*/
		
		@Test
		public void login() {
			TC_ConsultantProfilePage.driver.get(utils.Links.homepageLink);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			commonEls.clickLogInButton();
			// driver.get(utils.Links.loginLink);
			loginPageEls.login(utils.Links.consUsername, utils.Links.consPassword);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			commonEls.clickProfileButton();
		}
		
		// TC_CPP_01
		@Test
		public void pageRedirect(){						
			String URL = driver.getCurrentUrl();
			// message, actual, expected
			collector.checkThat(tcName, URL, CoreMatchers.equalTo(utils.Links.consProfileLink));
		}
		
		// TC_CPP_03
		public void navigationMenu(){
			
		}
		
		// TC_CPP_04
		public void profileTitle(){
			String profileTitle = consProfileEls.getProfileTitleText();
			Assert.assertEquals("Profile",profileTitle);
		}
		
		// TC_CPP_05
		public void profilePhoto(){
			
		}
		
		// TC_CPP_06
		public void profileInfoVisible(){
			
		}
		
		// TC_CPP_07
		public void profileInfoTitles(){
			
		}
		
		// TC_CPP_08
		public void profileInfoContent(){
			
		}
		
		// TC_CPP_11
		public void updateButtonVisible(){
			
		}
		
		// TC_CPP_12
		public void updateButtonRedirect(){
			
		}
}
