package stepdefinations;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pages.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.driverfactory;

public class datatableastepdefinition {
	WebDriver driver = driverfactory.getDriver();
	loginpage lp = new loginpage(driver);
	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}


		@When("user enters credentials")
		public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	 
			
	 
			List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);
	 
			for (Map<String, String> user : users) {

	 
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
				Thread.sleep(10000);
	 
				String username = user.get("username");

				String password = user.get("password");
	 
				WebElement username1 = driver.findElement(By.name("username"));
	 
				Thread.sleep(4000);
	 
				username1.sendKeys(username);
	 
				Thread.sleep(2000);
	 
				WebElement password1 = driver.findElement(By.name("password"));
	 
				password1.sendKeys(password);
	 
				Thread.sleep(2000);
	 
				

	 
		}
	 
	 
	}

	
	

}