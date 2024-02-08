package openMRS.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IsolationWard {
	
	WebDriver ldriver;
	
	public IsolationWard(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "Isolation Ward")
	WebElement clkISWord;
	
	public void ClickISWord() {
		clkISWord.click();
	}

}
