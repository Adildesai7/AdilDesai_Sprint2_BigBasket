package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "./src/test/java/feature",
		glue = "StepDef",
		plugin = {"pretty","html:Reports/HTMLReport.html","json:target/Jsonreport.json",
				"junit:target/JUnitreport.junit"}
		)

public class AllRunner extends AbstractTestNGCucumberTests{

}