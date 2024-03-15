package tests;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import sirius.SelenideStart;

import static com.codeborne.selenide.Selenide.$;

public class TestMethods extends SelenideStart {
    public By addCartButton = By.xpath("//button[@data-test=\"add-to-cart-sauce-labs-backpack\"]");
    public By removeCartButton = By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]");
    public By cartButton = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    @Test
    public void testAddToCart() {
        $(addCartButton).shouldBe(visible).click();
        Assertions.assertEquals($(removeCartButton).getText(), "Remove");
        sleep(2000);
        $(removeCartButton).shouldBe(visible);
    }

    @Test
    public void goToCart() {
        $(cartButton).shouldBe(visible).click();
        sleep(2000);
    }
}
