package Datadriven_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datadriven 
{	
	@Test(dataProvider = "logindata")
	public void login(String username, String password) throws InterruptedException
	{
		//WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.wordpress.org/");
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		//Assert.assertTrue(driver.getTitle().contains("Dashboard"));
		//System.out.println(driver.getTitle()); 
		driver.quit();
	}
	
	@DataProvider(name="logindata")
	public Object[][] passData()
	{
		Object [][] data= new Object[3][2];
		data[0][0] = "Sachin";
		data[0][1] = "Tendulkar";
		
		data[1][0] = "Virat";
		data[1][1] = "Kohli";
		
		data[2][0] = "Ramesh";
		data[2][1] = "Power";
		return data;
		
	}
}

