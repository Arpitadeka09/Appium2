package Appiumscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ZoomInAndOut {
	
public static void main(String[] agrs) throws MalformedURLException, Throwable {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		  dc.setCapability("deviceName","Samsung");  
		  dc.setCapability("automationName","appium");
		  dc.setCapability("platformName","Android");
		  dc.setCapability("platformVersion","9");
		  dc.setCapability("UDID","RZ8M93M401P");
		  //DC for Android 
		  
		  dc.setCapability("appPackage","com.davemorrissey.labs.subscaleview.sample");
		  dc.setCapability("appActivity",".MainActivity");
		  
		  // Appium Server Port No.
		  URL url = new URL("http://localhost:4723/wd/hub");
		  AndroidDriver driver = new AndroidDriver(url, dc);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
			
			WebElement img = driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
			
			driver.zoom(img);
			
			Thread.sleep(3000);
			
			driver.pinch(img);

		}

}
