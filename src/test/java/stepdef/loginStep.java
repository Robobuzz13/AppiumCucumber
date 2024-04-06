package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStep {

    @Given("I am in login page")
    public void iAmInLoginPage(){
        System.out.println(" ");
    }

    @When("I enter userName {string}")
    public void iEnterUserName(String userName){
        System.out.println(" ");
    }

    @And("I enter password {string}")
    public void iEnterPassword(String userName){
        System.out.println(" ");
    }

    @And("I click login button")
    public void iClickLoginButton(){
        System.out.println(" ");
    }

    @Then("I am in all account page")
    public void iAmInAllAccountPage(){
        System.out.println(" ");
    }

    @Then("Error message is displayed")
    public void errorMessageIsDisplayed(){
        System.out.println(" ");
    }
}
