package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginStep {

    @Steps
    LoginPage loginPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openUrl();
    }

    @When("I input null email")
    public void iInputNullEmail() {
        loginPage.inputEmail("");
    }

    @And("I input null password")
    public void iInputNullPassword() {
        loginPage.inputPassword("");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickloginBtn();
    }

    @Then("I will get error message")
    public void iWillGetErrorMessage() {
        loginPage.errorMessageDisplayed();
    }

    @When("I input valid email")
    public void iInputValidEmail() {
        loginPage.inputEmail("yusuffe92@gmail.com");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginPage.inputPassword("yusuf09876");
    }

    @Then("I success login")
    public void iSuccessLogin() {
        loginPage.successLogin();
    }

    @When("I input invalid email")
    public void iInputInvalidEmail() {
        loginPage.inputEmail("yusuffe92@gmail.co");
    }

    @And("I input invalid password")
    public void iInputInvalidPassword() {
        loginPage.inputPassword("yusufyusuf");
    }

    @Then("I will get record not found message")
    public void iWillGetRecordNotFoundMessage() {
        loginPage.recordNotFound();
    }

    @Then("I will get error message is invalid")
    public void iWillGetErrorMessageIsInvalid() {
        loginPage.errorMessageIsInvalid();
    }

    @Then("I will get error message password is required")
    public void iWillGetErrorMessagePasswordIsRequired() {
        loginPage.errorpasswordIsRequired();
    }

    @Then("I will get error message email is required")
    public void iWillGetErrorMessageEmailIsRequired() {
        loginPage.erroremailIsRequired();

    }
}
