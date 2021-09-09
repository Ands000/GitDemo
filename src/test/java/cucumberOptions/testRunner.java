package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue="stepDefinations",stepNotifications=true,monochrome=true,tags="@RegressionTest",strict=true,
		plugin= {"pretty","html:target/cucumber.html","junit:target/cukes.xml","json:target/cucumber.json"}
		)
public class testRunner {

	
	
}
