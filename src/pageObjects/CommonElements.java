package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonElements extends utils.Driver {
	public CommonElements(WebDriver driver, WebDriverWait wait) {
		super();
	}

	// Navigation menu
	private List<WebElement> navigation() {
		return driver.findElements(By.xpath("//div[@id='navigation']/ul/li/a"));
	}

	protected WebElement btn_home() {
		return driver.findElement(By.linkText("Home"));
	}

	protected WebElement btn_aboutUs() {
		return driver.findElement(By.linkText("About us"));
	}

	protected WebElement btn_logIn() {
		return driver.findElement(By.linkText("Log in"));
	}

	protected WebElement btn_logOut() {
		return driver.findElement(By.linkText("Log Out"));
	}

	protected WebElement btn_register() {
		return driver.findElement(By.linkText("Register"));
	}

	protected WebElement btn_profile() {
		return driver.findElement(By.xpath("//a[@href='profile-page.php']"));
	}

	protected WebElement btn_myProjects() {
		return driver.findElement(By.linkText("My Projects"));
	}

	protected WebElement btn_projects() {
		return driver.findElement(By.linkText("Projects"));
	}

	protected WebElement btn_services() {
		return driver.findElement(By.linkText("Services"));
	}

	protected WebElement btn_contacts() {
		return driver.findElement(By.linkText("Contacts"));
	}

	// Footer elements
	private WebElement txt_columns3f() {
		return driver.findElement(By.className("columns3f"));
	}

	private WebElement txt_columns3mid() {
		return driver.findElement(By.className("columns3mid"));
	}

	private WebElement txt_columns3() {
		return driver.findElement(By.className("columns3"));
	}

	private WebElement btn_facebook() {
		return driver.findElement(By.xpath("//a[@href='http://www.facebook.com']"));
	}

	private WebElement btn_twitter() {
		return driver.findElement(By.xpath("//a[@href='http://www.twitter.com']"));
	}

	private WebElement btn_googleplus() {
		return driver.findElement(By.xpath("//a[@href='http://www.plus.google.com']"));
	}

	// Public methods

	// Click FB, Twitter, Google+ buttons
	public void clickHomeButton() {
		btn_home().click();
	}

	public void clickAboutUsButton() {
		btn_aboutUs().click();
	}

	public void clickLogInButton() {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btn_logIn().click();
	}

	public void clickLogOutButton() {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btn_logOut().click();
	}

	public void clickRegisterButton() {
		btn_register().click();
	}

	public void clickProfileButton() {
		btn_profile().click();
	}

	public void clickMyProjectsButton() {
		btn_myProjects().click();
	}

	public void clickProjectsButton() {
		btn_projects().click();
	}

	public void clickServicesButton() {
		btn_services().click();
	}

	public void clickContactsButton() {
		btn_contacts().click();
	}

	public void clickFacebookButton() {
		wait.until(ExpectedConditions.elementToBeClickable(btn_facebook()));
		btn_facebook().click();
	}

	public void clickTwitterButton() {
		wait.until(ExpectedConditions.elementToBeClickable(btn_twitter()));
		btn_twitter().click();
	}

	public void clickGoogleButton() {
		wait.until(ExpectedConditions.elementToBeClickable(btn_googleplus()));
		btn_googleplus().click();
	}

	// Get text from footer
	public String getColumns3fText() {
		wait.until(ExpectedConditions.visibilityOf(txt_columns3f()));
		return txt_columns3f().getText();
	}

	public String getColumns3Text() {
		wait.until(ExpectedConditions.visibilityOf(txt_columns3()));
		return txt_columns3().getText();
	}

	public String getColumns3midText() {
		wait.until(ExpectedConditions.visibilityOf(txt_columns3mid()));
		return txt_columns3mid().getText();
	}

	public List<String> getNavigationColor() {
		int size = navigation().size();
		List<String> navColors = new ArrayList<String>();
		for (int i = 0; i < size; i++) {
			navColors.add(navigation().get(i).getCssValue("background-color"));
		}
		return navColors;
	}

	public int getNavigationSize() {
		int size = navigation().size();
		return size;
	}

	public boolean isDisplayed(WebElement e) {
		return e.isDisplayed();
	}

	public String getNavColor(WebElement e) {
		return e.getCssValue("background-color");
	}

	// Get element by Link Name
	private WebElement elementByLinkName(String linkName) {
		return driver.findElement(By.partialLinkText(linkName));
	}

	// Get element by Xpath
	private WebElement elementByXPath(String xPath) {
		return driver.findElement(By.xpath(xPath));
	}

	// Get Button and click
	public String getButtonLink(String linkName) {
		wait.until(ExpectedConditions.visibilityOf(elementByLinkName(linkName)));
		return elementByLinkName(linkName).getAttribute("href");
	}

	public String getButtonName(String linkName) {
		wait.until(ExpectedConditions.visibilityOf(elementByLinkName(linkName)));
		return elementByLinkName(linkName).getText();
	}

	// Get text from footer
	public String getElementByXPath(String xPath) {
		wait.until(ExpectedConditions.visibilityOf(elementByXPath(xPath)));
		return elementByXPath(xPath).getText();
	}
	
	public boolean homeVisible(){
		if (btn_home().isDisplayed()){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean profileVisible(){
		if (btn_profile().isDisplayed()){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean myProjectsVisible(){
		if (btn_myProjects().isDisplayed()){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean aboutUsVisible(){
		if (btn_aboutUs().isDisplayed()){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean logOutVisible(){
		if (btn_logOut().isDisplayed()){
			return true;
		} else {
			return false;
		}
	}
	
}