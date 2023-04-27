package starter.fillDatePicker;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import starter.ui.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SelectDate implements  Task {
    private  final  String day;
    private  final  String month;
    private  final  String year;

    public SelectDate(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        int value = Integer.parseInt(day);
        actor.attemptsTo(
                    Click.on(HomePage.OPTION_WIDGETS), WaitUntil.angularRequestsHaveFinished(),
                    Click.on(HomePage.WIDGETS_DATE_PICKER), WaitUntil.angularRequestsHaveFinished(),
                    Click.on(DatePikers.INPUT_DATE), WaitUntil.angularRequestsHaveFinished(),
                    SelectFromOptions.byVisibleText(month).from(DatePikers.LIST_MONTH),
                    SelectFromOptions.byVisibleText(year).from(DatePikers.LIST_YEAR),
                    Click.on(By.xpath("//div[contains(text(),'"+value+"')]")), WaitUntil.angularRequestsHaveFinished()
        );
    }

    public static Performable To (String day, String month, String year ) {
        return instrumented(SelectDate.class, day, month, year);
    }
}
