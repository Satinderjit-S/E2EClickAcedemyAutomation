package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObjects {
	WebDriver driver;
	public loginPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	By emailObject = By.id("user_email");
	By passwordObject=By.id("user_password");
	By loginBtnObject=By.xpath("//input[@name='commit']");
	
	public WebElement getEmailObject()
	{
		return driver.findElement(emailObject);
	}
	public WebElement getPasswordObject()
	{
		return driver.findElement(passwordObject);
	}
	public WebElement getLoginBtnObject()
	{
		return driver.findElement(loginBtnObject);
	}
	
	
}
