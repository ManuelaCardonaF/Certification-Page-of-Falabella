package com.co.test.certification.tiendaOnlineFalabella.stepDefinitions;

import com.co.test.certification.tiendaOnlineFalabella.interactions.OpenBrowser;
import com.co.test.certification.tiendaOnlineFalabella.models.HomePage;
import com.co.test.certification.tiendaOnlineFalabella.models.InformationProduct;
import com.co.test.certification.tiendaOnlineFalabella.questions.ConfirmPrice;
import com.co.test.certification.tiendaOnlineFalabella.questions.EmptyBag;
import com.co.test.certification.tiendaOnlineFalabella.questions.StockMaxime;
import com.co.test.certification.tiendaOnlineFalabella.questions.ValidatePage;
import com.co.test.certification.tiendaOnlineFalabella.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static com.co.test.certification.tiendaOnlineFalabella.utils.Constants.NAMEACTOR;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ShoppingOnlineStepDefinition {
    HomePage page;

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
        theActorCalled(NAMEACTOR);
    }

    @Given("^the user is on the main page$")
    public void theUserIsOnTheMainPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.on(page));


    }
    @Then("^the user should confirm that he is on the page through the (.*) button$")
    public void theUserShouldConfirmThatHeIsOnThePageThroughTheUserInfoButton(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePage.isCorrect(message)));

    }


    @When("^the user proceeds to search for a certain product$")
    public void theUserProceedsToSearchForACertainProduct(List<InformationProduct> productList) {
        InformationProduct dataProduct = productList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(WriteProduct.search(dataProduct));


    }

    @When("^the user chooses the product he wishes to acquire$")
    public void theUserChoosesTheProductHeWishesToAcquire() {
        OnStage.theActorInTheSpotlight().attemptsTo(DefineProduct.ok());

    }

    @When("^the user fills out dispatch information$")
    public void theUserFillsOutDispatchInformation(List<InformationProduct> productList) {
        InformationProduct dataProduct = productList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(FillOutData.on(dataProduct));
    }

    @Then("^the user should see the price of the product plus the value of the shipment$")
    public void theUserShouldSeeThePriceOfTheProductPlusTheValueOfTheShipment() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ConfirmPrice.validate()));

    }
    @When("^the user chooses the product he wishes to acquire and add zero products$")
    public void theUserChoosesTheProductHeWishesToAcquireAndAddZeroProducts() {
        OnStage.theActorInTheSpotlight().attemptsTo(DefineProductZero.ok());


    }
    @Then("^the user should see the message of (.*)$")
    public void theUserShouldSeeTheMessageOf(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(EmptyBag.ok(message)));

    }


    @When("^the user chooses the product he wishes to acquire and add maxium products$")
    public void theUserChoosesTheProductHeWishesToAcquireAndAddMaxiumProducts() {
        OnStage.theActorInTheSpotlight().attemptsTo(DefineProductMaxime.ok());
    }

    @Then("^the user should see the message warning (.*)\\.$")
    public void theUserShouldSeeTheMessageWarning(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(StockMaxime.ok(message)));

    }









}
