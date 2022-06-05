package Base;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseGreenKart {

    public WebDriver driver;
    public GreenKart greenkart;
    public OrderPage orderpage;
    public GreenKartHP greenkarthp;
    public SuccessfulOrder successfulorder;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sstojanovic.EXCHANGE\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        greenkart = new GreenKart(driver);
        greenkarthp = new GreenKartHP(driver);
        orderpage = new OrderPage(driver);
        successfulorder = new SuccessfulOrder(driver);


    }
    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
