package Utulities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    JavascriptExecutor js;

    public ElementHelper(WebDriver webDriver) {
        driver = webDriver;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        actions = new Actions(webDriver);
        js = (JavascriptExecutor) driver;
    }

    public void findEelements(By by) {

    }

    public void click(By by) {

    }

    public void type(By by, String text) {

    }

    public void clear(By by) {

    }

    public void checkText(By by, String text) {

    }
}
