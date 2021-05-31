package co.com.tigo.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoTo implements Task {

    private Target target;

    public GoTo(Target target) {

        this.target = target;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(target));

    }


    public static GoTo the(Target target) {

        return Tasks.instrumented(GoTo.class, target);

    }
}
