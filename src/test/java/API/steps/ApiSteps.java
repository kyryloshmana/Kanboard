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
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static API.steps.ApiRequests.*;
import static DATA.UsersData.USER;

public class ApiSteps extends ApiHelper {
    @Step
    @Description("Method that created new valid user")
    public static int createUser(){
        Response response = postAdminRequest(createUserBody());
        response.then().statusCode(200);
        response.prettyPrint();
        Allure.addAttachment("Get Api Response for Create User Method", "text/plain",response.prettyPrint() );
        CreateUserResponse createUserResponse = response.as(CreateUserResponse.class);
        return user_id = createUserResponse.getResult();
    }

    @Step
    @Description("The method that deleted created user")
    public DeleteUserResponse deleteUser(){
        Response response = deleteRequest(deleteUserRequest(user_id));
        response.then().statusCode(200);
        response.prettyPrint();
        Allure.addAttachment("Get Api Response for Delete User Method", "text/plain",response.prettyPrint() );
        DeleteUserResponse deleteUserResponse = response.as(DeleteUserResponse.class);
        return deleteUserResponse;
    }

    @Step
    @Description("The method that deleted created project")
    public DeleteProjectResponse deleteProject(){
        Response response = deleteRequest(deleteProjectRequest(project_id), USER.getUsername(), USER. getPassword());
        response.then().statusCode(200);
        response.prettyPrint();
        Allure.addAttachment("Get Api Response for Delete Project Method", "text/plain",response.prettyPrint());
        DeleteProjectResponse deleteProjectResponse = response.as(DeleteProjectResponse.class);
        return deleteProjectResponse;
    }

    @Step
    @Description("The method that deleted created task")
    public DeleteTaskResponse deleteTask(){
        Response response = deleteRequest(deleteTaskRequest(task_id),USER.getUsername(), USER. getPassword());
        response.then().statusCode(200);
        response.prettyPrint();
        Allure.addAttachment("Get Api Response for Delete Task Method", "text/plain",response.prettyPrint());
        DeleteTaskResponse deleteTaskResponse = response.as(DeleteTaskResponse.class);
        return deleteTaskResponse;
    }

    @Step
    @Description("Method that return created user")
    public GetUSerResponse getUser(){
        Response response = getRequest(getUserRequest(user_id));
        response.then().statusCode(200);
        response.prettyPrint();
        Allure.addAttachment("Get Api Response for Get User Method", "text/plain",response.prettyPrint());
        return response.as(GetUSerResponse.class);
    }

    @Step
    @Description("Method that return created project")
    public GetProjectResponse getProject(){
        Response response = getRequest(getProjectRequest(project_id), USER.getUsername(), USER.getPassword());
        response.then().statusCode(200);
        response.prettyPrint();
        Allure.addAttachment("Get Api Response for Create Project Method", "text/plain",response.prettyPrint());
        GetProjectResponse getProjectResponse = response.as(GetProjectResponse.class);
        return getProjectResponse;
    }

    @Step
    @Description("Method that return created task")
    public GetTaskResponse getTask(){
        Response response = getRequest(getTaskRequest(task_id), USER.getUsername(), USER.getPassword());
        response.then().statusCode(200);
        response.prettyPrint();
        Allure.addAttachment("Get Api Response for Get Task Method", "text/plain",response.prettyPrint() );
        GetTaskResponse getTaskResponse = response.as(GetTaskResponse.class);
        return getTaskResponse;
    }

    @Step
    @Description("Method that created new valid project")
    public static int createProject(){
        Response response = postRequest(createProjectRequest(user_id), USER.getUsername(), USER.getPassword());
        response.then().statusCode(200);
        response.prettyPrint();
        Allure.addAttachment("Get Api Response for Create Project Method", "text/plain",response.prettyPrint() );
        CreateProjectResponse createProjectResponse = response.as(CreateProjectResponse.class);
        return project_id = createProjectResponse.getResult();
    }

    @Step
    @Description("Method that created new valid task")
    public static int createTask(){
        Response response = postRequest(createTaskRequest(user_id, project_id), USER.getUsername(), USER.getPassword());
        response.then().statusCode(200);
        response.prettyPrint();
        Allure.addAttachment("Get Api Response for Create Task Method", "text/plain",response.prettyPrint() );
        CreateTaskResponse createTaskResponse = response.as(CreateTaskResponse.class);
        return task_id = createTaskResponse.getResult();
    }

}
