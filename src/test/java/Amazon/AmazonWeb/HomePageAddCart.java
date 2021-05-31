package Amazon.AmazonWeb;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Resources.Base;
import org.junit.Assert;

public class HomePageAddCart extends Base 
{
	public WebDriver driver;
	HomePage hp ;
	
	@BeforeTest
	public void initilized()
	{
		driver = initializeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		
	}
	
	@Test
	public void SearchItemToAddCart() throws InterruptedException
	{
		hp = new HomePage(driver);
		hp.getSearchBar().clear();
		hp.getSearchBar().click();
		hp.getSearchBar().sendKeys("car accessories");
		hp.getSearchButton().click();
		int itemSize = hp.getitemToAdd().size();
		System.out.println(itemSize);
		for(int i=0;i<itemSize;i++)
		{
			String name = hp.getitemToAdd().get(i).getText();
			if(name.contains("Charger for Apple and Android"))
			{
				hp.getitemToAdd().get(i).click();
				break;
			}
		}
		
		hp.getAddToCart().click();
		Thread.sleep(3000);
		Assert.assertTrue(hp.getTextAddedToCart().isDisplayed());
		
	}
	
	
	
	

}
