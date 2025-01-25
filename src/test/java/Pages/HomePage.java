package Pages;

import Models.HomePageModel;
import StepDefinitions.HomePageSteps;
import Utulities.ElementHelper;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    ElementHelper elementHelper ;
    public HomePage(WebDriver webDriver){
        driver = webDriver;
        elementHelper= new ElementHelper(webDriver);
    }
    public void clickLogBtn(){
        elementHelper.click(HomePageModel.loginBtn);
    }
}
