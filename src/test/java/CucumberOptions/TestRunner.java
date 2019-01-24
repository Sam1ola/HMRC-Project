package CucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src\\test\\java\\features"
		,glue={"StepDef"}
		,tags = {"@FunctionalTest"}
)
public class TestRunner extends AbstractTestNGCucumberTests  {

}
