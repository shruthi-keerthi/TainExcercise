package stepdef;

import io.cucumber.java.en.Then;
import pages.CheckoutCompletePage;

public class CheckoutCompletePageStepdef extends CheckoutCompletePage {

    @Then("User should see a success message confirming the order completion")
    public void user_should_see_a_success_message_confirming_the_order_completion() {
        order_placed_successfully();
    }
}
