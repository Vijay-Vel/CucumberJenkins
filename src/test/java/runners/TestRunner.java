package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\USER\\eclipse-workspace\\Cucumber-Framework\\src\\test\\java\\features\\DemoWebShop.feature",
				glue= {"stepDefinition"},
				dryRun=false,
						plugin={"pretty",
				"html:target/amazonreport.html"},
		tags="@all")
public class TestRunner {

}
