package UI.tests;

import DATA.UsersData;
import UI.steps.LogInPage;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import UI.steps.MainPage;
import UI.steps.ProjectPage;

import static DATA.UsersData.USER;

public class ProjectTest extends BaseUITest {
    public static final String PROJECT_NAME = "ProjectNameUI";
    public static int IDENTIFIER_NAME = ProjectPage.uniqueId();

    @Test()
    @Description("Create project with correct credentials ")
    public void createProjectUI(){
        new LogInPage()
                .logIn(USER.getUsername(), USER.getPassword());
        new MainPage()
                .clickToCreateProjectButton()
                .enterProjectName(PROJECT_NAME)
                .enterProjectIdentifier(IDENTIFIER_NAME)
                .clickToSaveButton();

        String title = new ProjectPage().getCreatedTitleProject();
        Assert.assertEquals(title, PROJECT_NAME);

    }

}
