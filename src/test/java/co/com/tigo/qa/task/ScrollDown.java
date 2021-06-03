package co.com.tigo.qa.task;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ScrollDown implements Task {

    private Target target;
    AppiumDriver browser;
    //TouchAction touchAction;
    int width;
    int startPoint;
    int endPoint;
    Dimension size;

    public ScrollDown(Target target, AppiumDriver browser ) {
        //touchAction = new TouchAction(browser);
        this.browser=browser;
        this.target = target;
        size = browser.manage().window().getSize();
        width = size.width / 2;
        startPoint = (int) (size.getHeight() * 0.80);
        endPoint = (int) (size.getHeight() * 0.20);

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        new TouchAction(browser).press(PointOption.point(width, startPoint)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(width, endPoint)).release().perform();
    }

    public static ScrollDown to(Target target, WebDriver browser) {

        return Tasks.instrumented(ScrollDown.class, target, browser);

    }
}
