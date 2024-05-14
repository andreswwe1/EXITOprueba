package com.exito.pageObject;
/*
 * @(#) HomePageObject.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */

public class HomePageObject extends PageObject {



   // private final By txtSearch= By.xpath("//input[@aria-label='search' and @placeholder='Buscar en exito.com']");

    private By btnMenu =By.xpath("//button[@aria-label='Collapse menu']");
    private By btnCatTecnologia=By.xpath( "//p[contains(text(), 'Tecnología')]");

    private By  txtPortatiles=By.xpath("//a[@href='/tecnologia/computadores-y-accesorios/computadores-portatiles']");
/*
    public By getTxtSearch() {
        return txtSearch;
    }


 */

    public By getBtnMenu() {
        return btnMenu;
    }

    public By getBtnCatTecnologia() {
        return btnCatTecnologia;
    }

    public By getTxtPortatiles() {
        return txtPortatiles;
    }
}
