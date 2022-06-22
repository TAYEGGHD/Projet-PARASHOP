package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import NullDriver.DriverINIT;

public class loginPage extends DriverINIT {
	
	public loginPage ( ) {
		super();
		PageFactory.initElements(driver,this);
		}
	
	protected By iframe = By.xpath("/html/body/div[6]/div[1]/div/div/iframe");
	private By btn_login = By.xpath("//a[contains(@href,'javascript:open_login_popup()')]");
	private By txt_email = By.id("input-email");
	private By txt_password = By.id("input-password");
	private By btn_submit = By.xpath("/html/body/div/form/div[3]/div/button/span");
	private By btn_logout = By.xpath("//a[contains(@href,'https://www.parashop.tn/index.php?route=account/logout')]");

		
	
	public void homePage()  {
		
		driver.findElement(btn_login).click();
	
	}
	
    public void enterEmail(String email) {
    	WebElement  frame=driver.findElement(iframe);
		driver.switchTo().frame(frame).findElement(txt_email).sendKeys(email);
		
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
