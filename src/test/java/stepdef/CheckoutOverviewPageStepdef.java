package stepdef;

import io.cucumber.java.en.When;
import pages.CheckoutOverviewPage;

public class CheckoutOverviewPageStepdef extends CheckoutOverviewPage {

    @When("User clicks on Finish button")
    public void user_clicks_on_finish_button() {
        click_on_finish_button();
    }
}
