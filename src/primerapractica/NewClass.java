
package primerapractica;

import models.Apuesta.Apuesta;
import models.Apuesta.ApuestaBuilder;
import models.Apuesta.ApuestaMarcadorBuilder;
import models.Apuesta.ApuestaResultadoBuilder;
import models.Apuesta.DirectorApuesta;

public class NewClass {
     public static void main(String args[]) {
       DirectorApuesta da=new DirectorApuesta();
       ApuestaBuilder marcador=new ApuestaMarcadorBuilder();
       ApuestaBuilder marcador1=new ApuestaResultadoBuilder();
       da.setApuestaBuilder(marcador1);
       da.contruirApuesta();
       Apuesta apuesta=da.getApuesta();
       System.out.println(apuesta.getBonificacion() );
    }
}
