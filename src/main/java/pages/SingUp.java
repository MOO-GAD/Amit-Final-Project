package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SingUp {
    WebDriver driver;
    WebDriverWait wait;
public SingUp(WebDriver driver) {
    this.driver = driver;
    this.wait= new WebDriverWait(driver,Duration.ofSeconds(10));
}
    //Locators
    private By newuser = By.id("signin2");
    private By usernamebox = By.id("sign-username");
    private By passwordbox = By.id("sign-password");
    private By singupbotton = By.cssSelector(".btn.btn-primary");

    // Actions
    public void singup(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(newuser));
        driver.findElement(newuser).click();
    }

    public void insertusername(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernamebox));
        driver.findElement(usernamebox).sendKeys(username);
    }

    public void insertpassword (String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordbox));
        driver.findElement(passwordbox).sendKeys(password);
    }
    public void clickonsingup(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(singupbotton)).click();
        //driver.findElement(singupbotton).click();
    }
    public void acceptAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }
}
