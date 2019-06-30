package practicePage;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactoryObjectRepository.practicePageObjects;
import resources.Base;

public class selectDropdownTest extends Base {
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
	public void testSelectDropDown() throws InterruptedException 
	{
		log.info("Running testSelectDropDown");
		Select target=ppos.getSelectDropDownObj();
		try {
			target.selectByValue("option1");
			target.selectByValue("option2");
			target.selectByValue("option3");
			//target.selectByValue("option4"); //to fail test
			
		}
		catch (NoSuchElementException e ) {
			log.error("Element not Found");
		}
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
