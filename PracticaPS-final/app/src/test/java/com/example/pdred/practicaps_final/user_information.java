package com.example.pdred.practicaps_final;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import com.example.pdred.practicaps_final.Clases.Usuario;
import com.example.pdred.practicaps_final.Clases.Jugador;
import com.example.pdred.practicaps_final.Clases.Equipo;
import java.util.ArrayList;
import static org.junit.Assert.*;

//@RunWith(Cucumber.class)
public class user_information {

    @Given("^The user is in a community$")
    public void the_user_is_in_a_community() throws Throwable {
        //throw new PendingException();
        Jugador jug1 = new Jugador(0,"Cuellar","POR",100000,1,"Dani");
        Jugador jug2 = new Jugador(0,"Navas","POR",1000000,1,"Dani");
        ArrayList<Jugador> listaJug = new ArrayList<>();
        listaJug.add(jug1);
        listaJug.add(jug2);
        Equipo equipo = new Equipo("equipo1",20000000,listaJug.size(),listaJug);
        Usuario user = new Usuario("Dani","Calidad",1000000,0,equipo);

        assertNotNull(user.getNombreLiga());
    }

    @When("^The user name is pressed$")
    public void the_user_name_is_pressed() throws Throwable {
        //throw new PendingException();
        assertTrue(true);
    }

    @Then("^Displays user information$")
    public void displays_user_information() throws Throwable {
        //throw new PendingException();
        Jugador jug1 = new Jugador(0,"Cuellar","POR",100000,1,"Dani");
        Jugador jug2 = new Jugador(0,"Navas","POR",1000000,1,"Dani");
        ArrayList<Jugador> listaJug = new ArrayList<>();
        listaJug.add(jug1);
        listaJug.add(jug2);
        Equipo equipo = new Equipo("equipo1",20000000,listaJug.size(),listaJug);
        Usuario user = new Usuario("Dani","Calidad",1000000,0,equipo);

        assertEquals(user.getNombreUsuario(),"Dani");
        assertEquals(user.getNombreLiga(),"Calidad");
        assertEquals(user.getDinero(),1000000);
        assertEquals(user.getPuntos(),0);
        assertNotNull(user.getEquipo());
    }

}