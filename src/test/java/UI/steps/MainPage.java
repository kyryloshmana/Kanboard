package UI.steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {


    private final SelenideElement dashboardForAdminTitle = $x("//span[@class='title']");
    private final SelenideElement createProjectButton = $x("//*[@class='page-header']//ul//li//*[text()='New project']");
    private final SelenideElement nameCreatingProjectInput = $x("//input[@id='form-name']");
    private final SelenideElement identifierCreatingProjectInput = $x("//input[@id='form-identifier']");
    private final SelenideElement saveButton = $x("//button[text()='Save']");


    public SelenideElement getUserName() {
        return dashboardForAdminTitle;
    }

    public SelenideElement getCreateProjectButton() {
        return createProjectButton;
    }

    public SelenideElement getNameCreatingProjectInput() {
        return nameCreatingProjectInput;
    }

    public SelenideElement getIdentifierCreatingProjectInput() {
        return identifierCreatingProjectInput;
    }

    public SelenideElement getSaveButton() {
        return saveButton;
    }

    @Step
    @Story("Get user name")
    public String getTitle(){
        return getUserName().getText();
    }

    @Step
    @Story("Click to create project button. Open new form")
    public MainPage clickToCreateProjectButton(){
        getCreateProjectButton().click();
        return this;
    }

    @Step
    @Story("Enter a project name")
    public MainPage enterProjectName(String name){
        getNameCreatingProjectInput().sendKeys(name);
        return this;
    }

    @Step
    @Story("Enter a project identifier")
    public MainPage enterProjectIdentifier(int identifier){
        getIdentifierCreatingProjectInput().sendKeys(Integer.toString(identifier));
        return this;
    }

    @Step
    @Story("Click to save button. The create form is close. Created new project")
    public void clickToSaveButton(){
        getSaveButton().click();
        }


}
