package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signUpStep {

    @When("I click signup link")
    public void iClickSignupLink(){
        System.out.println(" ");
    }

    @And("I enter name {string}")
    public void iEnterName(String name) {
        System.out.println(" ");
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        System.out.println(" ");
    }

    @And("I enter confirm password {string}")
    public void iEnterConfirmPassword(String password) {
        System.out.println(" ");
    }

    @And("I click register button")
    public void iClickRegisterButton() {
        System.out.println(" ");
    }
}
