package tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium {

	WebDriver driver;
	String host = "http://localhost:4444/wd/hub";
	String url = "https://www.google.com/";
	By tagName = By.name("q");
	WebElement element = null;

	String search = "Devops";

	
	@Test(priority = 1)
	public void chrome() throws MalformedURLException, InterruptedException {
		driver = new RemoteWebDriver(new URL(host), DesiredCapabilities.chrome());
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		element = driver.findElement(tagName);
		element.sendKeys(search);
		element.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		System.out.println("WebDriver: " + driver.getTitle());
	}

	@Test(priority = 2)
	public void firefox() throws MalformedURLException, InterruptedException {
		driver = new RemoteWebDriver(new URL(host), DesiredCapabilities.firefox());
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		element = driver.findElement(tagName);
		element.sendKeys(search);
		element.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		System.out.println("WebDriver: " + driver.getTitle());
	}

	@AfterTest
	public void afterMethod() throws InterruptedException {

		driver.quit();

	}

}
