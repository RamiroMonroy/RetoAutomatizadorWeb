package co.com.bancolombia.Automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class ShoppingCar {
    public static final Target ADD=Target.the("add").locatedBy("//span[contains(text(),'Agregar')]");
    public static final Target SCROLL=Target.the("scroll").locatedBy("//h1[@class='vtex-store-components-3-x-productNameContainer mv0 t-heading-4']");
    public static final Target AMOUNT=Target.the("amount").locatedBy("//button[@class='exito-vtex-components-4-x-buttonActions exito-vtex-components-4-x-productSummaryAddToCar  product-summary-add-to-car-plus']");
    public static final Target SHOPPING_CAR=Target.the("shopping_car").locatedBy("//div[@class='exito-header-3-x-minicartQuantity']");
    public static final Target NAME_PRODUCT=Target.the("name_product").locatedBy("//div[@class='exito-checkout-io-0-x-itemCartContainer']/div[{0}]/div/div[4]/span");
    public static final Target TOTAL_PRICE_PRODUCT=Target.the("total_prince_product").locatedBy("//div[@class='exito-checkout-io-0-x-summaryContainer']/div/div/div/span[2]");


}

