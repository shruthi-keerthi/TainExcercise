package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageStepdef extends HomePage {

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        logged_in_successfully();
    }

    @When("User adds the first item to the cart")
    public void user_adds_the_first_item_to_the_cart() {
        add_first_item_to_the_cart();
    }

    @When("User adds the second item to the cart")
    public void user_adds_the_second_item_to_the_cart() {
        add_second_item_to_the_cart();
    }

    @When("User clicks on the shopping cart link")
    public void user_clicks_on_the_shopping_cart_link() {
        click_on_shopping_cart_link();
    }

    @Given("User has added items to the shopping cart")
    public void user_has_added_items_to_the_shopping_cart() {
        add_first_item_to_the_cart();
        add_second_item_to_the_cart();
        click_on_shopping_cart_link();
    }
}
