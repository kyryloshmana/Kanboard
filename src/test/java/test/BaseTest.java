package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Selenide.open("http://localhost:81/login");
        //        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterMethod
    public void quit(){
        Selenide.closeWindow();
    }
}
