package starter.completeTable;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WebTables {
   public static Target BUTTON_ADD = Target.the("button add").located(By.id("addNewRecordButton"));
   public static Target BUTTON_DELETE = Target.the("button add").located(By.id("addNewRecordButton"));
   public static InfoTable infoTable ;
}
