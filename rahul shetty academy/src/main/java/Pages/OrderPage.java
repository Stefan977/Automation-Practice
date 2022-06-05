package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {
    WebDriver driver;
    WebElement chooseCountry;
    WebElement checkBox;
    WebElement proceed;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getChooseCountry() {
        return driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/select"));
    }

    public WebElement getCheckBox() {

        return driver.findElement(By.className("chkAgree"));
    }

    public WebElement getProceed() {

        return driver.findElement(By.xpath("/html/body/div/div/div/div/div/button"));
    }
}

