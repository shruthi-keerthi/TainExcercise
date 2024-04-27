package stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;

public class CartPageStepdef extends CartPage {

    @Then("the cart should display {string} item\\(s)")
    public void the_cart_should_display_item_s(String expectedItemCount) {
        number_of_items_in_the_cart(expectedItemCount);
    }

    @When("User proceeds to checkout")
    public void user_proceeds_to_checkout() {
        checkout_button();
    }
}
