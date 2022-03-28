package dyds.solid.ejC;

public class AProfesion implements Atributo{
    Profesion prof;

    public Profesion getProfesion(){
        return prof;
    }
    public void setProfesion(Profesion p){
        prof=p;
    }

    @Override
    public boolean compareTo(Atributo value) {
        return ((AProfesion)value).getProfesion()==prof;
    }
}
