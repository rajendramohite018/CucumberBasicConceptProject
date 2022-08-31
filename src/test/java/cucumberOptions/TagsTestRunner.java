package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features", //"src/test/java/Features//Login.feature",  we can provide feature file to run sepcific file 
    glue = "stepDefinations", stepNotifications= true, 
    tags="@SmokeTest or @WebTest"  // we can run only one tag or multiple tag as well "@SmokeTest or @RegTest", "@SmokeTest"
    								// we can run this way "not @smokeTest"
									// if e.g @SmokeTest @RegTest then use "@SmokeTest and @RegTest"
    
		)

public class TagsTestRunner {
	
}
