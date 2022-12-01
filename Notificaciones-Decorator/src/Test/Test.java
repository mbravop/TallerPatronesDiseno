package Test;
import BaseDecorator.NotifVencimientoPlazo;
import BaseDecorator.Notificar;
import ClassesDecorator.SignalDeorator;
import ClassesDecorator.TelegramDecorator;
import ClassesDecorator.WhatsAppDecorator;
import ClassesDecorator.WireDecorator;

public class Test {

	public static void main(String[] args) {
		
		//Notificacion por medios obligatorios
		Notificar notificacionBase= new NotifVencimientoPlazo();
		notificacionBase.enviarNot("Enviando notificacion por los medios obligatorios que son SMS y Correo Electronico");
		
		//Notificacion por medios obligatorios y por el opcional whatsApp
		Notificar notifWhatsApp=new WhatsAppDecorator(notificacionBase);
		notifWhatsApp.enviarNot("Enviando notificacion por los medios obligatorios y tambien por WhatsApp");

		//Notificacion por todos los medios disponibles 
		Notificar notifTodosLosMedios=new TelegramDecorator(new WireDecorator(new SignalDeorator(notifWhatsApp) ));
		notifTodosLosMedios.enviarNot("Enviando notificacion por todos los medios disponibles");
		
	}

}
