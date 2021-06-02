package co.com.banistmo.certificacion.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPageElements {

    public static final Target SELECT_THE_PRODUCT = Target.the("Product selection")
            .locatedBy("//section[@id='menu-solicitud-productos']//a[contains(text(),'{0}')]");
    public static final Target DEPLOY_OPTIONS = Target.the("Deploy options").located(By.id("mostrar-filtros"));
    public static final Target SELECT_THE_OPTION = Target.the("Option selection")
            .locatedBy("//div[@class='productos-filtro_tags']//a[contains(text(),'{0}')]");
    public static final Target BUTTON_KNOW_MORE = Target.the("Button know more").located(By.id("filtrado-conoce-inversion-0"));
}
