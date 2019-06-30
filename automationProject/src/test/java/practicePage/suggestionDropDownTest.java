package practicePage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactoryObjectRepository.practicePageObjects;
import resources.Base;

public class suggestionDropDownTest extends Base{
	public static Logger log=LogManager.getLogger(radioBtnTest.class.getName());
	practicePageObjects ppos;
	WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initiateDriver();
		driver.get(propObj.getProperty("purl"));
		ppos=new practicePageObjects(driver);
		
	}
	@Test
	public void testAutoSuggestionDropDown() throws InterruptedException 
	{
		log.info("Running testAutoSuggestionDropDown");
		WebElement target=ppos.getautocompleteDropDownObj();
		target.sendKeys("CAN"); // Trying to select Canada 
		Thread.sleep(2000);
		target.sendKeys(Keys.ARROW_DOWN);
		target.sendKeys(Keys.ARROW_DOWN);
		target.sendKeys(Keys.ENTER);
		target.sendKeys(Keys.TAB);
		Assert.assertEquals(target.getAttribute("value"),"Canada");
		
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
}
