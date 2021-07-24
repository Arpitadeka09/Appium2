package Appiumscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.TouchAction;

import io.appium.java_client.android.AndroidDriver;

public class ApiDragnDrop {
public static void main(String[] agrs) throws MalformedURLException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		 dc.setCapability("deviceName","Samsung");  
		  dc.setCapability("automationName","appium");
		  dc.setCapability("platformName","Android");
		  dc.setCapability("platformVersion","9");
		  dc.setCapability("UDID","RZ8M93M401P");
		  //DC for Android 
		  
		  dc.setCapability("appPackage","io.appium.android.apis");
		  dc.setCapability("appActivity",".ApiDemos");
		  
		  // Appium Server Port No.
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElementByAccessibilityId("Views").click();
		  driver.findElementByAccessibilityId("Drag and Drop").click();
		  
		  WebElement src=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		  WebElement dest=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_3"));
		  
		  TouchAction ta=new TouchAction(driver);
		  ta.longPress(src).waitAction(2000).moveTo(dest).release().perform();
		  
		  
		  
		  
		  

}	  
		  
		  

}
