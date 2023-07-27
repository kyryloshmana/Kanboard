package API.steps;
import API.models.CreateTask.CreateTaskRequest;
import API.models.CreateTask.CreateTaskRequestParams;
import API.models.CreateUser.CreateUserRequest;
import API.models.CreateUser.CreateUserRequestParams;
import API.models.DeleteProject.DeleteProjectRequest;
import API.models.DeleteProject.DeleteProjectRequestParams;
import API.models.DeleteTask.DeleteTaskRequest;
import API.models.DeleteTask.DeleteTaskRequestParams;
import API.models.DeleteUser.DeleteUserRequest;
import API.models.DeleteUser.DeleteUserRequestParams;
import API.models.GetProject.GetProjectRequest;
import API.models.GetProject.GetProjectRequestParams;
import API.models.GetTask.GetTaskRequest;
import API.models.GetTask.GetTaskRequestParams;
import API.models.GetUser.GetUserRequest;
import API.models.GetUser.GetUserRequestParams;
import API.models.CreateProject.*;
import io.qameta.allure.Story;

import static DATA.ProjectData.PROJECT_DATA;
import static DATA.TaskData.TASK_DATA;
import static DATA.UsersData.*;

public class ApiRequests {
    private static final String jsonrpc = "2.0";
    private static final String methodsCreateUser = "createUser";
    private static final String methodsGetUser = "getUser";
    private static final String methodsRemoveUser = "removeUser";
    private static final String methodsCreateProject = "createProject";
    private static final String methodsGetProjectById = "getProjectById";
    private static final String methodsRemoveProject = "removeProject";
    private static final String methodsCreateTask = "createTask";
    private static final String methodsGetTaskById = "getTask";
    private static final String methodsRemoveTask = "removeTask";

    public CreateUserRequest createUserRequest(String JSONRPC, String method, int id, String username, String password, String name, String email, String role){
        return CreateUserRequest.builder()
                .jsonrpc(JSONRPC)
                .method(method)
                .id(id)
                .params(getUserRequestParams(username, password, name, email, role))
                .build();
    }

    public CreateUserRequestParams getUserRequestParams(String username, String password, String name, String email, String role){
        return CreateUserRequestParams.builder()
                .username(username)
                .password(password)
                .name(name)
                .email(email)
                .role(role)
                .build();
    }

    public GetUserRequest getUserRequest(String JSONRPC, String method, int id, int user_id){
        return GetUserRequest.builder()
                .jsonrpc(JSONRPC)
                .method(method)
                .id(id)
                .params(getUserRequestParams(user_id))
                .build();
    }

    public GetUserRequestParams getUserRequestParams(int user_id){
        return GetUserRequestParams.builder()
                .user_id(user_id)
                .build();
    }

    public GetProjectRequest getProjectRequest(String JSONRPC, String method, int id, int project_id){
        return GetProjectRequest.builder()
                .jsonrpc(JSONRPC)
                .method(method)
                .id(id)
                .params(getProjectRequestParams(project_id))
                .build();
    }

    public GetProjectRequestParams getProjectRequestParams(int project_id){
        return GetProjectRequestParams.builder()
                .project_id(project_id)
                .build();
    }

    public GetTaskRequestParams getTaskRequestParams(int task_id){
        return GetTaskRequestParams.builder()
                .task_id(task_id)
                .build();
    }

    public GetTaskRequest getTaskRequest(String JSONRPC, String method, int id, int project_id){
        return GetTaskRequest.builder()
                .jsonrpc(JSONRPC)
                .method(method)
                .id(id)
                .params(getTaskRequestParams(project_id))
                .build();
    }

    public DeleteUserRequest deleteUserRequest(String JSONRPC, String method, int id, int user_id){
        return DeleteUserRequest.builder()
                .jsonrpc(JSONRPC)
                .method(method)
                .id(id)
                .params(deleteUserRequestParams(user_id))
                .build();
    }

    public DeleteUserRequestParams deleteUserRequestParams(int user_id){
        return DeleteUserRequestParams.builder()
                .user_id(user_id)
                .build();
    }

    public DeleteProjectRequest deleteProjectRequest(String JSONRPC, String method, int id, int project_id){
        return DeleteProjectRequest.builder()
                .jsonrpc(JSONRPC)
                .method(method)
                .id(id)
                .params(deleteProjectRequestParams(project_id))
                .build();
    }

    public DeleteProjectRequestParams deleteProjectRequestParams(int project_id){
        return DeleteProjectRequestParams.builder()
                .project_id(project_id)
                .build();
    }

