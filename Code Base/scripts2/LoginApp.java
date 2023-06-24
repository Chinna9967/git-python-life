package scripts.PratikAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LoginApp {
	
	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "12.0");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("deviceName", "Android");
		caps.setCapability("app", "/Users/lucky/Downloads/app/Android/Ecommerce Store Demo_v1.4_apkpure.com.apk");
		caps.setCapability("noReset", true);
		
		URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");
		
		AppiumDriver driver = new AndroidDriver<MobileElement>(serverURL,caps);
		
		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/email")).sendKeys("krishnaappium@mailinator.com");
		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/password")).sendKeys("test1234");
		driver.findElementByXPath("//*[@text='SIGN IN']").click();

		Thread.sleep(5600);
		driver.quit();
		
	}

}
