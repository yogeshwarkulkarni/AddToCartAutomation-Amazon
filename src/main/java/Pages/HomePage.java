package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{
	
	public WebDriver driver;
	By searchBar = By.id("twotabsearchtextbox");
	By searchButton = By.id("nav-search-submit-button");
	By itemToAdd = By.cssSelector("a[class='a-link-normal a-text-normal']");
	By addToCart = By.id("submit.add-to-cart");
	By proceedCheckOutButton = By.id("attach-sidesheet-checkout-button");
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getSearchBar()
	{
		return driver.findElement(searchBar);
	}
	public WebElement getSearchButton()
	{
		return driver.findElement(searchButton);
	}
	public List<WebElement> getitemToAdd()
	{
		return driver.findElements(itemToAdd);
	}
	public WebElement getAddToCart()
	{
		return driver.findElement(addToCart);
	}
	public WebElement getTextAddedToCart()
	{
		return driver.findElement(proceedCheckOutButton);
	}


}
