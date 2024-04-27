package stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutPage;

public class CheckoutPageStepdef extends CheckoutPage {

    @When("User enters payment information")
    public void user_enters_payment_information() {
        enters_valid_payment_details();
    }

    @When("User clicks on Continue button")
    public void user_clicks_on_continue_button() {
        click_on_continue_button();
    }

    @Then("User should see an error message indicating missing payment details")
    public void user_should_see_an_error_message_indicating_missing_payment_details() {
        missing_payment_details_error_message();
    }
}
