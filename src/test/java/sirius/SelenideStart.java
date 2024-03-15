package sirius;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.open;

public class SelenideStart {

    static {
        Configuration.timeout = 30000;
        Configuration.pageLoadTimeout = 30000;
        Configuration.browserSize = "1920x1080";
        Configuration.proxyEnabled = false;
        String browser = "Chrome";
        Configuration.savePageSource = false;
        Configuration.browser = browser;
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--autoplay-policy=no-user-gesture-required");
//        caps.setCapability("browserVersion", "119.0");
//        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--disable-web-security");
//        options.addArguments("--disable-notifications");
//        options.addArguments("--disable-popup-blocking");
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);
        caps.setCapability(ChromeOptions.CAPABILITY, options);
        Configuration.browserCapabilities = caps;

        open("https://www.saucedemo.com/", AuthPage.class)
                .login("standard_user", "secret_sauce");
    }
}
