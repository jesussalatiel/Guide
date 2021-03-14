package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;




public class SearchSteps {

	WebDriver driver;

	@Given("the user is in the index page")
	public void theUserIsInIndexPage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
	}

	@When("the user enters (.*) in the search bar")
	public void userEnterDressesInSearchBar(String articles) {
		driver.findElement(By.id("search_query_top")).sendKeys(articles);
	}

	@When("the user clicks the search button")
	public void theUserClickTheSearchButton() {
		driver.findElement(By.name("submit_search")).click();
	}

	@Then("the (.*) page appears")
	public void theDressesPagesAppear(String articles) {
		String title = driver.findElement(By.className("lighter")).getText();
		Assert.assertEquals(title, "\"" + articles.toUpperCase() + "\"");
	}

	@Then("Close Browser")
	public void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}

}
