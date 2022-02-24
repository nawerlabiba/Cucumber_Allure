package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class Homepage extends Base{
//	WebDriver driver;
//	public Homepage (WebDriver driver) {
//		this.driver=driver;
//	}
	//locators of home page
	By welcomeText=By.xpath("//h2[text()='Welcome Test ']");
	//method 
	public String getWelcomeText() {
		return browser.findElement(welcomeText).getText();
	}
}
