package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/learning/cucumbercourse/features"},
		//glue = {"stepdefinitions", "hooks"},
		glue = {"stepdefinitions"},
		//tags = "@SmokeTest or @RegularTest or @NightBuildTest or @ListOfString",
		plugin= {"pretty",
				"html:target/SystemTestReports/html/report.html",
				"json:target/SystemTestReports/json/report.json",
				"junit:target/SystemTestReports/junit/report.xml",
				},
		//tags= "@ListOfString or @ListOfListOfString or @ListOfMaps",
		tags= "@ScenariOutlineExample",
		dryRun = false,
		monochrome = true
		)
public class MenuManagementTest {

}
