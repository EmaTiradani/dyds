package dyds.solid.ejB;

import java.util.Random;

public class GiftcardGenerator {

    int ultimoCodigo;

    public GiftcardGenerator(int ultimoCodigo){
        this.ultimoCodigo=ultimoCodigo;
    }

    public Giftcard generarGiftcard(Usuario user){
        int nuevoCodigo = (new Random().nextInt(9000) + 1000)*10000 + ultimoCodigo;
        ultimoCodigo = nuevoCodigo;
        return new Giftcard(nuevoCodigo, user);
    }
}
