package EndToEnd;

import base.BaseSteps;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CardPage;
import pages.ProductPage;
import pages.SingUp;

import java.time.Duration;

public class EndToEnd extends BaseSteps {
    ProductPage productPage;
    CardPage cardPage;
 @Test
  public void EndToEndSenario(){
     //singup.singup();
     //singup .insertusername("Gad");
     //singup.insertpassword("ghjdk");
     //singup.clickonsingup();
     //singup.acceptAlert();
     productPage = new ProductPage(driver);
     cardPage = new CardPage(driver);
     productPage.click();
     productPage.add();
     productPage.acceptAlert();
     productPage.home();
     productPage.secondproduct();
     productPage.add();
     productPage.acceptAlert();
     cardPage.clickcard();
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     WebElement totalPriceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("totalp")));
     String actualResult = totalPriceElement.getText();
     System.out.println("Actual result: " + actualResult);
     String expectedResult = "1180";
     Assert.assertEquals(actualResult, expectedResult);
     cardPage.clickPlaceOrder();
     cardPage.fillOrderForm("Gad", "Egypt", "Cairo", "123456789", "04", "2025");
     cardPage.clickPurchase();
     cardPage.isOrderConfirmed();
     cardPage.okbotton();
 }
}
