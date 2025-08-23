package wipro.javaselenium;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.interactions.Actions;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Keyboardevents {

	public static WebDriver driver;

	public static void main(String[] args) {

		try {

			ChromeOptions chromeOption = new ChromeOptions();

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver(chromeOption);

			driver.get("https://www.facebook.com/");

			//Maximize the window

			driver.manage().window().maximize();

			//Action class is used to simulate the mouse related activities

			Actions act = new Actions(driver);

			Thread.sleep(2000);


			WebElement email = driver.findElement(By.xpath("//input[@id='email']"));

			act.moveToElement(email).keyDown(Keys.SHIFT).sendKeys

			("hello").keyUp(Keys.SHIFT).build().perform();

			Thread.sleep(2000);

			WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));

			act.moveToElement(password).click().sendKeys("hi").release().build().perform();


			Thread.sleep(2000);


		}catch(Exception e){

			System.out.println(e);

		}

		finally {

			driver.quit();

		}

	}

}
