package dyds.solid.ejB;

public class Controlador {

    public Controlador(){
    }

    public boolean controlarCompra(Compra compra, Usuario usuario){
        return (compra.importe() > 50000 && usuario.isGold());
    }

}
