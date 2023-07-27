package API.tests;

import API.models.DeleteUser.DeleteUserResponse;
import API.models.GetUser.GetUSerResponse;
import io.qameta.allure.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DATA.UsersData.USER;


public class CreateUserTest extends BaseTestForCreateDeleteUser {

    @Test(groups = "API")
    @Description("Create a new valid user")
    public void createUserValid() {
        user_id = createUser();
        GetUSerResponse getUser = new BaseTestForCreateDeleteUser().getUser();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(user_id, getUser.getResult().getId());
        softAssert.assertEquals(USER.getUsername(), getUser.getResult().getUsername());
        softAssert.assertEquals(USER.getName(), getUser.getResult().getName());
        softAssert.assertEquals(USER.getEmail(), getUser.getResult().getEmail());
        softAssert.assertEquals(USER.getRole(), getUser.getResult().getRole());
        softAssert.assertAll();
    }

    @AfterMethod
    @Description("Delete created user")
    public DeleteUserResponse deleteUser(){
        return new BaseTestForCreateDeleteUser().deleteUser();
    }
}