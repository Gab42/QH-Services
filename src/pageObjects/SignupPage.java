package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage extends CommonElements{	
	public SignupPage(WebDriver driver, WebDriverWait wait){
		super(driver, wait);	
	}
	
	private List<WebElement> btn_signup(){
		return driver.findElements(By.className("sign-as-button"));
	}
	
	private WebElement btn_signup_cons(){
		return btn_signup().get(0);
	}
	
	private WebElement btn_signup_client(){
		return btn_signup().get(1);
	}
	
	// Public methods
	
	public void clickSignupCons(){
		wait.until(ExpectedConditions.elementToBeClickable(btn_signup_cons()));
		btn_signup_cons().click();
   }
	
	public void clickSignupClient(){
		wait.until(ExpectedConditions.elementToBeClickable(btn_signup_client()));
		btn_signup_client().click();
   }
	
	public void goToSignUpPage(){
		super.clickRegisterButton();
	}
	
	public boolean signUpConsDisplayed(){
		wait.until(ExpectedConditions.visibilityOf(btn_signup_cons()));
		return super.isDisplayed(btn_signup_cons());
	}
	
	public boolean signUpClientDisplayed(){
		wait.until(ExpectedConditions.visibilityOf(btn_signup_client()));
		return super.isDisplayed(btn_signup_client());
	}

}
