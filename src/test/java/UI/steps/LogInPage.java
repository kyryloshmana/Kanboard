package UI.steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

import static DATA.UsersData.USER;
import static com.codeborne.selenide.Selenide.$x;

public class LogInPage {
    private final SelenideElement usernameField = $x("//input[@id='form-username']");
    private final SelenideElement passwordField = $x("//input[@id='form-password']");
    private final SelenideElement signInButton = $x("//button[text()='Sign in']");
    private final SelenideElement error = $x("//p[@class='alert alert-error']");

    public SelenideElement getUsernameField() {
        return usernameField;
    }
    public SelenideElement getPasswordField() {
        return passwordField;
    }
    public SelenideElement getSignInButton() {
        return signInButton;
    }
    public SelenideElement getError() {
        return error;
    }

    @Step
    @Story("Send Username and Password")
    public MainPage logIn(String username, String password){
        getUsernameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getSignInButton().click();
        return new MainPage();
    }

    @Step
    @Story("Getting error about incorrect data")
    public String getErrorText(){
        return getError().getText();
    }

}
