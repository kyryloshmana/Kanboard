package utils;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class LogInPage {
    private final SelenideElement usernameField = $x("//input[@id='form-username']");
    private final SelenideElement passwordField = $x("//input[@id='form-password']");
    private final SelenideElement signInButton = $x("//button[text()='Sign in']");

    public SelenideElement getUsernameField() {
        return usernameField;
    }

    public SelenideElement getPasswordField() {
        return passwordField;
    }

    public SelenideElement getSignInButton() {
        return signInButton;
    }

    @Step
    public MainPage logIn(String username, String password){
        getUsernameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getSignInButton().click();
        return new MainPage();
    }
}
