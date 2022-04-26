package com.co.test.certification.tiendaOnlineFalabella.tasks;

import com.co.test.certification.tiendaOnlineFalabella.models.InformationProduct;
import com.co.test.certification.tiendaOnlineFalabella.userInterfaces.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class FillOutData implements Task {

    InformationProduct data;
    public FillOutData(InformationProduct data) {
        this.data = data;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(data.getRegion()).into(PrincipalPage.REGION),
                Enter.keyValues(data.getCity()).into(PrincipalPage.CITY),
                Enter.keyValues(data.getCommune()).into(PrincipalPage.COMMUNE),
                Click.on(PrincipalPage.CONTINUE),
                Enter.keyValues(data.getAddress()).into(PrincipalPage.ADDRESS),
                Enter.keyValues(data.getComplement()).into(PrincipalPage.DATES_GENERAL),
                Click.on(PrincipalPage.ENTER_ADDRESS));
        actor.remember("price_shipping",PrincipalPage.SHIPPING.resolveFor(actor).getText().replace("$","").replace(".",""));

        actor.attemptsTo(Click.on(PrincipalPage.BUTTON_GO_PAY));
        actor.remember("total_price",PrincipalPage.PRICE_FINAL.resolveFor(actor).getText().replace("$","").replace(".",""));
        actor.attemptsTo(WaitUntil.the(PrincipalPage.DELIVERY, WebElementStateMatchers.isVisible()));
    }
    public static FillOutData on(InformationProduct data){
        return Tasks.instrumented(FillOutData.class,data);

    }
}
