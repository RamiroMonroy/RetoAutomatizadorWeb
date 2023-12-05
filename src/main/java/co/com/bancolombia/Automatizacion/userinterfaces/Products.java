package co.com.bancolombia.Automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class Products {
    public static final Target PRODUCTS_MENU= Target.the("products_menu").locatedBy("//div[@class='vtex-flex-layout-0-x-flexRow vtex-flex-layout-0-x-flexRow--search-result-web']/div/div/div/div[{0}]");
    public static final Target PRODUCTS_TEXT= Target.the("products_text").locatedBy("//div[@class='vtex-flex-layout-0-x-flexRow vtex-flex-layout-0-x-flexRow--search-result-web']/div/div/div/div[{0}]/section/a/article/div[3]/div[2]/div/div/div/div/div/div/div[3]/div/div/div/h3/span");
    public static final Target PRICE_PRODUCTS= Target.the("price_products").locatedBy("//div[@class='false bg-base w-100']/div/div[2]/div/span");
    public static final Target WINDOW= Target.the("window").locatedBy("//div[@id='wps-overlay-close-button']");
    public static final Target WINDOW_DATA_CITY= Target.the("window_data_city").locatedBy("//div[@class='exito-geolocation-3-x-pickUpPointCitySelectCity shippingaddress-lista-ciudad']/div[2]/div/div/div/div/div/div/input");
    public static final Target WINDOW_DATA_STORE= Target.the("window_data_store").locatedBy("//div[@class='exito-geolocation-3-x-pickUpPointCitySelectCity buycollect-lista-almacen']/div[2]/div/div/div/div/div/div/input");
    public static final Target WINDOW_DATA_BUTTON_EMAIL= Target.the("window_data_button_email").locatedBy("//div[@class='exito-geolocation-3-x-bodyContainer w-100']/div/div/button[2]");
    public static final Target BUTTON= Target.the("button").locatedBy("//div[@class='exito-geolocation-3-x-requestEmailActions flex']/button");
    public static final Target BUTTON_CONFIRM= Target.the("button_confirm").locatedBy("//div[@class='exito-geolocation-3-x-bodyContainer w-100']/div[3]/div[3]/button[2]");
    public static final Target WINDOW_EMAIL=Target.the("window_email").locatedBy("//div[@class='exito-geolocation-3-x-containerFormDeliveryType']/div/label/div/input");
}

