package ClassesDecorator;
import BaseDecorator.Notificar;

public class WhatsAppDecorator extends NotifDecorator{

	public WhatsAppDecorator(Notificar notificacion) {
		super(notificacion);
	}

	@Override
	public void enviarNot(String mensaje) {
		// Codigo para enviar notificacion por WhatsApp
		notificacion.enviarNot(mensaje);
		System.out.println("-WhatsApp");
		
	}

}
