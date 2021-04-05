package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSteps {
	WebDriver driver;
	@Given("^open Facebook application$")
	public void open_facebook_application() {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@Then("^verify email textbox is displayed$")
	public void verify_email_textbox_is_displayed() {
		Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());
	}

	@And("^verify password textbox is displayed$")
	public void verify_password_textbox_is_displayed() {
		Assert.assertTrue(driver.findElement(By.id("pass")).isDisplayed());
		
	}
	@Then("^sendkey email textbox is \"([^\"]*)\"$")
	public void sendkey_email_textbox_is(String email)  {
		driver.findElement(By.id("email")).sendKeys(email);
	}

	@Then("^sendkey password textbox is \"([^\"]*)\"$")
	public void sendkey_password_textbox_is(String password)  {
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	@Given("^open facebook application$")
	public void openFacebookApplication()  {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Then("^sendkey email textbox is  \"([^\"]*)\"$")
	public void sendkeyEmailTextboxIs(String email )  {
		driver.findElement(By.id("email")).sendKeys(email);
	}

	@Then("^sendkey password textbox is  \"([^\"]*)\"$")
	public void sendkeyPasswordTextboxIs(String password)  {
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
 
	@And("^close application$")
	public void closeApplication() {
		driver.quit();
		
	}

}
