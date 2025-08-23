package aug18;

import java.time.Duration;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
 
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class ShoppingCartAutomation {
 
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions chromeOption = new ChromeOptions();

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOption);

		driver.get("https://www.demoblaze.com/index.html");

		//Maximize the window

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement samPhone = driver.findElement(By.xpath("//a[normalize-space()='Samsung galaxy s7']"));

		samPhone.click();

		WebElement phone = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));

		phone.click();

		Thread.sleep(2000);

		Alert alt = driver.switchTo().alert();

		alt.accept();

		WebElement home = driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']"));

		home.click();

		WebElement laptops = driver.findElement(By.xpath("//a[3]"));

		laptops.click();

		WebElement Applelaptop = driver.findElement(By.xpath("//a[normalize-space()='MacBook Pro']"));

		Applelaptop.click();

		WebElement macbookpro = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));

		macbookpro.click();

		Thread.sleep(2000);

		Alert alt1 = driver.switchTo().alert();

		alt1.accept();

		WebElement adc = driver.findElement(By.xpath("//a[@id='cartur']"));

		adc.click();

		WebElement order = driver.findElement(By.xpath("//button[normalize-space()='Place Order']"));

		order.click();

		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));

		name.sendKeys("Sireesha");

		WebElement country = driver.findElement(By.xpath("//input[@id='country']"));

		country.sendKeys("India");

		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));

		city.sendKeys("West Godavari");

		Thread.sleep(2000);

		WebElement creditcard = driver.findElement(By.xpath("//input[@id='card']"));

		creditcard.sendKeys("0000 0000 0000");

		Thread.sleep(2000);

		WebElement month = driver.findElement(By.xpath("//input[@id='month']"));

		month.sendKeys("August");

		Thread.sleep(2000);

		WebElement year = driver.findElement(By.xpath("//input[@id='year']"));

		year.sendKeys("2025");

		Thread.sleep(2000);

		WebElement purchase = driver.findElement(By.xpath("//button[normalize-space()='Purchase']"));

		purchase.click();

        WebElement ok = driver.findElement(By.xpath("//button[normalize-space()='OK']"));

		ok.click();

		Thread.sleep(2000);

	}
 
}
 