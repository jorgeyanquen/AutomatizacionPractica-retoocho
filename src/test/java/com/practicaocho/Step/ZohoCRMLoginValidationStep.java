package com.practicaocho.Step;


import com.practicaocho.pages.ZohoCRMLoginPage;
import net.thucydides.core.annotations.Step;

public class ZohoCRMLoginValidationStep {
    ZohoCRMLoginPage zohoCRMLoginPage;

    @Step
    public void Login_ZohoCRM(){
        zohoCRMLoginPage.open();
    }
}
