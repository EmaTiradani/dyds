package dyds.solid.ejC;


import java.util.ArrayList;
import java.util.List;

public class FiltrosPersonaje {
/*
	//Metodo filtrador generico(Modifique los tests para esto)
	public List<Personaje> filtrar(List<Personaje> personajes, String nombre, Profesion profesion, int nivel, Filtro filtro){
		//Creo el personaje con los atributos pasados por parametros
		Personaje personaje = new Personaje(nombre, profesion, nivel, 0);
		return filtro.filter(personajes, personaje);
	}

	/*
	//Metodos para que pase los tests default
	public List<Personaje> filtradoPorProfesion(List<Personaje> personajes, Profesion profesion){
		Filtro filtro = new FiltroProfesion();
		Personaje pj = new Personaje(null, profesion, 0, 0);
		return filtro.filter(personajes, pj);
	}

	public List<Personaje> filtroContieneNombre(List<Personaje> personajes, String parteNombre) {
		Filtro filtro = new FiltroNombre();
		Personaje pj = new Personaje(parteNombre, null, 0, 0);
		return filtro.filter(personajes, pj);
	}

	public List<Personaje> filtroSuperaNivel(List<Personaje> personajes, int nivel) {
		Filtro filtro = new FiltroNivel();
		Personaje pj = new Personaje(null, null, nivel, 0);
		return filtro.filter(personajes, pj);
	}
	/*
	public List<Personaje> filtradoPorProfesion(List<Personaje> personajes, Profesion profesion) {
		List<Personaje> filteredList = new ArrayList<Personaje>();
		for (Personaje personaje : personajes) {
			if (personaje.getRubro() == profesion) {
				filteredList.add(personaje);
			}
		}
		return filteredList;
	}

	public List<Personaje> filtroContieneNombre(List<Personaje> personajes, String parteNombre) {
		List<Personaje> filteredList = new ArrayList<Personaje>();
		for (Personaje personaje : personajes) {
			if (personaje.getNombre().contains(parteNombre)) {
				filteredList.add(personaje);
			}
		}
		return filteredList;
	}

	public List<Personaje> filtroSuperaNivel(List<Personaje> personajes, int nivel) {
		List<Personaje> filteredList = new ArrayList<Personaje>();
		for (Personaje personaje : personajes) {
			if (personaje.getNivel() > nivel) {
				filteredList.add(personaje);
			}
		}
		return filteredList;
	}*/
}
