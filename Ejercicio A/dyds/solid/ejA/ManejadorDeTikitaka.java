package dyds.solid.ejA;

public class ManejadorDeTikitaka implements RedSocial{
    private static ManejadorDeTikitaka instance;

    private ManejadorDeTikitaka() {
    }

    public static ManejadorDeTikitaka getInstance() {
        if (instance == null) {
            instance = new ManejadorDeTikitaka();
        }
        return instance;
    }

    int cantidadContenidosEnviados = 0;


    public void postearContenido(Contenido contenido) {
        //Codigo dummy para hacer los tests
        cantidadContenidosEnviados++;
    }

    public int getCantidadContenidosEnviados() {
        return cantidadContenidosEnviados;
    }

    public void resetSingleton(){
        //Por ser un singleton tenemos que limpiarlo para el testing
        cantidadContenidosEnviados = 0;
    }
}
