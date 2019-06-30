package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePageObjects {
	public WebDriver driver=null;
	public homePageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By homePageLoginObject = By.xpath("//span[contains(text(),'Login')]");
	
	public WebElement getHomePageLoginObject()
	{
		
		return driver.findElement(homePageLoginObject);
	}
	
	
}
