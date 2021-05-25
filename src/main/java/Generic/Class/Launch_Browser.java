package Generic.Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Launch_Browser 
{
	public static WebDriver driver;
	public String browserval = "CHROME";
	public void openBrowser() 
	{
		try 
		{
			switch (browserval) {
			case "CHROME":
				 System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\ProjectTest\\SoftwareDrivers\\chromedriver.exe");
				 driver = new ChromeDriver();
				 driver.get("https://www.amazon.in/");
				 driver.manage().window().maximize();
//				System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\ProjectTest\\SoftwareDriver\\chromedriver.exe");
//				driver = new ChromeDriver();
				break;
			case "FIREFOX":
			     System.setProperty("webdriver.gecko.driver", "D:\\eclipse-workspace\\RQBE\\MvenDemo\\SoftwareDrivers\\geckodriver.exe");
			     driver = new FirefoxDriver();
			     break;
			case "IE":
				System.setProperty("webdriver.ie.driver", "D:\\eclipse-workspace\\RQBE\\MvenDemo\\SoftwareDrivers\\IEDriverServer.exe");
				break;
			}
			
		} 
		catch (Exception e)
		{
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//String URL = "https://www.amazon.in/";
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
	}
	
//	public void implicitWaitMethod()
//	{
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//	
	public void closeApplication()
	{
		try
		{
			Thread.sleep(1000);
		} 
		catch (Exception e)
		{
		}
	}

}
