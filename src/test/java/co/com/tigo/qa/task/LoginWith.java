package co.com.tigo.qa.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.tigo.qa.userinterfaces.LoginUI.*;

public class LoginWith {

    public static Performable emailAndPassword(String username, String password) {
        return Task.where("{0} ingresa en la aplicacion con su usario #username y su constrasenia",
                Click.on(INGRESAR_CON_CORREO)
                , Enter.theValue(username).into(CAMPO_CORREO)
                , Enter.theValue(password).into(CAMPO_CONTRASENIA)
                , Click.on(BOTON_INGRESAR));
    }
}
