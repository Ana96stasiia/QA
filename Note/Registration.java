import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Registration {
    EdgeDriver driver;

    @Before
    public void SetUp() {
        System.setProperty("webDriver.edge.driver", "/Users/Anastasiia Nelina/Downloads/edgeDriver_win64");
        driver = new EdgeDriver();
        String BASE_URL = "http://suninjuly.github.io/registration1.html";
        driver.get(BASE_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void onlyRequiredField() throws InterruptedException {
        WebElement firstNameInputField = driver.findElement(By.cssSelector("[placeholder='Input your first name']"));
        firstNameInputField.sendKeys("John");
        Thread.sleep(10000);
    }

    @Test
    public void onlyRequiredField2() throws InterruptedException {
        WebElement lastNameInputField = driver.findElement(By.cssSelector("[placeholder='Input your last name']"));
        lastNameInputField.sendKeys("Steshenko");
        Thread.sleep(10000);
    }

    @Test
    public void onlyRequiredField3() throws InterruptedException {
        WebElement emailInputField = driver.findElement(By.cssSelector("[placeholder='Input your email']"));
        emailInputField.sendKeys("jfvjnv.jvnjn@gmail.com");
        Thread.sleep(10000);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
