package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GreenKart {
    WebDriver driver;
    WebElement codeInput;
    WebElement appliedButton;
    WebElement codeApplied;
    WebElement totalAmount;
    WebElement discount;
    WebElement placeOrder;
    WebElement priceBrocolli;
    WebElement priceCucumber;
    WebElement priceCauliflower;
    WebElement priceAfterDicount;


    public WebElement getPriceAfterDicount() {
        return driver.findElement(By.className("discountAmt"));
    }

    public WebElement getAppliedButton() {
        return driver.findElement(By.className("promoBtn"));
    }

    public WebElement getPriceBrocolli() {
        return driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr[3]/td[4]/p"));
    }

    public WebElement getPriceCucumber() {
        return driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr[1]/td[4]/p"));
    }
    public WebElement getPrice(int i) {
        return driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr[" + i + "]/td[4]/p"));
    }

    public WebElement getPriceCauliflower() {
        return driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr[2]/td[4]/p"));
    }

    public WebElement getCodeInput() {
        return driver.findElement(By.className("promoCode"));
    }

    public WebElement getCodeApplied() {
        return driver.findElement(By.className("promoInfo"));

    }

    public WebElement getPlaceOrder() {
        return driver.findElement(By.xpath("/html/body/div/div/div/div/div/button"));
    }

    public GreenKart(WebDriver driver) {
        this.driver = driver;

    }

    public WebElement getTotalAmount() {
        return driver.findElement(By.className("totAmt"));
    }

}

