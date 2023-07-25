package COMBINED;

import COMBINED.BaseTests.TaskBaseTestCombined;
import UI.steps.LogInPage;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import UI.steps.ProjectPage;
import UI.steps.TaskPage;

import static DATA.TaskData.TASK_DATA;
import static DATA.UsersData.USER;

public class TaskTest extends TaskBaseTestCombined {

    @Test
    @Description("Create task by UI with valid data")
    public void createTaskValidData(){
        new LogInPage().
                logIn(USER.getUsername(), USER.getPassword());
        new ProjectPage()
                .clickToCreatedProject()
                .clickToAddNewTaskIcon()
                .sendTaskName()
                .sendTaskDescription()
                .clickToSaveButton();
        String taskName = new TaskPage().getNameFromCreatedTask();
        Assert.assertEquals(taskName,TASK_DATA.getTitle());
           }

    @Test
    @Description("Close task by UI")
    public void closeTaskValidData(){
        new LogInPage().
                logIn(USER.getUsername(), USER.getPassword());
        new ProjectPage()
                .clickToCreatedProject()
                .clickToAddNewTaskIcon()
                .sendTaskName()
                .sendTaskDescription()
                .clickToSaveButton();
       String status =  new TaskPage()
                .clickToCreatedTask()
                .clickToCloseThisTaskButton()
                .clickToYesButton()
                .getTextTaskStatus();
       Assert.assertEquals(status, "closed");

    }

    @Test
    @Description("Add comment to created task")
    public void AddCommentToTaskValidData(){
        String text = "Text Comment";
        new LogInPage().
                logIn(USER.getUsername(), USER.getPassword());
        new ProjectPage()
                .clickToCreatedProject()
                .clickToAddNewTaskIcon()
                .sendTaskName()
                .sendTaskDescription()
                .clickToSaveButton();
        String comment =  new TaskPage()
                .clickToCreatedTask()
                .clickToAddCommentButton()
                .enterComment(text)
                .clickToSaveButton()
                .getCreatedComment();
        Assert.assertEquals(comment, text);
    }
}
