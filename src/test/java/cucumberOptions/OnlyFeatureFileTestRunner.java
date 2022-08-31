package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features//AccountLogin.feature", //"src/test/java/Features//Login.feature",  we can provide feature file to run sepcific file 
    glue = "stepDefinations", stepNotifications= true
		)

public class OnlyFeatureFileTestRunner {

}
