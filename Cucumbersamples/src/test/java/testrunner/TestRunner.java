package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={".//Features//Login.feature"},
		glue="stepdefinitions",
		plugin= {"pretty","html:test-output",
				"json:json_output/cucumber.json",
				"junit:junit_xml_output/cucumber.xml"},
		dryRun=false,
		monochrome=true
		)

public class TestRunner {
	

} 
