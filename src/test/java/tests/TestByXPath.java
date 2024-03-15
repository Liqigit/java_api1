package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import sirius.SelenideStart;

import static com.codeborne.selenide.Selenide.$;

public class TestByXPath extends SelenideStart {
    public SelenideElement name = $(By.xpath("//*[@data-test=\"add-to-cart-sauce-labs-backpack\"]"));

    public SelenideElement name1 = $(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button"));

    @Test
    public void testByXPath() {
        name.shouldBe(Condition.visible);
    }

    @Test
    public void testByXPath1() {
        if (!name.equals(name1)) {
            throw new VerifyError("Elements are not eq");
        }
    }
}
