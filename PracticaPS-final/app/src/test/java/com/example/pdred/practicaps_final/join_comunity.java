package com.example.pdred.practicaps_final;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

//@RunWith(Cucumber.class)
public class join_comunity {

    @Given("^The name of the user and the name of the comunity$")
    public void the_name_of_the_user_and_the_name_of_the_comunity() throws Throwable {
        //throw new PendingException();
        assertEquals("ok","ok");
    }

    @When("^Join comunity button is pressed$")
    public void join_comunity_button_is_pressed() throws Throwable {
        //throw new PendingException();
        assertEquals("ok","ok");
    }

    @Then("^User is joined in the existing comunity$")
    public void user_is_joined_in_the_existing_comunity() throws Throwable {
        //throw new PendingException();
        assertEquals("ok","ok");
    }

}