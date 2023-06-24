package iOSCodeBase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Search {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME	, "XCUITest");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.5");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
		caps.setCapability(MobileCapabilityType.UDID, "BA399B94-447F-4B31-B909-13D7E0763DFC");
		caps.setCapability(MobileCapabilityType.APP, "/Users/lucky/Library/Developer/Xcode/DerivedData/UIKitCatalog-fbkrzdkewotohqakjnjvctdnhzhu/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");

		AppiumDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		

		driver.findElementByAccessibilityId("Search").click();
		driver.findElementByAccessibilityId("Default").click();
		
		driver.findElementByXPath("//*[@type='XCUIElementTypeSearchField']").click();
		driver.findElementByXPath("//*[@type='XCUIElementTypeSearchField']").sendKeys("surendra jaganadam");
		
		
		driver.findElementByAccessibilityId("Clear text").click();
		
		Thread.sleep(6500);
		driver.quit();
		
		
	}

}