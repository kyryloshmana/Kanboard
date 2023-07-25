package API.steps;

import API.models.CreateProject.CreateProjectResponse;
import API.models.CreateTask.CreateTaskResponse;
import API.models.CreateUser.CreateUserResponse;
import API.models.DeleteProject.DeleteProjectResponse;
import API.models.DeleteTask.DeleteTaskResponse;
import API.models.DeleteUser.DeleteUserResponse;
import API.models.GetProject.GetProjectResponse;
import API.models.GetTask.GetTaskResponse;
import API.models.GetUser.GetUSerResponse;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.testng.Assert;

import static API.steps.ApiRequests.*;
import static DATA.UsersData.USER;

public class ApiSteps extends ApiHelper {
    @Step
    @Description("Method that created new valid user")
    public static int createUser(){
        Response response = postAdminRequest(createUserBody());
        response.then().statusCode(200);
        response.prettyPrint();
        CreateUserResponse createUserResponse = response.as(CreateUserResponse.class);
        return user_id = createUserResponse.getResult();
    }

    @Step
    @Description("The method that deleted created user")
    public DeleteUserResponse deleteUser(){
        Response response = deleteRequest(deleteUserRequest(user_id));
        response.then().statusCode(200);
        response.prettyPrint();
        DeleteUserResponse deleteUserResponse = response.as(DeleteUserResponse.class);
        return deleteUserResponse;
    }

    @Step
    @Description("The method that deleted created project")
    public DeleteProjectResponse deleteProject(){
        Response response = deleteRequest(deleteProjectRequest(project_id), USER.getUsername(), USER. getPassword());
        response.then().statusCode(200);
        response.prettyPrint();
        DeleteProjectResponse deleteProjectResponse = response.as(DeleteProjectResponse.class);
        return deleteProjectResponse;
    }

    @Step
    @Description("The method that deleted created task")
    public DeleteTaskResponse deleteTask(){
        Response response = deleteRequest(deleteTaskRequest(task_id),USER.getUsername(), USER. getPassword());
        response.then().statusCode(200);
        response.prettyPrint();
        DeleteTaskResponse deleteTaskResponse = response.as(DeleteTaskResponse.class);
        return deleteTaskResponse;
    }

    @Step
    @Description("Method that return created user")
    public GetUSerResponse getUser(){
        Response responseGetUser = getRequest(getUserRequest(user_id));
        responseGetUser.then().statusCode(200);
        responseGetUser.prettyPrint();
        GetUSerResponse getUserResponse = responseGetUser.as(GetUSerResponse.class);
        return getUserResponse;
    }

    @Step
    @Description("Method that return created project")
    public GetProjectResponse getProject(){
        Response getProject = getRequest(getProjectRequest(project_id), USER.getUsername(), USER.getPassword());
        getProject.then().statusCode(200);
        getProject.prettyPrint();
        GetProjectResponse getProjectResponse = getProject.as(GetProjectResponse.class);
        return getProjectResponse;
    }

    @Step
    @Description("Method that return created task")
    public GetTaskResponse getTask(){
        Response getTask = getRequest(getTaskRequest(task_id), USER.getUsername(), USER.getPassword());
        getTask.then().statusCode(200);
        getTask.prettyPrint();
        GetTaskResponse getTaskResponse = getTask.as(GetTaskResponse.class);
        return getTaskResponse;
    }

    @Step
    @Description("Method that created new valid project")
    public static int createProject(){
        Response response = postRequest(createProjectRequest(user_id), USER.getUsername(), USER.getPassword());
        response.then().statusCode(200);
        response.prettyPrint();
        CreateProjectResponse createProjectResponse = response.as(CreateProjectResponse.class);
        return project_id = createProjectResponse.getResult();
    }

    @Step
    @Description("Method that created new valid task")
    public static int createTask(){
        Response response = postRequest(createTaskRequest(user_id, project_id), USER.getUsername(), USER.getPassword());
        response.then().statusCode(200);
        response.prettyPrint();
        CreateTaskResponse createTaskResponse = response.as(CreateTaskResponse.class);
        return task_id = createTaskResponse.getResult();
    }

}
