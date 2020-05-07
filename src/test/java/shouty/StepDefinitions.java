package shouty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	@Given("Lucy is located {int} mts from Sean")
	public void lucy_is_located_mts_from_Sean(Integer distance) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Given Lucy is located 15 mts from Sean");
	}

	@When("Sean shouts {string}")
	public void sean_shouts(String message) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When Sean shouts "+message);
	}

	@Then("Lucy hears Sean's message")
	public void lucy_hears_Sean_s_message() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Lucy hears Sean's message");
	}
}
