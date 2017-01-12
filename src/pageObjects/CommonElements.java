package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonElements extends utils.Driver {
	public CommonElements(WebDriver driver) {
		super(driver);		
	}

	private static WebElement element = null;

	// Navigation menu
	private WebElement btn_home (){
		element = driver.findElement(By.linkText("Home"));
		return element;
	}
		
	private WebElement btn_aboutUs (){
		element = driver.findElement(By.linkText("About us"));
		return element;	
	}
		
	private WebElement btn_logIn (){
		element = driver.findElement(By.linkText("Log in"));
		return element;
	}
	
	private WebElement btn_logOut (){
		element = driver.findElement(By.linkText("Log Out"));
		return element;
	}
	
	private WebElement btn_register (){
		element = driver.findElement(By.linkText("Register"));
		return element;
	}	
	
	private WebElement btn_profile (){
		element = driver.findElement(By.linkText("Profile"));
		return element;
	}	
	
	private WebElement btn_myProjects (){
		element = driver.findElement(By.linkText("My Projects"));
		return element;
	}	
	
	private WebElement btn_projects (){
		element = driver.findElement(By.linkText("Projects"));
		return element;
	}	
	
	private WebElement btn_services (){
		element = driver.findElement(By.linkText("Services"));
		return element;
	}
	
	private WebElement btn_contacts (){
		element = driver.findElement(By.linkText("Contacts"));
		return element;
	}
	
	// Footer elements
	private WebElement txt_columns3f (){
		element = driver.findElement(By.className("columns3f"));
		return element;
	}
	
	private WebElement txt_columns3mid (){
		element = driver.findElement(By.className("columns3mid"));
		return element;
	}
	
	private WebElement txt_columns3 (){
		element = driver.findElement(By.className("columns3"));
		return element;
	}
	   
    private WebElement btn_facebook (){
		element = driver.findElement(By.xpath("//a[@href='http://www.facebook.com']"));
		return element;
	}
    
	private WebElement btn_twitter (){
		element = driver.findElement(By.xpath("//a[@href='http://www.twitter.com']"));
		return element;
	}
	
	private WebElement btn_googleplus (){
		element = driver.findElement(By.xpath("//a[@href='http://www.plus.google.com']"));
		return element;
	}
	
	// Public methods
	
	// Click FB, Twitter, Google+ buttons
	public void clickFacebookButton(){		
		btn_facebook().click();
	}
	
	public void clickTwitterButton(){
		btn_twitter().click();
	}
	
	public void clickGoogleButton(){
		btn_googleplus().click();
	}
	
	// Get text from footer
    public String getColumns3fText() {
        String text;
        System.out.println("Getting text for first footer column");
        text = txt_columns3f().getText();
        return text;
    }
    
    public String getColumns3Text() {
        String text;
        System.out.println("Getting text for second footer column");
        text = txt_columns3().getText();
        return text;
    }
    
    public String getColumns3midText() {
        String text;
        System.out.println("Getting text for third footer column");
        text = txt_columns3mid().getText();
        return text;
    }
}
