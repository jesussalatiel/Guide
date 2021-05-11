package main;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import io.github.bonigarcia.wdm.WebDriverManager;

//https://www.extentreports.com/docs/versions/5/java/index.html
//https://www.toolsqa.com/extent-report/extent-report-for-cucumber-testng-project/
//https://www.youtube.com/watch?v=Rduh69SfD4Q
public class ReportTest {

	private ExtentTest test;
	private ExtentReports extent;
	private WebDriver driver;
	private ExtentSparkReporter spark;

	private String PATH_FILE = System.getProperty("user.dir") + "//target//";

	@BeforeTest
	public void startTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();

		extent = new ExtentReports();
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Author", "Jesus Salatiel");
		extent.setSystemInfo("User Name", "jesus.bustamante");
		extent.setSystemInfo("Environment", "QA");

		spark = new ExtentSparkReporter(PATH_FILE + "Report.html").viewConfigurer().viewOrder().as(
				new ViewName[] { ViewName.DASHBOARD, ViewName.TEST, ViewName.AUTHOR, ViewName.DEVICE, ViewName.LOG })
				.apply();

		spark.config().setTheme(Theme.STANDARD);
		spark.config().setTimelineEnabled(true);
		spark.config().setEncoding("utf-8");
		spark.config().setProtocol(Protocol.HTTPS);
		spark.config().setDocumentTitle("Regression Report");
		spark.config().setReportName("Jesus Salatiel ");
		extent.attachReporter(spark);

		driver.get("https://www.google.com");
		test = extent.createTest("Cucumber").assignAuthor("Jesus Salatiel").assignCategory("Regression")
				.assignDevice(caps.getBrowserName() + "-" + caps.getVersion());

	}

	@Test
	public void extentReportsDemo() {

		if (driver.getTitle().equals("Google")) {
			test.createNode("Step One").pass("Into to Google").addScreenCaptureFromPath(capture(driver));

		}
	}

	@Test
	public void extentReportsDemo2() {

		if (driver.getTitle().equals("Gogle")) {
			test.createNode("Step Two").pass("Can't into Google").addScreenCaptureFromPath(capture(driver));
		}
	}

	@AfterClass
	public void endTest() {
		if (driver != null) {
			extent.flush();
			driver.quit();
		}
	}

	public String capture(WebDriver driver) {
		String errflpath = null;
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File Dest = new File(PATH_FILE + "Images//" + System.currentTimeMillis() + ".png");
			errflpath = Dest.getAbsolutePath();
			FileUtils.copyFile(scrFile, Dest);
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		return errflpath;
	}
}
