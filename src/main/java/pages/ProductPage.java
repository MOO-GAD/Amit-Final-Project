package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
    WebDriver driver;
    WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }
    //Locators
    private By productname = By.linkText("Samsung galaxy s6");
    private By addtocard = By.cssSelector(".btn.btn-success.btn-lg");
    private By homepage = By.id("nava");
    private By lumia = By.linkText("Nokia lumia 1520");
    //Actions
    public void click() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(productname));
        driver.findElement(productname).click();
    }
    public void add(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(addtocard));
        driver.findElement(addtocard).click();
    }
    public void acceptAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }
    public void home(){
        driver.findElement(homepage).click();
    }
    public void secondproduct(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lumia));
        driver.findElement(lumia).click();
    }



}