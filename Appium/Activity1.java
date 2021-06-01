
package Activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
	
	AndroidDriver<MobileElement> driver = null;
    
    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "PixelEmulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL remoteURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(remoteURL, caps);
    }

    @Test
    public void multiply() {
        driver.findElementById("com.android.calculator2:id/digit_7").click();
        driver.findElementById("com.android.calculator2:id/op_mul").click();
        driver.findElementById("com.android.calculator2:id/digit_4").click();
        driver.findElementById("com.android.calculator2:id/eq").click();
        
        //Display Result
        String result = driver.findElementById("result").getText();
        System.out.println(result);
        Assert.assertEquals(result, "28");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
