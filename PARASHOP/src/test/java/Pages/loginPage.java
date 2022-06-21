package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {
	
	protected WebDriver driver;
	
	private By btn_login = By.xpath("//a[contains(@href,'javascript:open_login_popup()')]");
	private By txt_email = By.id("input-email");
	private By txt_password = By.id("input-password");
	private By btn_submit = By.id("btn btn-primary");
	private By btn_logout = By.xpath("//a[contains(@href,'https://www.parashop.tn/index.php?route=account/logout')]");

	public void homePage(WebDriver driver) {
	this.driver = driver;

		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.parashop.tn");
		driver.manage().window().maximize();
		driver.findElement(btn_login).click();
	}
	
	public void enterEmail(String email) {
		driver.findElement(txt_email).sendKeys(email);	
	}
	
	public void enterPassword (String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(btn_submit).click();
	}
	
	public void checkLogoutIsDisplayed() {
		driver.findElement(btn_logout).isDisplayed();
	}
	
	

	
}
