package TestRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//This is Testrunner
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = {"StepDefination"},
        format = {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome = true,
		dryRun = true
        )
public class TestRunner {
	
	

}
