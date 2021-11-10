
package primerapractica;

public class Apostador {
    private String nombre;
    private static Apostador apostador;
    
    private Apostador(){
        
    }
    public static Apostador getInstance(){
        if(apostador==null){
            apostador=new Apostador();
        }
        return apostador;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
