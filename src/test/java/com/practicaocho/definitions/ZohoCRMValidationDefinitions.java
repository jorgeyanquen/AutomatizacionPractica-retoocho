package com.practicaocho.definitions;

import com.practicaocho.Step.ZohoCRMLoginValidationStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ZohoCRMValidationDefinitions {

    @Steps
    ZohoCRMLoginValidationStep zohoCRMLoginValidationStep;

    @Given("the user wants to use Zoho CRM")
    public void the_user_wants_to_use_zoho_crm() {
        zohoCRMLoginValidationStep.Login_ZohoCRM();
    }
    @When("I make the registration successful")
    public void i_make_the_registration_successful() {

    }
    @Then("I check the access to the application")
    public void i_check_the_access_to_the_application() {

    }
}
