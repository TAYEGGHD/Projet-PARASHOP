package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps_POM {
	WebDriver driver = null;
	 loginPage login = new loginPage();
	
	@Given("user is on the login page of the site")
	public void user_is_on_the_login_page_of_the_site() {
		System.out.println("Inside Step - user is on the login page of the site");
		login.homePage(driver);			
	}

	@When("user enters E-mail and password")
	public void user_enters_e_mail_and_password() {
		System.out.println("Inside Step - user enters E-mail and password");
		        
        login.enterEmail("email");
        login.enterPassword("password");		

		}


	@And("user clicks on submit")
	public void user_clicks_on_submit() {
		System.out.println("Inside Step - user clicks on submit");

		login.clickLogin();
		
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside Step - user is navigated to the home page");
		
	login.checkLogoutIsDisplayed();
			
	}

}
