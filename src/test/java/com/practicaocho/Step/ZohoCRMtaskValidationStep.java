package com.practicaocho.Step;

import com.practicaocho.pages.ZohoCRMtaskPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class ZohoCRMtaskValidationStep {

    ZohoCRMtaskPage zonaCRMtaskPage;
    @Step
    public void task(List<List<String>> data, int id){
        zonaCRMtaskPage.botonmas();
        zonaCRMtaskPage.botontask();
        zonaCRMtaskPage.subject(data.get(id).get(0).trim());
        zonaCRMtaskPage.date(data.get(id).get(1).trim());
        zonaCRMtaskPage.buscarcontact();
        zonaCRMtaskPage.seleccionarcontacto();
        zonaCRMtaskPage.selectstatus();
        zonaCRMtaskPage.selectstatus1(data.get(id).get(2).trim());
    }
}
