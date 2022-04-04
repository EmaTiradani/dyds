package dyds.solid.ejB;

import java.util.Random;

public class Giftcard implements Premio{

    private static Giftcard instance;
    int codigo;
    Usuario beneficiario;

    private Giftcard(){
    }

    public static Giftcard getInstance(int ultimoCodigo, Usuario beneficiario) {
        if(instance == null){
            instance = new Giftcard();
            this.codigo = (new Random().nextInt(9000) + 1000)*10000 + ultimoCodigo;
            this.beneficiario = beneficiario;
        }
        return instance;
    }

    public int darCodigo() {
        return codigo;
    }

    @Override
    public String mensajeAviso() {
       return "Gracias! por tu compra ganaste una Giftcard! reclamala con: " + this.darCodigo();
    }
}
