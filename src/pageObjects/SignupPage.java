package pageObjects;

import java.util.ArrayList;
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

	private static WebElement element = null;
	private static List<WebElement> elements = new ArrayList<WebElement>();
	
	private List<WebElement> btn_signup(){
		elements = driver.findElements(By.className("sign-as-button"));
		return elements;
	}
	
	private WebElement btn_signup_cons(){
		element = btn_signup().get(0);
		return element;
	}
	
	private WebElement btn_signup_client(){
		element = btn_signup().get(1);
		return element;
	}
	
	// Public methods
	
	public void clickSignupCons(){
		wait.until(ExpectedConditions.elementToBeClickable(btn_signup_cons()));
		btn_signup_cons().click();
   }
	
	public void clickSignupClient(){
		wait.until(ExpectedConditions.elementToBeClickable(btn_signup_client()));
		btn_signup_cons().click();
   }

}
