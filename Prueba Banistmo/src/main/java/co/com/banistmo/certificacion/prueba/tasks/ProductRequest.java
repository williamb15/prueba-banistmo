package co.com.banistmo.certificacion.prueba.tasks;

import co.com.banistmo.certificacion.prueba.userinterfaces.HomePageElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductRequest implements Task {


    public static ProductRequest inTheChanel(){
        return instrumented (ProductRequest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePageElements.BUTTON_PRODUCT_REQUEST));
    }
}
