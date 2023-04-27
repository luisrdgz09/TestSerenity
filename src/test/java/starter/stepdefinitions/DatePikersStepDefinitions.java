package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.fillDatePicker.SelectDate;
import starter.fillDatePicker.SelectDateAndTime;
import starter.navigation.Navigate;
import starter.utils.Parameters;




public class DatePikersStepDefinitions {

    @Given("{actor} is researching things on the internet")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(Navigate.hacia(Parameters.PAGE_DEMOQA));
    }

    @When("{actor} select date with day {string} month {string} year {string}")
    public void he_select_date_with_day_month_year(Actor actor, String day, String month,  String year) {
        actor.attemptsTo(
                SelectDate.To(day, month, year));
    }
    @And("{actor} select day {string} and time hours {string}")
    public void he_select_day_and_time_hours(Actor actor, String day, String hours ) {
        actor.attemptsTo(
                SelectDateAndTime.To(day, hours));
    }


    @Then("{actor} should see that information correct")
    public void he_should_see_that_information_correct(Actor actor) {

    }

}
