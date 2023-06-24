package factory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoRunner {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
/*		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME	, "UiAutomator2");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		caps.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");
		caps.setCapability("app", "/Users/lucky/Downloads/app/Android/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
		
		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS); */
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME	, "XCUITest");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.5");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
		caps.setCapability(MobileCapabilityType.UDID, "BA399B94-447F-4B31-B909-13D7E0763DFC");
		caps.setCapability(MobileCapabilityType.APP, "/Users/lucky/Library/Developer/Xcode/DerivedData/UIKitCatalog-fbkrzdkewotohqakjnjvctdnhzhu/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");

		AppiumDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		
		instanceToLoginPage(driver).navigateLoginScreen();
		
		Thread.sleep(6500);
		driver.quit();
		
		
	}
	
	
	public static LoginPage instanceToLoginPage(AppiumDriver driver) {
		LoginPage lp = new LoginPage(driver);
		return lp;
		
	}

}
