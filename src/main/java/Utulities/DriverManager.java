package Utulities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager {
    static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        threadLocal.set(new ChromeDriver());
        threadLocal.get().manage().window().maximize();
        threadLocal.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        threadLocal.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        threadLocal.get().get("https://www.trendyol.com/");
    }

    public static void quitDriver() {
        threadLocal.get().quit();
    }

    public static WebDriver getDriver() {
        return threadLocal.get();
    }


}
