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

public class SauceLabsDemoApp {
	
	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9.0");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("deviceName", "Samsung_Galaxy_S9_free");
		caps.setCapability("app", "https://github.com/saucelabs/sample-app-mobile/releases/download/2.3.0/Android.saucelabs.Mobile.Sample.app.2.3.0.apk?raw=true");
//			caps.setCapability("app", "sauce-storage:Ecommerce Store Demo_v1.4_apkpure.com.apk");
		caps.setCapability("noReset", true);
		URL serverURL = new URL("https://oauth-luckytrainingsqtp-d2d91:c3adcc0f-d93c-4384-bf51-f65ff4bdd6aa@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		
		AppiumDriver driver = new AndroidDriver<MobileElement>(serverURL,caps);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElementByAccessibilityId("test-Username").sendKeys("standard_user");
		
		
		
		
		Thread.sleep(5600);
		driver.quit();
		
	}

}
