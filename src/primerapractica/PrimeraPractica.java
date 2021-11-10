
package primerapractica;

import models.ApuestaResultado;


public class PrimeraPractica {

   
    public static void main(String[] args) {
            ApuestaResultado ap1= new ApuestaResultado(100,"Ganador",new Apostador());
            System.out.println( ap1.getGanancia());
        
    }
    
}
