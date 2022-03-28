package dyds.solid.ejB;

import java.util.Random;

public class Giftcard implements Premio{
    int codigo;
    Usuario beneficiario;


    public Giftcard(int ultimoCodigo, Usuario beneficiario) {
        this.codigo = (new Random().nextInt(9000) + 1000)*10000 + ultimoCodigo;
        this.beneficiario = beneficiario;
    }

    public int darCodigo() {
        return codigo;
    }

    @Override
    public String mensajeAviso() {
       return "Gracias! por tu compra ganaste una Giftcard! reclamala con: " + this.darCodigo();
    }
}
