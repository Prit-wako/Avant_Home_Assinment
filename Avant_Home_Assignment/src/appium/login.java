package appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class login extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=Capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
	driver.findElementById("com.healthengine.android:id/log_in").click();
	driver.findElementByXPath("//android.widget.EditText[@text='Email']").sendKeys("testuser7889@gmail.com");
	driver.findElementById("com.healthengine.android:id/password_text_entry").sendKeys("Sydney123!");
	driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
	
			
		
	}

}
