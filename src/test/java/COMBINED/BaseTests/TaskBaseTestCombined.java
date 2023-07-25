package COMBINED.BaseTests;

import API.steps.ApiSteps;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import UI.steps.LogInPage;
import static DATA.UsersData.USER;

public class TaskBaseTestCombined extends ApiSteps {


    @BeforeMethod
    @Description("Create user" +
            "Create project"+
            "Open Log In page"+
            "log in")
    public void setUp(){
        RestAssured.baseURI = "http://localhost:81/jsonrpc.php";
        createUser();
        createProject();

        Configuration.browser = "chrome";
        Selenide.open("http://localhost:81/login");
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
