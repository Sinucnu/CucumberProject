package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {

	WebDriver driver = new ChromeDriver();

	@Given("User is on homepage")
	public void user_is_on_homepage() {
		System.out.println("I am in " + "User is on homepage");

	}

	@When("User navigates to Login page")
	public void user_navigates_to_login_page() {
		System.out.println("I am in " + "User navigates to Login page");
	}

	@And("User enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("I am in " + "User enters username and password");
	}

	@Then("Success message is displayed")
	public void Success_message_is_displayed() {
		System.out.println("I am in " + "Success message is displayed");
	}

	@Given("I access google page")
	public void access_google_page() {
		driver.get("https://www.google.co.in");
		System.out.println("I access google page with title : " + driver.getTitle());
	}

	@And("I search for selenium word and click on first link")
	public void search_for_selenium_word_and_click_on_first_link() {
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("selenium");
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys(Keys.ENTER);

		driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div.yuRUbf > a > div > cite"))
				.click();

		System.out.println("I am in " + "Success message is displayed");
	}

	@Then("I print the title of the page and close the browser")
	public void print_the_title_of_the_page() {
		System.out.println("I am in selenium page with title : " + driver.getTitle());
		driver.close();
	}

}
