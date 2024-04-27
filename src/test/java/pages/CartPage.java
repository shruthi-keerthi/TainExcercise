package pages;
import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;
import static utility.BrowserDriver.driver;
public class CartPage {

    // Locators for Cart items, Checkout button
    public static String cart_items = "div[data-test='inventory-item']";

    public static String checkout_button = "checkout";

    // Method to assert number of cart items
    public void number_of_items_in_the_cart(String expectedItemCount) {
        int actualItemCount = driver.findElements(By.cssSelector(cart_items)).size();
        int expectedCount = Integer.parseInt(expectedItemCount);
        assertEquals("Number of items in the cart does not match", expectedCount, actualItemCount);
    }

    // Method to click on the checkout button
    public void checkout_button(){
        driver.findElement(By.id(checkout_button)).click();
    }
}
