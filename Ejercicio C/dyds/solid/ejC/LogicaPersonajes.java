package dyds.solid.ejC;

import com.sun.deploy.perf.PerfRollup;

import java.util.ArrayList;
import java.util.List;

public class LogicaPersonajes {
	//private FiltrosPersonaje filtro = new FiltrosPersonaje();
	private List<Personaje> personajes =  new ArrayList<Personaje>();

	public List<Personaje> getListaFiltrada(String nombre, Profesion profesion, int nivel, Filtro filtro){
		Personaje pj = new Personaje(nombre, profesion, nivel, 0);
		return filtro.filter(personajes, pj);
	}

	public List<Personaje> getPersonajes() { return personajes; }
/*
	public List<Personaje> getPersonajesConNombre(String nombre) {
		return filtro.filtroContieneNombre(personajes, nombre);
	}
	
	public List<Personaje> getPersonajesConNivelMayorA(int nivel) {

		return filtro.filtroSuperaNivel(personajes, nivel);
	}

	public List<Personaje> getPersonajesConProfesion(Profesion profesion) {

		return filtro.filtradoPorProfesion(personajes, profesion);
	}
*/


}
