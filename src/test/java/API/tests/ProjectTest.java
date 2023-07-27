package API.tests;

import API.models.DeleteProject.DeleteProjectResponse;
import API.models.GetProject.GetProjectResponse;
import API.steps.ApiSteps;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static DATA.ProjectData.PROJECT_DATA;

public class ProjectTest extends BaseTest{
    @Test(groups = "API")
    @Description("Create a new valid project")
    public void createProjectValid(){
        project_id = createProject();
        GetProjectResponse getProject = new ApiSteps().getProject();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(project_id, getProject.result.getId());
        softAssert.assertEquals(PROJECT_DATA.getName(), getProject.result.getName());
        softAssert.assertEquals(PROJECT_DATA.getDescription(), getProject.result.getDescription());
        softAssert.assertAll();
    }

    @Test(groups = "API")
    @Description("Delete created project")
    public void deleteProjectValid(){
      project_id = createProject();
      DeleteProjectResponse deleteProject = new ApiSteps().deleteProject();
      Assert.assertTrue(deleteProject.isResult());
    }

}
