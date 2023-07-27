package API.tests;

import API.models.DeleteUser.DeleteUserResponse;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DeleteUserTest extends BaseTestForCreateDeleteUser {
    @Test(groups = "API")
    @Description("Delete created user")
    public void deleteUserTest() {
        createUser();
        DeleteUserResponse response = new BaseTestForCreateDeleteUser().deleteUser();
        Assert.assertTrue(response.isResult());
    }
}
