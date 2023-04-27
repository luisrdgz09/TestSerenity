package starter.navigation;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;


public class Navigate implements Interaction {
    private final String optionUrl;



    @Override
    @Step("{0} navigate to the page: #optionUrl")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(optionUrl));

    }

    public static Performable hacia(String optionUrl) {
        return Instrumented.instanceOf(Navigate.class).withProperties(optionUrl);
    }

    public Navigate(String optionUrl) {
        this.optionUrl = optionUrl;
    }
}