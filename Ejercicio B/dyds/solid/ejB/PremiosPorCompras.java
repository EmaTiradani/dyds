package dyds.solid.ejB;

import java.util.ArrayList;
import java.util.Random;

public class PremiosPorCompras {

    private ArrayList<Premio> listaPremiosOtorgados;
    private Mensajero mensajero = new Mensajero();
    private GiftcardGenerator generador = new GiftcardGenerator();
    private Premio nuevoPremio;

    public void controlarCompra(Compra compra) {
        Usuario usuario = compra.darComprador();
        Controlador controlador = new Controlador();
        if(controlador.controlarCompra(compra, usuario)) {
            nuevoPremio = generador.generarGiftcard(usuario);
            listaPremiosOtorgados.add(nuevoPremio);
            mensajero.enviarMensaje(usuario, nuevoPremio);
        }
    }
    public PremiosPorCompras() {
	    listaPremiosOtorgados = new ArrayList<>();
    }
}
