package starter.completeTable;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InfoTable {
    public static Target INPUT_FIRST_NAME = Target.the("input first name").located(By.id("firstName"));
    public static Target INPUT_LAST_NAME = Target.the("input last name").located(By.id("lastName"));
    public static Target INPUT_EMAIL = Target.the("input email").located(By.id("userEmail"));
    public static Target INPUT_AGE = Target.the("input age ").located(By.id("age"));
    public static Target INPUT_SALARY = Target.the("input salary").located(By.id("salary"));
    public static Target INPUT_DEPARTMENT = Target.the("input department").located(By.id("department"));
    public static Target BUTTON_SUBMIT = Target.the("button submit").located(By.id("submit"));

}
