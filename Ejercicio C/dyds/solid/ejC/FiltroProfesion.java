package dyds.solid.ejC;

import java.util.ArrayList;
import java.util.List;

public class FiltroProfesion implements Filtro{

    public List<Personaje> filter(List<Personaje> personajes, Atributo pj) {

        Profesion profesion = ((AProfesion)pj).getProfesion();
        List<Personaje> filteredList = new ArrayList<Personaje>();
        for (Personaje personaje : personajes) {
            if (personaje.getRubro() == profesion) {
                filteredList.add(personaje);
            }
        }
        return filteredList;
    }
}
