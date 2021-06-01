package Appium_Project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2 {
	
	AndroidDriver<MobileElement> driver = null;
	
    
    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "PixelEmulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL remoteURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(remoteURL, caps);
       
    }

    @Test
    public void Task() {
    	WebDriverWait wait = new WebDriverWait(driver, 20);
    	
    	
    	//Adding Tasks 
    	
    	// ---- Create Notes
    	
    	wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("new_note_button")));	
        driver.findElementById("new_note_button").click();
        
        // ---- Title 
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("editable_title")));
        driver.findElementById("editable_title").click();                 
        driver.findElementById("editable_title").sendKeys("Nikhil Notes");
        
       
        // ---- Notes
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("edit_note_text")));
        driver.findElementById("edit_note_text").sendKeys("This is my notes for Appium Project");
        
        driver.findElementByAccessibilityId("Open navigation drawer").click();
    	
        
              
        //Display Result
    	wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("index_note_title")));
    	String result = driver.findElementById("index_note_title").getText();
    	System.out.println(result);
    	Assert.assertEquals(result, "Nikhil Notes");
        
      
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
