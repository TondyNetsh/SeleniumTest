package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinitions {
    @Given("^User is on google homepage$")
    public void user_is_on_google_homepage() throws Throwable {
        System.out.println("User is on google homepage");
    }

    @Then("User searches for selenium framework")
    public void userSearchesForSeleniumFramework() {
        System.out.println("User enters a word or sentence");

    }

    @And("User clicks on the search button")
    public void userClicksOnTheSearchButton() {
        System.out.println("User clicks on the search button");
    }
}
