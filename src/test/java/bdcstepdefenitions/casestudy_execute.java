package bdcstepdefenitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class casestudy_execute {
	WebDriver driver;


	@Given("user who wants to shop will launch demowebshop app in chrome browser")


	public void user_who_wants_to_shop_will_launch_demowebshop_app_in_chrome_browser() {


	    // Write code here that turns the phrase above into concrete actions


	   // throw new cucumber.api.PendingException();


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\t.thiagaraju\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();


	 //driver.manage().window().maximize();


	 driver = new ChromeDriver();


	 driver.get("http://demowebshop.tricentis.com/");


	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	}





	@Then("user access the login page")


	public void user_access_the_login_page() {


	    // Write code here that turns the phrase above into concrete actions


	    //throw new cucumber.api.PendingException();


	 driver.findElement(By.xpath("//a[@href='/login']")).click();


	}





	@Then("provides the required details")


	public void provides_the_required_details() {


	    // Write code here that turns the phrase above into concrete actions


	    //throw new cucumber.api.PendingException();


	  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ttraju2000@gmail.com");


	   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("numbernot");


	}





	@Then("click login button")


	public void click_login_button() {


	    // Write code here that turns the phrase above into concrete actions


	    //throw new cucumber.api.PendingException();


	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("b");


	  driver.findElement(By.xpath("//input[@type='submit']")).click();


	}





	@Given("user searches the item of his choice")


	public void user_searches_the_item_of_his_choice() {


	    // Write code here that turns the phrase above into concrete actions


	    //throw new cucumber.api.PendingException();


	  driver.findElement(By.xpath("//a[@href='/books']")).click();


	  


	  


	}





	@Given("adds the item  of his choice to the cart")


	public void adds_the_item_of_his_choice_to_the_cart() {


	    // Write code here that turns the phrase above into concrete actions


	    //throw new cucumber.api.PendingException();


	 driver.findElement(By.xpath("//input[@value='Add to cart']")).click();


	}





	@Then("countinue the shopping")


	public void countinue_the_shopping() {


	    // Write code here that turns the phrase above into concrete actions


	    //throw new cucumber.api.PendingException();


	 driver.close();


	}





	@Given("user searches for one more item")


	public void user_searches_for_one_more_item() {


	    // Write code here that turns the phrase above into concrete actions


	    //throw new cucumber.api.PendingException();


	  driver.findElement(By.xpath("//a[@href='/apparel-shoes']")).click();


	  driver.findElement(By.xpath("//input[@value='Add to cart']")).click();


	  


	}





	@Given("adds the second item to the cart")


	public void adds_the_second_item_to_the_cart() {


	    // Write code here that turns the phrase above into concrete actions


	    //throw new cucumber.api.PendingException();


	  driver.findElement(By.xpath("//input[@id='add-to-cart-button-5']")).click();


	  driver.close();


	}

}