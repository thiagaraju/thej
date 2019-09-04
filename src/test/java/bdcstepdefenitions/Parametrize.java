package bdcstepdefenitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import MyDemo_01_Cucumber.MyDemo_01_Cucumber.Driverclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Parametrize {
	 WebDriver driver;
	  @Given("the user launches the app")
	  public void the_user_launches_the_app() {
	      // Write code here that turns the phrase above into concrete actions
	     // throw new cucumber.api.PendingException();
	    driver=Driverclass.configureDriver("chrome");
	    driver.manage().window().maximize();
	    driver.get("http://demowebshop.tricentis.com");
	  
	  }




	 @Given("the user clicks on login")
	  public void the_user_clicks_on_login() {
	      // Write code here that turns the phrase above into concrete actions
	      //throw new cucumber.api.PendingException();
	   driver.findElement(By.xpath("//a[@href='/login']")).click();
	  }




	 @Then("the data {string} and {string} is provided by the user")
	  public void the_data_and_is_provided_by_the_user(String string, String string2) {
	      // Write code here that turns the phrase above into concrete actions
	     // throw new cucumber.api.PendingException();
	   driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(string);
	   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(string2);
	  }




	 @Then("the submit button is clicked")
	  public void the_submit_button_is_clicked() {
	      // Write code here that turns the phrase above into concrete actions
	      //throw new cucumber.api.PendingException();
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("b");
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	  }
	  @Then("the app is closed")
	  public void the_app_is_closed() {
	      // Write code here that turns the phrase above into concrete actions
	      //throw new cucumber.api.PendingException();
	   driver.close();
	  }


}
