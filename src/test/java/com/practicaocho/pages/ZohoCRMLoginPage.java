package com.practicaocho.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.zoho.com/es-xl/crm/")
public class ZohoCRMLoginPage extends PageObject {

    @FindBy(id = "namefield")
    public WebElementFacade txtUsername;

    @FindBy(id = "email")
    public WebElementFacade txtEmail;

    @FindBy(xpath = "//*[@id=\"signupform\"]/section[1]/div[3]/div/input")
    public WebElementFacade txtpassword;

    @FindBy(xpath = "//*[@id=\"mobile\"]")
    public WebElementFacade txtphone;

    @FindBy(xpath = "//*[@id=\"signup-termservice\"]")
    public WebElementFacade select;

    @FindBy(id = "signupbtn")
    public WebElementFacade btnSingIn;

    public void username(String datoPrueba){
        txtUsername.click();
        txtUsername.clear();
        txtUsername.sendKeys(datoPrueba);
    }
    public void email(String datoPrueba) {
        txtEmail.click();
        txtEmail.clear();
        txtEmail.sendKeys(datoPrueba);

    }

    public void password(String datoPrueba) {
        txtpassword.click();
        txtpassword.clear();
        txtpassword.sendKeys(datoPrueba);

    }

    public void phone(String datoPrueba) {
        txtphone.click();
        txtphone.clear();
        txtphone.sendKeys(datoPrueba);

    }

    public void selectclic() {
        select.click();


    }
    public void btnSingin() {
        btnSingIn.click();

    }
}
