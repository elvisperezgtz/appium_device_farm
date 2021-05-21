package co.com.tigo.qa.stepdefinitions;

import co.com.tigo.qa.questions.MisServicios;
import co.com.tigo.qa.task.LoginWith;
import co.com.tigo.qa.task.Omitir;
import co.com.tigo.qa.utils.MyAndroidDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;
import org.hamcrest.Matchers;

import java.net.MalformedURLException;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {
    public static String accessKey = "elvisperezgtz_Er0QPh";
    public static String userName = "hJoskWauw1zLtGoSqtpz";

    AppiumDriver<MobileElement> driver;

    //    private Actor actor = Actor.named("James");
    @Before
    public void setUp() throws MalformedURLException {
        Stage stage = OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("James");
    }

    @Given("^El usuario registrado se encuentra en la OneApp$")
    public void elUsuarioRegistradoSeEncuentraEnLaOneApp() throws MalformedURLException {
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyAndroidDriver.hisBrowserStackDriver().enLaApp()));
    }

    @When("^El inicia sesion en la app por medio del correo electronico$")
    public void elIniciaSesionEnLaAppPorMedioDelCorreoElectronico() {

        theActorInTheSpotlight().attemptsTo(
//                Omitir.actualizacionDisponible(),
                LoginWith.emailAndPassword("automatizacionmicuenta@gmail.com", "Tigo2019")
        );

    }

    @Then("^El deberia poder ver los detalles de la linea$")
    public void elDeberiaPoderVerLosDetallesDeLaLinea() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(MisServicios.disponibles(), Matchers.is(true))
        );
    }

}
