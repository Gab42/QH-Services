package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage extends CommonElements{	
	public SignupPage(WebDriver driver, WebDriverWait wait){
		super(driver, wait);	
	}

	private static WebElement element = null;
	
	private WebElement btn_signup (){
		element = driver.findElement(By.className("sign-as-button"));
		return element;
	}
	
	// Public methods
	
	public void clickSignup(){
		wait.until(ExpectedConditions.elementToBeClickable(btn_signup()));
		btn_signup().click();
   }

}
