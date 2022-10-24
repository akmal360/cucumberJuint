package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/appsFeature/Registration.feature" }, 
		glue = { "stepDefinations"},
		plugin = { "pretty", 
							"json:target/myReports/report.json", 
							"junit:target/myReports/report.xml" },
		publish = true,
		monochrome = false,
		dryRun=false
				
		)

public class RegistrationTest {

}
