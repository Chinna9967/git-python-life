package scripts.PratikAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class E2EScenario {
	
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
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.abhiandroid.ecommercestore:id/topSpaceView")).click();
		driver.findElementById("searchEditText").sendKeys("iPhone");
		driver.findElementById("productImage1").click();
		driver.findElementById("size").click();
		driver.findElementByXPath("//*[@text='Golden']").click();
		driver.findElementById("addToCart").click();
		driver.findElementById("confirm_button").click();
		
		driver.findElementById("cart").click();
		
		driver.findElementById("quantity").click();
		driver.findElementByXPath("//*[@text='2']").click();
		driver.findElementById("confirm_button").click();
		driver.findElementById("delete").click();
		driver.findElementById("confirm_button").click();
		
		driver.findElementById("continueShopping").click();
		
		driver.findElementById("menu").click();
		
		driver.findElementByXPath("//*[@text='My Profile']").click();
		driver.findElementById("logout").click();
		driver.findElementById("confirm_button").click();
		
		
		
		
		Thread.sleep(5600);
		driver.quit();
		
	}

}
