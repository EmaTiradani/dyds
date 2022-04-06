package dyds.solid.ejC;


import java.util.ArrayList;
import java.util.List;

public class LogicaPersonajes {

	private List<Personaje> personajes =  new ArrayList<Personaje>();

	public List<Personaje> getListaFiltrada(String nombre, Profesion profesion, int nivel, Filtro filtro){
		Personaje pj = new Personaje(nombre, profesion, nivel, 0);
		return filtro.filter(personajes, pj);
	}

	public List<Personaje> getPersonajes() { return personajes; }
}
