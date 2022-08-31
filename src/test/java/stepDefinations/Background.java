package stepDefinations;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background {
	
		@Given("^Validate the browser$")
	    public void validate_the_browser() throws Throwable {
	        System.out.println("Browser is validated");
	    }

	    @When("^Browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	    	System.out.println("Browser is triggered");
	    }

	    @Then("^Check if browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
	    	System.out.println("Browser is started");
	    }

}
