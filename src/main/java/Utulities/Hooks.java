package Utulities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.util.Base64;

public class Hooks {

    @Before
    public void before(){

    DriverManager.setDriver();
    }
    @After
    public void teardown(Scenario scenario) throws IOException {
        if (scenario.isFailed()){
            //Eğer ekran görüntüsü dosyası oluşturmasını istiyorsam aşağıdaki kodu kullanmam gerekiyor.
            /*
            File srcFile = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
            String screenshotPath = "target/screenshots/" + scenario.getName() + "_" + System.currentTimeMillis() + ".png";
            FileUtils.copyFile(srcFile, new File(screenshotPath));
            scenario.attach(FileUtils.readFileToByteArray(new File(screenshotPath)), "image/png", scenario.getName());
             */

            // Eğer ekran görüntüüsnün dosyasını istemiyorsam aşağıdaki kodu kullanmam gerekiyor.
            TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
            String base64Screenshot = ts.getScreenshotAs(OutputType.BASE64);
            scenario.attach(Base64.getDecoder().decode(base64Screenshot), "image/png", scenario.getName());
        }
        DriverManager.quitDriver();
    }


}
