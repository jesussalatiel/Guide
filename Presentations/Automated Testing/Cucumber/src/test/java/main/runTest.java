package main;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/features/search.feature", glue = "steps")
public class runTest extends AbstractTestNGCucumberTests {

}
