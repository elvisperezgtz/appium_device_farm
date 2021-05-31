package co.com.tigo.qa.stepdefinitions;

import co.com.tigo.qa.questions.MisServicios;
import co.com.tigo.qa.task.GoTo;
import co.com.tigo.qa.task.LoginWith;
import co.com.tigo.qa.task.Omitir;
import co.com.tigo.qa.userinterfaces.HomeAppUI;
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



    @Managed(driver = "appium")
    //AppiumDriver<MobileElement> hisBrowser;
    private WebDriver hisBrowser;
    private Actor david = Actor.named("David");


    //    private Actor actor = Actor.named("James");
    @Before
    public void setUp() throws MalformedURLException {

        //hisBrowser.manage().window().maximize();
        david.can(BrowseTheWeb.with(hisBrowser));
        //Stage stage = OnStage.setTheStage(new OnlineCast());
        //OnStage.theActorCalled("James");
    }

    @Given("^El usuario registrado se encuentra en la OneApp$")
    public void elUsuarioRegistradoSeEncuentraEnLaOneApp() throws MalformedURLException {
        //OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyAndroidDriver.hisLocalAndroidDriver().enLaApp()));
        david.wasAbleTo(Omitir.actualizacionDisponible());

    }

    @When("^El inicia sesion en la app por medio del correo electronico$")
    public void elIniciaSesionEnLaAppPorMedioDelCorreoElectronico() throws InterruptedException {
        david.wasAbleTo(LoginWith.emailAndPassword("automatizacionmicuenta@gmail.com", "Tigo2019"),
                GoTo.the(HomeAppUI.SALTAR_BIO),
                GoTo.the(HomeAppUI.SELEC_LINEA));
        
        Thread.sleep(5000);

        //theActorInTheSpotlight().attemptsTo(
        //        //Omitir.actualizacionDisponible(),
       //         LoginWith.emailAndPassword("automatizacionmicuenta@gmail.com", "Tigo2019")
     //   );

    }

    @Then("^El deberia poder ver los detalles de la linea$")
    public void elDeberiaPoderVerLosDetallesDeLaLinea() throws InterruptedException {
        david.attemptsTo(GoTo.the(HomeAppUI.SALDOS),
                GoTo.the(HomeAppUI.SERVICIOS),
                GoTo.the(HomeAppUI.COMPRAS_ONEAPP));
        Thread.sleep(5000);

        //theActorInTheSpotlight().should(
          //      GivenWhenThen.seeThat(MisServicios.disponibles(), Matchers.is(true))
       // );
    }

}
