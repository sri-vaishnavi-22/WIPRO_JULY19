package wipro.javaselenium;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
 
 
public class Radioeg {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co=new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		WebDriver driver= new ChromeDriver(co);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement Radio3 = driver.findElement(By.xpath("//input[@value='radio3']"));

		Radio3.click();

		Thread.sleep(2000);

	}
 
}

 