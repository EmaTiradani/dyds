package dyds.solid.ejA;

import java.util.ArrayList;
import java.util.List;

public class Poster{
    private ArrayList<RedSocial> redes = new ArrayList<RedSocial>();

    public Poster(ArrayList<RedSocial> listaDeRedes){
        redes = listaDeRedes;
    }
    public void post(Contenido contenidoNuevo){
        for(int i=0; i< redes.size(); i++) {
            redes.get(i).postearContenido(contenidoNuevo);
        }
    }


}
