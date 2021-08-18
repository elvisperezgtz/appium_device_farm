package co.com.tigo.qa.stepdefinitions;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import co.com.tigo.qa.questions.MisServicios;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import co.com.tigo.qa.questions.TheElementVisibility;
import co.com.tigo.qa.task.*;
import co.com.tigo.qa.userinterfaces.HomeAppUI;
import co.com.tigo.qa.userinterfaces.ComprarUI;
import co.com.tigo.qa.utils.MyAndroidDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import net.thucydides.core.annotations.Managed;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.Stage;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import java.net.MalformedURLException;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {
    public static String accessKey = "elvisperezgtz_Er0QPh";
    public static String userName = "hJoskWauw1zLtGoSqtpz";
    private Utill utillVAr;



    @Managed(driver = "appium")
    private AppiumDriver<MobileElement> hisBrowser;
  //  private WebDriver hisBrowser;
    private Actor david = Actor.named("David");


    //    private Actor actor = Actor.named("James");
    @Before
    public void setUp() throws MalformedURLException {


        david.can(BrowseTheWeb.with(hisBrowser));

    }

    @Given("^El usuario registrado se encuentra en la OneApp$")
    public void elUsuarioRegistradoSeEncuentraEnLaOneApp() throws MalformedURLException {
        //OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyAndroidDriver.hisLocalAndroidDriver().enLaApp()));
//        david.wasAbleTo(Omitir.actualizacionDisponible());

    }

    @When("^El inicia sesion en la app por medio del correo electronico$")
    public void elIniciaSesionEnLaAppPorMedioDelCorreoElectronico() throws InterruptedException {
        david.wasAbleTo(LoginWith.emailAndPassword("pruebastigo2014@gmail.com", "123456789Pb"),
                GoTo.the(HomeAppUI.SALTAR_BIO));
        Thread.sleep(5000);
        david.wasAbleTo(Scroll.toElement("ABAJO",HomeAppUI.SELEC_LINEA),
                GoTo.the(HomeAppUI.SELEC_LINEA));

        Thread.sleep(5000);
    }

    @Then("^El deberia poder ver los detalles de la linea$")
    public void elDeberiaPoderVerLosDetallesDeLaLinea() throws InterruptedException {
        david.attemptsTo(GoTo.the(HomeAppUI.SALDOS),
                GoTo.the(HomeAppUI.SERVICIOS),
                GoTo.the(HomeAppUI.COMPRAS_ONEAPP));
        Thread.sleep(5000);

        david.attemptsTo(
                GoTo.the(ComprarUI.PAQUETE_PREPAGO),
                GoTo.the(ComprarUI.SALDO_DE_RECARGA));

        david.attemptsTo(GoTo.the(ComprarUI.BOTON_PAGAR));
        Thread.sleep(5000);

        david.should(seeThat(the(ComprarUI.COMPRA_EXITOSA),isCurrentlyVisible()));
        david.should(seeThat(the(ComprarUI.COMPRA_EXITOSA),isCurrentlyVisible()));
   }

}
