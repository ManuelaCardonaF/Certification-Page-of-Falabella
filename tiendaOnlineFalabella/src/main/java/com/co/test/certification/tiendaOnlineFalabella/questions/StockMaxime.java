package com.co.test.certification.tiendaOnlineFalabella.questions;

import com.co.test.certification.tiendaOnlineFalabella.userInterfaces.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class StockMaxime implements Question<Boolean> {
    String message;

    public StockMaxime(String message) {
        this.message = message;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        System.out.println(message);
        return message.equals(actor.recall("Stock"));
    }
    public static StockMaxime ok(String message){

        return new StockMaxime(message);
    }
}
