package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utility.BrowserDriver.driver;

public class CheckoutCompletePage {

    // Locator for order success message
    public static String order_success_message = "h2[data-test='complete-header']";

    // Method to assert successful order completion
    public void order_placed_successfully(){
        WebElement successMessageElement = driver.findElement(By.cssSelector(order_success_message));
        String actual_success_message = successMessageElement.getText();
        String expected_success_message = "Thank you for your order!";
        Assert.assertTrue(actual_success_message.contains(expected_success_message));
    }
}
