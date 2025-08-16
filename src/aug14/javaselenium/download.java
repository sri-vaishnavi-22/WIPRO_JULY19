package wipro.javaselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class download {
    public static void main(String[] args) throws InterruptedException {
        
        // Set up ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize window and set implicit wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Open the website
        driver.get("https://the-internet.herokuapp.com/download");
        
        // Click on selenium-snapshot.png link
        driver.findElement(By.xpath("//a[text()='selenium-snapshot.png']")).click();
        
        // Wait for file to download (simple pause)
        Thread.sleep(3000);
        
        // Close browser
        driver.quit();
    }
}
