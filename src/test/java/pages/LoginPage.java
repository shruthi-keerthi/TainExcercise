package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utility.BrowserDriver.driver;

public class LoginPage {

    // URL of the Swag Labs website
    public static String page = "https://www.saucedemo.com/";

    // Locators for username, password, login button, and error message
    public static String username = "user-name";
    public static String password = "password";
    public static String login_button = "login-button";
    public static String error_message = "h3[data-test='error']";

    // Method to navigate to Swag Labs website
    public void navigate_to_swag_labs_website(){
        driver.get(page);
    }

    // Method to enter a valid username
    public void enter_username(){
        driver.findElement(By.id(username)).sendKeys("standard_user");
    }

    // Method to enter a valid password
    public void enter_password(){
        driver.findElement(By.id(password)).sendKeys("secret_sauce");
    }

    // Method to enter an invalid password
    public void enter_invalid_password(){
        driver.findElement(By.id(password)).sendKeys("pass");
    }

    // Method to click on the login button
    public void click_on_login_button(){
        driver.findElement(By.id(login_button)).click();
    }

    // Method to assert that the user failed to log in and sees an error message
    public void user_failed_to_login(){
        WebElement errorMessageElement = driver.findElement(By.cssSelector(error_message));
        String actual_error_message = errorMessageElement.getText();
        String expected_error_message = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertTrue(actual_error_message.contains(expected_error_message));
    }
}
