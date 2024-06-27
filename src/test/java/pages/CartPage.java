package pages;

import base.BaseClass;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class CartPage extends BaseClass {

    @Then("I click on checkout button")
    public void i_click_on_checkout_button()  {
        driver.findElement(By.id("checkout")).click();
    }
}
