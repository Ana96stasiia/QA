import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class InventoryPage {
    @FindBy(id = "inventory_container")
    WebElement inventoryList;
    @FindBy(css = "[class='inventory_item']")
    private List<WebElement> productCards;
    @FindBy(xpath = "//div[@class='inventory_item']")
    private List<WebElement> titleProducts;
    @FindBy(xpath = "//span[@class='title']")
    private WebElement titleAllProducts;
    @FindBy(xpath = "//img[class='inventory_item_img']")
    private List<WebElement> imgProductsList;
    @FindBy(xpath = "//div[class='app_logo']")
    private WebElement logoInventoryPage;
    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingCartContainer;
    @FindBy(className = "product_sort_container")
    private WebElement productSortContainer;
    @FindBy(className = "peek")
    private WebElement robot;
    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory']")
    private List<WebElement> buttonAddToCardList;
    @FindBy(xpath = "//div[@class='inventory_item_price']")
    private WebElement priceList;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement productBadge;
    //Sort
    @FindBy(xpath = "//option[@value='az']")
    private WebElement sortNameAToZ;
    @FindBy(xpath = "//option[@value='za']")
    private WebElement sortNameZToA;
    @FindBy(xpath = "//option[@value='lohi']")
    private WebElement sortNameLohi;
    @FindBy(xpath = "//option[@value='hilo']")
    private WebElement sortNameHilo;
    //Footer
    @FindBy(xpath = "//a[@href='https://twitter.com/saucelabs']")
    private WebElement twitterIconLink;
    @FindBy(xpath = "//a[@href='https://www.facebook.com/saucelabs']")
    private WebElement facebookIconLink;
    @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/sauce-labs']")
    private WebElement linkedinIconLink;
    @FindBy(xpath = "//img[@alt='Swag Bot Footer']")
    private WebElement robotFooter;
    @FindBy(xpath = "//div[@class='footer_copy']")
    private WebElement footerText;
    //sideSsrAllElements
    @FindBy(id = "react_burger_menu_btn")
    private WebElement SideBarOpenIcon;
    @FindBy(xpath = "//div[@class='bm_cross_button']")
    private WebElement sideBarCloseIcon;
    @FindBy(id = "inventory_sidebar_link")
    private WebElement sideBarAllItimes;
    @FindBy(id = "about_sidebar_link")
    private WebElement aboutSideBar;
    @FindBy(id = "logout_sidebar_link")
    private WebElement logout;
    @FindBy(id = "reset_sidebar_link")
    private WebElement resetApp;
    //BackPack
    @FindBy(id = "add_to_cart_sauce_labs_backpack")
    private WebElement addOnToCartBackpack;
    @FindBy(id = "add_to_cart_sauce_labs_bike_light")
    private WebElement addBikeLightToCartButton;
    @FindBy(id = "add_to_cart_sauce_labs_backpack")
    private WebElement addLabsBackPack;
    //Tests
    public InventoryPage(WebDriver driver) {
        super(driver);
    }
    //inventoryPageAllElements
    public void setInventoryListShouldBeDisplayed() {
        Assert.assertTrue(inventoryList.isDisplayed());
    }

    public void checkAllProductsAreDisplayed() {
        for (WebElement product : productCards) {
            Assert.assertTrue(product.isDisplayed());
        }
    }

    public void checkAmountOfProducts(int expectedAmount) {
        Assert.assertEquals("Amount of products is not" + expectedAmount, productCards.size(), expectedAmount);
    }

    public void checkProductsNameIsDisplayed() {
        for (WebElement productTitle : titleProducts) {
            Assert.assertTrue(productTitle.isDisplayed());
        }
    }

    public void checkProductTitleAmount(int expectedAmount) {
        Assert.assertEquals("Amount of title products is not" + expectedAmount, titleProducts.size(), expectedAmount);
    }

    public void checkProductNameIsNotEmpty() {
        for (WebElement productTitle : titleProducts) {
            Assert.assertFalse(productTitle.getText().isEmpty());
        }
    }

    public void checkLogoIsDisplayed() {
        Assert.assertTrue(logoInventoryPage.isDisplayed());
    }

    public void checkRobotIsDisplayed() {
        Assert.assertTrue(robot.isDisplayed());
    }

    public void checkProductNameIsDisplayed() {
        Assert.assertTrue(titleAllProducts.isDisplayed());
    }
    public void checkPriceIsDisplayed() {
        for (WebElement priceIsNotEmpty : priceList) {
            Assert.assertFalse(priceIsNotEmpty.getText().isEmpty());
        }
    }

    public void checkImgIsDisplayed() {
        Assert.assertTrue(robot.isDisplayed());
    }

    public void setProductBadge() {
        Assert.assertTrue(productBadge.isDisplayed());
    }

    public void clickToTheBadge() {
        productBadge.click();
    }

    //footer
    public void checkTwitterLink() {
        Assert.assertTrue(twitterIconLink.isDisplayed());
    }

    public void checkFacebookLink() {
        Assert.assertTrue(facebookIconLink.isDisplayed());
    }

    public void checkLinkedinLink() {
        Assert.assertTrue(linkedinIconLink.isDisplayed());
    }

    public void checkRobotFooterLink() {
        Assert.assertTrue(robotFooter.isDisplayed());
    }

    public void checkFooterTextLink() {
        Assert.assertTrue(footerText.isDisplayed());
    }
    //sideBarAllElements
    public void clickOnTheSideBarOpenIcon() {
        {
            Actions actions = new Actions(driver);
            actions.moveToElement(SideBarOpenIcon).perform();
        }
        SideBarOpenIcon.click();
    }
    public void allItimesIsDisplayed() throws InterruptedException {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(sideBarAllItimes));
        Assert.assertTrue(sideBarAllItimes.isDisplayed());
    }
    public void aboutIsDisplayed() {
        Assert.assertTrue(aboutSideBar.isDisplayed());
    }
    public void logoutIsDisplayed() {
        Assert.assertTrue(logout.isDisplayed());
    }
    public void resetAppStateIsDisplayed() {
        Assert.assertTrue(resetApp.isDisplayed());
    }
    public void clickOnTheSideBarCloseIcon() {
        sideBarCloseIcon.click();
    }
    public void setSideBarAllItimesIsNotDisplayed() {
        Assert.assertFalse(sideBarAllItimes.isDisplayed());
    }
    //sortAllElements
    public void sort() {
        productSortContainer.click();
    }
    public void setSortNameAToZ() {
        Assert.assertTrue(sortNameAToZ.isDisplayed());
    }
    public void setSortNameZToA() {
        Assert.assertTrue(sortNameZToA.isDisplayed());
    }
    public void setSortNameLohi() {
        Assert.assertTrue(sortNameLohi.isDisplayed());
    }
    public void setSortNameHilo() {
        Assert.assertTrue(sortNameHilo.isDisplayed());
    }
    public void clickSortCloseIcon() {
        productSortContainer.click();
    }
    public void clickOnToBackpack() {
        addOnToCartBackpack.click();
    }
    public void clickOnAddToCartBikeLight() {
        clickOnTheElement(addBikeLightToCartButton);
    }
    public void clickOnAddToLabsBackPack() {
        clickOnTheElement(addLabsBackPack);
    }
    public void clickOnTheCartIcon() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(productBadge));
        productBadge.click();
    }
    public void clickOnTheResetAppState() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(resetApp));
        resetApp.click();
    }
    public void resetAppClick() {
        resetApp.click();
    }
    public void resetAppState(){
        clickOnTheSideBarOpenIcon();
        clickOnTheResetAppState();
        clickOnTheSideBarCloseIcon();
        refreshPage();
    }
}











