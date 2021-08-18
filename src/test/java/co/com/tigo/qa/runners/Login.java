package co.com.tigo.qa.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.com.tigo.qa.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/features/login.feature"
//        ,tags = "@recuperarContrasenia"
)
public class Login {
}
