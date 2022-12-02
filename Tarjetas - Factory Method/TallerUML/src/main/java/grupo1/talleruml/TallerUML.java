/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package grupo1.talleruml;

import grupo1.talleruml.factory.CreaTarjeta;
import grupo1.talleruml.factory.CreaTarjetaBasica;
import grupo1.talleruml.factory.CreaTarjetaPremium;
import grupo1.talleruml.factory.CreaTarjetaVIP;
import grupo1.talleruml.persona.Cliente;
import grupo1.talleruml.tarjetas.Tarjeta;

/**
 *
 * @author mbravop
 */
public class TallerUML {

    public static void main(String[] args) {
        //Creacion de clientes
        Cliente clienteEstudiante = new Cliente("Mauricio",10); 
        Cliente clienteEjecutivo = new Cliente("Dereck",100);
        Cliente clientePresidente = new Cliente("Kevin",500);
        
        //Creacion de factory de tarjetas
        CreaTarjeta creadorTarjetaBasica = new CreaTarjetaBasica();
        CreaTarjeta creadorTarjetaPremium = new CreaTarjetaPremium();
        CreaTarjeta creadorTarjetaVIP = new CreaTarjetaVIP();
        
        //Otorgar tarjetas, creado según el tipo.
        clienteEstudiante.setTarjeta(creadorTarjetaBasica.crearTarjeta());
        clienteEjecutivo.setTarjeta(creadorTarjetaPremium.crearTarjeta());
        clientePresidente.setTarjeta(creadorTarjetaVIP.crearTarjeta());
        
        //Muestra de la implementación
        clienteEstudiante.getTarjeta().realizarPago();
        clienteEjecutivo.getTarjeta().realizarPago();
        clientePresidente.getTarjeta().realizarPago();
    }
}
