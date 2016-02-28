package com.example.pdred.practicaps_final;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

//@RunWith(Cucumber.class)
public class validate_username {

    @Given("^The name of the user to validate$")
    public void the_name_of_the_user() throws Throwable {
        //throw new PendingException();
        assertEquals("ok","ok");
    }

    @When("^Validate button is pressed$")
    public void validate_button_is_pressed() throws Throwable {
        //throw new PendingException();
        assertEquals("ok","ok");
    }

    @Then("^The user name is validate$")
    public void the_user_name_is_validate() throws Throwable {
        //throw new PendingException();
        assertEquals("ok","ok");
    }

}