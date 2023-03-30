package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.search.Search;

public class SearchSteps {
    @Steps
    Search search;

    @Given("I have successfully logged into my LinkedIn account")
    public void onTheSearchpage() {
    }

    @When("I enter the username I want to search for in the search field")
    public void EnterUsernameInthesearchfielad() {
    }

    @And("I clicked the \"Search\" button")
    public void ClickSearchBUtton() {
    }

    @Then("I will see search results relevant to the username I'm looking for")
    public void onTheUserSearch() {
    }
}
