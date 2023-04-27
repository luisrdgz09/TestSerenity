package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
   public static final Target OPTION_ELEMENTS = Target.the("option elements").locatedBy("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards div.card.mt-4.top-card:nth-child(1) div:nth-child(1) div.avatar.mx-auto.white > svg:nth-child(1)");
   public static final Target OPTION_WIDGETS = Target.the("option widgets'").locatedBy("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards div.card.mt-4.top-card:nth-child(4) div:nth-child(1) div.avatar.mx-auto.white > svg:nth-child(1)");
   public static final Target OPTION_ALERTS = Target.the("option alerts'").locatedBy("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards div.card.mt-4.top-card:nth-child(3) div:nth-child(1) div.avatar.mx-auto.white > svg:nth-child(1)");
   public static final Target ELEMENTS_WEB_TABLE = Target.the("elements web table ").located(By.xpath("//span[contains(text(),'Web Tables')]"));
   public static final Target WIDGETS_DATE_PICKER = Target.the("widgets date piker ").located(By.xpath("//span[contains(text(),'Date Picker')]"));
   public static final Target ALERTS = Target.the("widgets date piker ").located(By.xpath("//span[contains(text(),'Alerts')]"));
}
