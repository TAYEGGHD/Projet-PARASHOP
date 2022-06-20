package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	WebDriver driver = null;
	
	@Given("user is on the login page of the site")
	public void user_is_on_the_login_page_of_the_site() {
		System.out.println("Inside Step - user is on the login page of the site");
		
		System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
	
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.navigate().to("https://www.parashop.tn/");
		driver.findElement(By.xpath("//a[contains(@href,'javascript:open_login_popup()')]")).click();
	}

	@When("user enters E-mail and password")
	public void user_enters_e_mail_and_password() {
		System.out.println("Inside Step - user enters E-mail and password");
		driver.findElement(By.id("//*[@id=\"input-email\"]")).sendKeys("test.academy1@yahoo.com");
		driver.findElement(By.id("input-password")).sendKeys("Test123");
		}

	@And("user clicks on submit")
	public void user_clicks_on_submit() {
		System.out.println("Inside Step - user clicks on submit");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside Step - user is navigated to the home page");
	}


}
