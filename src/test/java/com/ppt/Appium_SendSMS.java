package com.ppt;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Appium_SendSMS {
	
	@Test
	public static void main1() throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability("appPackage", "com.android.mms");
		dc.setCapability("appActivity", "com.android.mms.ui.MmsTabActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,dc);
		Thread.sleep(3000);
		
		WebElement sms =driver.findElement(By.id("com.android.mms:id/ignore"));
		sms.click();
		WebElement sms2 =driver.findElement(By.id("com.android.mms:id/from"));
		sms2.click();
		
		WebElement sms1 =driver.findElement(By.id("com.android.mms:id/message_content_panel"));
		sms1.click();
		
		  WebElement sms4 =driver.findElement(By.id("com.android.mms:id/embedded_text_editor"));
		  sms4.sendKeys("hii");
		  driver.findElement(By.id("com.android.mms:id/send_button")).click();
		 

		
		Thread.sleep(2000);

	}

}
