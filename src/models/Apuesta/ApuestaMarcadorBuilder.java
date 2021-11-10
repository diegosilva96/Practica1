
package models.Apuesta;

import models.Apuesta.ApuestaBuilder;



public class ApuestaMarcadorBuilder extends ApuestaBuilder {

   @Override
    public void buildBonificacion(){
        apuesta.setBonificacion(30); ;
    }
  
}
