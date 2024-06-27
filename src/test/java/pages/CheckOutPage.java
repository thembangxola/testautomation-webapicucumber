package pages;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class CheckOutPage extends BaseClass {
    @Given("I enter fist name as firstname")
    public void i_enter_fist_name_as_fistname() {
        driver.findElement(By.id("first-name")).sendKeys("FirstName");
    }
    @When("I enter last name as lastname")
    public void i_enter_last_name_as_lastname() {
        driver.findElement(By.id("last-name")).sendKeys("LastName");
    }
    @When("I enter postal code as {int}")
    public void i_enter_postal_code_as(Integer int1) {
        driver.findElement(By.id("postal-code")).sendKeys("32013");
    }
    @And("I click continue button")
    public void i_click_continue_button() {
        driver.findElement(By.id("continue")).click();
    }
    @Then("I retrieve the card number")
    public void i_retrieve_the_card_number() {
        String text = driver.findElement(By.xpath("//div[@data-test='payment-info-value']")).getText().trim();
        System.out.println("Sauce Card Number is " + text);
    }
}
