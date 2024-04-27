package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class HomePage {

    // Locators for addToCart buttons and shopping_cart link
    public static String addToCart_sauceLabs_backpack_button = "add-to-cart-sauce-labs-backpack";

    public static String addToCart_sauceLabs_bike_light_button = "add-to-cart-sauce-labs-bike-light";

    public static String shopping_cart_link = "a[data-test='shopping-cart-link']";

    // Method to assert successful login
    public void logged_in_successfully(){
        Assert.assertEquals(driver.getTitle(),"Swag Labs");
    }

    // Method to add first item to the shopping cart
    public void add_first_item_to_the_cart(){
        driver.findElement(By.id(addToCart_sauceLabs_backpack_button)).click();
    }

    // Method to add second item to the shopping cart
    public void add_second_item_to_the_cart(){
        driver.findElement(By.id(addToCart_sauceLabs_bike_light_button)).click();
    }

    // Method to click shopping cart link
    public void click_on_shopping_cart_link(){
        driver.findElement(By.cssSelector(shopping_cart_link)).click();
    }
}
