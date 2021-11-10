
package models.Apuesta;

import models.Apuesta.Apuesta;

public abstract class ApuestaBuilder {
    protected Apuesta apuesta;
    
    public Apuesta getApuesta(){
        return apuesta;
    }
    public void crearApuesta(){
        apuesta=new Apuesta();
    }
    public abstract void buildBonificacion();
}
