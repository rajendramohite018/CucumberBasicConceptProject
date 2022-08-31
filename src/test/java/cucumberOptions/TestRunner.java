package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features",  // it will run all the feature file and apply the background and hooks as well
    glue = "stepDefinations", stepNotifications= true
		)

public class TestRunner {

}
