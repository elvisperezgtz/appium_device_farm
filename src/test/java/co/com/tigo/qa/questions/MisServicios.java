package co.com.tigo.qa.questions;

import co.com.tigo.qa.userinterfaces.HomeAppUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import java.time.Duration;

public class MisServicios implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(HomeAppUI.MIS_SERVICIOS.waitingForNoMoreThan(Duration.ofSeconds(30))).viewedBy(actor).asBoolean();
    }
    public static MisServicios disponibles(){
        return new MisServicios();
    }
}
