package scripts.PratikAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SauceDemo {
	
	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
//		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
////		caps.setCapability("platformName", "Android");
//		caps.setCapability("platformVersion", "11.0");
////		caps.setCapability("automationName", "UiAutomator2");
//		caps.setCapability("deviceName", "Google Pixel 3a GoogleAPI Emulator");
////		caps.setCapability("app", "sauce-storage:Ecommerce Store Demo_v1.4_apkpure.com.apk");
//		caps.setCapability("app", "https://github.com/saucelabs/sample-app-mobile/releases/download/2.3.0/Android.SauceLabs.Mobile.Sample.app.2.3.0.apk?raw=true");
//		caps.setCapability("noReset", true);
		
		caps.setCapability("appiumVersion", "1.9.1");
	    caps.setCapability("deviceName","Samsung Galaxy S9 Plus FHD GoogleAPI Emulator");
	    caps.setCapability("deviceOrientation", "portrait");
	    caps.setCapability("browserName", "");
	    caps.setCapability("platformVersion","8.1");
	    caps.setCapability("platformName","Android");
	    caps.setCapability("app", "/Users/lucky/Downloads/app/Android/Ecommerce Store Demo_v1.4_apkpure.com.apk");

		
		URL serverURL = new URL("https://luckyQA121:0fdbffa0-3c5f-4917-95e4-7b70a1466207@ondemand.us-west-1.saucelabs.com:443/wd/hub");
		
		AppiumDriver driver = new AndroidDriver<MobileElement>(serverURL,caps);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		
		
		
		Thread.sleep(5600);
		driver.quit();
		
	}

}
