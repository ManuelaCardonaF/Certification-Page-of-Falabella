package com.co.test.certification.tiendaOnlineFalabella.tasks;


import com.co.test.certification.tiendaOnlineFalabella.userInterfaces.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class DefineProductMaxime implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PrincipalPage.ADD_BAG_PRODUCT),
                Click.on(PrincipalPage.ADD_BAG_PRODUCT));
        for (int i=0;i<10;i++){
            actor.attemptsTo(
                    WaitUntil.the(PrincipalPage.MAXIME_PRODUCT, WebElementStateMatchers.isCurrentlyEnabled()),
                    Click.on(PrincipalPage.MAXIME_PRODUCT));

        }
        actor.remember("Stock",PrincipalPage.STOCK.resolveFor(actor).getText().replace(".",""));
        System.out.println(PrincipalPage.STOCK.resolveFor(actor).getText().replace(".",""));







    }
    public static DefineProductMaxime ok(){
        return Tasks.instrumented(DefineProductMaxime.class);
    }
}
