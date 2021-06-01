package HRM_Project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Activity1 {
    WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
            
        //Open the browser
        driver.get("http://alchemy.hguy.co/orangehrm");
        
        //driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
        //driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
        
        //username.sendKeys("orange");
        //password.sendKeys("orangepassword123");
        
        //driver.findElement(By.id("divLoginButton")).click();    
    }
        @Test
        public void gettitle() {
        String title = driver.getTitle();
       
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "OrangeHRM");
        }
        @AfterTest
        public void afterMethod() {
            //Close the browser
            driver.close();
        }
    }
             
    
