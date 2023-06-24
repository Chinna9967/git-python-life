package scripts.PratikAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

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

public class Down {
	
	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "12.0");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("deviceName", "Android");
		caps.setCapability("app", "/Users/lucky/Downloads/Ecommerce Store Demo_v1.4_apkpure.com.apk");
		
		URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");
		
		AppiumDriver driver = new AndroidDriver<MobileElement>(serverURL,caps);
		
		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/email")).sendKeys("krishnaappium@mailinator.com");
		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/password")).sendKeys("test1234");
		driver.findElementByXPath("//*[@text='SIGN IN']").click();
		Thread.sleep(5600);
		
		TouchAction action = new TouchAction(driver);
		PointOption p = new PointOption();
		Dimension d = driver.manage().window().getSize();
		
		int h1= (int) (d.getHeight() * 0.8);
		int h2= (int) (d.getHeight() * 0.2);
		
		action.press(p.point(0, h1)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600))).moveTo(p.point(0, h2)).release().perform();
		
		
		
		Thread.sleep(5600);
		driver.quit();
		
	}

}
