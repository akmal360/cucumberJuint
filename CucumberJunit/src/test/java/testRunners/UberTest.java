package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/appsFeature/Uber.feature" }, 
				glue = { "stepDefinations" },
		// tags = "@Smoke or @Regression",
				plugin = { "pretty", "json:target/myReports/report.json",
				"junit:target/myReports/report.xml" },
				monochrome = false, 
				dryRun = false
// plugin = { "pretty"}
)

public class UberTest {

}
