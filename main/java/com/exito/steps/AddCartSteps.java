package com.exito.steps;

import com.exito.pageObject.AddCartPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class AddCartSteps {

    @Page
   private AddCartPageObject addcart;

    @Step( "Dar click en el boton de agregar al carrito")
        public  void  ClicAddCart(){
      //addcart.getDriver().findElement(addcart.getBtnAddCart()).click();
        addcart.getDriver().findElement(addcart.getBtnAddProduct()).click();
        addcart.getDriver().findElement(addcart.getBtnCarrito()).click();


    }


}
