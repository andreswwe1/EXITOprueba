package com.exito.stepDefinitions;
/*
 * @(#) AddProductStepDefinitions.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.exito.steps.AddCartSteps;
import com.exito.steps.HomeSteps;
import com.exito.steps.ProductListSteps;

import io.cucumber.java.en.*;

import net.thucydides.core.annotations.Steps;


/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class AddProductStepDefinitions {
    @Steps
    private HomeSteps homeSteps;

    @Steps
    private ProductListSteps productList;

    @Steps
    private AddCartSteps addCart;

    @Given("que el usuario ingresa a la pagina web")
    public void queElUsuarioIngresaALaPaginaWeb() {
        homeSteps.openUrl();

    }
    @When("el usuario ingresa al menu")
    public void elUsuarioIngresaAlMenu() {
       // homeSteps.sendInfo();
        homeSteps.abrirMenu();


    }
    @When("Busca la categoria y subcategoria")
    public void buscaLaCategoriaYSubcategoria() {
       // productList.selectProduct();
homeSteps.buscarCatySubcategoria();
    }
    @When("Selecciona el producto")
    public void seleccionaElProducto() {
        productList.seleccionarPortatil();

    }
    @When("Dar click en el boton de agregar al carrito")
    public void darClickEnElBotonDeAgregarAlCarrito() {
        addCart.ClicAddCart();

    }
    @Then("Se podra visualizar el producto en el carrito de compras")
    public void sePodraVisualizarElProductoEnElCarritoDeCompras() {

    }
}
