package openMRS.testCases;

import org.testng.annotations.Test;

import openMRS.pageObjects.InpatientWord;
import openMRS.pageObjects.IsolationWard;
import openMRS.pageObjects.LoginPage;

public class TC_IsolationWord_004 extends BaseClass {
	
	@Test(priority = 3)
	public void IsolationWordTest() {
		driver.get(baseURL);
		logger.info("Browser is Opened");
		driver.manage().window().maximize();
		logger.info("Browser is Maximized");
		LoginPage LP = new LoginPage(driver);
		LP.setUsername(UserName);
		logger.info("Username is Entered");
		LP.setPassword(Password);
		logger.info("Password is Entered");
		
		
		
		
		IsolationWard ISW = new IsolationWard(driver);
		ISW.ClickISWord();
		LP.clickLogin();
		logger.info("Login Button is Clicked");
		
		InpatientWord IP = new InpatientWord(driver);
		logger.info("OutPatient Search is Started");
		IP.ClickWidget1();
		logger.info("OutPatient Search Widget is Clicked");
		IP.setSearchId(PatientName);
		logger.info("OutPatient name is Entered");
		IP.ClickpatientName();
		logger.info("OutPatient record is displayed");
		LP.clickLogout();
		logger.info("Logout Button is Clicked"); 
		logger.info("Successfully Logged Out");
	}

}
