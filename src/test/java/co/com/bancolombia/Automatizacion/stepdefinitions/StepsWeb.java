package co.com.bancolombia.Automatizacion.stepdefinitions;

import co.com.bancolombia.Automatizacion.interactions.OpenBrowser;
import co.com.bancolombia.Automatizacion.models.MainPage;
import co.com.bancolombia.Automatizacion.questions.ValidateName;
import co.com.bancolombia.Automatizacion.questions.ValidateTotalPrice;
import co.com.bancolombia.Automatizacion.tasks.ChooseCategoriesAndProducts;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.bancolombia.Automatizacion.utils.Constants.ACTOR;
public class StepsWeb {
    MainPage mainPage;

    @Before
    public void startstage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR);
    }

    @Given("^that the user is on the web page$")
    public void thatTheUserIsOnTheWebPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.on(mainPage));
    }

    @When("^choose five products at random each product has random quantities between one and ten$")
    public void chooseFiveProductsAtRandomEachProductHasRandomQuantitiesBetweenOneAndTen() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChooseCategoriesAndProducts.choose());
    }

    @Then("^the name of the added products are the same as in the shopping cart$")
    public void theNameOfTheAddedProductsAreTheSameAsInTheShoppingCart() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateName.validate()));
    }

    @Then("^the price of the added products are the same as in the shopping cart$")
    public void thePriceOfTheAddedProductsAreTheSameAsInTheShoppingCart() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTotalPrice.validate()));
    }


}

