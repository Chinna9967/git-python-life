package scripts.PratikAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Switchview {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME	, "UiAutomator2");
//		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		caps.setCapability(MobileCapabilityType.APP, "/Users/lucky/Downloads/app/Android/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
		caps.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");
		caps.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
		URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");
		
		AppiumDriver driver = new AndroidDriver<MobileElement>(serverURL,caps);
		
		driver.manage().timeouts().implicitlyWait(65, TimeUnit.SECONDS);
		
		Thread.sleep(3500);	

		Dimension d=driver.manage().window().getSize();
		
		int h1=(int) (d.getHeight() * 0.8);
		int h2=(int) (d.getHeight() * 0.2);
		
		TouchAction action = new TouchAction(driver);
		PointOption p = new PointOption();
		
		action.press(p.point(0, h1)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600))).moveTo(p.point(0, h2)).release().perform();
		
		driver.findElementByXPath("//*[@text='standard_user']").click();
		Thread.sleep(3500);	
		
		action.press(p.point(0, h2)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600))).moveTo(p.point(0, h1)).release().perform();
		
		Thread.sleep(3500);	
		
		driver.findElementByAccessibilityId("test-LOGIN").click();
		
		
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView").click();
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"test-WEBVIEW\"]").click();
		driver.findElementByXPath("//android.widget.EditText[@content-desc=\"test-enter a https url here...\"]").sendKeys("https://www.bing.com");
		driver.findElementByXPath("//*[@text='GO TO SITE']").click();	
		Thread.sleep(5500);	
		Set<String> contexts=driver.getContextHandles();
		
		for(String context : contexts) {
		System.out.println(context);
		
		if(!context.equals("NATIVE_APP")) {
			driver.context(context);
			break;
		}
		
		}
		
		Thread.sleep(5500);	
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
			
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("surendra jaganadam");
		
		
		
		Thread.sleep(9500);
		driver.quit();
		
	}

}
