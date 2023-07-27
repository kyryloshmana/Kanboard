package API.tests;

import API.models.DeleteTask.DeleteTaskResponse;
import API.models.GetTask.GetTaskResponse;
import API.steps.ApiSteps;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DATA.TaskData.TASK_DATA;

public class TaskTest extends BaseTest{

    @Test(groups = "API")
    @Description("Create a new valid task")
    public void createTaskValid(){
        createProject();
        task_id = createTask();
        GetTaskResponse getTask = new ApiSteps().getTask();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(getTask.getResult().getTitle(), TASK_DATA.getTitle());
        softAssert.assertEquals(getTask.getResult().getDescription(), TASK_DATA.getDesc());
        softAssert.assertEquals(getTask.getResult().getColor_id(), TASK_DATA.getColor_id());
        softAssert.assertEquals(getTask.getResult().getColumn_id(),TASK_DATA.getColumn_id());
        softAssert.assertEquals(getTask.getResult().getOwner_id(), user_id);
        softAssert.assertEquals(getTask.getResult().getProject_id(), project_id);
        softAssert.assertAll();
        }

    @Test(groups = "API")
    @Description("Delete created task")
    public void deleteTaskValid(){
        createProject();
        task_id = createTask();
        DeleteTaskResponse deleteTask = new ApiSteps().deleteTask();
        Assert.assertTrue(deleteTask.isResult());
    }
}
