package dyds.solid.tests;

import dyds.solid.ejC.LogicaPersonajes;
import dyds.solid.ejC.Personaje;
import dyds.solid.ejC.Profesion;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dyds.solid.ejC.*;

    public class EjCTest2 {

    LogicaPersonajes logicaPersonajes = new LogicaPersonajes();

    @Before
    public void setUp() throws Exception {
        Personaje personajeA = new Personaje("Pungui", Profesion.Granuja, 500, 5);
        Personaje personajeB = new Personaje("Conano", Profesion.Campeon, 20, 50);
        Personaje personajeC = new Personaje("El Magias", Profesion.Mago, 200, 10);
        Personaje personajeD = new Personaje("El Raton", Profesion.Granuja, 750, 15);

        logicaPersonajes.getPersonajes().add(personajeA);
        logicaPersonajes.getPersonajes().add(personajeB);
        logicaPersonajes.getPersonajes().add(personajeC);
        logicaPersonajes.getPersonajes().add(personajeD);
    }

    @Test
    public void testProfesionesCant() {
        Filtro filtro = new FiltroProfesion();
        List<Personaje> clientesBB = logicaPersonajes.getListaFiltrada("Pepe", Profesion.Granuja, 2, filtro);

        assertEquals(clientesBB.size(), 2);
    }

    @Test
    public void testProfPersonaje1() {
        Filtro filtro = new FiltroProfesion();
        List<Personaje> clientesBB = logicaPersonajes.getListaFiltrada("Pepe",Profesion.Granuja, 2, filtro);

        assertEquals(clientesBB.get(0).getNombre(),"Pungui");
    }

    @Test
    public void testProfPersonaje2() {
        Filtro filtro = new FiltroProfesion();
        List<Personaje> clientesBB = logicaPersonajes.getListaFiltrada("pepe", Profesion.Granuja, 2, filtro);

        assertEquals(clientesBB.get(1).getNombre(),"El Raton");
    }

    @Test
    public void testContieneNombreCant() {
        Filtro filtro = new FiltroNombre();
        List<Personaje> clientesB = logicaPersonajes.getListaFiltrada("El", Profesion.Campeon, 3, filtro);

        assertEquals(clientesB.size(), 2);
    }

    @Test
    public void testContieneNombrePers1() {
        Filtro filtro = new FiltroNombre();
        List<Personaje> clientesB = logicaPersonajes.getListaFiltrada("Con", Profesion.Mago, 2, filtro);

        assertEquals(clientesB.get(0).getNombre(),"Conano");
    }

    @Test
    public void testMasCarosQue() {
        Filtro filtro = new FiltroNivel();
        List<Personaje> clientesSaldo = logicaPersonajes.getListaFiltrada("Coso", Profesion.NONE, 50, filtro);

        assertEquals(clientesSaldo.size(), 3);
    }
}
