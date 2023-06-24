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

public class EcomE2E {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME	, "UiAutomator2");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		caps.setCapability(MobileCapabilityType.APP, "/Users/lucky/Downloads/app/Android/Ecommerce Store Demo_v1.4_apkpure.com.apk");
//		caps.setCapability("noReset", true);
//		caps.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");
		
		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/email")).sendKeys("test1@mailinator.com");
		driver.findElementById("com.abhiandroid.ecommercestore:id/password").sendKeys("test1234");
		driver.findElement(MobileBy.id("com.abhiandroid.ecommercestore:id/signIn")).click();
		
//		driver.findElement(By.xpath("//*[@text='ADD TO CART']")).click();
//		driver.findElementByAccessibilityId("test-Cart").click();
//		driver.findElement(MobileBy.xpath("//*[@text='CHECKOUT']")).click();
		
//		
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/topSpaceView")).click();
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/searchEditText")).sendKeys("iPhone");
//		
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/productImage1")).click();
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/addToCart")).click();
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/confirm_button")).click();
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/size")).click();
//		driver.findElement(By.xpath("//*[@text='Golden']")).click();
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/addToCart")).click();
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/confirm_button")).click();
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/cart")).click();
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/quantity")).click();
//		driver.findElement(By.xpath("//*[@text='2']")).click();
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/confirm_button")).click();
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/delete")).click();
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/confirm_button")).click();	
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/continueShopping")).click();
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/menu")).click();
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/design_menu_item_text")).click();
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/logout")).click();
//		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/confirm_button")).click();
		
		
		Thread.sleep(6500);
		driver.quit();
		
		
	}

}
