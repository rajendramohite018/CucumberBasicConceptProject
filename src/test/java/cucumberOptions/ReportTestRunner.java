package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features",  
    glue = "stepDefinations", stepNotifications= true, 
    tags="@SmokeTest or @WebTest",//dryRun=true,  // dryRun will use for check mapping (stepdefination) is done or not
   // monochrome=true, // it will show good view result
    plugin= {"pretty","html:target/cucumber.html"} //for json report json:target/cucumber.json for xml report Junit:target/cakes.xml
    							
   	)

public class ReportTestRunner {

}
