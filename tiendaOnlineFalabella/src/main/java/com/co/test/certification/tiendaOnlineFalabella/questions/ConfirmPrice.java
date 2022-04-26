package com.co.test.certification.tiendaOnlineFalabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConfirmPrice implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        int priceProduct= Integer.parseInt(actor.recall("price_final"));
        int shipping= Integer.parseInt(actor.recall("price_shipping"));
        int totalPrice= Integer.parseInt(actor.recall("total_price"));
        int total= priceProduct + shipping;


        return total ==totalPrice;
    }
    public static ConfirmPrice validate(){
        return new ConfirmPrice();
    }
}
