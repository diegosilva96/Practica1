
package models.Apuesta;

import models.Apuesta.ApuestaBuilder;
import models.Apuesta.Apuesta;


public class DirectorApuesta {
    private ApuestaBuilder apuestaBuilder;
    
    public void setApuestaBuilder(ApuestaBuilder ap){
        apuestaBuilder=ap;
    }
    public Apuesta getApuesta(){
        return apuestaBuilder.getApuesta();
    }
    public void contruirApuesta(){
        apuestaBuilder.crearApuesta();
        apuestaBuilder.buildBonificacion();
    }
    
    
}
