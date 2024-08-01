package com.practicaocho.definitions;

import com.practicaocho.Step.ZohoCRMLoginValidationStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ZohoCRMValidationSingIn {

    @Steps
    ZohoCRMLoginValidationStep zohoCRMLoginValidationStep;


    @Given("I logged into Zoho CRM with a registered user")
    public void i_logged_into_zoho_crm_with_a_registered_user() {
        zohoCRMLoginValidationStep.Login_ZohoCRM();
    }
    @When("I create a Task")
    public void i_create_a_task() {

    }
    @Then("I verify that the task was successfully created")
    public void i_verify_that_the_task_was_successfully_created() {

    }

}
