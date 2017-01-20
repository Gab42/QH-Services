package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends CommonElements{
	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver,wait);	
	}
	
	private List<WebElement> fieldTitles(){
		return driver.findElements(By.xpath("//form[@action='../controllers/login-function.php']/div/p"));
	}
	
	private WebElement txtBox_username(){
		//System.out.println(driver.findElement(By.name("email-login")));
		return driver.findElement(By.name("email-login"));
	}
	
	private WebElement txtBox_password(){
		return driver.findElement(By.name("password-login"));
	}
	
	private WebElement btn_submit(){
		return driver.findElement(By.name("loginButton"));
	}
	
	private WebElement btn_forgotPass(){
		return driver.findElement(By.linkText("Forgot your password?"));
	}
	
	private WebElement btn_signUp(){
		return driver.findElement(By.linkText("Sign up"));
	}
	
	private void setUsername(String strUsername){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//wait.until(ExpectedConditions.visibilityOf(txtBox_username()));
		txtBox_username().sendKeys(strUsername);
   }
	
	private void setPassword(String strPassword){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//wait.until(ExpectedConditions.visibilityOf(txtBox_password()));
		txtBox_password().sendKeys(strPassword);
   }
	
	private void clickSubmit(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//wait.until(ExpectedConditions.elementToBeClickable(btn_submit()));
		btn_submit().click();
   }
	
	// Public methods
	
	public void login(String strUsername,String strPassword){
		setUsername(strUsername);
		setPassword(strPassword);
		clickSubmit();
   }
	
	public void clickSignUp(){
		btn_signUp().click();
	}
	
	public void clickForgotPass(){
		btn_forgotPass().click();
	}

	public String emailFieldText(){
		return fieldTitles().get(0).getText();
	}
	
	public String passFieldText(){
		return fieldTitles().get(1).getText();
	}
}
