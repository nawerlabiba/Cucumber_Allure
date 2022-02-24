package pages;

import org.openqa.selenium.By;

import base.Base;

public class Employee_Loginpage extends Base{
//	WebDriver driver;
//	public Employee_Loginpage (WebDriver driver) {
//		this.driver=driver;
//	}
	//locator declare 
	By userIdBox=By.xpath("//input[@name='mailuid']");
	By pwd=By.xpath("//input[@name=\"pwd\"]");
	By loginButton=By.xpath("//input[@name='login-submit']");
	By verifyEmpLoginPage=By.xpath("//h1[text()='Employee Login ']");
	//method for userid,password then login button
	public void enterUserName() {
		browser.findElement(userIdBox).sendKeys("testpilot@gmail.com");
	}
	public void enterPassword() {
		browser.findElement(pwd).sendKeys("1234");
	}
	public void clickLoginButton() {
		browser.findElement(loginButton).click();
	}
	public String verifyEmpLoginpageLebel() {
		return browser.findElement(verifyEmpLoginPage).getText();
	}
//	
}
