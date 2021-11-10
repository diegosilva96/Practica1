package primerapractica;

public class Contendor implements Cloneable{

    String nombre;
    String categoria;
    
  
    public Contendor(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getcategoria() {
        return categoria;
    }

    public void setcategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
  
    @Override
    public Contendor clone() {
        try {
            return (Contendor) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
