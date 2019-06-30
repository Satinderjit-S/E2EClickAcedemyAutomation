package practicePage;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageFactoryObjectRepository.practicePageObjects;
import resources.Base;

public class practicePage_Test001 extends Base{
	WebDriver driver;
	practicePageObjects ppos;
	public static Logger log= LogManager.getLogger(practicePage_Test001.class.getName());
	@Test
	public void testEnterNameBox() throws IOException, InterruptedException
	{
		driver=initiateDriver();
		driver.get(propObj.getProperty("purl")); 
		ppos =new practicePageObjects(driver);
		ppos.getEnterNameBoxObj().sendKeys("hello");
		ppos.getAlertBtnObj().click();
		driver.switchTo().alert().accept();
		ppos.getConfirmBtnObj().click();
		driver.switchTo().alert().dismiss();
		driver.close();		
	}
}
