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
public class name_community {

    @Given("^The user belongs to a community$")
    public void the_user_belongs_to_a_community() throws Throwable {
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

    @When("^I press Mi liga$")
    public void i_press_mi_liga() throws Throwable {
        //throw new PendingException();
        assertTrue(true);
    }

    @Then("^I see the name of the community$")
    public void i_see_the_name_of_the_community() throws Throwable {
        //throw new PendingException();
        Jugador jug1 = new Jugador(0,"Cuellar","POR",100000,1,"Dani");
        Jugador jug2 = new Jugador(0,"Navas","POR",1000000,1,"Dani");
        ArrayList<Jugador> listaJug = new ArrayList<>();
        listaJug.add(jug1);
        listaJug.add(jug2);
        Equipo equipo = new Equipo("equipo1",20000000,listaJug.size(),listaJug);
        Usuario user = new Usuario("Dani","Calidad",1000000,0,equipo);

        System.out.println("Comunidad: "+user.getNombreLiga());
        assertEquals(user.getNombreLiga(),"Calidad");

    }

}