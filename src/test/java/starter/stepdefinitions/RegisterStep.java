package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterPage;

public class RegisterStep {
    @Steps
    RegisterPage registerPage;

    @Given("I am on the login pagee")
    public void iAmOnTheLoginPagee() {
        registerPage.openUrl();
    }

    @When("I click register buttonn")
    public void iClickRegisterButtonn() {
        registerPage.clickRegisterButon();
    }

    @And("I input null namaa")
    public void iInputNullNamaa() {
        registerPage.inputNama("");
    }

    @And("I input null emaill")
    public void iInputNullEmaill() {
        registerPage.inputEmail("");
    }

    @And("I input null passwordd")
    public void iInputNullPasswordd() {
        registerPage.inputPassword("");
    }

    @Then("I will get error message nul")
    public void iWillGetErrorMessageNul() {
        registerPage.errormessagenull();
    }

    @And("I click register iconn")
    public void iClickRegisterIconn() {
        registerPage.clickRegistericon();
    }

    @And("I input valid nama")
    public void iInputValidNama() {
        registerPage.inputNama("yusuf");
    }

    @And("I input valid emaill")
    public void iInputvalidemaill() {
        registerPage.inputEmail("mochyusufefendi25@gmail.com");
    }

    @And("I input valid passwordd")
    public void iInputValidPasswordd() {
        registerPage.inputPassword("akunsaya");
    }
}
