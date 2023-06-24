package factory;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage {
	
	//i want to define onnly page locators + desired logics which we need to perform
	
	
	AppiumDriver driver;
	public LoginPage(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@iOSXCUITFindBy(accessibility = "Alert Views")
	@AndroidFindBy(accessibility = "test-LOGIN")
	private MobileElement signButton;
	
	
	public void navigateLoginScreen() {
		signButton.click();
	}
	
	

}
