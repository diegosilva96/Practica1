
package models.Apuesta;

import primerapractica.Apostador;


public class Apuesta {
    private int monto;
    private Apostador apostador;

    public Apostador getApostador() {
        return apostador;
    }

    public void setApostador(Apostador apostador) {
        this.apostador = apostador;
    }
    private double bonificacion;

    public double getGanancia() {
        return monto*1.5;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

   
}
