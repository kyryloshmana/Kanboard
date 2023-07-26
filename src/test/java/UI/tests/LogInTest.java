package UI.tests;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import UI.steps.LogInPage;
import UI.steps.MainPage;

import static DATA.UsersData.USER;


public class LogInTest extends BaseUITest {

    @Test()
    @Description("Login with correct Username and Password")
    public void loginWithCorrectCredentialAdmin(){
        new LogInPage().
            logIn(USER.getUsername(), USER.getPassword());
        String title = new MainPage()
                .getTitle();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(title, "Dashboard for " + USER.getName());
        softAssert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(),"http://localhost:81/dashboard");
        softAssert.assertAll();
        }

        @Test ()
        @Description("Login with correct Username and incorrect Password")
        public void loginWithIncorrectPassword(){
           new LogInPage()
                .logIn(USER.getUsername(), "qwe");
           String error = new LogInPage()
                   .getErrorText();
           Assert.assertEquals(error, "Bad username or password");
        }

    @Test
    @Description("Login with incorrect Username and correct Password")
    public void loginWithIncorrectUsername(){
        new LogInPage()
                .logIn("qwe", USER.getPassword());
        String error = new LogInPage()
                .getErrorText();
        Assert.assertEquals(error, "Bad username or password");
    }


}
