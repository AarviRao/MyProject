package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination {

	@Given("^User is on NetBanking landing page$")
	public void user_is_on_netbanking_landing_page() {
		System.out.println("Displaed Home Page");
	}

	@When("^User Login into application with username and password$")
	public void user_login_into_application_with_username_and_password() {
		System.out.println("given username and password");
	}

	@Then("^Home Page is Populated$")
	public void home_page_is_populated() {
		System.out.println("Displaed validated");
	}

	/*@Then("^Cards are displayed$")
	public void cards_are_displayed() {
		System.out.println("Validated cards");
	}*/

}