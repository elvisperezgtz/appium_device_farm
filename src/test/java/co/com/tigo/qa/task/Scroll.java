package co.com.tigo.qa.task;

import co.com.tigo.qa.userinterfaces.ComprarUI;
import co.com.tigo.qa.userinterfaces.HomeAppUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class Scroll implements Interaction {

    String dir;
    private Target target;

    public Scroll(String dir,Target target){
        this.dir = dir;
        this.target = target;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Utill.deslizaHacia(dir, target.resolveFor(actor), BrowseTheWeb.as(actor).getDriver());
    }

    public static Scroll toElement( String dir, Target target){
        return Tasks.instrumented(Scroll.class , dir,target);
    }
}
