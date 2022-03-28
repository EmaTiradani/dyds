package dyds.solid.ejB;

public class Mensajero
{

    public String componerMensaje(Premio premio) {
        return premio.mensajeAviso();
    }

    public void enviarMensaje(Usuario usuario, Premio premio){
        SesionQuepasApp sesionQuepasApp =null;
        try {
            sesionQuepasApp = SesionQuepasApp.getInstance();
            String contactoUsuario = usuario.getContacto();
            String mensaje=this.componerMensaje(premio);
            sesionQuepasApp.enviarMensaje(new MensajeQuepasApp().to(contactoUsuario).withBody(mensaje));
        } finally {
            if(sesionQuepasApp !=null)
                sesionQuepasApp.cerrar();
        }
    }
}
