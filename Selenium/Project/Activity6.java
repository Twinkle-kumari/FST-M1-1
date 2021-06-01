package HRM_Project;


import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Activity6 {
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
    	
    boolean directory = driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']")).isDisplayed();
    if(directory=true) {
    	System.out.println("Directory is visible");
    	
    }
    else {
    System.out.println("Directory is not visible");
    	 }
    driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']")).click();
    }
    
    @Test
    public void Search() {
    String searchdir = driver.findElement(By.xpath("//div[@id='content']/div[1]/div[1]/h1")).getText();
    System.out.println("The heading of the page is : " + searchdir);
    Assert.assertEquals(searchdir, "Search Directory");
    }
    @AfterTest
    public void afterMethod() {
        //Close the browser
        driver.close();
    }
    }
