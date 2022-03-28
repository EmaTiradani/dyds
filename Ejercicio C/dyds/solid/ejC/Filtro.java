package dyds.solid.ejC;

import java.util.List;

public interface Filtro {
    List<Personaje> filter(List<Personaje> personajes, Atributo atributo);
}
