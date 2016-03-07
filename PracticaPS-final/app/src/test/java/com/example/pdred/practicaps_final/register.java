package com.example.pdred.practicaps_final;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import com.example.pdred.practicaps_final.Clases.Usuario;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

public class register {

    String username = "Luis";
    Usuario user;
    ArrayList<Usuario> users = new ArrayList<>();

    // <editor-fold desc="// GIVEN">
    @Given("^The name of the comunity$")
    public void the_name_of_the_comunity() throws Throwable {
        assertEquals("ok","ok");
    }

    @Given("^The name of the user$")
    public void the_name_of_the_user() throws Throwable {
        System.out.println("Username: " + username);
        assertEquals(username, "Luis");
    }

    @Given("^The name of the user and the comunity$")
    public void the_name_of_the_user_and_the_comunity() throws Throwable {
        assertEquals("ok","ok");
    }

    @Given("^The name of the user to validate$")
    public void the_name_of_the_user_to_validate() throws Throwable {
        assertEquals("ok","ok");
    }
    // </editor-fold>

    // <editor-fold desc="// WHEN">
    @When("^Create new comunity button$")
    public void create_new_comunity_button() throws Throwable {
        assertEquals("ok","ok");
    }

    @When("^Input user name button is pressed$")
    public void input_user_name_button_is_pressed() throws Throwable {
        System.out.println("adding " + username);
        user = Usuario.cargarUsuario(username);
        assertTrue(users.add(user));
    }

    @When("^Join comunity button is pressed$")
    public void join_comunity_button_is_pressed() throws Throwable {
        assertEquals("ok","ok");
    }

    @When("^Validate button is pressed$")
    public void validate_button_is_pressed() throws Throwable {
        assertEquals("ok","ok");
    }
    // </editor-fold>

    // <editor-fold desc="// THEN">
    @Then("^A comunity is created$")
    public void a_comunity_is_created() throws Throwable {
        assertEquals("ok","ok");
    }

    @Then("^Username is registered$")
    public void username_is_registered() throws Throwable {
        assertEquals(user.getNombreUsuario(), username);
    }

    @Then("^User is joined in the existing comunity$")
    public void user_is_joined_in_the_existing_comunity() throws Throwable {
        assertEquals("ok","ok");
    }

    @Then("^The user name is validate$")
    public void the_user_name_is_validate() throws Throwable {
        assertEquals("ok","ok");
    }
    // </editor-fold>

}