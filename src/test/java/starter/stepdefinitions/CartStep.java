package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CartPage;

public class CartStep {

    @Steps
    CartPage cartpage;

    @Given("I am on the dashboard page")
    public void iAmOnTheDashboardPage() {
        cartpage.dashboardPage();
    }

    @When("I click buy button")
    public void iClickBuyButton() {
        cartpage.buybutton();
    }

    @And("I click add button")
    public void iClickAddButton() {
        cartpage.addbuton();
    }

    @Then("I success add my item")
    public void iSuccessAddMyItem() {
        cartpage.successAdd();
    }

    @And("I click reduce button")
    public void iClickReduceButton() {
        cartpage.reducebutton();
    }

    @Then("I succes reduce my item")
    public void iSuccesReduceMyItem() {
        cartpage.successReduce();
    }

    @And("I click cart button")
    public void iClickCartButton() {
        cartpage.cartbutton();
    }
}
