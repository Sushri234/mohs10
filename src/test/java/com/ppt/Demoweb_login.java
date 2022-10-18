package com.ppt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoweb_login {

	@Test
	public void Register_page()throws InterruptedException
	
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
	driver.findElement(By.id("gender-female")).click();
	driver.findElement(By.id("FirstName")).sendKeys("admin");;
	driver.findElement(By.id("LastName")).sendKeys("login");
	driver.findElement(By.id("Email")).sendKeys("admin8@gmail.com");
	driver.findElement(By.xpath("//input[@class=\"text-box single-line password\"]")).sendKeys("pihu@123");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("pihu@123");
	driver.findElement(By.id("register-button")).click();	

	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Register");
	

}
}

