package StepDefinitions;

import Pages.HomePage;
import Utulities.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class HomePageSteps {
    HomePage homePage;


    public HomePageSteps() {
        homePage = new HomePage(DriverManager.getDriver());
    }

    @Given("setup the app")
    public void setupTheApp() {
        System.out.println("Given part");

    }

    @When("click on search Text Box")
    public void clickOnSearchTextBox() {
        System.out.println("when part1");
    }

    @When("type Macbook")
    public void typeMacbook() {
        System.out.println("when part2");
    }

    @When("Click on Search btn")
    public void clickOnSearchBtn() {
        System.out.println("when part3");
    }

    @Then("You should see the Macbook")
    public void youShouldSeeTheMacbook() {
        System.out.println("Then part");
    }


    @When("click on Login Btn on HomePage")
    public void clickOnLoginBtnOnHomePage() {
    }
}
