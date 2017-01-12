package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends CommonElements{
	public LoginPage(WebDriver driver) {
		super(driver);	
	}

	private static WebElement element = null;
	
	public static WebElement txtBox_username (WebDriver driver){
		element = driver.findElement(By.name("email-login"));
		return element;
	}
	
	public static WebElement txtBox_password (WebDriver driver){
		element = driver.findElement(By.name("password-login"));
		return element;
	}
	
	public static WebElement btn_submit (WebDriver driver){
		element = driver.findElement(By.linkText("Submit"));
		return element;
	}
	
	public static void setUsername(WebDriver driver,String strUsername){
		txtBox_password(driver).sendKeys(strUsername);
   }
	
	public static void setPassword(WebDriver driver,String strPassword){
		txtBox_password(driver).sendKeys(strPassword);
   }
	
	public static void clickSubmit(WebDriver driver){
		btn_submit(driver).click();
   }
	
	public static void login(WebDriver driver,String strUsername,String strPassword){
		setUsername(driver,strUsername);
		setPassword(driver,strPassword);
		clickSubmit(driver);
   }

}
