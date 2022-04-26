package com.co.test.certification.tiendaOnlineFalabella.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PrincipalPage {
    public static final Target PAGE_FALABELLA = Target.the("option_user_info").locatedBy("//span[@class='UserInfo-module_sr-only__1FHrr']");
    public static final Target SEARCH_BAR = Target.the("search_bar_of_product").locatedBy("//input[@class='SearchBar-module_searchBar__Input__1VvhT']");
    public static final Target ADD_BAG_PRODUCT = Target.the("add_bag_select_product").locatedBy("//button[@class='jsx-2166277967 button button-primary']");
    public static final Target PRICE_PRODUCT = Target.the("price_product").locatedBy("//span[@class='copy3 primary high jsx-3548557188 normal      ']");
    public static final Target SHOPPING_BAG = Target.the("watch_bag").locatedBy("//a[@id='linkButton']");
    public static final Target SHOPPING = Target.the("button_shopping").locatedBy("//button[@class='fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase']");

    public static final Target REGION = Target.the("button_for_region").locatedBy("//select[@id='region']");
    public static final Target CITY = Target.the("button_select_city").locatedBy("//select[@id='ciudad']");
    public static final Target COMMUNE = Target.the("button_select_commune").locatedBy("//select[@id='comuna']");
    public static final Target CONTINUE = Target.the("button_select_continue").locatedBy("//button[@class='fbra_button fbra_test_button fbra_formItem__field04']");
    public static final Target ADDRESS = Target.the("input_address").locatedBy("//input[@id='address']");
    public static final Target DATES_GENERAL = Target.the("input_date_general").locatedBy("//input[@id='departmentNumber']");
    public static final Target ENTER_ADDRESS = Target.the("button_enter_address").locatedBy("//button[@class='fbra_button fbra_test_button fbra_formItem__useAddress']");
    public static final Target SHIPPING = Target.the("price_of_shipping_destination").locatedBy("//span[@class='fbra_price__purchasedPrice fbra_test_price__purchasedPrice']");
    public static final Target BUTTON_GO_PAY = Target.the("button_go_pay").locatedBy("//button[@class='fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton']");
    public static final Target PRICE_FINAL = Target.the("price_final").locatedBy("//span[@class='fbra_text fbra_test_orderSummary__totalCostPrice fbra_orderSummary__totalCostPrice']");
    public static final Target DELIVERY= Target.the("delivery").locatedBy("//h2[@class='fbra_heading fbra_deliverySummary_main_head fbra_deliverySummary__heading fbra_test_deliverySummary__heading']");
    public static final Target MINUS_PRODUCT= Target.the("minus_product").locatedBy("//span[@class='jsx-647144324']");
    public static final Target MAXIME_PRODUCT= Target.the("maxime_product").locatedBy("//button[@class='jsx-647144324 increment btn-primary']");
    public static final Target WARNING= Target.the("message_of_warning").locatedBy("//h4[@class='fb-order-status__title']");
    public static final Target STOCK = Target.the("text_stock_available").locatedBy("//div[@class='jsx-3640063463 additional-information']/div[4]/div[1]/span[2]/span[1]");

}
