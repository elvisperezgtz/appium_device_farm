package co.com.tigo.qa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {

    public static final Target INGRESAR_CON_CORREO = Target.the("Boton ingresar con correo")
            .locatedForAndroid(By.xpath("//android.widget.Button[contains(@text,'INGRESAR CON CORREO')] | //*[@resource-id=\"goToLogin\"]"))
            .locatedForIOS(By.xpath("//XCUIElementTypeButton[@name=\"goToLogin\"]"));

    public static final Target CAMPO_CORREO = Target.the("Campo correo")
            .locatedForAndroid(By.xpath("(//android.widget.EditText)[1]"))
            .locatedForIOS(By.xpath("//XCUIElementTypeTextField[@name=\"Correo electrónico\"]"));

    public static final Target CAMPO_CONTRASENIA = Target.the("Campo contrasenia")
            .locatedForAndroid(By.xpath("(//android.widget.EditText)[2]"))
            .locatedForIOS(By.xpath("//XCUIElementTypeSecureTextField[@name=\"Contraseña\"]"));

    public static final Target BOTON_INGRESAR = Target.the("Boton ingresar")
            .locatedForAndroid(By.xpath("//android.widget.Button[@text='enterOk']"))
            .locatedForIOS(By.xpath("//XCUIElementTypeButton[@name=\"enterOk\"]"));

    public static final Target OLVIDO_CONTRASENIA = Target.the("¿Olvidaste tu contrasenia")
            .locatedBy("//*[@resource-id='forgotPasswordLbl']");
    public static final Target NUMERO_MOVIL = Target.the("Campo numero movil")
            .locatedBy("//*[@resource-id='forgotPasswordLbl']");
    public static final Target BOTON_CONTINUAR = Target.the("Boton continuar")
            .locatedBy("//android.widget.Button[@text='CONTINUAR']");
    public static final Target BOTON_CONTINUAR2 = Target.the("Boton continuar")
            .locatedBy("(//android.widget.Button[@text='CONTINUAR'])[2]");
    public static final Target BOTON_AHORA_NO = Target.the("Boton ahora no")
            .locatedBy("//*[@text='AHORA NO']");
    public static final Target MENSAJE_ACTUALIZACION = Target.the("Boton ahora no")
            .locatedBy("(//*[contains(@text,'disponible')])[1]");
}
