package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesStepDefinitions {

    @Given("user is on the sales page")
    public void user_is_on_the_sales_page() {
        System.out.println("I am on the sales page");

    }
    @When("user logs in as a sales manager")
    public void user_logs_in_as_a_sales_manager() {
        System.out.println("Logged as a sales manager");

    }
    @Then("user should see the Sales dashboard")
    public void user_should_see_the_sales_dashboard() {
        System.out.println("I saw the Sales dashboard");

    }

}
