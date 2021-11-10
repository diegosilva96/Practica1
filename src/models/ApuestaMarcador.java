
package models;

import models.interfaces.tieneGanancia;
import primerapractica.Apostador;
import models.interfaces.tieneBonificacion;


public class ApuestaMarcador implements tieneGanancia,tieneBonificacion{

    private int monto;
    private Apostador persona;
    private String tipoApuesta;
    
    @Override
     public double getGanancia(){
        return monto*1.5;
    }
     @Override
    public double getBonificacion(){
        return monto*0.1;
    }
    
    
}
