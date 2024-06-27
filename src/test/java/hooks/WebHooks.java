package hooks;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class WebHooks extends BaseClass {
    @Before
    public void setUp() {
        initializeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void tearDown() {
        quitDriver();
    }
}
