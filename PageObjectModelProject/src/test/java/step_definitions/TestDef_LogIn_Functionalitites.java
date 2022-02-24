package step_definitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Employee_Loginpage;
import pages.Homepage;
import pages.Landingpage;

public class TestDef_LogIn_Functionalitites extends Base{
	//create obj of each page
	Landingpage landingpage=new Landingpage();
	Employee_Loginpage empLoginPage=new Employee_Loginpage();
	Homepage welcometext=new Homepage();
	@Given("I am in  Landing page")
	public void i_am_in_Landing_page() {
	    landingpage.navigateUrl();
	}

	@When("I click on login menu")
	public void i_click_on_login_menu() {
		landingpage.clickLoginMenu();
	}

	@Then("I verify I am in Employee Login page")
	public void i_verify_I_am_in_employee_login_page() {
		assertEquals("Employee Login",empLoginPage.verifyEmpLoginpageLebel());
	}

	@Then("I enter log in id")
	public void i_enter_log_in_id() {
		empLoginPage.enterUserName();
	}

	@Then("I enter password")
	public void i_enter_password() {
		empLoginPage.enterPassword();
	}

	@Then("I click on login button")
	public void i_click_on_login_button() {
	   empLoginPage.clickLoginButton();
	}

	@Then("I will be in my homepage")
	public void i_will_be_in_my_homepage() {
		assertEquals("Welcome Test555",welcometext.getWelcomeText());
	}



}
