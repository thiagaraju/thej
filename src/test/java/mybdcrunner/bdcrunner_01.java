package mybdcrunner;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature99",glue ="bdcstepdefenition")
plugin= {"pretty","html:target/cucumber-html-report"})
public class bdcrunner_01 {
	

}
