package ru.antipant.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import ru.antipant.config.WebConfig;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    public static void beforeTest() {
        WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.browser = webConfig.getBrowser();
        Configuration.browserVersion = webConfig.getBrowserVersion();
        if (!webConfig.getRemoteWebDriver().equals("")) {
            Configuration.remote = webConfig.getRemoteWebDriver();
        }
        String baseUrlString = System.getProperty("baseUrl");
        if (Objects.isNull(baseUrlString)) {
            baseUrlString = "https://www.comindware.com/ru/";
        }
        open(baseUrlString);
    }
}
