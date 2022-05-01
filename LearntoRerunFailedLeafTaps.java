package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearntoRerunFailedLeafTaps extends BaseClass {

	
	  @Test(timeOut = 1150) public void createLead() throws InterruptedException {
	  int ranNum = (int) (Math.random() * 1000);
	  
	  driver.findElement(By.linkText("Create Lead")).click();
	  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Retry");
	  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Failed");
	  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Testing");
	  driver.findElement(By.name("submitButton")).click();
	  
	  Thread.sleep(ranNum); 
	  }
	  
	  @Test public void editLead() throws InterruptedException{
	  driver.findElement(By.linkText("Find Leads")).click();
	  driver.findElement(By.xpath("//span[text()='Phone']")).click();
	  driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
	  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	  Thread.sleep(2000); driver.findElement(By.
	  xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	  driver.findElement(By.linkText("Edit")).click();
	  driver.findElement(By.id("updateLeadForm_companyName")).clear();
	  driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Edit_Retry"
	  ); driver.findElement(By.name("submitButton")).click(); }
	  
	  @Test public void deleteLead() throws InterruptedException {
	  driver.findElement(By.linkText("Find Leads")).click();
	  driver.findElement(By.xpath("//span[text()='Phone']")).click();
	  driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
	  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	  Thread.sleep(2000); String leadID = driver.findElement(By.
	  xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	  
	  driver.findElement(By.
	  xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.linkText("Delete")).click();
	  driver.findElement(By.linkText("Find Leads")).click();
	  driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	  Thread.sleep(2000); String actMsg =
	  driver.findElement(By.className("x-paging-info")).getText(); String expMsg =
	  "No records to display"; Assert.assertEquals(actMsg, expMsg);
	  
	  
	  }
	  
	  @Test
	public void duplicateLead() throws InterruptedException {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();

	}

}