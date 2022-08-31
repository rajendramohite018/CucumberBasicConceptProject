package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/java/Features//AccountLogin.feature",    //Login.feature
	    glue = "stepDefinations")
public class TestNG_TestRunner extends AbstractTestNGCucumberTests {

}