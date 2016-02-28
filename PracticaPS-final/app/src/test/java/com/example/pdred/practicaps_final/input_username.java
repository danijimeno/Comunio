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

public class input_username {

    String username = "Luis";
    Usuario user;
    ArrayList<Usuario> users = new ArrayList<>();

    @Given("^The name of the user$")
    public void the_name_of_the_user() throws Throwable {
        System.out.println("Username: " + username);
        assertEquals(username, "Luis");
    }

    @When("^Input user name botton is pressed$")
    public void input_user_name_botton_is_pressed() throws Throwable {
        System.out.println("adding " + username);
        user = Usuario.cargarUsuario(username);
        assertTrue(users.add(user));
    }

    @Then("^Username is registered$")
    public void username_is_registered() throws Throwable {
        assertEquals(user.getNombreUsuario(), username);
    }

}