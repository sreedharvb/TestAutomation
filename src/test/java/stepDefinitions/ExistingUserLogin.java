package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.gl.E;
import functionLibrary.CommonFunctions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;


public class ExistingUserLogin extends CommonFunctions {

    HomePage homePage = new HomePage(driver);

    @Given("^Landed on Home Page$")
    public void landed_on_Home_Page(String url)
    {
        driver.get(url);
    }

    @When("^I click on Login button$")
    public void i_click_on_Login_button()
    {

    }

    @Then("^I should see Login page$")
    public void i_should_see_Login_page()
    {

    }

    // Scenario: To verify Google sign in popup is displayed
    // Click Sign in with Google Account button
    @Given("^I am in Login page$")
    public void i_am_in_Login_page()
    {

    }

    @When("^I click Sign in with Google Account$")
    public void i_click_Sign_in_with_Google_Account()
    {

    }

    @Then("^I should see Sign in with Google dialog$")
    public void i_should_see_Sign_in_with_Google_dialog()
    {

    }
    // Scenario: To verify Login succeeded with existing user account
    @Given("^I am in Sign in with Google dialog$")
    public void i_am_in_Sign_in_with_Google_dialog()
    {

    }

    @When("^Existing Google account is clicked$")
    public void existing_Google_account_is_clicked()
    {

    }

    @Then("^User should be logged in successfuly$")
    public void user_should_be_logged_in_successfuly()
    {

    }

}


