package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml" },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@bos",
        dryRun = false
)

public class TestRunner2 {
    // Bu Classın ismini aynı anda 2 tane chrome calsıtırmak icin tekrar TestRunner2 yapmaliyiz.
}
