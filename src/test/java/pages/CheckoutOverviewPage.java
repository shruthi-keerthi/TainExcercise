package pages;
import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class CheckoutOverviewPage {
    // Locator for finish button
    public static String finish_button = "finish";

    // Method to click on the finish button
    public void click_on_finish_button(){
        driver.findElement(By.id(finish_button)).click();
    }
}
