/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo1.talleruml.factory;

import grupo1.talleruml.tarjetas.Tarjeta;
import grupo1.talleruml.tarjetas.TarjetaVIP;

/**
 *
 * @author mbravop
 */
public class CreaTarjetaVIP implements CreaTarjeta{
    @Override
    public Tarjeta crearTarjeta(){
        return new TarjetaVIP();
    }
}
