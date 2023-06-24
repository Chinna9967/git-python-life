package scripts.PratikAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeNSelect {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME	, "UiAutomator2");
//		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		caps.setCapability(MobileCapabilityType.APP, "/Users/lucky/Downloads/app/Android/Simple Swipe Menu Layout Demo_apkpure.com.apk");
		URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");
		
		AppiumDriver driver = new AndroidDriver<MobileElement>(serverURL,caps);
		
		driver.manage().timeouts().implicitlyWait(65, TimeUnit.SECONDS);
		
		Thread.sleep(3500);	

		
		TouchAction action = new TouchAction(driver);
		PointOption p = new PointOption();
		
		
		Dimension d=driver.findElementById("com.edgarmmann88.simpleswip:id/foregroundContainer").getSize();
		
		int startx= (int) (d.getWidth() * 0.8);
		int starty=d.getHeight();
		
		int endx=(int) (d.getWidth() * 0.4);
		
		
		action.press(p.point(startx, endx)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600))).moveTo(p.point(endx, starty)).release().perform();
		
		Thread.sleep(9500);
		driver.quit();
		
	}

}
