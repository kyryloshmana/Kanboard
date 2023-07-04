package test;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.LogInPage;
import utils.MainPage;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class LogInTest {
    private final static String NAME = "admin";
    private final static String PASS = "admin";

    @Test
    public void loginWithCorrectCredentialAdmin(){
        new LogInPage().
            logIn(NAME, PASS);
        }
}
