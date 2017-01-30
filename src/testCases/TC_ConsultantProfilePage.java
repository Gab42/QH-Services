package testCases;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
		
		// TC_CPP_01
		@Test
		public void pageRedirect(){			
			driver.get(utils.Links.homepageLink);
			commonEls.clickLogInButton();
			loginPageEls.login(utils.Links.consUsername, utils.Links.consPassword);
			commonEls.clickProfileButton();
			//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			//wait.until(ExpectedConditions.elementToBeClickable(btn_facebook()));
			String test = consProfileEls.getProfileTitleText();
			String URL = driver.getCurrentUrl();		
			// message, actual, expected			
			collector.checkThat(tcName, URL, CoreMatchers.equalTo(utils.Links.consProfileLink));
	
			commonEls.clickLogOutButton();		
		}
		
		// TC_CPP_03
		@Test
		public void navigationMenu(){
			driver.get(utils.Links.homepageLink);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			commonEls.clickLogInButton();
			loginPageEls.login(utils.Links.consUsername, utils.Links.consPassword);
			collector.checkThat(tcName + " home button is visible?",commonEls.homeVisible(), CoreMatchers.equalTo(true));
			collector.checkThat(tcName + " profile button is visible?",commonEls.profileVisible(), CoreMatchers.equalTo(true));
			collector.checkThat(tcName + " my projects button is visible?",commonEls.myProjectsVisible(), CoreMatchers.equalTo(true));
			collector.checkThat(tcName + " about us button is visible?",commonEls.aboutUsVisible(), CoreMatchers.equalTo(true));
			collector.checkThat(tcName + " log out button is visible?",commonEls.logOutVisible(), CoreMatchers.equalTo(true));
			commonEls.clickLogOutButton();	
		}
		
		
		// TC_CPP_04
		@Test
		public void profileTitle(){	
			TC_ConsultantProfilePage.driver.get(utils.Links.homepageLink);		
			commonEls.clickLogInButton();
			loginPageEls.login(utils.Links.consUsername, utils.Links.consPassword);
			driver.get(utils.Links.consProfileLink);
			String profileTitle = consProfileEls.getProfileTitleText();
			collector.checkThat(tcName + " profile title text is visible?",profileTitle,CoreMatchers.equalTo("Profile"));
			commonEls.clickLogOutButton();	
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
