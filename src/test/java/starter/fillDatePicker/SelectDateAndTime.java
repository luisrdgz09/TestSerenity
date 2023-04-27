package starter.fillDatePicker;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.PageElement;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SelectDateAndTime implements  Task {
    private final  String day;
    private final  String hours;


    public SelectDateAndTime(String day, String hours) {
        this.day = day;
        this.hours = hours;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DatePikers.INPUT_DATE_AND_TIME), WaitUntil.angularRequestsHaveFinished(),
                Click.on(By.xpath("//div[contains(text(),"+day+")]")), WaitUntil.angularRequestsHaveFinished(),
                Click.on(PageElement.withCSSClass("react-datepicker__time-list-item").containingText("1:00"))
        );
    }

    public static Performable To(String day, String hours) {
        return instrumented(SelectDateAndTime.class, day, hours);
    }
}
