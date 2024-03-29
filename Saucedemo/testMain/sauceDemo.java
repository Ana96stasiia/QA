import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;
import static org.junit.Assert.*;


public class sauceDemo {
    EdgeDriver driver;

    @Before
    public void SetUp() {
        System.setProperty("webDriver.edge.driver", "/Users/Anastasiia Nelina/Downloads/edgeDriver_win64");
        driver = new EdgeDriver();
        String BASE_URL = "https://www.saucedemo.com/";
        driver.get(BASE_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void loginWithValueDate(){
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
        submitButton.click();
        assertFalse(driver.getCurrentUrl().contains("result"));
        WebElement header = driver.findElement(By.cssSelector("[class=title]"));
        assertEquals("Congratulations! You have successfully registered!", header.getText());
        assertTrue("User is still on the registration page",header.getText().contains("Congratulations"));
        System.out.println("Current URL:" + driver.getCurrentUrl());


    }

    @Test
    public void loginWithNotValueDate() {
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
        submitButton.click();
        assertFalse(driver.getCurrentUrl().contains("result"));

        WebElement header = driver.findElement(By.cssSelector("[class=title]"));
    }


    @Test
    public void loginWithNotValueDate1() {
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
        submitButton.click();
        assertFalse(driver.getCurrentUrl().contains("result"));

        WebElement header = driver.findElement(By.cssSelector("[class=title]"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
