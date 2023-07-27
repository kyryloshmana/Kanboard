package COMBINED.BaseTests;

import API.steps.ApiSteps;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TaskBaseTestCombined extends ApiSteps {


    @BeforeMethod
    @Description("Create user" +
            "Create project"+
            "Open Log In page"+
            "log in")
    public void setUp(){
        RestAssured.baseURI = "http://localhost:81/jsonrpc.php";
        Allure.addAttachment("API URL", "text/plain","http://localhost:81/jsonrpc.php" );
        createUser();
        createProject();
        String browser = System.getProperty("browser", "chrome");
        if("chrome".equals(browser)){
            Allure.addAttachment("The browser in use", "text/plain", "chrome");
            Configuration.browser = "chrome";
        }else if("firefox".equals(browser)){
            Allure.addAttachment("The browser in use", "text/plain", "firefox");
            Configuration.browser = "firefox";
        }else if ("chromeHeadless".equals(browser)) {
            Allure.addAttachment("The browser in use", "text/plain", "chromeHeadless");
            Configuration.headless = true;
            Configuration.browser = "chrome";
        }else{
           throw new IllegalArgumentException("Невідомий браузер" + browser);
        }
        Selenide.open("http://localhost:81/login");
//        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterMethod
    @Description("Delete Project"+
            "Delete created user"+
            "Close window" )
    public void quit(){
        deleteProject();
        deleteUser();
        Selenide.closeWindow();
    }





}
