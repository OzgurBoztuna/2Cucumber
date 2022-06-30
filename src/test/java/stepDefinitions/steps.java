package stepDefinitions;

import com.google.common.collect.Maps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.DataTable;
import org.junit.Assert;
import pages.Home;
import pages.addTariffPlan;
import utils.BrowserUtils;
import utils.ConfigurationsReader;
import utils.Driver;

import java.util.Map;

public class steps extends BrowserUtils {
    Home home =new Home();
    addTariffPlan addTariffPlan2=new addTariffPlan();
    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("demoURL"));
        BrowserUtils.setWaitTime();

    }

    @When("The user wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {
       home.open();

    }

    @Then("The user wants to verify {string} headerr")
    public void the_user_wants_to_verify_headerr(String string) {
        addTariffPlan2.headerCheck(string);

    }

    @Then("The user wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(Map<String,String> dataTable) {
        addTariffPlan2.fillInputFields(dataTable);

    }

    @Then("The user wants to submit")
    public void the_user_wants_to_submit() {
      addTariffPlan2.clickSubmit();

    }

    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
   addTariffPlan2.headerCheck2(string);

    }
}
