package starter.fillDatePicker;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatePikers {
   public static Target INPUT_DATE = Target.the("input date ").located(By.id("datePickerMonthYearInput"));
   public static Target INPUT_DATE_AND_TIME = Target.the("input date and time").located(By.id("dateAndTimePickerInput"));
   public static Target LIST_MONTH = Target.the("list month").located(By.xpath("//select[@class='react-datepicker__month-select']"));
   public static Target LIST_YEAR = Target.the("list year").located(By.xpath("//select[@class='react-datepicker__year-select']"));

}
