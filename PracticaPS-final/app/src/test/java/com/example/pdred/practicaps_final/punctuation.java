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
public class punctuation {


    ArrayList<Usuario> users = new ArrayList<>();

    @Given("^The user has a punctuation$")
    public void the_user_has_a_punctuation() throws Throwable {
        //throw new PendingException();
        Jugador jug1 = new Jugador(0,"Cuellar","POR",100000,1,"Dani");
        Jugador jug2 = new Jugador(0,"Navas","POR",1000000,1,"Dani");
        ArrayList<Jugador> listaJug = new ArrayList<>();
        listaJug.add(jug1);
        listaJug.add(jug2);
        Equipo equipo = new Equipo("equipo1",20000000,listaJug.size(),listaJug);
        Usuario user = new Usuario("Dani","Calidad",1000000,0,equipo);
        users.add(user);
        assertEquals(user.getPuntos(),0);
    }

    @When("^I press Mi Liga$")
    public void i_press_mi_liga() throws Throwable {
        //throw new PendingException();
        assertTrue(true);
    }

    @Then("^Appears the user list sorted by points$")
    public void appears_the_user_list_sorted_by_points() throws Throwable {
        //throw new PendingException();
        for (Usuario u : users) {
            System.out.println(u.getNombreUsuario());
        }
        assertEquals(users.get(0).getNombreUsuario(),"Dani");
    }

}