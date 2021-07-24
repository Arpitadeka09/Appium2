package Appiumscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ApiScroll {
	
public static void main(String[] agrs) throws MalformedURLException {
	     AndroidDriver driver;
		
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
		  
		  WebElement views=driver.findElementByAccessibilityId("views");
			
			views.click();
			
		   scrollToElement(driver,"text","search view");
          driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Search View']")).click();
          
          public static void scrollToElement(AndroidDriver driver,String an,String av)
          {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
        }


	

	}

		

}
