/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo1.talleruml.factory;

import grupo1.talleruml.tarjetas.Tarjeta;
import grupo1.talleruml.tarjetas.TarjetaPremium;

/**
 *
 * @author mbravop
 */
public class CreaTarjetaPremium implements CreaTarjeta{
    @Override
    public Tarjeta crearTarjeta(){
        return new TarjetaPremium();
    }
}
