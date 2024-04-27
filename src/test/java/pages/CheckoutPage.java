package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utility.BrowserDriver.driver;

public class CheckoutPage {

    // Locators for firstname, lastname, postcode, continue button and error message
    public static String firstname = "first-name";
    public static String lastname = "last-name";
    public static String postalcode = "postal-code";
    public static String continue_button = "continue";
    public static String error_message = "h3[data-test='error']";

    // Method to enter valid payment details for a standard checkout process
    public void enters_valid_payment_details(){
        driver.findElement(By.id(firstname)).sendKeys("Mary");
        driver.findElement(By.id(lastname)).sendKeys("Poppins");
        driver.findElement(By.id(postalcode)).sendKeys("AB12 4CD");
    }

    // Method to click on the continue button
    public void click_on_continue_button(){
        driver.findElement(By.id(continue_button)).click();
    }

    // Method to assert the error message due to missing payment details
    public void missing_payment_details_error_message(){
        WebElement errorMessageElement = driver.findElement(By.cssSelector(error_message));
        String actual_error_message = errorMessageElement.getText();
        String expected_error_message = "Error: First Name is required";
        Assert.assertTrue(actual_error_message.contains(expected_error_message));
    }
}
