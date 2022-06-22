package StepDefinitions;

import org.junit.Test;
import org.testng.annotations.BeforeMethod;
import NullDriver.DriverINIT;
import Pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps_POM extends DriverINIT {
	
	 loginPage login = new loginPage();
	 
@BeforeMethod	
	@Given("user is on the login page of the site")
	public void user_is_on_the_login_page_of_the_site() throws InterruptedException {
		System.out.println("Inside Step - user is on the login page of the site");
		intialization();
		login.homePage();
	}
@Test
	@When("^user enters (.*) and (.*)$")
	public void user_enters_e_mail_and_password(String email, String password) {
		System.out.println("Inside Step - user enters E-mail and password");
		        
        login.enterEmail(email);
        login.enterPassword(password);		

		}

@Test
	@And("user clicks on submit")
	public void user_clicks_on_submit() {
		System.out.println("Inside Step - user clicks on submit");

		login.clickLogin();
		
	}
@Test
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside Step - user is navigated to the home page");
		
	login.checkLogoutIsDisplayed();
			
	}

}
