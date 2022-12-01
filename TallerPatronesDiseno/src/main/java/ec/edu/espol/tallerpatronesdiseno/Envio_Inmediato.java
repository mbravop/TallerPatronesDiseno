/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tallerpatronesdiseno;

/**
 *
 * @author Dereck Santander
 */
public class Envio_Inmediato {
    private boolean estadoServicio;
    
    public void setEstadoServicio(boolean Estado){
        this.estadoServicio=Estado;
        if(Estado){
            System.out.println("El servicio Envio_Inmediato esta activo");
        }else{
            System.out.println("El servicio Envio_Inmediato esta inactivo");
        }
    }
}
