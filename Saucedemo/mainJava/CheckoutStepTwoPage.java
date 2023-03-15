import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
@Getter
public class CheckoutStepTwoPage {
    public CheckoutStepTwoPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(className = "cart_item_label")
    private List<WebElement> productsNames;
    @FindBy(xpath = "//div[text()='29.99']")
    private WebElement priceSauceLabsBackpack;
    @FindBy(xpath = "//div[text()='9.99']")
    private WebElement priceBikeLight;
    @FindBy(xpath = "//div[text()='39.98']")
    private WebElement amountProductsInCart;
    public boolean checkProductCardsQuantity(int expectedQuantity) {
        System.out.println(productsNames.size());
        return productsNames.size() == expectedQuantity;
    }
}