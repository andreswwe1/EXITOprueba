package com.exito.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import javax.xml.xpath.XPath;

public class AddCartPageObject  extends PageObject {

   // private By btnAddProduct= By.xpath("//div/div/button[@class='DefaultStyle_default__jW12W ']");
    private By btnAddProduct= By.xpath("/html/body/div[1]/main/section[1]/section[1]/section[2]/section/section[1]/div[1]/button/span");

    private By btnCarrito=By.xpath("/html/body/div[1]/header/section/div/div[2]/div[2]/button");//FUNCIONA BIEN

    public By getBtnAddProduct() {
        return btnAddProduct;
    }


    public By getBtnCarrito() {
        return btnCarrito;
    }


}
