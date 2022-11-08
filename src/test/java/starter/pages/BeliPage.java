package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BeliPage extends PageObject {

    private By clickBuyButton() { return By.xpath("//button/span[text()='Beli'][1]");}

    private By addedChart() { return By.xpath("//span[text()='1']");}

    public void clickBuy() { $(clickBuyButton()).click();}

    public void addchart() { $(addedChart()).isDisplayed();}

    public void dashboard() {openAt("/");}

}
