package scripts.PratikAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class web {
	
	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "12.0");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("deviceName", "Android");
		caps.setCapability("app", "/Users/lucky/Downloads/Hybrid.apk");
		
		URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");
		
		AppiumDriver driver = new AndroidDriver<MobileElement>(serverURL,caps);
		
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.id("com.webtrends.WThybridAppSample:id/btnOpenBrowser")).click();
		Set<String> contexts=driver.getContextHandles();
		System.out.println(contexts.size());
		for (String context : contexts) {
            System.out.println(contexts);
           if (!context.equals("NATIVE_APP")) {
               driver.context(context);
               break;
           }
       }
		
		System.out.println(driver.getCurrentUrl());
		
		
		Thread.sleep(5600);
		driver.quit();
		
	}

}
