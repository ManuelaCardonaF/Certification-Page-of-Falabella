package com.co.test.certification.tiendaOnlineFalabella.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\shopping.feature",
        glue = "com.co.test.certification.tiendaOnlineFalabella.stepDefinitions",
       tags = " @ExceedStock",
        snippets = SnippetType.CAMELCASE

)

public class ShoppingOnline {
}
