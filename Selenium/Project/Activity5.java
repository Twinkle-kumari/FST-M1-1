package HRM_Project;


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


public class Activity5 {
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
    	
    driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='btnSave']")).click();
    
    
    driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).clear();
    driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).sendKeys("Nikhil");
    driver.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']")).clear();
    driver.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']")).sendKeys("Devram");
    driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).clear();  
    driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).sendKeys("Mhatre");
    
    Thread.sleep(2000);
    Boolean gender = driver.findElement(By.xpath("//*[@id=\"personal_optGender_1\"]")).isSelected();
    Boolean male = gender.booleanValue();
    if(male==true) {
    	System.out.println("Male check box Selected");
    }
    
    else {
    	driver.findElement(By.xpath("//*[@id=\"personal_optGender_1\"]")).click();
    }
    Thread.sleep(2000);
    
    // Nationality
    WebElement nationality = driver.findElement(By.xpath("//select[@id='personal_cmbNation']"));
    
    Select select = new Select(nationality);
    //select.selectByValue("4");
    select.selectByVisibleText("American");
    Thread.sleep(2000);
    
    
    // Click on Date picker to open the Calender.
    driver.findElement(By.xpath("//*[@id='frmEmpPersonalDetails']/fieldset/ol[3]/li[4]/img")).click();
    
    // Select month from Calender.
    WebElement month = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]"));
    Select mon = new Select(month); 
    mon.selectByVisibleText("Aug");
    
    // Select Year from Calender.
    WebElement year = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]"));
    Select yr = new Select(year);
    yr.selectByVisibleText("1988");
    
    //Select Day from Calender
    
    driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[1]/a")).click();
    
    driver.findElement(By.xpath("//input[@id='btnSave']")).click();
    
    Thread.sleep(2000);
    }
    
    @AfterTest
    public void afterMethod() {
        //Close the browser
        driver.close();
   
    }
    }
