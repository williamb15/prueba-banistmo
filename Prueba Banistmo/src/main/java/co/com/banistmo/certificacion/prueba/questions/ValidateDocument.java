package co.com.banistmo.certificacion.prueba.questions;

import co.com.banistmo.certificacion.prueba.utils.GeneralConstants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.ArrayList;

public class ValidateDocument implements Question<String> {

public static ValidateDocument inTheTab(){
    return new ValidateDocument();
}

    @Override
    public String answeredBy(Actor actor) {
        ArrayList<String> windows = new ArrayList<>(
                BrowseTheWeb.as(actor).getDriver().getWindowHandles());
        BrowseTheWeb.as(actor).getDriver().switchTo().window(windows.get(1));
        return BrowseTheWeb.as(actor).getDriver().getTitle();
    }
}
