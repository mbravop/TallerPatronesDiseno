/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo1.talleruml.tarjetas;

/**
 *
 * @author mbravop
 */
public class TarjetaVIP implements Tarjeta{
    private float costoAnual;
    private int limiteCredito;
    
    public TarjetaVIP(){
        this.costoAnual = 400.0f;
        this.limiteCredito = 4000;
    }
    
    public void realizarPago(){
        //Codigo que realiza el pago con una tarjeta básica
        System.out.println("Se ha pagado con la tarjeta VIP");
    }
}
