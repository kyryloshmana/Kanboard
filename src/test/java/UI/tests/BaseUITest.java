package UI.tests;

import API.steps.ApiHelper;
import API.steps.ApiSteps;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class BaseUITest extends ApiSteps {

    @BeforeMethod()
    @Description("Create user and Open Log In page")
    public void setUp(){
        RestAssured.baseURI = "http://localhost:81/jsonrpc.php";
        Allure.addAttachment("API URL", "text/plain","http://localhost:81/jsonrpc.php" );
        createUser();
        Allure.addAttachment("The browser in use", "text/plain", "chrome");
        Configuration.browser = "chrome";
        Allure.addAttachment("", "text/plain", "http://localhost:81/login");
        Selenide.open("http://localhost:81/login");

        //        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterMethod()
    @Description("Close window and Delete created user")
    public void quit(){
        Selenide.closeWindow();
        deleteUser();
    }
}
