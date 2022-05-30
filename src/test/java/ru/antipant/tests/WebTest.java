package ru.antipant.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;
import static io.qameta.allure.Allure.step;

public class WebTest extends TestBase {

    @Test
    @DisplayName("Заголовок страницы должен иметь название")
    void titleTest() {
        step("Открыть 'https://www.comindware.com/ru/'", () ->
                open("https://www.comindware.com/ru/"));

        step("В заголовке должен быть текст 'Цифровая трансформация бизнеса с Comindware'", () -> {
            String expectedTitle = "Цифровая трансформация бизнеса с Comindware";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

}
