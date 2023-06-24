package scripts.PratikAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class iOSSWipe {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
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
		
		driver.findElementByAccessibilityId("Sliders").click();
		Thread.sleep(3500);	
		
		WebElement obj=driver.findElement(By.xpath("//*[@type='XCUIElementTypeSlider']"));

		obj.sendKeys("0.1");
		Thread.sleep(1500);		
		obj.sendKeys("0.9");

		Thread.sleep(9500);
		driver.quit();
		
	}

}
