package com.co.test.certification.tiendaOnlineFalabella.questions;

import com.co.test.certification.tiendaOnlineFalabella.userInterfaces.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class EmptyBag implements Question<Boolean> {
    String message;

    public EmptyBag(String message) {
        this.message = message;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return message.equals(PrincipalPage.WARNING.resolveFor(actor).getText());
    }
    public static EmptyBag ok(String message){

        return new EmptyBag(message);
    }
}
