package com.practicaocho.Step;


import com.practicaocho.pages.ZohoCRMLoginPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class ZohoCRMLoginValidationStep {
    ZohoCRMLoginPage zohoCRMLoginPage;

    @Step
    public void Login_ZohoCRM(){
        zohoCRMLoginPage.open();

    }
    @Step
    public void Registro_ZohoCRM(List<List<String>> data, int id){
        zohoCRMLoginPage.username(data.get(id).get(0).trim());
        zohoCRMLoginPage.email(data.get(id).get(1).trim());
        zohoCRMLoginPage.password(data.get(id).get(2).trim());
        zohoCRMLoginPage.phone(data.get(id).get(3).trim());
        zohoCRMLoginPage.selectclic();
        zohoCRMLoginPage.btnSingin();
    }
}
