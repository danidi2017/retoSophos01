package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/com/metro/www/features/compraProducto.feature"
        		,
        glue="com.metro.stepdefinitions",
        snippets= SnippetType.CAMELCASE,
        tags = " @tag1"
)

public class CarritoCompras{
}
