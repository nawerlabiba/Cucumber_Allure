package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class Landingpage extends Base{
//	WebDriver driver;
//	public Landingpage (WebDriver driver) {
//		this.driver=driver;
//	}
	
	//as we are extending Base class thatsy theres no
	//longer need to write 9to 12 number lines
	
	//webelement decalaration
		By loginMenuButton=By.xpath("//a[@href='elogin.php']");
		public void navigateUrl() {
			browser.get("https://sit.skyschooling.com/microtech");
		}
		//method for login menu
		public void clickLoginMenu() {
			browser.findElement(loginMenuButton).click();
		}
}
