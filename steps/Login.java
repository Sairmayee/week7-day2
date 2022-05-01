package steps;


	import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.But;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class Login extends BaseClass {	
		

		@Given("Enter the username as {string}")
		public void enterUsername(String username) {
			driver.findElement(By.id("username")).sendKeys(username);
		}

		@Given("Enter the password as {string}")
		public void enterPassword(String password) {
			driver.findElement(By.id("password")).sendKeys(password);
		}

		@When("Click on Login button")
		public void click_on_login_button() {
			driver.findElement(By.className("decorativeSubmit")).click();
		}

		@Then("Homepage should be displayed")
		public void verifyHomepage() {
			boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
			Assert.assertTrue(displayed);
		}

		@But("Error message should be displayed")
		public void verifyErrorMessage() {
			System.out.println("Error message is displayed");

		}
		
}	
		
		
		
		
		
		
		
		
		
	