package pageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends CommonElements {

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	// private static WebElement element = null;

	private WebElement btn_homeLogo() {
		return driver.findElement(By.xpath(".//*[@id='logo']/a/img"));	
	}

	private WebElement btn_joinUs() {
		return driver.findElement(By.id("joinus"));
	}

	private WebElement header_topLeft() {
		return driver.findElement(By.id("homeQuality"));
	}

	private WebElement header_middle() {
		return driver.findElement(By.id("homeAssurance"));
	}

	private WebElement header_bottomRight() {
		return driver.findElement(By.id("homeServices"));
	}

	private WebElement btn_headerHome() {
		return driver.findElement(By.xpath("//*[@id='navigation']/ul/li[1]/a"));

	}

	private WebElement btn_headerServices() {
		return driver.findElement(By.xpath("//*[@id='navigation']/ul/li[2]/a"));

	}

	private WebElement btn_headerAboutUs() {
		return driver.findElement(By.xpath("//*[@id='navigation']/ul/li[3]/a"));

	}

	private WebElement btn_headerContacts() {
		return driver.findElement(By.xpath("//*[@id='navigation']/ul/li[4]/a"));

	}

	private WebElement btn_headerLogIn() {
		return driver.findElement(By.xpath("//*[@id='navigation']/ul/li[5]/a"));

	}

	private WebElement btn_headerRegister() {
		return driver.findElement(By.xpath("//*[@id='navigation']/ul/li[6]/a"));

	}

	private WebElement qhInfo() {
		return driver.findElement(By.xpath(".//*[@id='info-field2']/div[1]/p"));
	}

	private WebElement qhContacts() {
		return driver.findElement(By.xpath(".//*[@id='info-field2']/div[2]/p[1]"));
	}

	private WebElement btn_facebook() {
		return driver.findElement(By.xpath(".//*[@id='info-field2']/div[3]/p/a[1]/img"));

	}

	private WebElement btn_twitter() {
		return driver.findElement(By.xpath(".//*[@id='info-field2']/div[3]/p/a[2]/img"));

	}

	private WebElement btn_googleplus() {
		return driver.findElement(By.xpath(".//*[@id='info-field2']/div[3]/p/a[3]/img"));

	}

	public void clickJoinUsButton() {
		wait.until(ExpectedConditions.elementToBeClickable(btn_joinUs()));
		btn_joinUs().click();
	}
	
	public boolean homeBtnIsDisplayed (){
		return super.isDisplayed(btn_home());
	}
	
	public boolean servicesBtnIsDisplayed (){
		return super.isDisplayed(btn_services());
	}
	
	public boolean aboutUsBtnIsDisplayed (){
		return super.isDisplayed(btn_aboutUs());
	}
	
	public boolean contactsBtnIsDisplayed (){
		return super.isDisplayed(btn_contacts());
	}
	
	public boolean logInBtnIsDisplayed (){
		return super.isDisplayed(btn_logIn());
	}
	
	public boolean registerBtnIsDisplayed (){
		return super.isDisplayed(btn_register());
	}
	
	public String homeBtnColor (){
		return super.getNavColor(btn_home());
	}
	
	public String servicesBtnColor (){
		return super.getNavColor(btn_services());
	}
	
	public String aboutUsBtnColor (){
		return super.getNavColor(btn_aboutUs());
	}
	
	public String contactsBtnColor (){
		return super.getNavColor(btn_contacts());
	}
	
	public String logInBtnColor (){
		return super.getNavColor(btn_logIn());
	}
	
	public String registerBtnColor (){
		return super.getNavColor(btn_register());
	}
}
