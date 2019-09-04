package mybdcrunner;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\t.thiagaraju\\Downloads\\New folder\\MyDemo_01_Cucumber\\Feature99\\BDC_Demo_01.feature",glue ="bdcstepdefenition")
plugin= {"pretty","html:target/cucumber-html-report"})
public class bdcrunner_01 {
	

}
