package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {


    private By accountbutton() {return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]");}

    private By logoutButton() {return By.xpath("/html/body/div[1]/div[1]/header/div/button[2]");}

    private By fieldEmailAcc() {return By.xpath("//div[label[text()='Email']]/input");}

    private By fieldPass() {return By.xpath("//div[label[text()='Password']]/input");}

    private By loginbutton() {return By.xpath("//button/span[text() = 'Login']");}

    private By loginpage() {return By.xpath("//div[text()='Login']");}

    private By buttonLogout() {return By.xpath("/html/body/div[1]/div/header/div/button[2]/span[1]/i");}

    public void buttonlogout() { $(buttonLogout()).click();}

    public void loginPage() { $(loginpage()).isDisplayed();}

    public void loginButton() { $(loginbutton()).click();}

    public void fieldemailacc(String email) { $(fieldEmailAcc()).type(email);}

    public void fieldpass(String password) { $(fieldPass()).type(password);}
    public void loginUrl() {openAt("/auth/login");}

    public void accountButton() { $(accountbutton()).click();}

    public void logoutbutton() { $(logoutButton()).click();}

    public void dashbordUrl() {openAt("/");}

}
