package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdefinitions {
WebDriver driver;

	    @Given("^Open the browser$")
	    public void open_the_browser() throws Throwable {
	    	System.setProperty("webdriver.Firefox.driver","C:\\Drivers\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
            driver=new FirefoxDriver();
            driver.manage().window().maximize();
	    }

	    @When("^Enter the URL \"([^\"]*)\"$")
	    public void enter_the_url_something(String strArg1) throws Throwable {
	    	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	    }

	    @And("^Enter registered username and password$")
	    public void Enter_registered_username_and_password() throws Throwable {
	        driver.findElement(By.id("Email")).clear();
	        driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	        driver.findElement(By.id("Password")).clear();
	        driver.findElement(By.id("Password")).sendKeys("admin");
	    }

	    @And("^Click on login button$")
	    public void click_on_login_button() throws Throwable {
	    	driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
	    }
	     @Then("^user must successfully login to the webpage$")
	    public void user_must_successfully_login_to_the_webpage$n() throws Throwable {
	    	String exp_tittle=driver.getTitle();
	    	System.out.println(exp_tittle);
	    	if(exp_tittle=="Dashboard/nopcommerce Adinistration")
	    	{
	    		System.out.println("test passed");
	    	}
	    	else
	    	{
	    		System.out.println("test failed");
	    	}
	     }


	}

