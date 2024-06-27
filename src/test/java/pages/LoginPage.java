package pages;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {

    @Given("I enter a username as standard_user")
    public void i_enter_a_username_as_standard_user() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }
    @When("I enter a password as secret_sauce")
    public void i_enter_a_password_as_secret_sauce() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }
    @Then("I click login button")
    public void i_click_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

}
