package com.metro.www.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com/metro/www/features/compraProducto.feature",
        glue = {"com.metro.www.stepDefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class ComprasMetro {
}

