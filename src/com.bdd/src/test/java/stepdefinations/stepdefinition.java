
package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.driverfactory;

public class stepdefinition {
	WebDriver driver = driverfactory.getDriver();
	/*@Given("User is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
				
			}
		
	   
	    @When("user enters the username")
	public void user_enters_the_username() throws InterruptedException {
	    	//usernamecode
	    	Thread.sleep(2000);
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		
	   
	}

	@When("user enters teh password")
	public void user_enters_teh_password() throws InterruptedException {
		//passwordcode
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		Thread.sleep(2000);
		
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() throws InterruptedException {
         //logginbutton
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        button.click();
        Thread.sleep(8000);
		
	    
	}

	@Then("user is naqvigated to home page")
	public void user_is_naqvigated_to_home_page() throws InterruptedException {
		//homepage navigation
		WebElement admin = driver.findElement(By.xpath("//li[1]//a[1]//span[1]"));
		Thread.sleep(8000);
		 
		if (admin.isDisplayed()) {
			System.out.println("User is on the home page");
		} else {
 
			System.out.println("User is not on the home page");
		}
	    
	}
	
	@When("the user enters invalid username")
	public void the_user_enters_invalid_username() throws InterruptedException {
		//usernamecode
    	Thread.sleep(2000);
	WebElement username=driver.findElement(By.name("username"));
	username.sendKeys("Adm");
	Thread.sleep(2000);
	}

	@When("the user enters invalid password")
	public void the_user_enters_invalid_password() throws InterruptedException {
		//passwordcode
				WebElement password=driver.findElement(By.name("password"));
				password.sendKeys("admin1");
				Thread.sleep(5000);
	}

	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() throws InterruptedException {
		//logginbutton
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        button.click();
        Thread.sleep(10000);
	}

	@Then("an error message should be displayed")
	public void an_error_message_should_be_displayed() throws InterruptedException {
 
			WebElement errorMsg = driver.findElement(By.xpath("//p[contains(@class,'oxd-alert-content-text')]"));
            if (errorMsg.isDisplayed()) {
                System.out.println("Error displayed: " + errorMsg.getText());
            } else {
                System.out.println("Expected error not displayed");
            }
	}
	
	@When("user enters the {string} and {string}")
	public void user_enters_the(String username , String password ) throws InterruptedException {
		WebElement username1 = driver.findElement(By.name("userame"));
		Thread.sleep(8000);
 
		username1.sendKeys(username);
 
		Thread.sleep(8000);

 
		WebElement password1 = driver.findElement(By.name("password"));
 
		password1.sendKeys(password);
 
		Thread.sleep(8000);
		*/
	
	
	}