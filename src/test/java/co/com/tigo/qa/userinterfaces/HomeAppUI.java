package co.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeAppUI {
    public static final Target MIS_SERVICIOS = Target.the("Mis servicios")
            .locatedForAndroid(By.xpath("//*[@text='Mis Servicios']"))
            .locatedForIOS(By.xpath(""));

}
