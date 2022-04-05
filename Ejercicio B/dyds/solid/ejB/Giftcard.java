package dyds.solid.ejB;

import java.util.ArrayList;
import java.util.Random;

public class Giftcard implements Premio{

    int codigo;
    Usuario beneficiario;

    private Giftcard(){
    }

    public Giftcard(int codigo, Usuario beneficiario) {
            this.codigo = codigo;
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
