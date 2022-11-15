package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class MainPageTests extends TestBase {

    @Test
    @DisplayName("Заголовок главной страницы")
    void titleTest() {
        step("Открыть сайт 'https://astondevs.ru'", () ->
                open("https://astondevs.ru"));

        step("Страница должна иметь заголовок 'Разработка программного обеспечения для Бизнеса - Aston'", () -> {
            String expectedTitle = "Разработка программного обеспечения для Бизнеса - Aston";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

}