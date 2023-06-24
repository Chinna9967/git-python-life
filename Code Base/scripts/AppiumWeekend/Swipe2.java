package scripts.AppiumWeekend;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
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

public class Swipe2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME	, "UiAutomator2");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		caps.setCapability(MobileCapabilityType.APP, "/Users/lucky/Downloads/app/Android/Simple Swipe Menu Layout Demo_apkpure.com.apk");
		
		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		WebElement swipeLocator=driver.findElementById("com.edgarmmann88.simpleswip:id/swipeContainer");

		
		Dimension d=swipeLocator.getSize();
		
		int startx=(int) (d.getWidth() * 0.8);
		int starty=(int) (d.getHeight());
		
		
		int endx = (int) (d.getWidth() * 0.3);
		

		TouchAction act = new TouchAction(driver);
		PointOption p = new PointOption();
		
		/*
		 * press we need to startx, starty
		 * move we need to endx, endy(starty)
		 */
	
		
		act.press(p.point(startx, starty)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(700))).moveTo(p.point(endx, starty)).release().perform();
				
		
		
		Thread.sleep(6500);
		driver.quit();
		
		
	}

}
