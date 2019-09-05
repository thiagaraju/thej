package mybdcrunner;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\t.thiagaraju\\Downloads\\New folder\\MyDemo_01_Cucumber\\Feature99",glue ="bdcstepdefenitions",
plugin={"pretty","html:target/cucumber-report","json:target/cucumber-JSON-report"})


public class bdcrunner_01 {
	

}
