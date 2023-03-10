import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Cats {
    EdgeDriver driver;
    @Before
    public void SetUp() {
        System.setProperty("webDriver.edge.driver", "/Users/Anastasiia Nelina/Downloads/edgeDriver_win64");
        driver = new EdgeDriver();
        String BASE_URL = "http://suninjuly.github.io/cats.html";
        driver.get(BASE_URL);
    }
    @Test
    public void checkHeaderText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement header = driver.findElement(By.className("jumbotron-heading"));
        wait.until(ExpectedConditions.visibilityOf(header));
        String expectedHeaderText = "Cat memes";
        assertEquals("Element does not contains text" + expectedHeaderText, "Cat memes",
                header.getText());
    }
    @Test
    public void checkCatsCardsQuantity() {
        List<WebElement> catsCards = driver.findElements(By.className("col-sm-4"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(catsCards.get(0)));
        assertEquals("Quantity of cat cards is not 5!", 5, catsCards.size());
    }
    @Test
    public void checkCard2Text() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement nameOfSecondCat = driver.findElement(By.cssSelector(".col-sm-4:nth-child(2) .card-body [class='card-text second']"));
        wait.until(ExpectedConditions.visibilityOf(nameOfSecondCat));
    }
    @After
    public void tearDown () {
        driver.quit();
    }
}
