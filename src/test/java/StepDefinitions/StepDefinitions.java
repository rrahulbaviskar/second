package StepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinitions {
	public RemoteWebDriver driver;
	
	
	   @Given("^Initialize the chrome driver$")
	    public void initialize_the_chrome_driver() throws Throwable {
		   
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		     driver = new ChromeDriver();
	       
		   
	    }

	    @When("^user navigates to URL$")
	    public void user_navigates_to_url() throws Throwable {
	    	
	    	driver.get("https://login.salesforce.com/?locale=in");
	       
	    }

	    @Then("^user should be able to login$")
	    public void user_should_be_able_to_login() throws Throwable {
	        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Rahul");
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
	        driver.findElement(By.xpath("//input[@id='Login']")).click();
	    }

	    @And("^user enter username and password and clicks on login button$")
	    public void user_enter_username_and_password_and_clicks_on_login_button() throws Throwable {
	    	
	    	System.out.println("Aatul is clever boy");
	       
	    }

	}


