package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:report/cucumber-pretty","json:target/cucumber.json"},
        tags = "@regression or @Samtest1",
        glue = {"Stepdefinations"},
        features = {"src/test/java/Features"}
)
public class ShoppingRunner {
}
