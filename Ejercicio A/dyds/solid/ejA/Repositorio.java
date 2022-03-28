package dyds.solid.ejA;

import java.util.ArrayList;

public interface Repositorio {
    ArrayList<Contenido> dummyDB = new ArrayList<>();;

    public boolean grabar(Contenido contenido);

    public int getRepoSizeForTesting();

}
