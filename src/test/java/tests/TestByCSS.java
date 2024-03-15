package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.rtkit.aqajava.tests.lessons.lesson10.SelenideStart;

import static com.codeborne.selenide.Selenide.$;

public class TestByCSS extends SelenideStart {
    public SelenideElement invertoryItemNameByCssClass
            = $(By.cssSelector("div[class='inventory_item_name ']"));
    public SelenideElement invertoryItemCostByCssCompositeClass
            = $(By.cssSelector(
            "div.inventory_item_description div.inventory_item_price"));

    @Test
    public void testByCSS() {
        invertoryItemNameByCssClass.shouldBe(Condition.visible);
    }

    @Test
    public void testByCompositeCSS() {
        invertoryItemCostByCssCompositeClass.shouldBe(Condition.visible);
    }

}
