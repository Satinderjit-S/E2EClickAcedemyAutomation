package clickAcedemy.automationProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.homePageObjects;
import pageObjects.loginPageObjects;
import resources.*;

public class homePageLogin_Test001 extends Base {
	WebDriver driver;
	homePageObjects hpos;
	loginPageObjects lpos;

	@Test(dataProvider = "userPassProvider")
	public void validateLoginFunctionality(String user, String pass) throws IOException {
		driver = initiateDriver();
		driver.get(propObj.getProperty("hurl"));
		hpos = new homePageObjects(driver);
		hpos.getHomePageLoginObject().click();
		System.out.println(driver.getTitle());
		lpos = new loginPageObjects(driver);
		lpos.getEmailObject().sendKeys(user);
		lpos.getPasswordObject().sendKeys(pass);
		lpos.getLoginBtnObject().click();

	}

	@DataProvider
	public Object[][] userPassProvider() {
		Object[][] data = new Object[2][2];
		// first data set
		data[0][0] = "sumybngr94@gmail.com";
		data[0][1] = "satiNderJit";

		// second data set
		data[1][0] = "saisatinderjitsingh.com";
		data[1][1] = "dummy pass";

		return data;

	}

}
