package co.com.banistmo.certificacion.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DocumentsPageElements {

    public static final Target OPTION_DOCUMENTS = Target.the("Option documents")
            .locatedBy("//section[@id='tabs']//*[contains(text(), 'Documentos')]");

    public static final Target BUTTON_DOWNLOAD = Target.the("Button Download")
            .locatedBy("//div[@id='tab4']//button");

}
