package Resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base
{

	public WebDriver initializeDriver()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ykulkarni\\Desktop\\Selenium Udemy\\Latest ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
