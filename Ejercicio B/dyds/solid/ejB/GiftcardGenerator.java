package dyds.solid.ejB;

import java.util.Random;

public class GiftcardGenerator {

    int ultimoCodigo;

    public GiftcardGenerator(){
        this.ultimoCodigo=1000;
    }

    public Giftcard generarGiftcard(Usuario user){
        ultimoCodigo++;
        int nuevoCodigo = (new Random().nextInt(9000) + 1000)*10000 + ultimoCodigo;
        return new Giftcard(nuevoCodigo, user);
    }
}
