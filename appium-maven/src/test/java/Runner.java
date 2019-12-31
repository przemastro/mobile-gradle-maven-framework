import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(plugin = "html:target/html-report",
        features = "src/test/java/features/",
        glue = "steps",
        tags= "@smokeTest")
public class Runner extends AbstractTestNGCucumberTests {
}