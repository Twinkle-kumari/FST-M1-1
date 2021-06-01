package Appium_Project;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class Activity5 {
	
	AndroidDriver<MobileElement> driver = null;
	WebDriverWait wait;
	
    
    @BeforeClass
    public void beforeClass() throws MalformedURLException
    {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "PixelEmulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL remoteURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(remoteURL, caps);
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    
        @Test (priority=1)
        public void Successful() {
        	
        	wait = new WebDriverWait(driver,20);
        	
        	System.out.println("Valid Credentials : Successful Login");
        	
        	wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[1]")));
        	
        	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.EditText[1]").sendKeys("admin");
        	       	
        	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.EditText[2]").sendKeys("password");
        	
        	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.Button").click();
        	       	
        	
        	// assertions
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	WebElement message = driver.findElement(By.xpath("//*[@text='Welcome Back, admin']"));
        	System.out.println(message.getText());
        	Assert.assertEquals(message.getText(), "Welcome Back, admin");
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        }
        
        @Test (priority=2)
        public void Clear() 
        {
        	
        	// Clear the fields
        	
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.widget.EditText[1]").clear();
	       	
        	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.widget.EditText[2]").clear();
            
        	System.out.println("Clear Credentials : Credentials Cleared");
        	
        	        	
        }
        
        @Test (priority=3) 
        public void Failure() {
        	
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	
        	System.out.println("InValid Credentials : Unsuccessful Login ");
        	
        	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.widget.EditText[1]").sendKeys("admin");
        	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.widget.EditText[2]").sendKeys("passwrd");
        	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.widget.Button").click();
        	
        	// assertions
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	WebElement msg = driver.findElement(By.xpath("//*[@text='Invalid Credentials']"));
        	System.out.println(msg.getText());
        	Assert.assertEquals(msg.getText(), "Invalid Credentials");
        }
        
        @AfterClass
        public void afterClass() {
        	driver.quit();
    
    }
    }
