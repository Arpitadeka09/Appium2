package Appiumscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ApiDemosValidate {
	
public static void main(String[] agrs) throws MalformedURLException, Throwable {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		 dc.setCapability("deviceName","Samsung");  
		  dc.setCapability("automationName","appium");
		  dc.setCapability("platformName","Android");
		  dc.setCapability("platformVersion","9");
		  dc.setCapability("UDID","RZ8M93M401P");
		  
		  
		  dc.setCapability("appPackage","io.appium.android.apis");
		  dc.setCapability("appActivity",".ApiDemos");
		  
		 
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		    driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
			Thread.sleep(1000);

			driver.findElement(By.id("android:id/button1")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"2. Dark Theme\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("Arpita");
			String expectedname ="Arpita";
			String actualname=driver.findElement(By.id("io.appium.android.apis:id/edit")).getText();
			
			
			if(expectedname.equals(actualname))
			{
				System.out.println("pass");
			}
			else {
				System.out.println("fail");

			}

			Thread.sleep(1000);
			driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc=\"Checkbox 1\"]")).click();


			Thread.sleep(1000);
			WebElement checkbox=driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc=\"Checkbox 1\"]"));
			Thread.sleep(1000);
			
			
			if(!checkbox.isSelected()) {
				driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc=\"Checkbox 1\"]")).click();

				System.out.println("checkbox is Selected");
			}else 
			{System.out.println("checkbox is not selected");}

			driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc=\"Checkbox 1\"]")).click();


			Thread.sleep(1000);
			WebElement radio=driver.findElement(By.id("io.appium.android.apis:id/radio1"));
			Thread.sleep(1000);
			
			
			if(!radio.isSelected()) {
				driver.findElement(By.id("io.appium.android.apis:id/radio1")).click();

				System.out.println("radio is Selected");
			}else 
			{System.out.println("radio is not selected");}

			driver.hideKeyboard();
			Thread.sleep(1000);
			
			
			driver.findElement(By.id("android:id/text1")).click();
			List<WebElement> alltext = driver.findElementsByClassName("android.widget.CheckedTextView");
			
			for(int i=1; i<alltext.size(); i++)
			 {
				 System.out.println(alltext.get(i).getText());
			 }

		}
	

}
