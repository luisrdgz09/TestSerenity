package starter.stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.AlertAction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.openAlert.OpenOptionAlert;
import starter.ui.HomePage;


public class AlertsStepDefinitions {
    @When("{actor} open the differents alerts {string}:")
    public void he_open_the_differents_alerts(Actor actor, String alert) {
        actor.attemptsTo(
                OpenOptionAlert.To(alert)
        );

    }
    @Then("he should see the alert correctly")
    public void he_should_see_the_alert_correctly() {

    }



    }


