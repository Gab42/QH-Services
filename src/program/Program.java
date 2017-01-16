package program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program {		
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",utils.Links.webdriverFolder);		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    		
		testCases.TC_HP test01 = new testCases.TC_HP(driver,wait);
		test01.doTest();


	}	
}
