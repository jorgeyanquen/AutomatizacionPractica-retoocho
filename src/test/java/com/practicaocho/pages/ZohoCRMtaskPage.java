package com.practicaocho.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ZohoCRMtaskPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"createIcon\"]/span")
    public WebElementFacade btnmas;

    @FindBy(id = "submenu_Tasks")
    public WebElementFacade btntask;

    @FindBy(id = "Crm_Tasks_SUBJECT")
    public WebElementFacade txtsubject;

    @FindBy(id = "Crm_Tasks_DUEDATE")
    public WebElementFacade txtdate;

    @FindBy(xpath = "//*[@id=\"Crm_Tasks_CONTACTID_img\"]")
    public WebElementFacade btnbuscar1;

    @FindBy(xpath = "//*[@id=\"6372180000000489204\"]/lyte-td[1]/lyte-yield/lyte-radiobutton/label/span[1]")
    public WebElementFacade btnbuscar1seleccion;

    @FindBy(xpath = "//*[@id=\"select2-Crm_Tasks_STATUS-container\"]/span")
    public WebElementFacade selectstatus;

    @FindBy(xpath = "//*[@id=\"select2-Crm_Tasks_STATUS-result-1mjp-Not Started\"]/span")
    public WebElementFacade selectstatus1;

    @FindBy(xpath = "//*[@id=\"Tasks_fldRow_PRIORITY\"]/div[2]/div/span/span[1]/span")
    public WebElementFacade selectpriority;



    public void botonmas(){
        btnmas.click();
    }
    public void botontask(){
        btntask.click();
    }
    public void subject(String dataPrueba){
        txtsubject.click();
        txtsubject.clear();
        txtsubject.sendKeys(dataPrueba);
    }
    public void date(String dataPrueba){
        txtdate.click();
        txtdate.clear();
        txtdate.sendKeys(dataPrueba);
    }
    public void buscarcontact(){
        btnbuscar1.click();
    }
    public void seleccionarcontacto(){
        btnbuscar1seleccion.click();
    }
    public void selectstatus(){
        selectstatus.click();

    }
    public void selectstatus1(String datoPrueba){
        selectstatus1.click();
        selectstatus1.selectByVisibleText(datoPrueba);
    }
}
