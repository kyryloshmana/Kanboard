package API.tests;

import API.steps.ApiSteps;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

public class BaseTestForCreateDeleteUser extends ApiSteps {

    @BeforeMethod
    public void setUp(){
        RestAssured.baseURI = "http://localhost:81/jsonrpc.php";
    }
}
