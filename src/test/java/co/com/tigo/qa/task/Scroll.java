package co.com.tigo.qa.task;

import co.com.tigo.qa.userinterfaces.ComprarUI;
import co.com.tigo.qa.userinterfaces.HomeAppUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Scroll implements Interaction {

    String direccion;

    public Scroll( String direccion) {
        this.direccion = direccion;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Utill.deslizaHacia(direccion, HomeAppUI.SELEC_LINEA.resolveFor(actor), BrowseTheWeb.as(actor).getDriver());
    }

    public static Scroll toElement( String direccion){
        return Tasks.instrumented(Scroll.class , direccion);
    }
}
