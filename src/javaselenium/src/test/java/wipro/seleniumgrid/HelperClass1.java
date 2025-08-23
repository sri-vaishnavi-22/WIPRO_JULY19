package wipro.seleniumgrid;
import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

public class HelperClass1 {

	// remote web driver to support remote computers and browsers

	// Thread local is for the parallel execution support

	protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();

	public static String remote_url = " http://10.143.47.164:4444";

	@BeforeMethod

	public void setDriver() throws MalformedURLException {

		FirefoxOptions options1 = new FirefoxOptions();
 
		driver.set(new RemoteWebDriver(new URL(remote_url), options1));
 
		driver.get().get("https://opensource-demo.orangehrmlive.com/");
 
		driver.get().manage().window().maximize();

	}

	public WebDriver getDriver() {

		return driver.get();

	}

	@AfterMethod

	public void closeBrowser() {

		//driver.get().quit();

		//driver.remove();

	}

}
 