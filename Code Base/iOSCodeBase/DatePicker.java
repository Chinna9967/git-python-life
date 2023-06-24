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

public class DatePicker {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME	, "XCUITest");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.5");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
		caps.setCapability(MobileCapabilityType.UDID, "BA399B94-447F-4B31-B909-13D7E0763DFC");
		caps.setCapability(MobileCapabilityType.APP, "/Users/lucky/Library/Developer/Xcode/DerivedData/UIKitCatalog-fbkrzdkewotohqakjnjvctdnhzhu/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");

		AppiumDriver<MobileElement> driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		

		driver.findElementByAccessibilityId("Date Picker").click();
		driver.findElementByAccessibilityId("Date and Time Picker").click();
		driver.findElementByAccessibilityId("Sunday, December 12").click();	
		driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"Time\"]").sendKeys("444");
		driver.findElementByAccessibilityId("AM").click();
		
		
		
		
		Thread.sleep(6500);
		driver.quit();
		
		
	}

}