/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3.Lab3.excepciones;

/**
 *
 * @author PFR
 */
public class Cuenta {
    private long idCuenta;
    private double saldoActual;
    
    public Cuenta(long cuenta){
        this.idCuenta = cuenta;
        this.saldoActual = 5000;
        
        
    }
    
    
    public void retirarCajero(double cuantoDesea) throws SaldoInsuficienteException {
        
        if (saldoActual < cuantoDesea){
            throw new SaldoInsuficienteException(saldoActual, cuantoDesea);
         }
        
        System.out.println("Monto Restante: "+(saldoActual - cuantoDesea));
    }
    
    
}
