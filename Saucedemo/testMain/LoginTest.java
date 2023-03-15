import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class LoginTest extends TestBase {

    @Test
    public void loginWithValidDate() {
        User user = new User(username, password);
        new LoginPage(driver).login(user).setInventoryListShouldBeDisplayed();
    }
    @Test
    public void allLoginPageElementsAreDisplayed(){
        LoginPage loginPage = new LoginPage(driver);
        assertTrue(loginPage.logoIsDisplayed());
        loginPage.fieldUsernameIsDisplayed();
        loginPage.fieldPasswordIsDisplayed();
        loginPage.botIsDisplayed();
        loginPage.loginButtonShouldBeDisplayed();
        loginPage.acceptedUsernameAreIsDisplayed();
        loginPage.passwordForAllUsersIsDisplayed();
    }
    @Test
    public void loginLockOut(){
        User user = new User (lockedOut, passwordLocked);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(user);
        loginPage.loginButtonShouldBeDisplayed();
    }
    @Test
    public void loginInvalid(){
        User user = new User (userInvalid, passwordInvalid);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(user);
        loginPage.loginButtonShouldBeDisplayed();
        loginPage.messageInvalidUserShouldBeDisplayed();
    }
}
