package openMRS.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import openMRS.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplicationurl();
	public String UserName= readconfig.getUserName();
	public String Password = readconfig.getPassword();
	public String PatientName = readconfig.getPatientName();
	
	public static WebDriver driver;
	public static ChromeOptions Options;
	public static Logger logger;
	
	@BeforeClass
	public void setUp() {
		
		logger = logger.getLogger("OpenMRS");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
		Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(Options);
	}
	@AfterClass
	public void tearDown() {
		logger.info("Browser is Closed");
		driver.quit();
	}
	

}
