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

public class SwipeExtended {

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
		
		
		Thread.sleep(4500);
		
		Dimension d=driver.manage().window().getSize();
		int h1= (int) (d.getHeight() * 0.8);
		int h2= (int) (d.getHeight() * 0.2);
		
		
		TouchAction act = new TouchAction(driver);
		PointOption p = new PointOption();

		for(int i=1;i<=4;i++) {
			List<WebElement> titles=driver.findElementsById("com.edgarmmann88.simpleswip:id/titleText");
			
			for(int p1=0;p1<titles.size();p1++) {
				System.out.println(titles.get(p1).getText());
					
			}
			
			
			act.press(p.point(0, h1)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(700))).moveTo(p.point(0, h2)).release().perform();
			Thread.sleep(1500);	
		}
		
		
		Thread.sleep(6500);
		driver.quit();
		
		
	}

}
