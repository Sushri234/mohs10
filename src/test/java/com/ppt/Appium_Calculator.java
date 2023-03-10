package com.ppt;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.sun.org.apache.xpath.internal.operations.Equals;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Appium_Calculator {

	@Test
	public static void main1() throws Exception {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability("appPackage", "com.miui.calculator");
		dc.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,dc);
		Thread.sleep(3000);
		
		WebElement eight =driver.findElement(By.id("com.miui.calculator:id/btn_8_s"));
		eight.click();
		
		  WebElement plus=driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
		  plus.click(); 
		  WebElement five=driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
		  five.click(); 
		  WebElement equals=driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
		  equals.click(); 
		  Thread.sleep(3000); 
		  String results=driver.findElement(By.id("com.miui.calculator:id/result\r\n")).getText();
		  
			
			 if(results.equals("=13")) 
			  { 
			  System.out.println("result is pass");
			  } 
			  else 
			  {
			  System.out.println("result is fail"); 
			  }
			 
		 
		Thread.sleep(5000);
		

	}

}
