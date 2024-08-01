package com.practicaocho.definitions;

import com.practicaocho.Step.ZohoCRMLoginValidationStep;
import com.practicaocho.Step.ZohoCRMSingInValidationStep;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class ZohoCRMValidationSingIn {

    @Steps
    ZohoCRMSingInValidationStep zohoCRMSingInValidationStep;

    @Given("Entering the Zoho CRM page")
    public void Entering_the_Zoho_CRM_page(){
        zohoCRMSingInValidationStep.Login_ZohoCRM();
    }

    @Given("I logged into Zoho CRM with a registered user")
    public void i_logged_into_zoho_crm_with_a_registered_user(DataTable dtDatosForm1) {
        List<List<String>> cells = dtDatosForm1.cells();

        for(int i=1; i<cells.size(); i++){
            zohoCRMSingInValidationStep.logueo(cells, i);
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){

            }
        }


    }
    @When("I create a Task")
    public void i_create_a_task() {

    }
    @Then("I verify that the task was successfully created")
    public void i_verify_that_the_task_was_successfully_created() {

    }

}
