package API.steps;

import API.models.CreateProject.CreateProjectRequest;
import API.models.CreateTask.CreateTaskRequest;
import API.models.CreateUser.CreateUserRequest;
import API.models.DeleteProject.DeleteProjectRequest;
import API.models.DeleteTask.DeleteTaskRequest;
import API.models.DeleteUser.DeleteUserRequest;
import API.models.GetProject.GetProjectRequest;
import API.models.GetTask.GetTaskRequest;
import API.models.GetUser.GetUserRequest;
import DATA.AdminValue;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static DATA.AdminValue.ADMIN_VALUE;

public class ApiHelper {
    protected static int user_id;
    protected static int project_id;
    protected static int task_id;

    @Story("Response about ")
    public static Response postAdminRequest(CreateUserRequest createUserRequest){
        return RestAssured.given().log().all()
                .auth().basic(ADMIN_VALUE.getUsername(), ADMIN_VALUE.getPassword())
                .body(createUserRequest)
                .post();
    }
    @Story("Response about create project")
    public static Response postRequest(CreateProjectRequest createProjectRequest, String username, String password){
        return RestAssured.given().log().all()
                .auth().basic(username, password)
                .body(createProjectRequest)
                .post();
    }
    @Story("Response about create task")
    public static Response postRequest(CreateTaskRequest createTaskRequest, String username, String password){
        return RestAssured.given().log().all()
                .auth().basic(username, password)
                .body(createTaskRequest)
                .post();
    }
    @Story("Response about get user data")
    public static Response getRequest(GetUserRequest getUserRequest){
        return RestAssured.given().log().all()
                .auth().basic(ADMIN_VALUE.getUsername(), ADMIN_VALUE.getPassword())
                .body(getUserRequest)
                .get();
    }
    @Story("Response about get task data ")
    public static Response getRequest(GetTaskRequest getTaskRequest, String username, String password){
        return RestAssured.given().log().all()
                .auth().basic(username, password)
                .body(getTaskRequest)
                .get();
    }
    @Story("Response about get project data ")
    public static Response getRequest(GetProjectRequest getProjectRequest, String username, String password){
        return RestAssured.given().log().all()
                .auth().basic(username, password)
                .body(getProjectRequest)
                .get();
    }
    @Story("Response about delete task ")
    public static Response deleteRequest(DeleteTaskRequest deleteTaskRequest, String username, String password){
        return RestAssured.given().log().all()
                .auth().basic(username, password)
                .body(deleteTaskRequest)
                .delete();
    }
    @Story("Response about delete project")
    public static Response deleteRequest(DeleteProjectRequest deleteProjectRequest, String username, String password){
        return RestAssured.given().log().all()
                .auth().basic(username, password)
                .body(deleteProjectRequest)
                .delete();
    }
    @Story("Response about delete user")
    public static Response deleteRequest(DeleteUserRequest deleteUserRequest){
        return RestAssured.given().log().all()
                .auth().basic(ADMIN_VALUE.getUsername(), ADMIN_VALUE.getPassword())
                .body(deleteUserRequest)
                .delete();
    }


}
