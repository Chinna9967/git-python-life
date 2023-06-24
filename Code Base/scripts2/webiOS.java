package scripts.PratikAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class webiOS {
	
	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("platformName", "iOS");
		caps.setCapability("platformVersion", "14.5");
		caps.setCapability("automationName", "XCUITest");
		caps.setCapability("deviceName", "iPhone");
		caps.setCapability("app", "Users/lucky/Library/Developer/Xcode/DerivedData/UIKitCatalog-cummyqhwpursfvfqelhxxzpuioie/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
		caps.setCapability("noReset", true);
		caps.setCapability("udid", "BA399B94-447F-4B31-B909-13D7E0763DFC");
		URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");
		

		AppiumDriver driver = new IOSDriver<MobileElement>(serverURL,caps);
		
		driver.manage().timeouts().implicitlyWait(65, TimeUnit.SECONDS);
		
		driver.findElementByAccessibilityId("Web View").click();
		Thread.sleep(5600);
		
		
		Set<String> contexts=driver.getContextHandles();
		System.out.println(contexts.size());
		for (String context : contexts) {
            System.out.println(contexts);
//           if (!context.equals("NATIVE_APP")) {
//               driver.context(context);
//               break;
//           }
       }
		
//		System.out.println(driver.getCurrentUrl());
		
		
		Thread.sleep(5600);
		driver.quit();
		
	}

}
