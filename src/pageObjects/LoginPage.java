package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends CommonElements{
	public LoginPage(WebDriver driver) {
		super(driver);	
	}

	private static WebElement element = null;
	
	public WebElement txtBox_username (){
		element = driver.findElement(By.name("email-login"));
		return element;
	}
	
	public WebElement txtBox_password (){
		element = driver.findElement(By.name("password-login"));
		return element;
	}
	
	public WebElement btn_submit (){
		element = driver.findElement(By.linkText("Submit"));
		return element;
	}
	
	public void setUsername(String strUsername){
		txtBox_password().sendKeys(strUsername);
   }
	
	public void setPassword(String strPassword){
		txtBox_password().sendKeys(strPassword);
   }
	
	public void clickSubmit(){
		btn_submit().click();
   }
	
	public void login(String strUsername,String strPassword){
		setUsername(strUsername);
		setPassword(strPassword);
		clickSubmit();
   }

}
