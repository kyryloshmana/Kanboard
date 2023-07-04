package utils;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {


    private final SelenideElement dashboardForAdminTitle = $x("//span[@class='title']");


    public SelenideElement getDashboardForAdminTitle() {
        return dashboardForAdminTitle;
    }

    @Step
    public String getTitle(){
        return getDashboardForAdminTitle().getText();
    }

}
