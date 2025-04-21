package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CardPage {
    WebDriver driver;
    WebDriverWait wait;

    public CardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    // locators
    private By card = By.id("cartur");
    private By placeOrderBtn = By.xpath("//button[text()='Place Order']");
    private By nameField = By.id("name");
    private By countryField = By.id("country");
    private By cityField = By.id("city");
    private By cardField = By.id("card");
    private By monthField = By.id("month");
    private By yearField = By.id("year");
    private By purchaseBtn = By.xpath("//button[text()='Purchase']");
    private By successMsg = By.className("sweet-alert");
    private By okBtn = By.xpath("//button[text()='OK']");

    //Actions
    public void clickcard() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(card));
        driver.findElement(card).click();
    }
    public void clickPlaceOrder() {
        driver.findElement(placeOrderBtn).click();
    }
    public void fillOrderForm(String name, String country, String city, String card, String month, String year) {
        wait.until(ExpectedConditions.elementToBeClickable(nameField));
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(countryField).sendKeys(country);
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(cardField).sendKeys(card);
        driver.findElement(monthField).sendKeys(month);
        driver.findElement(yearField).sendKeys(year);
    }
    public void clickPurchase() {
        wait.until(ExpectedConditions.elementToBeClickable(purchaseBtn));
        driver.findElement(purchaseBtn).click();
    }

    public boolean isOrderConfirmed() {
        return driver.findElement(successMsg).isDisplayed();
    }

    public void okbotton() {
        driver.findElement(okBtn).click();
    }
}
