package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features="src/test/java/features", glue = "steps", 
					monochrome = true, publish = true,
					tags = "@functional and @regression")
public class cucumberRunner extends BaseClass{

}
