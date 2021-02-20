package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.selenide.AllureSelenide;
import jdk.nashorn.internal.runtime.PropertyListeners;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static jdk.nashorn.internal.runtime.PropertyListeners.addListener;

public class TestBase {
    static DesiredCapabilities capabilities = new DesiredCapabilities();

    @BeforeAll
    static void setup() {

        Configuration.startMaximized = true;
        // config for Java + Selenide
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud:4444/wd/hub";
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
    }


}