package mybdcrunner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json"},features="C:\\Users\\t.thiagaraju\\Downloads\\New folder\\MyDemo_01_Cucumber\\Feature99",glue ="bdcstepdefenitions")
public class bdcrunner_01 {
}
