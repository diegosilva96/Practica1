
package models;

import models.interfaces.tieneGanancia;
import primerapractica.Apostador;


public class ApuestaResultado implements tieneGanancia {
    
    private int monto;
    private Apostador persona;
    private String tipoApuesta;
    
    public ApuestaResultado(int monto,String tipoApuesta, Apostador persona){
        this.monto=monto;
        this.persona=persona;
        this.tipoApuesta=tipoApuesta;
    }

  
    @Override
    public double getGanancia(){
        return monto*1.5;
    }

}
