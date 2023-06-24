package scripts.AppiumWeekend;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeExtended2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME	, "UiAutomator2");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		caps.setCapability(MobileCapabilityType.APP, "/Users/lucky/Downloads/APIDemo.apk");
		caps.setCapability(MobileCapabilityType.NO_RESET,true);
		
		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		
		Thread.sleep(4500);
		
		
		
		TouchAction act = new TouchAction(driver);
		PointOption p = new PointOption();

	
			
			
			act.press(p.point(71, 80)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(700))).moveTo(p.point(454, 80)).release().perform();
			Thread.sleep(1500);	
		
			act.press(p.point(71, 80)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(700))).moveTo(p.point(731, 80)).release().perform();
			Thread.sleep(1500);	
		
			act.press(p.point(71, 80)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(700))).moveTo(p.point(511, 80)).release().perform();
			
			
		Thread.sleep(6500);
		driver.quit();
		
		
	}

}
