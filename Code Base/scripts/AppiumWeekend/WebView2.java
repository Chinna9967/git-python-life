package scripts.AppiumWeekend;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class WebView2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ChromeOptions c = new ChromeOptions();
		c.addArguments("--incognito");	
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME	, "UiAutomator2");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		caps.setCapability(ChromeOptions.CAPABILITY, c);
		
		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

		Thread.sleep(4500);
		
		driver.get("https://www.bing.com");
		driver.findElementByXPath("//input[@id='sb_form_q']").sendKeys("lebyy courses");
		driver.findElementByXPath("//label[@for='sb_form_go']").click();
		
		Thread.sleep(6500);
		driver.quit();
		
		
	}

}
