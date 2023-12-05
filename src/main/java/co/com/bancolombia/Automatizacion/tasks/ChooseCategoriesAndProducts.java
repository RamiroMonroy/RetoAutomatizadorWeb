package co.com.bancolombia.Automatizacion.tasks;

import co.com.bancolombia.Automatizacion.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static co.com.bancolombia.Automatizacion.userinterfaces.Main.*;
import static co.com.bancolombia.Automatizacion.userinterfaces.Products.*;
import static co.com.bancolombia.Automatizacion.userinterfaces.ShoppingCar.*;
import static co.com.bancolombia.Automatizacion.utils.Constants.*;
import static co.com.bancolombia.Automatizacion.utils.Wait.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ChooseCategoriesAndProducts implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<Integer> selectedProducts = new ArrayList<>();
        for (int x = 0; x < AMOUNT_CATEGORY; x++) {
            int product;
            do {
                product = (int) (Math.random() * 10 + 1);
            } while (selectedProducts.contains(product));

            selectedProducts.add(product);
                int amountProduct = (int) (Math.random() * 4 + 1);
                actor.attemptsTo(Click.on(CATEGORY_MENU),(Click.on(LIST_CATEGORY)),(Click.on(SUB_CATEGORY)));
            if (Visibility.of(WINDOW).viewedBy(actor).asBoolean()) {
                actor.attemptsTo(Click.on(WINDOW));
                Wait.stopExecution(STOP_TIME);
            }
            if (Visibility.of(WINDOW_DATA_CITY).viewedBy(actor).asBoolean()) {
                actor.attemptsTo(
                        Click.on(WINDOW_DATA_CITY),
                        Enter.theValue(CITY).into(WINDOW_DATA_CITY).thenHit(Keys.ENTER),
                        Click.on(WINDOW_DATA_STORE),
                        Enter.theValue(STORE).into(WINDOW_DATA_STORE).thenHit(Keys.ENTER),
                        Click.on(WINDOW_DATA_BUTTON_EMAIL),
                        Click.on(WINDOW_EMAIL),
                        Enter.theValue(EMAIL)
                                .into(WINDOW_EMAIL).thenHit(Keys.ENTER),
                        Click.on(BUTTON));
                Wait.stopExecution(STOP_TIME);
                actor.attemptsTo(Click.on(BUTTON_CONFIRM));
                Wait.stopExecution(STOP_TIME);
            }


            actor.remember("product" + x, PRODUCTS_TEXT.of(String.valueOf(product)).resolveFor(actor).getText());
                actor.attemptsTo(Click.on(PRODUCTS_MENU.of(String.valueOf(product))),
                        (WaitUntil.the(SCROLL, isVisible()).forNoMoreThan(CONSTANTS_TIME).seconds()),
                        (Scroll.to(SCROLL)), (Click.on(ADD)));

                actor.remember("price" + x, PRICE_PRODUCTS.resolveFor(actor).getText());
                actor.remember("amountProduct" + x, amountProduct);
                for (int i = 0; i < amountProduct; i++) {
                    actor.attemptsTo(Click.on(AMOUNT));
                }


            }
            Wait.stopExecution(STOP_TIME);
            actor.attemptsTo(WaitUntil.the(SHOPPING_CAR, isVisible()).forNoMoreThan(CONSTANTS_TIME).seconds(),
                    Click.on(SHOPPING_CAR));
        }

        public static ChooseCategoriesAndProducts choose () {
            return Tasks.instrumented(ChooseCategoriesAndProducts.class);
        }
    }


