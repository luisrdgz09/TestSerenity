package starter.stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.completeTable.FillInformationTable;
import starter.navigation.Navigate;
import starter.utils.Parameters;

import java.util.List;
import java.util.Map;


public class WebTablesStepDefinitions {


    @When("{actor} add and remove items to a table with")
    public void he_add_and_remove_items_to_a_table_with(Actor actor, List<Map<String,String>> data) {
        actor.attemptsTo(

                FillInformationTable.With(data)
        );

    }

    @Then("{actor} should add and remove correctly")
    public void he_should_add_and_remove_correctly(Actor actor) {

    }
}
