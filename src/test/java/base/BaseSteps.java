package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.ProductPage;
import pages.SingUp;

public class BaseSteps {
    public WebDriver driver;
    public SingUp singup;
    //public CardPage cardPage;
    @BeforeClass
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        singup = new SingUp (driver);
        OpenURL();
    }
    @BeforeMethod
    public void OpenURL(){
        driver.get("https://demoblaze.com/");
    }

    @AfterClass
     public void CloseURL(){
        driver.quit();
     }
}