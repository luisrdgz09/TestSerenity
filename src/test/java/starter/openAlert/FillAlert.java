package starter.openAlert;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class FillAlert implements Task {
    public FillAlert() {
    }
    
    
    public <T extends Actor> void performAs(T t) {
        
    }
    
    public static Performable With(String text) {
        return Task.where("{0} fill the input of the alets", (actor) -> {
            BrowseTheWeb.as(actor).getDriver().switchTo().alert().sendKeys(text);
        });
    }
}

