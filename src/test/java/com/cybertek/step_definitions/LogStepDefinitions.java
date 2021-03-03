package com.cybertek.step_definitions;

import io.cucumber.java.en.When;

public class LogStepDefinitions {

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        System.out.printf("Enter username %s, and password &s to login",username,password);
    }

}
