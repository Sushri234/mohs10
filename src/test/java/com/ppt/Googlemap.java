package com.ppt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlemap {
	WebDriver driver;
	
	@Test(priority=1)
	public void Open_application() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/maps/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"hArJGc\"]")).click();
		//Thread.sleep(2000);
	}
	@Test(priority=2)
	public void Location_name() throws InterruptedException
	{
		WebElement item=driver.findElement(By.xpath("//*[@id=\\\"sb_ifc51\\\"]/input"));
		item.sendKeys("puri");
		WebElement item2=driver.findElement(By.xpath("//*[@id=\\\"sb_ifc52\\\"]"));
		item2.sendKeys("cuttuck");
		
		driver.findElement(By.xpath("//*[@id=\"directions-searchbox-1\"]/button[1]")).click();
		
		Thread.sleep(2000);
		
		}

}
