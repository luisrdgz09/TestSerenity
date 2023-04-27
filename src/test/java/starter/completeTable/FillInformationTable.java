package starter.completeTable;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import starter.ui.HomePage;

import java.util.List;
import java.util.Map;
import java.util.Random;



public class FillInformationTable {

    public static Performable With(List<Map<String,String>> data) {
        Random radomnum= new Random();
        int value = radomnum.nextInt(4);
        return Task.where("{0} fill information with '" + data+ "'",
                Click.on(HomePage.OPTION_ELEMENTS), WaitUntil.angularRequestsHaveFinished(),
                Click.on(HomePage.ELEMENTS_WEB_TABLE), WaitUntil.angularRequestsHaveFinished(),
                Click.on(WebTables.BUTTON_ADD), WaitUntil.angularRequestsHaveFinished(),
                Enter.theValue(data.get(0).get("name")).into(InfoTable.INPUT_FIRST_NAME),
                Enter.theValue(data.get(0).get("last_name")).into(InfoTable.INPUT_LAST_NAME),
                Enter.theValue(data.get(0).get("email")).into(InfoTable.INPUT_EMAIL),
                Enter.theValue(data.get(0).get("age")).into(InfoTable.INPUT_AGE),
                Enter.theValue(data.get(0).get("salary")).into(InfoTable.INPUT_SALARY),
                Enter.theValue(data.get(0).get("department")).into(InfoTable.INPUT_DEPARTMENT),
                Click.on(InfoTable.BUTTON_SUBMIT), WaitUntil.angularRequestsHaveFinished(),
                Click.on(Target.the("button delete").located(By.xpath("//span[@id='delete-record-"+value+"']")))
        );

    }
}
