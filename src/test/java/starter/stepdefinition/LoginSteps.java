package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Given("I'm on the main LinkedIn page")
    public void onTheLoginPage() {
    }

    @When("I click the \"Login\" button")
    public void EnterUsenameAndPassword() {
    }

    @And("I entered a valid email and password")
    @And("I chose the login option with a Google or Microsoft account")
    @And("I clicked the \"Login\" button")
    public void ClickLoginBUtton() {
    }

    @Then("I will be able to successfully login to my LinkedIn account")
    public void onTheHomePage() {
    }
}
