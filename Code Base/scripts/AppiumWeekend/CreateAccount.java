package scripts.AppiumWeekend;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CreateAccount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME	, "UiAutomator2");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		caps.setCapability(MobileCapabilityType.APP, "/Users/lucky/Downloads/Ecommerce Store Demo_v1.4_apkpure.com.apk");

		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		
		
		MobileElement loc=(MobileElement) driver.findElementById("com.abhiandroid.ecommercestore:id/txtSignUp");
		driver.findElement(MobileBy.id("com.abhiandroid.ecommercestore:id/username")).sendKeys("2323");
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/password")).sendKeys("test1235");
		
		Thread.sleep(6500);
		driver.quit();
		
		
	}

}
