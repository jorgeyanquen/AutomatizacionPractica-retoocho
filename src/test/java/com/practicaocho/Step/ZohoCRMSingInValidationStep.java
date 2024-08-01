package com.practicaocho.Step;

import com.practicaocho.pages.ZohoCRMSingInPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class ZohoCRMSingInValidationStep {
    ZohoCRMSingInPage zohoCRMSingInPage;

    @Step
    public void Login_ZohoCRM(){
        zohoCRMSingInPage.open();

    }

    @Step
    public void logueo(List<List<String>> data, int id){
        zohoCRMSingInPage.botoningreso();
        zohoCRMSingInPage.email1(data.get(id).get(0).trim());
        zohoCRMSingInPage.botonsiguiente();
        zohoCRMSingInPage.pass1(data.get(id).get(1).trim());
        zohoCRMSingInPage.botoniniciarsesion();




    }
}
