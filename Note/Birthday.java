import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Birthday {
        EdgeDriver driver;

        @Before
        public void SetUp() {
            System.setProperty("webDriver.edge.driver", "/Users/Anastasiia Nelina/Downloads/edgeDriver_win64");
            driver = new EdgeDriver();
            String BASE_URL = "https://demo.guru99.com/test/";
            driver.get(BASE_URL);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }
        @Test
        public void Field() throws InterruptedException {
            WebElement birthdayDateAndTime = driver.findElement(By.cssSelector("[name='bdaytime']"));
            birthdayDateAndTime.sendKeys("02/28/1996 04:45");

            WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
            submitButton.click();
            WebElement header = driver.findElement(By.cssSelector("font-size:15px;margin-left:50px"));
            assertEquals("Your Birth Date is",header.getText().contains("Your Birth Date is"));
            Thread.sleep(10000);

        }
        @After
        public void tearDown() {
            driver.quit();
        }
    }
