package starter.openAlert;



import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.HomePage;


import static net.serenitybdd.screenplay.Tasks.instrumented;


public class OpenOptionAlert implements  Task {
    private final  String typeAlert;



    public OpenOptionAlert(String typeAlert) {
        this.typeAlert = typeAlert;
    }



    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(HomePage.OPTION_WIDGETS), WaitUntil.angularRequestsHaveFinished(),
                Click.on(HomePage.OPTION_ALERTS), WaitUntil.angularRequestsHaveFinished(),
                Scroll.to(HomePage.ALERTS),WaitUntil.angularRequestsHaveFinished(),
                Click.on(HomePage.ALERTS),WaitUntil.angularRequestsHaveFinished());

        switch (typeAlert) {
            case "simple_alert":
                actor.attemptsTo(
                        Click.on(PageAlerts.BUTTON_SIMPLE_ALERT),
                        Switch.toAlert(),
                        Switch.toAlert().andAccept()
                        );
                break;
            case "alert_after_5_second":
                actor.attemptsTo(
                        Click.on(PageAlerts.BUTTON_ALERT_FIVE_SECOND));
                Thread.sleep(6000);
                actor.attemptsTo(
                        Switch.toAlert(),
                        Switch.toAlert().andAccept()
                );
                break;
            case "alert_confirm_box":
                actor.attemptsTo(
                        Click.on(PageAlerts.BUTTON_ALERT_CONFIRM_BOX),
                        Switch.toAlert(),
                        Switch.toAlert().andAccept()
                );
                break;
            default:
                actor.attemptsTo(
                        Click.on(PageAlerts.BUTTON_ALERT_PROMPT_BOX),
                        FillAlert.With("pueba"),
                        Switch.toAlert().andAccept()
                );
                break;
        }
    }

    public static Performable To(String typeAlert) {
        return instrumented(OpenOptionAlert.class, typeAlert);
    }
}
