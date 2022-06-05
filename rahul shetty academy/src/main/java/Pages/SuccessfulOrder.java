package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuccessfulOrder {
    WebDriver driver;
    WebElement successfullText;

    public SuccessfulOrder(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getSuccessfullText() {
        return driver.findElement(By.xpath("/html/body/div/div/div/div/div/span"));
    }
}
