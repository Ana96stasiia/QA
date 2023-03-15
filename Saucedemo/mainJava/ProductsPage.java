import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    protected WebDriver driver;

    @FindBy(className = "inventory_container")
    WebElement inventaryList;

    @Step("List of products is displayed")
    public boolean inventoryListIsDisplayed(){
        return inventaryList.isDisplayed();
    }

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}