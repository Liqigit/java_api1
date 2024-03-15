package sirius;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.openqa.selenium.By.xpath;

public class AuthPage {
    private final By userName = xpath("//input[@placeholder='Username']");

    private final By password = xpath("//input[@placeholder='Password']");
    private final By loginBtn = xpath("//input[@id='login-button']");

    public AuthPage() {
        $(userName).should(exist);
    }

    @Step("[ui] Логин")
    public AuthPage login(String userName, String password) {
        $(this.userName).sendKeys(userName);
        sleep(1000);
        $(this.password).sendKeys(password);
        sleep(1000);
        $(this.loginBtn).click();
//        $(this.sendAnyWayBtn).click();
        return this;
    }

    @Step("[ui] Проверка отображения <Страницы авторизации>")
    public void checkVisible() {
        $(userName).should(Condition.visible);
    }

    @Step("[ui] Проверка url")
    public void check_url(String expected_url) {
        assertThat(url(), containsString(expected_url));
    }

}
