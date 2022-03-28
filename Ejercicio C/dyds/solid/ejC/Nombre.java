package dyds.solid.ejC;

public class Nombre implements Atributo{
    private String nombre;

    public boolean compareTo(Atributo value){
        Nombre nom = (Nombre)value;
        int comparacion=(this.nombre.compareTo(nom.getNombre()));
        if(comparacion==0) //Si el metodo compareTo de string retorna 0, las dos cadenas son iguales
            return true;
        else
            return false;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    public String getNombre(){
        return nombre;
    }
}
