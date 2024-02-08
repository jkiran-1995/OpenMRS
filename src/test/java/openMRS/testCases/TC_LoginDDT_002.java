package openMRS.testCases;

import org.testng.annotations.Test;

import openMRS.pageObjects.LoginPage;
import openMRS.utilities.DataProviders;

public class TC_LoginDDT_002 extends BaseClass {
	
	
	@Test(priority = 1,dataProvider= "data", dataProviderClass = DataProviders.class )
	public void LoginTest01(String UserName,String Password) {
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
		LP.clickLogout();
		logger.info("Logout Button is Cliked");
		logger.info("Successfully Logged Out");
		
	}

}
