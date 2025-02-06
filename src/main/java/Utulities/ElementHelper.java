package Utulities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    public void click(By by) {
        scroll(by);
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public void type(By by, String text) {
        scroll(by);
        wait.until(ExpectedConditions.presenceOfElementLocated(by)).sendKeys(text);
    }

    public void clear(By by) {
        scroll(by);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).clear();
    }

    public String gettext(By by, String text) {
        scroll(by);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by)).getText();
    }

    public void checkText(By by, String text) {
        scroll(by);
        wait.until(ExpectedConditions.textToBe(by, text));
    }

    public void scroll(By by) {
        js.executeScript("arguments[0].scrollIntoView({\n" + "behavior: 'smooth',\n" + "block: 'center'\n" + "inline: 'center'\n" + " });", wait.until(ExpectedConditions.visibilityOfElementLocated(by)));
    }
}
