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

public class DatePickeriOS {
	
	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability("platformName", "IOS");
		caps.setCapability("platformVersion", "14.5");
		caps.setCapability("automationName", "XCUITest");
		caps.setCapability("deviceName", "iPhone");
		caps.setCapability("app", "Users/lucky/Library/Developer/Xcode/DerivedData/UIKitCatalog-cummyqhwpursfvfqelhxxzpuioie/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
		caps.setCapability("noReset", true);
		caps.setCapability("udid", "BA399B94-447F-4B31-B909-13D7E0763DFC");
		URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");
		
		AppiumDriver driver = new AndroidDriver<MobileElement>(serverURL,caps);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElementByAccessibilityId("Date Picker").click();
		driver.findElementByAccessibilityId("Date and Time Picker").click();
		
		driver.findElementByAccessibilityId("Monday, November 22").click();
		
		
		
		Thread.sleep(5600);
		driver.quit();
		
	}

}