    public DeleteTaskRequestParams deleteTaskRequestParams(int task_id){
        return DeleteTaskRequestParams.builder()
                .task_id(task_id)
                .build();
    }


    public DeleteTaskRequest deleteTaskRequest(String JSONRPC, String method, int id, int task_id){
        return DeleteTaskRequest.builder()
                .jsonrpc(JSONRPC)
                .method(method)
                .id(id)
                .params(deleteTaskRequestParams(task_id))
                .build();
    }

    public CreateProjectRequestParams createProjectRequestParams(String name, String desc, int owner_id){
        return CreateProjectRequestParams.builder()
                .name(name)
                .description(desc)
                .owner_id(owner_id)
                .build();
    }

    public CreateProjectRequest createProjectRequest(String JSONRPC, String method, int id, String name, String desc, int owner_id){
        return CreateProjectRequest.builder()
                .jsonrpc(JSONRPC)
                .method(method)
                .id(id)
                .params(createProjectRequestParams(name, desc, owner_id))
                .build();
    }

    public CreateTaskRequestParams createTaskRequestParams(String title, String desc, String color_id, int owner_id, int column_id, int priority, int project_id ){
        return CreateTaskRequestParams.builder()
                .title(title)
                .description(desc)
                .color_id(color_id)
                .owner_id(owner_id)
                .column_id(column_id)
                .priority(priority)
                .project_id(project_id)
                .build();
    }


    public CreateTaskRequest createTaskRequest(String JSONRPC, String method, int id, String title, String desc, String color_id, int owner_id, int column_id, int priority, int project_id ){
        return CreateTaskRequest.builder()
                .jsonrpc(JSONRPC)
                .method(method)
                .id(id)
                .params(createTaskRequestParams(title, desc, color_id, owner_id, column_id, priority, project_id))
                .build();
    }

    /********************/
    @Story("Request about delete task ")
    public static DeleteTaskRequest deleteTaskRequest(int task_id){
        return new ApiRequests().deleteTaskRequest(
                jsonrpc,
                methodsRemoveTask,
                890,
                task_id
        );
    }
    @Story("Request about create task")
    public static CreateTaskRequest createTaskRequest(int user_id, int project_id){
        return new ApiRequests().createTaskRequest(
                jsonrpc,
                methodsCreateTask,
                678,
                TASK_DATA.getTitle(),
                TASK_DATA.getDesc(),
                TASK_DATA.getColor_id(),
                user_id,
                TASK_DATA.getColumn_id(),
                TASK_DATA.getPriority(),
                project_id
        );
    }
    @Story("Request about delete project")
    public static DeleteProjectRequest deleteProjectRequest(int project_id){
        return new ApiRequests().deleteProjectRequest(
                jsonrpc,
                methodsRemoveProject,
                567,
                project_id
        );
    }
    @Story("Request about create project")
    public static CreateProjectRequest createProjectRequest(int user_id){
        return new ApiRequests().createProjectRequest(
                jsonrpc,
                methodsCreateProject,
                345,
                PROJECT_DATA.getName(),
                PROJECT_DATA.getDescription(),
                user_id
        );
    }
    @Story("Request about create user")
    public static CreateUserRequest createUserBody(){
        return new ApiRequests().createUserRequest(
                jsonrpc,
                methodsCreateUser,
                123123,
                USER.getUsername(),
                USER.getPassword(),
                USER.getName(),
                USER.getEmail(),
                USER.getRole());
    }
    @Story("Request about get user data")
    public static GetUserRequest getUserRequest(int user_id){
        return new ApiRequests().getUserRequest(
                jsonrpc,
                methodsGetUser,
                123,
                user_id
        );
    }
    @Story("Request about get task data")
    public static GetTaskRequest getTaskRequest(int task_id){
        return new ApiRequests().getTaskRequest(
                jsonrpc,
                methodsGetTaskById,
                789,
                task_id
        );
    }
    @Story("Request about delete user")
    public static DeleteUserRequest deleteUserRequest(int user_id){
        return new ApiRequests().deleteUserRequest(
                jsonrpc,
                methodsRemoveUser,
                234,
                user_id
        );
    }
    @Story("Request about get project data")
    public static GetProjectRequest getProjectRequest(int project_id){
        return new ApiRequests().getProjectRequest(
                jsonrpc,
                methodsGetProjectById,
                456,
                project_id
        );
    }


}
