package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestActions {

    public By username = By.cssSelector("#user-name");
    public By password = By.cssSelector("#password");
    public By loginBtn = By.cssSelector("#login-button");

    @Test
    void loginTest() {
        Selenide.open("https://www.saucedemo.com/");

        // Ввести логин
        $(username).sendKeys("standard_user");
        // Ввести пароль
        $(password).sendKeys("secret_sauce");
        // Нажать на кнопочку
        $(loginBtn).click();
        Selenide.sleep(5000);

    }
}
