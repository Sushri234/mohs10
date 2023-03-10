package com.ppt;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class VerticalScrollingbar {
	
	@Test
	public static void main1() throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability("appPackage", "com.touchboarder.android.api.demos");
		dc.setCapability("appActivity", "com.touchboarder.androidapidemos.MainActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,dc);
		Thread.sleep(3000);
		 
		WebElement tap = driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		tap.click();
		
		 
	    driver.findElement(By.id("android:id/button1")).click();
		
	    driver.findElement(By.id("com.touchboarder.android.api.demos:id/buttonDefaultPositive"));
		
		WebElement tap3 = driver.findElements(By.id("android:id/text1")).get(12);
		tap3.click();
		//capturing all test list item
	//	AndroidElement list = (AndroidElement)driver.findElement(By.id("android:id/text1"));
		//scrolling down till we get element
	//	MobileElement element=(MobileElement)driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scroolIntiView("+"new UiSelector().description(\"switches\"));"));
		
	//	System.out.println(listitem.getLocation());
	//	listitem.click();
		
		
		Thread.sleep(2000);
	}
}
