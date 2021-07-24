package Appiumscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SwipeINTouchScreen {
      public static void main(String[] agrs) throws MalformedURLException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		 dc.setCapability("deviceName","Samsung");  
		  dc.setCapability("automationName","appium");
		  dc.setCapability("platformName","Android");
		  dc.setCapability("platformVersion","9");
		  dc.setCapability("UDID","RZ8M93M401P");
		  //DC for Android 
		  
		  dc.setCapability("appPackage","jp.rallwell.siriuth.touchscreentest");
		  dc.setCapability("appActivity",".TouchScreenTestActivity");
		  
		  // Appium Server Port No.
		  URL url = new URL("http://localhost:4723/wd/hub");
		  AndroidDriver driver = new AndroidDriver(url, dc);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  Dimension size=driver.manage().window().getSize();
		  int ht=size.getHeight();
		  int wd=size.getWidth();
		  
		  System.out.println("Height is" +ht);
		  System.out.println("Width is" +wd);
		  
		  
		  
		//Vertical Swipe
		  driver.swipe( wd/2, (int) (ht*0.25), wd/2, (int) (ht*0.80), 1000);

		  // Horizontal swipe
		  driver.swipe((int)(wd*.20), ht/2, (int ) (wd*.80),ht/2, 1000);

}
		  

}
