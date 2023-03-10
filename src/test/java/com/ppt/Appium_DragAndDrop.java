package com.ppt;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class Appium_DragAndDrop {

	
	@Test
	public static void main1() throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability("appPackage", "com.mobeta.android.demodslv");
		dc.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,dc);
		Thread.sleep(3000);
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView[1]")).click();
		WebElement source =driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(2);
		
		
		WebElement target =driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(5);
		
		TouchAction action = new TouchAction((PerformsTouchActions)driver);
		action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();
		System.out.println("element has beeen droped in to destinations successsfully");
		
		  
		  

		
		Thread.sleep(2000);

	}

}


