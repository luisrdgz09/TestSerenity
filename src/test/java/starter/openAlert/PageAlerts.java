package starter.openAlert;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageAlerts {
   public static Target BUTTON_SIMPLE_ALERT = Target.the("button simple alert ").located(By.id("alertButton"));
   public static Target BUTTON_ALERT_FIVE_SECOND = Target.the("button alert fiver second").located(By.id("timerAlertButton"));
   public static Target BUTTON_ALERT_CONFIRM_BOX = Target.the("button alert confirm box").located(By.id("confirmButton"));
   public static Target BUTTON_ALERT_PROMPT_BOX = Target.the("button alert prompt box").located(By.id("promtButton"));

}
