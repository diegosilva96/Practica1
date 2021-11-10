package primerapractica;
import java.util.ArrayList;

public class Evento implements IEvento {
   
    private int id;
    private String nombre;
    private String fecha; 
    private String hora;
    private ArrayList<Contendor> contendores;
        
    
   /* public Evento(String nombre, String fecha,String hora) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        contendores = new ArrayList<>();
    }
    
 */

    public Evento (){
        this.nombre="Evento";
        this.fecha="01/12/2021";
        this.hora="01:00";
        Contendor equipo=new Contendor();
        Contendor equipo2=equipo.clonar();
        equipo.setNombre(equipo.generarNombre());
        equipo2.setNombre(equipo2.generarNombre());
        contendores=new ArrayList<>();
        contendores.add(equipo);
        contendores.add(equipo2);
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
    
    public ArrayList<Contendor> getContendores() {
        return contendores;
    }
    
    public void setContendores(ArrayList<Contendor> contendores) {
        this.contendores = contendores;
    }
    
    public String imprimirEvento(){
        return getNombre()+ " : " + getContendores().get(0).getNombre() + "vs" + getContendores().get(1).getNombre();
        }


    @Override
    public Evento clonar() {
        Evento ev = new Evento();
        this.id++;
        ev.setNombre(getNombre()+id);
        ev.setFecha(getFecha());
        ev.sethora(gethora());
        ev.setContendores(this.contendores);
        return ev;
    }
        
}





