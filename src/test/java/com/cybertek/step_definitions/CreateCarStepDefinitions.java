package com.cybertek.step_definitions;

import com.google.gson.internal.bind.util.ISO8601Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class CreateCarStepDefinitions {

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("User landed");
    }
    @When("user logs in with {string} and {string} credentials")
    public void user_logs_in_with_and_credentials(String string, String string2) {
        System.out.println("User logged");
    }
    @Then("user navigates to {string} and {string}")
    public void user_navigates_to_and(String string, String string2) {
        System.out.printf("user navigates to %s tab and %s module", string, string2);
    }
    @Then("user click on create car button")
    public void user_click_on_create_car_button() {
        System.out.println("User clicks on car button");
    }
    @Then("user enter vehicles information:")
    public void user_enter_vehicles_information(List<Map<String, String>> dataTable) {
      dataTable.forEach(p -> System.out.println());
    }

}
