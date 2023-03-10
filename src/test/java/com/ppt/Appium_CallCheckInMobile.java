package com.ppt;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Appium_CallCheckInMobile {
@Test
	public static void main1() throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability("appPackage", "com.android.phone");
		dc.setCapability("appActivity", "com.android.phone.MiuiEmergencyDialer");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,dc);
		Thread.sleep(3000);
		
		WebElement number =driver.findElement(By.id("com.android.phone:id/backButton"));
		number.click();
		WebElement number1 =driver.findElement(By.id("com.android.contacts:id/name"));
		number1.click();
		Thread.sleep(2000);

	}

}
