package Resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Defn 
{
	WebDriver driver;
	@Given("^I am able to access magento webpage$")
	public void i_am_able_to_access_magento_webpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://magento.com");
		driver.findElement(By.linkText("My Account")).click();
	}

	@Given("^I am a registered user on magento$")
	public void i_am_a_registered_user_on_magento() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^I update the valid username$")
	public void i_update_the_valid_username() throws Throwable {
	    driver.findElement(By.id("email")).sendKeys("natarajan.ramatham93@gmail.com");
	  
	}

	@When("^I update the valid password$")
	public void i_update_the_valid_password() throws Throwable {
		driver.findElement(By.id("pass")).sendKeys("Welcome123");
	}

	@When("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
		driver.findElement(By.id("send2")).click();

	}

	@Then("^I get access to page$")
	public void i_get_access_to_page() throws Throwable {
	 
	   
	}

}
