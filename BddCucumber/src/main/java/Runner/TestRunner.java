package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/apple/git/BddCucumber/BddCucumber/Features" ,
		glue={"stepDefination"},
		/*plugin = { "pretty","html:target/cucumber-html-report" , 
				"json:target/cucumber.json" ,"junit:target/cucumber.xml",
				"rerun:target/rerun.txt"}
				*/
		
		format= {"pretty","html:test-outout"},
		dryRun = false,
		monochrome = true,
		//strict= true,
		tags= {"@SmokeTest"}
		
		
		)
 

public class TestRunner {

}
