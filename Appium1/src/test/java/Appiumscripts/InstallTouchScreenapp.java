package Appiumscripts;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
public class InstallTouchScreenapp {
	
	public static void main(String[] agrs) throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		 dc.setCapability("deviceName","Samsung");  
		  dc.setCapability("automationName","appium");
		  dc.setCapability("platformName","Android");
		  dc.setCapability("platformVersion","9");
		  dc.setCapability("UDID","RZ8M93M401P");
		  
		  dc.setCapability("app","C:\\Users\\arpita\\Downloads\\Touch Screen Test_v1.7.14_apkpure.com.apk");
		  
           URL url = new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  
	}

}
