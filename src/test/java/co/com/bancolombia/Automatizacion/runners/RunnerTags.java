package co.com.bancolombia.Automatizacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions
        (features = "src\\test\\resources\\features\\reto.feature",
                glue = "co.com.bancolombia.Automatizacion.stepdefinitions",
                snippets = SnippetType.CAMELCASE
        )

public class RunnerTags {
}
