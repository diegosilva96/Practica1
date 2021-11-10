package primerapractica;

public class Contendor implements IContendor{

    String nombre;
    String categoria;
    
  
    public Contendor() {
        this.nombre = "Equipo";
        this.categoria = "1ra división";
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
  
    public void generarNombre(){
        this.nombre="Equipo"+(int)(Math.random()*50+1);
    } 
  
    @Override
    public Contendor clonar() {
        Contendor c = new Contendor();
       c.setNombre(nombre);
       c.setcategoria(categoria);
       return c;
    }
}
