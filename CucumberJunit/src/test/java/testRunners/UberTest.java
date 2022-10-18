package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/appsFeature/Uber.feature"},
		glue = {"stepDefination"},
		tags =  "@Smoke or @Regression",
		plugin = {"pretty"}	
	)
public class UberTest {

}
