package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageStepdef extends LoginPage {

    @Given("User navigates to the Swag Labs website")
    public void user_navigates_to_the_swag_labs_website() {
        navigate_to_swag_labs_website();
    }
    @When("User enters valid login credentials")
    public void user_enters_valid_login_credentials() {
        enter_username();
        enter_password();
    }
    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        click_on_login_button();
    }

    @When("User enters invalid login credentials")
    public void user_enters_invalid_login_credentials() {
        enter_username();
        enter_invalid_password();
    }

    @Then("User should be able to see error message")
    public void user_should_be_able_to_see_error_message() {
        user_failed_to_login();
    }

    @Given("User is logged into Swag Labs website")
    public void user_is_logged_into_swag_labs_website() {
        navigate_to_swag_labs_website();
        enter_username();
        enter_password();
        click_on_login_button();
    }
}
