package scripts.PratikAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppLaunch {
	
	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("deviceName", "Samsung_Galaxy_S9_free");
		caps.setCapability("app", "sauce-storage:Ecommerce Store Demo_v1.4_apkpure.com.apk");
		
		URL serverURL = new URL("https://oauth-luckytrainingsqtp-d2d91:c3adcc0f-d93c-4384-bf51-f65ff4bdd6aa@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		
		AppiumDriver driver = new AndroidDriver<MobileElement>(serverURL,caps);
		

		Thread.sleep(5600);
		driver.quit();
		
	}

}
