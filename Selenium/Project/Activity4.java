package HRM_Project;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Activity4 {
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
        
    }
        @Test
        public void PIM() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Nikhil");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Mhatre");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='btnSave']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']")).sendKeys("Nikhil");
        
        driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
        Thread.sleep(2000);
        
        WebElement firstname = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr/td[3]/a"));
        
              
        System.out.println(firstname.getText());
        String name = firstname.getText();
        Assert.assertEquals(name, "Nikhil");
        
        }
        @AfterTest
        public void afterMethod() {
            //Close the browser
            driver.close();
        }
    }
