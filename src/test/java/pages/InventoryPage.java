package pages;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class InventoryPage extends BaseClass {
    @When("I click on add to cart button")
    public void i_click_on_add_to_cart_button() {
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
    }

    @Then("I click on cart icon")
    public void i_click_on_cart_icon()  {
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

    }
}
