/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo1.talleruml.tarjetas;

/**
 *
 * @author mbravop
 */
public class TarjetaPremium implements Tarjeta{
    private float costoAnual;
    private int limiteCredito;
    
    public TarjetaPremium(){
        this.costoAnual = 150.0f;
        this.limiteCredito = 1500;
    }
    
    public void realizarPago(){
        //Codigo que realiza el pago con una tarjeta premium
        System.out.println("Se ha pagado con la tarjeta premium");
    }
}
