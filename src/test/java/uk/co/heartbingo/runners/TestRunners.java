package uk.co.heartbingo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile/",
        glue = "uk/co/heartbingo",
        tags = "@smoke",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
               }

)

public class TestRunners {

}
