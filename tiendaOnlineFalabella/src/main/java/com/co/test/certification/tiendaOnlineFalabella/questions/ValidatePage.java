package com.co.test.certification.tiendaOnlineFalabella.questions;

import com.co.test.certification.tiendaOnlineFalabella.models.HomePage;
import com.co.test.certification.tiendaOnlineFalabella.userInterfaces.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidatePage implements Question<Boolean> {
    String message;

    public ValidatePage(String message) {
        this.message = message;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return  message.equals(PrincipalPage.PAGE_FALABELLA.resolveFor(actor).getText() );

    }
    public static ValidatePage isCorrect(String message){
        return new ValidatePage(message);
    }
}
