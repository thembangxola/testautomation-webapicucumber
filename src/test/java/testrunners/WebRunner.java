package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/GetCardNumber.feature",
        glue = {"hooks", "pages"},
        monochrome = true,
        publish = true
)
public class WebRunner extends AbstractTestNGCucumberTests {
}
