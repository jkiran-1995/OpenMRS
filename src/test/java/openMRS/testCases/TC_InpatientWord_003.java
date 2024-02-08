package openMRS.testCases;

import org.testng.annotations.Test;

import openMRS.pageObjects.InpatientWord;
import openMRS.pageObjects.LoginPage;

public class TC_InpatientWord_003 extends BaseClass {
	
	@Test(priority = 2 )
	public void InpatientWordTest() {
		
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
		
		
		InpatientWord IP = new InpatientWord(driver);
		logger.info("Patient Search is Started");
		IP.ClickWidget1();
		logger.info("Patient Search Widget is Clicked");
		IP.setSearchId(PatientName);
		logger.info("Patient name is Entered");
		IP.ClickpatientName();
		logger.info("Patient record is displayed");
		LP.clickLogout();
		logger.info("Logout Button is Clicked"); 
		logger.info("Successfully Logged Out");
	}

}
