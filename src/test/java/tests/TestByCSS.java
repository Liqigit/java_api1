package tests;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import sirius.SelenideStart;

import static com.codeborne.selenide.Selenide.$;

public class TestByCSS extends SelenideStart {
    public SelenideElement invertoryItemNameByCssClass
            = $(By.cssSelector("div[class='inventory_item_name ']"));
    public SelenideElement invertoryItemCostByCssCompositeClass
            = $(By.cssSelector(
            "div.inventory_item_description div.inventory_item_price"));
    public SelenideElement myElement = $(By.cssSelector("div.inventory_item_desc"));
    public SelenideElement myElement2 = $(By.cssSelector("div.inventory_item_img"));

    @Test
    public void testByCSS() {
        invertoryItemNameByCssClass.shouldBe(Condition.visible);
    }

    @Test
    public void testByCompositeCSS() {
        invertoryItemCostByCssCompositeClass.shouldBe(Condition.visible);
    }

    @Test
    public void customTest() {
        myElement.shouldBe(Condition.visible);
    }
    @Test
    public void customTest2() {
        myElement.shouldBe(Condition.visible);
    }
}
