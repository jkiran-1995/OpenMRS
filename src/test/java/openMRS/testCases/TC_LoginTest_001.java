package openMRS.testCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import openMRS.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test(priority = 0 )
	public void LoginTest() {
		driver.get(baseURL);
		logger.info("Browser is Opened");
		driver.manage().window().maximize();
		logger.info("Browser is Maximized");
		LoginPage LP = new LoginPage(driver);
		LP.setUsername(UserName);
		logger.info("Username is Entered");
		LP.setPassword(Password);
		logger.info("Password is Entered");
		LP.clkSession();
		logger.info("Inpatient Word is Selected");
		LP.clickLogin();
		logger.info("Login Button is Clicked");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		LP.clickLogout();
		logger.info("Logout Button is Clicked"); 
		logger.info("Successfully Logged Out");
		
	}

}
