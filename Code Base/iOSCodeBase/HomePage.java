package iOSCodeBase;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage {
	
	AppiumDriver driver;
	public HomePage(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}

	@iOSXCUITFindBy(accessibility = "username")
	@AndroidFindBy(id = "com.abhiandroid.ecommercestore:id/email")
	private MobileElement username;
	
	
	public void loginApp() {
		username.sendKeys("surendra");
	}
	
}
