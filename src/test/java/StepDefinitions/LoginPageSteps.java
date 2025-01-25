package StepDefinitions;

import Pages.LoginPage;
import Utulities.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

    LoginPage loginPage;


    public LoginPageSteps() {
    loginPage = new LoginPage(DriverManager.getDriver());
    }

    @When("type {string} in username textbox")
    public void typeInUsernameTextbox(String username) {
        //System.out.println("username is: " + username);
        loginPage.setUsername(username);
    }

    @When("type {string} in password textbox")
    public void typeInPasswordTextbox(String password) {

        //System.out.println("password is : " + password);
        loginPage.setPassword(password);
    }

    @When("Click on login btn on login page")
    public void clickOnLoginBtnOnLoginPage() {
        loginPage.clickLoginBtn();
    }

    @Then("You should login to your account and see your name")
    public void youShouldLoginToYourAccountAndSeeYourName() {
    }

    @Then("You should login to your account and see your {string}")
    public void youShouldLoginToYourAccountAndSeeYour(String message) {
        System.out.println("Successful loging message: " + message);
    }
}
