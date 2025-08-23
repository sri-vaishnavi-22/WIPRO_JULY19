package wipro.fetchfromdatabase;





import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import java.util.logging.LogManager;
 
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;
 
import io.github.bonigarcia.wdm.WebDriverManager;

import io.opentelemetry.api.logs.Logger;

import utilities.LoggerHelper;
 
public class FileReader 

{

	private static final org.apache.logging.log4j.Logger log = LoggerHelper.getLogger(FileReader.class);

	@Test

	public void readfromDBTest() throws ClassNotFoundException, SQLException, InterruptedException {
 
	// fetch the db url , password and username of the my sql db 

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/wipro_db", "root", "root");

		Statement st=con.createStatement();

		String query="select * from persons ";

		// pass the query to result set

		ResultSet rs = st.executeQuery(query);

		while (rs.next()) 

		{

			String usrname = rs.getString("FirstName");

			String paswd = rs.getString("LastName");
 
			ChromeOptions chromeOptions = new ChromeOptions();

			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver(chromeOptions);

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			// name locator 

			// enter text in username field 

			Thread.sleep(4000);

			log.info("Invoking the browser");
 
			WebElement us1 = driver.findElement(By.xpath("//input[@name = 'username']"));

			log.info("Entering the username");

			us1.sendKeys(usrname);

			Thread.sleep(4000);

			// enter text in password field

			WebElement pwd1 = driver.findElement

					(By.xpath("//input[@name = 'password']"));

			log.info("Entering the password");
 
			pwd1.sendKeys(paswd);

			// click on login button

			Thread.sleep(2000);

			WebElement loginbutton = driver.findElement

					(By.xpath("//button[@type = 'submit']"));
 
			loginbutton.click();

			Thread.sleep(2000);
 
		}

	}

}
 