/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tallerpatronesdiseno;

/**
 *
 * @author Dereck Santander
 */
public class Compra_Facade {
    private Producto_Especifico p;
    private Pago_Tarjeta pt;
    private Comprobante c;
    private Envio_Inmediato ei;
    
    public void comprarEnLinea(Producto_Especifico p, boolean Estado){
        if(p.tieneStock()){
            setP(p);
            
            pt= new Pago_Tarjeta(p);
            pt.pagar();
            
            c= new Comprobante();
            c.imprimirComprobante();
            
            ei=new Envio_Inmediato();
            ei.setEstadoServicio(Estado);
            
        }
    }

    public void setP(Producto_Especifico p) {
        this.p = p;
    }
    
    
}
