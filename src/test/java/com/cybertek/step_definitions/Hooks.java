package com.cybertek.step_definitions;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;


public class Hooks {
    @Before
    public void setup(Scenario scenario){
        System.out.println(scenario.getName());
        System.out.println("Empty hook before");


    }
    public void specialSetup(){

    }

    @After
    public void tearDown(){

        System.out.println("Empty hook after");
    }
}
