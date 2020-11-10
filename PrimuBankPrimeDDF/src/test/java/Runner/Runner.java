package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="./FeatureFiles/BackgroundDemo.feature",
glue="stepDefinitions",
format= {"pretty","html:test-output/background.html","json:json-output/background.json","junit:junit-xml/background.xml"},
dryRun = false,
strict = false
//monochrome=true

)
@Test
public class Runner {
	
} 
 