package HRM_Project;


import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Activity7 {
    WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() throws InterruptedException {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
        //Open the browser
        driver.get("http://alchemy.hguy.co/orangehrm");
       
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
        
      
        driver.findElement(By.id("btnLogin")).click(); 
        Thread.sleep(2000);
    }   
    @Test
    public void PIM() throws InterruptedException {
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
    driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
    Thread.sleep(2000);    
    js.executeScript("window.scrollBy(0,1000)");   
    Thread.sleep(2000); 
    
    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[9]/a")).click();
    Thread.sleep(2000); 
    driver.findElement(By.xpath("//input[@id='addWorkExperience']")).click();
    Thread.sleep(2000); 
    driver.findElement(By.xpath("//input[@id='experience_employer']")).sendKeys("IBM India");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='experience_jobtitle']")).sendKeys("Project Lead");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='btnWorkExpSave']")).click();
    Thread.sleep(2000);
    
    
    }
    
    
    @AfterTest
    public void afterMethod() {
        //Close the browser
        driver.close();
    }
    }
