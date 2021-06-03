package co.com.tigo.qa.task;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Utill {

    public static void deslizaHacia(String direccion, WebElementFacade elemento, WebDriver facade){
        WebDriver driver= ((WebDriverFacade) facade).getProxiedDriver();
        TouchAction actions = new TouchAction((MobileDriver)driver) ;
        int intento;
        int maxIntento = 5;
        int puntoX = (int)(facade.manage().window().getSize().width / 2.1);
        int abajoY = (int)(facade.manage().window().getSize().height * 0.8);
        int arribaY = (int)(facade.manage().window().getSize().height * 0.6);
        intento = 10;
        switch (direccion) {
            case "ABAJO":
                while ( intento > 0 )
                {

                    actions.press(PointOption.point(puntoX, abajoY)).moveTo(PointOption.point(puntoX, arribaY)).release().perform();
                    intento--;
//                    if (elemento.isCurrentlyVisible()){
//                        break;
//                    }
                }
                break;
            case "ARRIBA":
                while ( intento < maxIntento ) {
                    actions.press(PointOption.point(puntoX, arribaY)).moveTo(PointOption.point(puntoX, abajoY)).release().perform();
                    intento++;
                    if (elemento.isVisible()){
                        break;
                    }
                }
                break;
        }
}
}