package com.exito.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductListPageObject extends PageObject {
/*
    private final By lnkProductsName=By.xpath("//h3/a[@class='link_fs-link__J1sGD']");

    public By getLnkProductsName() {
        return lnkProductsName;
    }

 */
    private By lnkAsusUno=By.xpath("//article/div/div/a[@href='/computador-asus-vivobook-go-15-oled-amd-ryzen-5-7520u-ram-16-gb-512-gb-ssd-e1504fa-l1402w-3150001/p']") ;

    public By getLnkAsusUno() {
        return lnkAsusUno;
    }
}
