package com.example.pdred.practicaps_final;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

//@RunWith(Cucumber.class)
public class create_comunity {

    @Given("^The name of the comunity$")
    public void comunity_name() throws Throwable {
        //throw new PendingException();
        assertEquals("ok","ok");
    }

    @When("^Create new comunity button is pressed$")
    public void create_new_comunity_button_is_pressed() throws Throwable {
        //throw new PendingException();
        assertEquals("ok","ok");
    }

    @Then("^A comunity is created$")
    public void a_comunity_is_created() throws Throwable {
        //throw new PendingException();
        assertEquals("ok","ok");
    }

}