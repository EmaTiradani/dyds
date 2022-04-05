package dyds.solid.ejA;

import java.util.ArrayList;
import java.util.List;

public class Poster{
    private ArrayList<RedSocial> redes = new ArrayList<RedSocial>();// = new List<RedSocial>();
    //RedSocial [] redes = new RedSocial[20];

    public Poster(ArrayList<RedSocial> listaDeRedes){
        //redes[0]=(ManejadorDeChulogram.getInstance());
        redes = listaDeRedes;
    }
    public void post(Contenido contenidoNuevo){
        for(int i=0; i< redes.size(); i++) {
            redes.get(i).postearContenido(contenidoNuevo);
        }
    }


}
