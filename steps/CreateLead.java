package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {
					
		@When("Click on CRMSFA and Leads")
		public void clickOn_CRMSFAandLeads() throws InterruptedException{
			Thread.sleep(2000);
			driver.findElement(By.linkText("CRM/SFA")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Leads")).click();

		}

		@When("Click on Create Lead")
		public void clickOnCreateLead() {
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cucumber");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Leadpage");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		}

		@Then("Enter required details and click Submit")
		public void leadSubmit() {

			driver.findElement(By.name("submitButton")).click();
			driver.close();
		}

		
	}

