package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    private By registerButton() { return By.xpath("//div/a[text() = 'Register']");}

    private By fieldNama() { return By.xpath("//div[label[text()='Nama Lengkap']]/input");}

    private By fieldEmail() { return By.xpath("//div[label[text()='Email']]/input");}

    private By fieldPassword() { return By.xpath("//div[label[text()='Password']]/input");}

    private By clickRegisterIcon() { return By.xpath("//div/button/span[text()='Register']");}

    private By errormessageNull() { return By.xpath("/html/body/div[1]/div/main/div/div/div/div[2]/div[1]/div");}

    public void openUrl() {openAt("/auth/login");}

    public void clickRegisterButon() { $(registerButton()).click();}

    public void clickRegistericon() { $(clickRegisterIcon()).click();}

    public void inputNama(String nama) { $(fieldNama()).type(nama);}

    public void inputEmail(String email) { $(fieldEmail()).type(email);}

    public void inputPassword(String password) { $(fieldPassword()).type(password);}

    public void errormessagenull() { $(errormessageNull()).isDisplayed();}


}
