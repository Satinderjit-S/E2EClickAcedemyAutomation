package practicePage;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactoryObjectRepository.practicePageObjects;
import resources.Base;
// Find all the radio button on the test by selecting each one of them and getting teh values
public class radioBtnTest extends Base {
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
	public void testRadioBtn() 
	{
		int count=ppos.getRadioGrpObj().size();
		for(int i=0;i<count;i++)
		{
			ppos.getRadioGrpObj().get(i).click();
			System.out.println(("Selected "+ppos.getRadioGrpObj().get(i).getAttribute("value")));
		}
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		
	}

}
