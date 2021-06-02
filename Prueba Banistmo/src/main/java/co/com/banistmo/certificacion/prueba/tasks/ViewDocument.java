package co.com.banistmo.certificacion.prueba.tasks;

import co.com.banistmo.certificacion.prueba.userinterfaces.DocumentsPageElements;
import co.com.banistmo.certificacion.prueba.utils.GeneralConstants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewDocument implements Task {

    public static ViewDocument inTheChanel(){
        return instrumented (ViewDocument.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DocumentsPageElements.OPTION_DOCUMENTS),
                Click.on(DocumentsPageElements.BUTTON_DOWNLOAD));
    }
}
