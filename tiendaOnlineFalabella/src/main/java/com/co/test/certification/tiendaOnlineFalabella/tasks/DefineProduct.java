package com.co.test.certification.tiendaOnlineFalabella.tasks;


import com.co.test.certification.tiendaOnlineFalabella.models.InformationProduct;
import com.co.test.certification.tiendaOnlineFalabella.userInterfaces.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class DefineProduct implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PrincipalPage.ADD_BAG_PRODUCT),
                Click.on(PrincipalPage.ADD_BAG_PRODUCT));
        actor.remember("price_final",PrincipalPage.PRICE_PRODUCT.resolveFor(actor).getText().replace("$ ","").replace(".","").replace(" (Precio final)","" ));
        actor.attemptsTo(
                Click.on(PrincipalPage.SHOPPING_BAG),
                WaitUntil.the(PrincipalPage.SHOPPING, WebElementStateMatchers.isCurrentlyVisible()),
                Click.on(PrincipalPage.SHOPPING) );


    }
    public static DefineProduct ok(){
        return Tasks.instrumented(DefineProduct.class);
    }
}
