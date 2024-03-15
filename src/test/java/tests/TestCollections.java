package tests;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import sirius.SelenideStart;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

public class TestCollections extends SelenideStart {
    public By buttons = By.xpath("//button[text()='Add to cart']");

    @Test
    void test() {
        $$(buttons).shouldBe(size(6));
        sleep(2000);
    }

    @Test
    void test1() {
        $$(buttons).get(2).click();
        sleep(2000);
    }
}
