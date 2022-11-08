package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.BeliPage;

public class BeliStep {
    @Steps
    BeliPage beliPage;
    @Given("I am on dashboard")
    public void iAmOnDashboard() {
        beliPage.dashboard();
    }

    @When("I click buy buttonn")
    public void iClickBuyButtonn() {
        beliPage.clickBuy();
    }

    @Then("My item added to my cart")
    public void myItemAddedToMyCart() {
        beliPage.addchart();
    }
}
