package dyds.solid.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import dyds.solid.ejA.*;

import java.util.ArrayList;


public class EjATest {

	ArrayList<RedSocial> redes;

	@Before
	public void setUp() throws Exception {
		ManejadorDeChulogram.getInstance().resetSingleton();
		redes.add(ManejadorDeChulogram.getInstance());
		ManejadorDeTikitaka.getInstance().resetSingleton();
		redes.add(ManejadorDeChulogram.getInstance());
	}

	@Test
	public void testBase() {

		ProcesadorDeContenidosNuevos procesador =  new ProcesadorDeContenidosNuevos(redes);
		assertEquals(ManejadorDeChulogram.getInstance().getCantidadContenidosEnviados(), 0);
	}

	@Test
	public void testContenidoInvalidoNulo() {
		ProcesadorDeContenidosNuevos procesador =  new ProcesadorDeContenidosNuevos(redes);
		procesador.procesar(new Contenido(null));

		assertEquals(ManejadorDeChulogram.getInstance().getCantidadContenidosEnviados(), 0);
	}

	@Test
	public void testContenidoInvalidoVacio() {
		ProcesadorDeContenidosNuevos procesador =  new ProcesadorDeContenidosNuevos(redes);
		procesador.procesar(new Contenido(""));

		assertEquals(ManejadorDeChulogram.getInstance().getCantidadContenidosEnviados(), 0);
	}

	@Test
	public void test1ContenidoReposteado() {
		ProcesadorDeContenidosNuevos procesador =  new ProcesadorDeContenidosNuevos(redes);
		procesador.procesar(new Contenido("Emoji"));

		assertEquals(ManejadorDeChulogram.getInstance().getCantidadContenidosEnviados(), 1);
	}

	@Test
	public void test1ContenidoGuardado() {
		ProcesadorDeContenidosNuevos procesador =  new ProcesadorDeContenidosNuevos(redes);
		procesador.procesar(new Contenido("Emoji"));

		assertEquals(procesador.getRepo().getRepoSizeForTesting(), 1);
	}

	@Test
	public void test2ContenidosReposteados() {
		ProcesadorDeContenidosNuevos procesador =  new ProcesadorDeContenidosNuevos(redes);
		procesador.procesar(new Contenido("Emoji1"));
		procesador.procesar(new Contenido("Emoji2"));

		assertEquals(ManejadorDeChulogram.getInstance().getCantidadContenidosEnviados(), 2);
	}

	@Test
	public void test2ContenidosGuardados() {
		ProcesadorDeContenidosNuevos procesador =  new ProcesadorDeContenidosNuevos(redes);
		procesador.procesar(new Contenido("Emoji1"));
		procesador.procesar(new Contenido("Emoji2"));

		assertEquals(procesador.getRepo().getRepoSizeForTesting(), 2);
	}



}
