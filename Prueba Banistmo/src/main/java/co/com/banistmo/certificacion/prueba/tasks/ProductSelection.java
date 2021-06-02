package co.com.banistmo.certificacion.prueba.tasks;

import co.com.banistmo.certificacion.prueba.userinterfaces.ProductPageElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductSelection implements Task {

    private String product;
    private String option;

    public ProductSelection(String product, String option) {
        this.product = product;
        this.option = option;
    }

    public static ProductSelection withTheOptions(String product, String option){
        return instrumented(ProductSelection.class, product, option);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ProductPageElements.SELECT_THE_PRODUCT.of(product),
                        WebElementStateMatchers.isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(ProductPageElements.SELECT_THE_PRODUCT.of(product)),
                Click.on(ProductPageElements.DEPLOY_OPTIONS),
                WaitUntil.the(ProductPageElements.SELECT_THE_OPTION.of(option),
                        WebElementStateMatchers.isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(ProductPageElements.SELECT_THE_OPTION.of(option)),
                Click.on(ProductPageElements.BUTTON_KNOW_MORE));
    }
}
