package UI.steps;

import com.codeborne.selenide.*;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class TaskPage {
    private final SelenideElement createdTaskName = $x("//a[text()='API_TASK']");
    private final SelenideElement closeThisTaskButton = $x("//a[text()='Close this task']");
    private final SelenideElement yesButton = $x("//button[text()='Yes']");
    private final SelenideElement taskStatus = $x("//*[@id='task-summary']/div/div/div[1]/ul/li[1]/span");
    private final SelenideElement addCommentButton = $x("//a[text()='Add a comment']");
    private final SelenideElement commentArea = $x("//div[@id='modal-content']//form//div[@class='text-editor']//textarea");
    private final SelenideElement comment =$x("//div[@id='comments']/div[@class='comment ']//div[@class='comment-content']//div//p");
    private final SelenideElement saveButton = $x("//div[@id='modal-content']//form//div[@class='js-submit-buttons-rendered']//div//button");

    public SelenideElement getComment() {
        return comment;
    }

    public SelenideElement getSaveButton() {
        return saveButton;
    }

    public SelenideElement getTaskStatus() {
        sleep(2000);
        return taskStatus;
    }

    public SelenideElement getCreatedTaskName() {
        return createdTaskName;
    }

    public SelenideElement getCloseThisTaskButton() {
        return closeThisTaskButton;
    }

    public SelenideElement getYesButton() {
        return yesButton;
    }

    public SelenideElement getAddCommentButton() {
        return addCommentButton;
    }

    public SelenideElement getCommentArea() {
        return commentArea;
    }

    @Step
    @Story("Return created comment")
    public String getCreatedComment(){
        return getComment().getText();
    }

    @Step
    @Story("CLick to save button. New task was create")
    public TaskPage clickToSaveButton(){
        getSaveButton().click();
        return this;
    }

    @Step
    @Story("Enter comment")
    public TaskPage enterComment(String text){
        getCommentArea().sendKeys(text);
        return this;
    }

    @Step
    @Story("Click to add comment button. Opened form for add comment")
    public TaskPage clickToAddCommentButton(){
        getAddCommentButton().click();
        return this;
    }

    @Step
    @Story("Return task status")
    public String  getTextTaskStatus(){
        return getTaskStatus().getText();
    }

    @Step
    @Story("Return form name")
    public String getNameFromCreatedTask(){
        return getCreatedTaskName().getText();
    }

    @Step
    @Story("Click to new created task. Opened task data")
    public TaskPage clickToCreatedTask(){
        getCreatedTaskName().click();
        return this;
    }

    @Step
    @Story("Click to close task. After should be change status task")
    public TaskPage clickToCloseThisTaskButton(){
        getCloseThisTaskButton().click();
        return this;
    }

    @Step
    @Story("Click to Yes baton. Form is close")
    public TaskPage clickToYesButton(){
        getYesButton().click();
        return this;
    }
}
