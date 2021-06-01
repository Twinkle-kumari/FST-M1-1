package HRM_Project;

import static org.testng.Assert.assertEquals;

import java.util.List;
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

public class Activity9 {
	WebDriver driver;

	@BeforeTest
	public void beforeMethod() throws InterruptedException {
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open the browser
		driver.get("http://alchemy.hguy.co/orangehrm");

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");

		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
	}

	@Test
	public void PIM() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id='menu_pim_viewMyDetails']")).click();
		driver.findElement(By.xpath("//*[@id='sidenav']/li[3]/a")).click();

		// Grab the table
		WebElement table = driver.findElement(By.xpath("//*[@id='emgcontact_list']"));
		// Get all the table rows
		List<WebElement> allrows = table.findElements(By.tagName("tr"));

		// And iterate over them, getting the cells

		for (WebElement row : allrows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));

			System.out.println("---------------------Emergency Contact Details are ------------------------------ : ");

			for (WebElement cell : cells) {

				System.out.println(cell.getText());

			}
		}

	}

	@AfterTest
	public void afterMethod() {
		// Close the browser
		driver.close();
	}
}
