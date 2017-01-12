package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.CommonElements;
import testCases.TC_HP;

public class Program {		
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ggeneva\\Downloads\\geckodriver-v0.12.0-win64\\geckodriver.exe");		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    		
		testCases.TC_HP test01 = new testCases.TC_HP(driver);


	}	
}
