package Pages;

import Models.LoginPageModel;
import Utulities.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    WebDriver driver;
    ElementHelper elementHelper ;


    public LoginPage(WebDriver webDriver) {
    driver = webDriver;
    elementHelper= new ElementHelper(webDriver);
    }



    public void setUsername(String username) {
        elementHelper.type(LoginPageModel.usernameTextbox, username);
    }

    public void setPassword(String password) {
    elementHelper.type(LoginPageModel.passwordTextbox,password);
    }

    public void clickLoginBtn() {
   elementHelper.click(LoginPageModel.loginBtn);
    }


}
