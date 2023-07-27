package UI.steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

import static DATA.TaskData.TASK_DATA;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class ProjectPage {
    private final SelenideElement titledProject = $x("//span[@class='title']");
    private final SelenideElement createdNumberProject=$x("//a[text()='API_Project']");
    private final SelenideElement addNewTaskIcon = $x("//div[@class='board-add-icon'][1]");
    private final SelenideElement inputName = $x("//input[@name='title']");
    private final SelenideElement inputDescription = $x("//textarea[@name='description']");
    private final SelenideElement saveButton = $x("//button[text()='Save']");

    public SelenideElement getAddNewTaskIcon() {
        return addNewTaskIcon;
    }

    public SelenideElement getInputName() {
        return inputName;
    }

    public SelenideElement getInputDescription() {
        return inputDescription;
    }

    public SelenideElement getSaveButton() {
        return saveButton;
    }

    public SelenideElement getTitledProject() {
        return titledProject;
    }

    public SelenideElement getCreatedNumberProject() {
        return createdNumberProject;
    }







    @Step
    @Story("Click to icon for added new task")
    public ProjectPage clickToAddNewTaskIcon(){
        getAddNewTaskIcon().click();
        return this;
    }

    @Step
    @Story("Entered tasks name")
    public ProjectPage sendTaskName(){
        getInputName().sendKeys(TASK_DATA.getTitle());
        return this;
    }

    @Step
    @Story("Entered tasks description")
    public ProjectPage sendTaskDescription(){
        getInputDescription().sendKeys(TASK_DATA.getDesc());
        return this;
    }

    @Step
    @Story("Click to Save Button. Return Project page with create project")
    public ProjectPage clickToSaveButton(){
        getSaveButton().click();
        return this;
    }

    @Step
    @Story("Getting created task name")
    public String getCreatedTitleProject(){
        sleep(1000);
        return getTitledProject().getText();
    }

    @Step
    @Story("Open new created project")
    public ProjectPage clickToCreatedProject(){
        getCreatedNumberProject().click();
        return this;
    }

    @Story("Return random number")
    public static int uniqueId(){
        int n = 100000;
        return (int) (Math.random() * (n + 1));
    }
}
