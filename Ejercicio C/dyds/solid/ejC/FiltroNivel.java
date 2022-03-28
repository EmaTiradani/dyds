package dyds.solid.ejC;

import java.util.ArrayList;
import java.util.List;

public class FiltroNivel implements Filtro{

    public List<Personaje> filter(List<Personaje> personajes, Atributo nivel) {
        int lvl=((Nivel)nivel).getNivel();
        List<Personaje> filteredList = new ArrayList<Personaje>();
        for (Personaje personaje : personajes) {
            if (personaje.getNivel() > lvl) {
                filteredList.add(personaje);
            }
        }
        return filteredList;
    }
}
