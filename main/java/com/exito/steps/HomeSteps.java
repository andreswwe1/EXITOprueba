package com.exito.steps;

import com.exito.pageObject.HomePageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;


public class HomeSteps {

    @Page
    private HomePageObject homePage;


    @Step("El usuario abre la url")
    public void openUrl(){

        homePage.openUrl("https://www.exito.com/");
    }
    @Step("el usuario ingresa al menu")
    public void abrirMenu(){
        homePage.getDriver().findElement(homePage.getBtnMenu()).click();
    }
   @Step("Busca la categoria y subcategoria")

    public void buscarCatySubcategoria() {


        homePage.getDriver().findElement(homePage.getBtnCatTecnologia()).click();
        homePage.getDriver().findElement(homePage.getTxtPortatiles()).click();
   }


/*
    @Step("Enviar info de busqueda")
    public void sendInfo(){
        homePage.getDriver().findElement(homePage.getTxtSearch()).sendKeys("Portatil", Keys.ENTER);
    }
     */


}
