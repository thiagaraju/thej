package MyDemo_01_Cucumber.MyDemo_01_Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class num1 {
	
	@Given("Application is launched by Guest User")
	public void application_is_launched_by_Guest_User()
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\t.thiagaraju\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
	}

	@When("Uer clicks on Sign In link available")
	public void uer_clicks_on_Sign_In_link_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("provides the required data in the form")
	public void provides_the_required_data_in_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user submits data")
	public void user_submits_data() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("verifies the account creation")
	public void verifies_the_account_creation() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
