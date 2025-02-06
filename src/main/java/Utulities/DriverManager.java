package Utulities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

import java.time.Duration;

public class DriverManager {
    static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public static void setDriver() {

        ConfigProperties configProperties = new ConfigProperties();
        String browser = configProperties.getProperty("browser");
        switch (browser){
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                threadLocal.set(new ChromeDriver());
                break;
            case "FireFox":
                WebDriverManager.firefoxdriver().setup();
                threadLocal.set(new FirefoxDriver());
                break;
            case "Safari":
                WebDriverManager.safaridriver().setup();
                threadLocal.set(new SafariDriver());
                break;
            default:
                Assert.assertTrue(false,"Please select a browser from config.properties");
                break;
        }

        threadLocal.get().manage().window().maximize();
        threadLocal.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Long.parseLong(configProperties.getProperty("pageLoadTimeout"))));
        threadLocal.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(configProperties.getProperty("implicitlyWait"))));
        threadLocal.get().get(configProperties.getProperty("url"));
    }

    public static void quitDriver() {
        threadLocal.get().quit();
    }

    public static WebDriver getDriver() {
        return threadLocal.get();
    }


}
