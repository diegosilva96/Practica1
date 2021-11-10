package primerapractica;
import java.util.ArrayList;

public class Evento implements Cloneable {
   
    //private int id;
    private String nombre;
    private String fecha; 
    private String hora;
    private ArrayList<Contendor> contendores;
        
    
    public Evento(String nombre, String fecha,String hora) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        contendores = new ArrayList<>();
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
       this.fecha = fecha;
    }
   
    public String gethora() {
        return hora;
    }
    
    public void sethora(String hora) {
        this.hora = hora;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList<Contendor> getContendors() {
        return contendores;
    }
    
    public void setContendors(ArrayList<Contendor> contendores) {
        this.contendores = contendores;
    }
    
    @Override
    public Evento clone() {
        try {
            return (Evento) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
        
}





