package Test;

import Base.BaseGreenKart;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestGreenKart extends BaseGreenKart {
    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");

    }

    @Test
    public void successfulorder() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        String[] vegetables = {"Cucumber","Cauliflower","Brocolli"};
        List<String> prices = new ArrayList<String>();
//      In this method we created two lists, The "vegetables" list is for sending product names and comparing if the products are available, if they are available we add them to the Cart.
//      The "prices" list is used for storing the prices from the wanted products and later compared if the prices are the same when added to Cart.
        for (int i = 0; i < vegetables.length; i++) {
            greenkarthp.getSearchField().sendKeys(vegetables[i]);
            Thread.sleep(1000);
            if(greenkarthp.getProductListName().getText().contains(vegetables[i])) { // Here we are checking if the product is available for purchase and if it is we add it to the Cart.
                wait.until((ExpectedConditions.elementToBeClickable(greenkarthp.getAddToCart())));
                prices.add(greenkarthp.getProductPrices().getText());
                greenkarthp.getAddToCart().click();
                greenkarthp.getSearchField().clear();
                System.out.println(prices);
            }
        }
        greenkarthp.getBagItems().click();
        greenkarthp.getCheckOut().click();
        Thread.sleep(1000);
//      This method is used to get elements from the list created "prices" one by one and compare them with the elements "getPrices".
        for (int i = 0; i < 3; i++) {
            Assert.assertEquals(prices.get(i), greenkart.getPrice(i+1).getText());
            System.out.println(prices.get(i));
            System.out.println(greenkart.getPrice(i+1).getText());
        }

        greenkart.getCodeInput().sendKeys("rahulshettyacademy");
        greenkart.getAppliedButton().click();
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo"))));

        Assert.assertEquals(true, greenkart.getCodeApplied().isDisplayed()); // We are checking if the message is visible that the code was successfuly used.

        int totalAmount = Integer.parseInt(greenkart.getTotalAmount().getText());
        double totalAfterDiscount = Double.parseDouble(greenkart.getPriceAfterDicount().getText());
        Assert.assertEquals(totalAfterDiscount, totalAmount - totalAmount * 0.1); // We are checking if the price after discount is 10% cheaper

        greenkart.getPlaceOrder().click();
        orderpage.getCheckBox().click();
        orderpage.getChooseCountry().click();
        orderpage.getChooseCountry().sendKeys("Serbia");
        orderpage.getChooseCountry().click();
        orderpage.getProceed().click();

        Assert.assertEquals(successfulorder.getSuccessfullText().getText(), "Thank you, your order has been placed successfully\n" +
                "You'll be redirected to Home page shortly!!"); // We are checking if the text is saying that the purchase is successful
    }
}