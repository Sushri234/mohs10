package com.ppt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
	
WebDriver driver;
	
	@Parameters({"browser"})
	@Test(priority=1)
	public void Lunchurl_test(String browser)
	{
		System.out.println("running browser is :"+browser);
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	
	@Parameters({"email","password"})
	@Test(priority=2)
	public void Login_test(String email,String password) {
		System.out.println("email:"+email +"and password:"+password);
		
		driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		driver.findElement(By.id("Email")).sendKeys("admin43@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin54");
		
		

}
}
