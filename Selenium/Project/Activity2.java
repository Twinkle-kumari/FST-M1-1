package HRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Print the url of the header image to the console
public class Activity2 {
    WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() throws InterruptedException {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
            
        //Open the browser
        driver.get("http://alchemy.hguy.co/orangehrm"); 
        
        Thread.sleep(2000);
           
    }
        @Test
        public void getUrl() {
        String url = driver.getCurrentUrl();
        System.out.println("The Current URL of Homepage is : " + url);
        Assert.assertEquals(url, "http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
        
        WebElement loc = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        String location = loc.getAttribute("src");
         System.out.println("The Image URL on homepage is : "+location);
        	
        	
        }
        @AfterTest
        public void afterMethod() {
            //Close the browser
            driver.close();
        }
    }
             
    
