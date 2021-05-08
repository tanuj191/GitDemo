package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objectrepository.FacebookLoginPage;

public class LoginApplication {
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sajal\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		FacebookLoginPage rd = new FacebookLoginPage(driver);
		rd.Emailid().sendKeys("tanujj");
		rd.Password().sendKeys("12a");
		
	}

}
