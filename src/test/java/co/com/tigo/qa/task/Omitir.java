package co.com.tigo.qa.task;

import co.com.tigo.qa.userinterfaces.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static java.time.Duration.ofSeconds;

public class Omitir implements Task {
    @Override
    @Step("{0} omite la actualizacion disponible, si esta aparece")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(LoginUI.BOTON_AHORA_NO.waitingForNoMoreThan(ofSeconds(10)).resolveFor(actor).isDisplayed())
                        .andIfSo(Click.on(LoginUI.BOTON_AHORA_NO)));
    }

    public static Omitir actualizacionDisponible() {
        return Tasks.instrumented(Omitir.class);
    }

}
