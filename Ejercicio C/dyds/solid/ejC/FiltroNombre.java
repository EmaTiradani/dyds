package dyds.solid.ejC;

import java.util.ArrayList;
import java.util.List;

public class FiltroNombre implements Filtro{

    public List<Personaje> filter(List<Personaje> personajes, Personaje parteNombre){
        String nom = parteNombre.getNombre();
        List<Personaje> filteredList = new ArrayList<Personaje>();
        for (Personaje personaje : personajes) {
            if (personaje.getNombre().contains(nom)){
                filteredList.add(personaje);
            }
        }
        return filteredList;
    }
}
