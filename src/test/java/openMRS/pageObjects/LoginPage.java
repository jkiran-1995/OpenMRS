package openMRS.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name = "username")
	WebElement txtUsername;
	
	@FindBy(name = "password")
	WebElement txtPassword;
	
	@FindBy(id = "Inpatient Ward")
	WebElement slcSession;
	
	@FindBy(id = "loginButton")
	WebElement clkLogin;
	
	
	@FindBy(xpath = "//li//a[contains(text(),'Logout')]")
	WebElement clkLogout;
	
	public void setUsername(String uname) {
		txtUsername.sendKeys(uname);
	}
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	public void clkSession() {
		slcSession.click();
	}
	public void clickLogin() {
		clkLogin.click();
	}
 	public void clickLogout() {
		
		clkLogout.click();
	
 	}	

}
