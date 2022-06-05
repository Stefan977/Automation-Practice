package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GreenKartHP {
    WebDriver driver;
    WebElement searchField;
    WebElement searchButton;
    WebElement Broccoli;
    WebElement Cauliflower;
    WebElement Cucumber;
    WebElement bagItems;
    WebElement checkOut;
    WebElement productListName;
    public WebElement addToCart;
    public WebElement productPrices;

    public WebElement getProductPrices() {
        return driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/p"));
    }

    public WebElement getAddToCart() {
        return driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[3]/button"));
    }

    public WebElement getProductListName() {
        return driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/h4"));
    }
    public GreenKartHP(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSearchField() {
        return driver.findElement(By.className("search-keyword"));
    }

    public WebElement getSearchButton() {
        return driver.findElement(By.className("search-button"));
    }

    public WebElement getBroccoli() {
        return driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div[3]/button"));
    }

    public WebElement getCauliflower() {
        return driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[3]/button"));
    }

    public WebElement getCucumber() {
        return driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[3]/button"));
    }

    public WebElement getBagItems() {

        return driver.findElement(By.className("cart-icon"));
    }
    public WebElement getCheckOut() {
        return driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/div[2]/div[2]/button"));
    }
}
