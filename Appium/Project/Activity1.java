package Appium_Project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.WebDriver;
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

public class Activity1 {
	
	AndroidDriver<MobileElement> driver = null;
	
    
    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "PixelEmulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL remoteURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(remoteURL, caps);
       
    }

    @Test
    public void Task() {
    	WebDriverWait wait = new WebDriverWait(driver, 20);
    	String[] tasks = {"Complete Activity with Google Tasks",
    					  "Complete Activity with Google Keep",
    					  "Complete the second Activity Google Keep"};
    	
    	//Adding Tasks 
    	for(String task : tasks) {
    	wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab")));	
        driver.findElementById("tasks_fab").click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));
        driver.findElementById("add_task_title").sendKeys(task);
        driver.findElementById("add_task_done").click();
    	}
        
              
        //Display Result
    	wait.until(ExpectedConditions.numberOfElementsToBe(MobileBy.id("task_name"), 3));
        List<MobileElement> result = driver.findElementsById("task_name");
        Assert.assertEquals(result.size(),3);
        System.out.println(result.get(0).getText());
        System.out.println(result.get(0).getText());
        System.out.println(result.get(0).getText());
        Assert.assertEquals(result.get(0).getText(), "Complete the second Activity Google Keep");
        Assert.assertEquals(result.get(1).getText(), "Complete Activity with Google Keep");
        Assert.assertEquals(result.get(2).getText(), "Complete Activity with Google Tasks");
        
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
