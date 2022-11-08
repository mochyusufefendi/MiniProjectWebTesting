package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CartPage extends PageObject {

    private By buyButton() { return By.xpath("//button/span[text() = 'Beli'][1]");}

    private By addButton() {return By.xpath("//button/span[text() = '+']");}

    private By reduceButton() {return By.xpath("//button/span[text() = '-']");}

    private By cartButton() {return By.xpath("//span/i[1]");}
    public void dashboardPage() {openAt("/");}

    public void successAdd(){}

    public void successReduce(){}

    public void buybutton() { $(buyButton()).click();}

    public void addbuton() { $(addButton()).click();}

    public void reducebutton() { $(reduceButton()).click();}

    public void cartbutton() { $(cartButton()).click();}
}
