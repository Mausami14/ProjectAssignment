package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/feature"},
		glue ="stepDefination",
		monochrome=true,
		plugin= {"html:target/cucumber.html"})
public class TestRunner {
	

}
