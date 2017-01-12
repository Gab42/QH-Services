package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends CommonElements{
	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver,wait);	
	}

	private static WebElement element = null;
	
	private WebElement txtBox_username (){
		element = driver.findElement(By.name("email-login"));
		return element;
	}
	
	private WebElement txtBox_password (){
		element = driver.findElement(By.name("password-login"));
		return element;
	}
	
	private WebElement btn_submit (){
		element = driver.findElement(By.linkText("Submit"));
		return element;
	}
	
	private void setUsername(String strUsername){
		wait.until(ExpectedConditions.visibilityOf(txtBox_username()));
		txtBox_username().sendKeys(strUsername);
   }
	
	private void setPassword(String strPassword){
		wait.until(ExpectedConditions.visibilityOf(txtBox_password()));
		txtBox_password().sendKeys(strPassword);
   }
	
	private void clickSubmit(){
		wait.until(ExpectedConditions.elementToBeClickable(btn_submit()));
		btn_submit().click();
   }
	
	// Public methods
	
	public void login(String strUsername,String strPassword){
		setUsername(strUsername);
		setPassword(strPassword);
		clickSubmit();
   }

}
