/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase6.pruebas;

/**
 *
 * @author PFR
 */
public class Divisa {

    private int importe;
    private String denominaci�n;

    public Divisa(int imp, String den) {
        this.importe = imp;
        this.denominaci�n = den;
    }

    public int getImporte() {
        return importe;
    }

    public String getDenominaci�n() {
        return denominaci�n;
    }

    public Divisa sumar(Divisa d) throws Exception {
        Divisa res;
        if (d.denominaci�n.equals(denominaci�n)) {
            res = new Divisa(d.importe + importe, denominaci�n);
            return res;
        } else {
            throw new Exception("Denominaci�n diferente: no se pueden sumar");
        }

    }
}