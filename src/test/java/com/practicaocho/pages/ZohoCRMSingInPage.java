package com.practicaocho.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.zoho.com/es-xl/crm/")
public class ZohoCRMSingInPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div[3]/a[1]")
    public WebElementFacade btningreso;

    @FindBy(id = "login_id")
    public WebElementFacade txtemail1;

    @FindBy(id = "nextbtn")
    public WebElementFacade btnsiguiente;

    @FindBy(id = "password")
    public WebElementFacade txtpass1;

    @FindBy(id = "nextbtn")
    public WebElementFacade btniniciarsesion;

    public void botoningreso(){
        btningreso.click();
    }
    public void email1(String datoPrueba) {
        txtemail1.click();
        txtemail1.clear();
        txtemail1.sendKeys(datoPrueba);

    }

    public void botonsiguiente(){
        btnsiguiente.click();
    }
    public void pass1(String datoPrueba){
        txtpass1.click();
        txtpass1.clear();
        txtpass1.sendKeys(datoPrueba);
    }
    public void botoniniciarsesion(){
        btniniciarsesion.click();
    }
}


