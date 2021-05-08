package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage {
	
	WebDriver driver;
	public FacebookLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	By username = By.id("email");
	By password = By.id("pass");
	By submit = By.name("login");
	
	public WebElement Emailid()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}

}
