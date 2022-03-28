package dyds.solid.ejB;

import java.util.ArrayList;
import java.util.Random;

public class PremiosPorCompras {

    private int ultimoCodigo;
    private ArrayList<Premio> listaPremiosOtorgados;
    private Mensajero mensajero = new Mensajero();

    public void controlarCompra(Compra compra) {
        Usuario usuario = compra.darComprador();
        Controlador controlador = new Controlador();
        if(controlador.controlarCompra(compra, usuario)) {
            ultimoCodigo++;
            Premio nuevoPremio = new Giftcard(ultimoCodigo, usuario);
            listaPremiosOtorgados.add(nuevoPremio);//Pasar esto a un generador de gift cards?
            mensajero.enviarMensaje(usuario, nuevoPremio);
            /*SesionQuepasApp sesionQuepasApp =null;
            try {
				sesionQuepasApp = SesionQuepasApp.getInstance();
                String contactoUsuario = usuario.getContacto();
                String mensaje=this.componerMensajeAviso(nuevaGiftcard);
                sesionQuepasApp.enviarMensaje(new MensajeQuepasApp().to(contactoUsuario).withBody(mensaje));
            } finally {
            if(sesionQuepasApp !=null)
              sesionQuepasApp.cerrar();
            }*/
        }
    }
    public PremiosPorCompras() {
	    listaPremiosOtorgados = new ArrayList<>();
	    ultimoCodigo = 1000;
    }
}
