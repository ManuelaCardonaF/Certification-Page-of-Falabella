package com.co.test.certification.tiendaOnlineFalabella.interactions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Interaction {
    private PageObject page;

    public OpenBrowser(PageObject page) {
        this.page = page;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
    }


    public static OpenBrowser on(PageObject pageObject) {
        return Tasks.instrumented(OpenBrowser.class, pageObject);
    }

}
