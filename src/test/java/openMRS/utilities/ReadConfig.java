package openMRS.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
		File file = new File("./configuration//config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			
			pro = new Properties();
			
			pro.load(fis);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getApplicationurl() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	public String getUserName() {
		String username = pro.getProperty("UserName");
		return username;
	}
	public String getPassword() {
		String password = pro.getProperty("Password");
		return password;
	}
	public String getPatientName() {
		String patientname = pro.getProperty("PatientName");
		return patientname;
	}
	public String getchromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	public String getfirefoxpath() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}



}
