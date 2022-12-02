/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo1.talleruml.persona;

import grupo1.talleruml.tarjetas.Tarjeta;

/**
 *
 * @author mbravop
 */
public class Cliente {
    private String nombre;
    private int salario;
    private Tarjeta tarjeta;
    
    public Cliente(String nombre,int salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public void setTarjeta(Tarjeta tarjeta){
        this.tarjeta = tarjeta;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }
    
}
