package dyds.solid.ejC;

public class Nivel implements Atributo{
    private int nivel;

    public Nivel(int lvl){
        nivel=lvl;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean compareTo(Atributo lvl){
        Nivel niv = (Nivel)lvl;
        return(niv.getNivel()>nivel);
    }
}
