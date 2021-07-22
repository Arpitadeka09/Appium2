package Appiumscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Generalstore {
	
	public static void main(String[] agrs) throws MalformedURLException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		 dc.setCapability("deviceName", "Samsung");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "9");
		  dc.setCapability("UDID", "RZ8M93M401P");
		  //DC for Android 
		  dc.setCapability("appPackage", "com.androidsample.generalstore");
		  dc.setCapability("appActivity", ".SplashActivity");
		  
		  // Appium Server Port No.
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Arpita");
		  
		  driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		  driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).click();
			 
		  driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
			 
			 
			 
		  
	}

}
