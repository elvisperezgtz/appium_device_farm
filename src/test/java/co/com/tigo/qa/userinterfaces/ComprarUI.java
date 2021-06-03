package co.com.tigo.qa.userinterfaces;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprarUI {

    public static final Target PAQUETE_PREPAGO = Target.the("Paquete a comprar")
            .locatedForAndroid(By.xpath("(//android.widget.Button[@text='$990'])[1]"))
            .locatedForIOS(By.xpath(""));

    public static final Target SALDO_DE_RECARGA = Target.the("saldo de recarga")
            .locatedForAndroid(By.xpath("//android.widget.TextView[@text='Saldo de recargas']"))
            .locatedForIOS(By.xpath(""));

    public static final Target BOTON_PAGAR = Target.the("boton de pagar")
            .locatedForAndroid(By.xpath("//android.widget.Button[@text='showPaymentSummary']"))
            .locatedForIOS(By.xpath(""));

    public static final Target COMPRA_EXITOSA = Target.the("Mensaje de compra")
            .locatedForAndroid(By.xpath("//android.widget.Image[@text='ok']"))
            .locatedForIOS(By.xpath(""));

    public static final Target MENSAJE_CONFIRMACION = Target.the("Mensaje de confirmacion")
            .locatedForAndroid(By.xpath("//android.view.View[@text='Te hemos enviado un SMS de confirmación']"))
            .locatedForIOS(By.xpath(""));

}
