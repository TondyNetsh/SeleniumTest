
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/feature/Facebook.feature", glue = "stepDefinitions", plugin = {"pretty", "html:target/Report.html"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
