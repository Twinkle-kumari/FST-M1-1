package HRM_Project;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.JavascriptExecutor;
import java.util.List;
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

public class Activity8 {
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

		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//a[@id='menu_dashboard_index']")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[4]/div/a/img")).click();
		Thread.sleep(2000);

		// Select Leave Type from Dropdown
		WebElement leavetype = driver.findElement(By.xpath("//*[@id=\"applyleave_txtLeaveType\"]"));
		Select leave = new Select(leavetype);
		leave.selectByVisibleText("Paid Leave");
		Thread.sleep(2000);

		// Select Date Type from Date field

		driver.findElement(By.xpath("//*[@id='frmLeaveApply']/fieldset/ol/li[3]/img")).click();
		WebElement month = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select fromdate = new Select(month);
		fromdate.selectByVisibleText("May");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]")).click();
		WebElement year = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
		Select date = new Select(year);
		date.selectByVisibleText("2021");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[1]/a")).click();

// Select Date Type To Date field

		driver.findElement(By.xpath("//*[@id='frmLeaveApply']/fieldset/ol/li[4]/img")).click();
		WebElement mon = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select todate = new Select(mon);
		todate.selectByVisibleText("May");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]")).click();
		WebElement yr = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
		Select dt = new Select(yr);
		dt.selectByVisibleText("2021");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='applyBtn']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='menu_leave_viewLeaveModule']")).click();
		driver.findElement(By.xpath("//*[@id='menu_leave_viewMyLeaveList']")).click();

		// Search Leaves

		driver.findElement(By.xpath("//*[@id='frmFilterLeave']/fieldset/ol/li[1]/img")).click();
		WebElement searchmonth = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select searchfromdate = new Select(searchmonth);
		searchfromdate.selectByVisibleText("May");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]")).click();
		WebElement searchyear = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
		Select searchdate = new Select(searchyear);
		searchdate.selectByVisibleText("2021");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[1]/a")).click();

// Select Date Type To Date field

		driver.findElement(By.xpath("//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[2]/img")).click();
		WebElement searchmon = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
		Select searchtodate = new Select(searchmon);
		searchtodate.selectByVisibleText("May");
		Thread.sleep(2000);

		WebElement searchyr = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
		Select searchdt = new Select(searchyr);
		searchdt.selectByVisibleText("2021");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[5]/a")).click();

		// driver.findElement(By.xpath("//*[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")).click();

		// driver.findElement(By.xpath("//*[@id='leaveList_chkSearchFilter_1']")).click();

		driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).click();

		// Grab the table
		WebElement table = driver.findElement(By.xpath("//*[@id=\"resultTable\"]"));

		// Now get all the TR elements from the table
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		// And iterate over them, getting the cells
		for (WebElement row : allRows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));

			System.out.println("MyLeave for Month of May 2021 are :  ");

			for (WebElement cell : cells) {

				System.out.println(cell.getText());

			}
			System.out.println();
		}

	}

	@AfterTest
	public void afterMethod() {
		// Close the browser
		driver.close();
	}
}
