package openMRS.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InpatientWord {
	
	WebDriver ldriver;
	
	public InpatientWord(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "(//a[@type='button'])[1]")
	WebElement clkPRWidget;
	
	@FindBy(xpath = "//input[@id='patient-search']")
	WebElement txtSearchid;
	
	@FindBy(xpath = "(//tbody//tr[@class='odd']//td[2])[1]")
	WebElement namesrch;
	
	public void ClickWidget1() {
		clkPRWidget.click();
	}
	public void setSearchId(String uname) {
		txtSearchid.sendKeys(uname);
	}
	public void ClickpatientName() {
		namesrch.click();
	}

}
