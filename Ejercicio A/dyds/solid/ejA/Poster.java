package dyds.solid.ejA;

import java.util.ArrayList;
import java.util.List;

public class Poster{
    //private List<RedSocial> redes = new ArrayList<RedSocial>();// = new List<RedSocial>();
    RedSocial [] redes = new RedSocial[20];

    public Poster(){
        redes[0]=(ManejadorDeChulogram.getInstance());
    }
    public void post(Contenido contenidoNuevo){
        for(int i=0; i< redes.length; i++) {
            redes[0].postearContenido(contenidoNuevo);
        }
    }


}
