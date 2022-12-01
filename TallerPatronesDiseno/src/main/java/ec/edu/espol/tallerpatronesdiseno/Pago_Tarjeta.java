/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tallerpatronesdiseno;


/**
 *
 * @author Dereck Santander
 */
public class Pago_Tarjeta {
    private Producto_Especifico p;
    
    public Pago_Tarjeta(Producto_Especifico p){
        this.p=p;
    }
    
    public void pagar(){
        System.out.println("Se realiza el pago del producto "+p.getNombre()+" correctamente");
    }
}
