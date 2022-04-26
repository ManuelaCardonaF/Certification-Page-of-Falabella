package com.co.test.certification.tiendaOnlineFalabella.tasks;

import com.co.test.certification.tiendaOnlineFalabella.models.InformationProduct;
import com.co.test.certification.tiendaOnlineFalabella.userInterfaces.PrincipalPage;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class WriteProduct implements Task {


    InformationProduct listProduct;
    public WriteProduct(InformationProduct listProduct) {
        this.listProduct = listProduct;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PrincipalPage.SEARCH_BAR),
                WaitUntil.the(PrincipalPage.SEARCH_BAR, WebElementStateMatchers.isEnabled()),
                Enter.theValue(listProduct.getProduct()).into(PrincipalPage.SEARCH_BAR).thenHit(Keys.ENTER)
        );

    }
    public static WriteProduct search (InformationProduct listProduct){
        return Tasks.instrumented(WriteProduct.class,listProduct);
    }
}
