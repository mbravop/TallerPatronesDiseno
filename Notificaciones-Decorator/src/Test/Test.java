package Test;
import BaseDecorator.NotifVencimientoPlazo;
import BaseDecorator.Notificar;
import ClassesDecorator.SignalDeorator;
import ClassesDecorator.TelegramDecorator;
import ClassesDecorator.WhatsAppDecorator;
import ClassesDecorator.WireDecorator;


import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Notificar notificacion=new NotifVencimientoPlazo();
		
		
		System.out.println("Sistema de envio de notificaciones:"
				+ "\nCuando se este proximo a vencer el plazo para pagar lo adeudado por compras con"
				+ "\ntarjeta de crédito se le enviara una notificacion por los siguientes medios:"
				+ "\n-SMS\n-Correo electronico\n¿Desea añadir otros medios?(S/N)");
		
		if(sc.nextLine().equalsIgnoreCase("s")) {
			
			System.out.println("¿Agregar WhatsApp?(s/n)");
			if(sc.nextLine().equalsIgnoreCase("s")) {
				notificacion= new WhatsAppDecorator(notificacion);
			}
			System.out.println("¿Agregar Telegram?(s/n)");
			if(sc.nextLine().equalsIgnoreCase("s")) {
				notificacion= new TelegramDecorator(notificacion);
			}
			System.out.println("¿Agregar Wire?(s/n)");
			if(sc.nextLine().equalsIgnoreCase("s")) {
				notificacion= new WireDecorator(notificacion);
			}
			System.out.println("¿Agregar Signal?(s/n)");
			if(sc.nextLine().equalsIgnoreCase("s")) {
				notificacion= new SignalDeorator(notificacion);
			}
			
			System.out.println("Configuracion guardada con exito");
			
		}
		
		notificacion.enviarNot("Enviando notificacion requerida");
		
		

	}

}
