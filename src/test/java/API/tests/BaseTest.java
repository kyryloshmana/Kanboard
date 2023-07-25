package API.tests;

import API.models.DeleteUser.DeleteUserResponse;
import API.steps.ApiSteps;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.*;

public class BaseTest extends ApiSteps {


    @BeforeMethod
    @Description("Create user")
    public static int createUser(){
        RestAssured.baseURI = "http://localhost:81/jsonrpc.php";
        ApiSteps.createUser();
        return user_id;
    }

    @AfterMethod
    @Description("Delete user")
    public DeleteUserResponse deleteUser(){
        DeleteUserResponse response = new BaseTestForCreateDeleteUser().deleteUser();
        return response;

    }
}
