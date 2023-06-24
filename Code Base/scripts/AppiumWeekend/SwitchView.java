package scripts.AppiumWeekend;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SwitchView {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME	, "UiAutomator2");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		caps.setCapability(MobileCapabilityType.APP, "/Users/lucky/Downloads/app/Android/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
		caps.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");
		
		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

		Thread.sleep(4500);
		
		Dimension d=driver.manage().window().getSize();
		int h1= (int) (d.getHeight() * 0.8);
		int h2= (int) (d.getHeight() * 0.2);
		
		
		TouchAction act = new TouchAction(driver);
		PointOption p = new PointOption();
		
		
		act.press(p.point(0, h1)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(700))).moveTo(p.point(0, h2)).release().perform();
		
		driver.findElementByXPath("//*[@text='standard_user']").click();	
		driver.findElementByAccessibilityId("test-LOGIN").click();
		driver.findElementByAccessibilityId("test-Menu").click();
		driver.findElementByAccessibilityId("test-WEBVIEW").click();
		driver.findElementByXPath("//android.widget.EditText[@content-desc=\"test-enter a https url here...\"]").sendKeys("https://www.bing.com");
		driver.findElementByAccessibilityId("test-GO TO SITE").click();	
		Thread.sleep(4500);
		
		Set<String> contexts=driver.getContextHandles();
		
		for(String context : contexts) {
			System.out.println(context);
			
//			if(!context.equals("NATIVE_APP")) {
//				driver.context(context);
//				break;
//			}
			
			
			if(context.equals("WEBVIEW_com.swaglabsmobileapp")) {
				driver.context(context);
				break;
			}
		}
		
		System.out.println(driver.getCurrentUrl());
		
		
		Thread.sleep(6500);
		driver.quit();
		
		
	}

}
