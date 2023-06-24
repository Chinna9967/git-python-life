package scripts.AppiumWeekend;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppLaunch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME	, "UiAutomator2");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		caps.setCapability(MobileCapabilityType.APP, "/Users/lucky/Downloads/app/Android/Ecommerce Store Demo_v1.4_apkpure.com.apk");

		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/email")).sendKeys("test1@mailinator.com");
		driver.findElementById("com.abhiandroid.ecommercestore:id/password").sendKeys("test1234");
		driver.findElement(MobileBy.id("com.abhiandroid.ecommercestore:id/signIn")).click();
		
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/txtSignUp")).click();
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/username")).sendKeys("fullname");
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/email")).sendKeys("test1@mailinator.com");
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/password")).sendKeys("test1234");
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/confirmPassword")).sendKeys("test1234");
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/signUp")).click();
//		
		
		Thread.sleep(6500);
		driver.quit();
		
		
	}

}
