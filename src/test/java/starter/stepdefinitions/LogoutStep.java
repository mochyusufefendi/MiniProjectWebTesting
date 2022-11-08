package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LogoutPage;

public class LogoutStep {
    @Steps
    LogoutPage logoutPage;

    @Given("I am on the dashboard")
    public void iAmOnTheDashboard() {
        logoutPage.dashbordUrl();
    }

    @And("I click logout button")
    public void iClickLogoutButton() {
        logoutPage.logoutbutton();
    }

    @When("I click account button")
    public void iClickAccountButton() {
        logoutPage.accountButton();
    }

    @Given("I am on the login Page")
    public void iAmOnTheLoginPage() {
        logoutPage.loginUrl();
    }

    @When("I input valid Email")
    public void iInputValidEmail() {
        logoutPage.fieldemailacc("yusuffe92@gmail.com");
    }

    @And("I input valid Password")
    public void iInputValidPassword() {
        logoutPage.fieldpass("yusuf09876");
    }

    @And("I click login Button")
    public void iClickLoginButton() {
        logoutPage.loginButton();
    }

    @Then("I see the login page")
    public void iSeeTheLoginPage() {
        logoutPage.loginPage();
    }


    @And("I click logout Buttonn")
    public void iClickLogoutButtonn() {
        logoutPage.buttonlogout();
    }

}
