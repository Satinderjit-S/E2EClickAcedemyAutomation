package resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static  WebDriver driver ;
	String path = System.getProperty("user.dir");
	public Properties propObj;
	public WebDriver initiateDriver() throws IOException
	{
		
		propObj= new Properties();
		
		FileInputStream inStreamObj=new FileInputStream(path+"\\src\\main\\java\\resources\\browser_data.properties");
		propObj.load(inStreamObj); 
		String browser=propObj.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
			driver=new ChromeDriver(); 
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", path+"\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.edge.driver", path+"\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		}
		else
		{
			System.exit(1);//("BROWSER NOT DEFINED OR VALUE NOT REOGNISED");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://test//"+result+"screenshot.png"));
		//FileUtils.copyFile(src,new File(path+"\\screenshots\\screenshot.png"));
		
	}
}
