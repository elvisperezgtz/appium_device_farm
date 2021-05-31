package co.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeAppUI {
    public static final Target MIS_SERVICIOS = Target.the("Mis servicios")
            .locatedForAndroid(By.xpath("//*[@text='Mis Servicios']"))
            .locatedForIOS(By.xpath(""));

    public static final Target SELEC_LINEA = Target.the("Campo contrasenia")
            .locatedBy("//android.view.View/android.view.View[8]/android.view.View/android.view.View/android.view.View");


    public static final Target SALTAR_BIO = Target.the("NEXT BIO")
            .locatedForAndroid(By.xpath("//android.view.View[2]/android.view.View[4]/android.view.View/android.widget.Button"))
            .locatedForIOS(By.xpath(""));

    public static final Target SALDOS = Target.the("SALDOS")
            .locatedForAndroid(By.xpath("//android.view.View[2]/android.widget.TabWidget/android.view.View[2]/android.view.View"))
            .locatedForIOS(By.xpath(""));

    public static final Target SERVICIOS = Target.the("CONSUMOS ONE APP")
            .locatedForAndroid(By.xpath("//android.view.View[2]/android.widget.TabWidget/android.view.View[3]/android.view.View"))
            .locatedForIOS(By.xpath(""));

    public static final Target COMPRAS_ONEAPP = Target.the("CONSUMOS ONE APP")
            .locatedForAndroid(By.xpath("//android.view.View[2]/android.widget.TabWidget/android.view.View[4]/android.view.View"))
            .locatedForIOS(By.xpath(""));
}
