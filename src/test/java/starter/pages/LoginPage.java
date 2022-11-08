package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By fieldEmail() { return By.xpath("//div[label[text()='Email']]/input");}

    private By fieldPassword() { return By.xpath("//div[label[text()='Password']]/input");}

    private By loginButton() { return By.xpath("//button/span[text() = 'Login']");}

    private By errorMesage() { return By.xpath("//div[text() = ' email is required ']");}

    private By recordNotfound() { return By.xpath("//div[text() = ' record not found ']");}

    private By errorMesageisinvalid() { return By.xpath("//div[text() = ' email or password is invalid ']");}

    private By errorpasswordIsrequired() { return By.xpath("//div[text() = ' password is required ']");}

    private By erroremailIsrequired() { return By.xpath("//div[text() = ' email is required ']");}


    public void openUrl() {openAt("/auth/login");}

    public void inputEmail(String email) { $(fieldEmail()).type(email);}

    public void inputPassword(String password) { $(fieldPassword()).type(password);}

    public void clickloginBtn() { $(loginButton()).click();}

    public void errorMessageDisplayed() { $(errorMesage()).isDisplayed();}

    public void recordNotFound() { $(recordNotfound()).isDisplayed();}

    public void errorMessageIsInvalid() { $(errorMesageisinvalid()).isDisplayed();}

    public void errorpasswordIsRequired() { $(errorpasswordIsrequired()).isDisplayed();}

    public void erroremailIsRequired() { $(erroremailIsrequired()).isDisplayed();}

    public void successLogin(){}
}
