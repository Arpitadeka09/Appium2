package Appiumscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Apidemos {
	
	
	public static void main(String[] agrs) throws MalformedURLException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		 dc.setCapability("deviceName", "Samsung");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "9");
		  dc.setCapability("UDID", "RZ8M93M401P");
		  //DC for Android 
		  
		  dc.setCapability("appPackage", "io.appium.android.apis");
		  dc.setCapability("appActivity", ".ApiDemos");
		  
		  // Appium Server Port No.
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"2. Dark Theme\"]")).click();
		  
		  driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("Arpita");
		  
		  driver.findElementByAccessibilityId("Checkbox 1").click();
		  driver.findElementByAccessibilityId("RadioButton 2").click();
		  
		  
		  
		  
	}

}
