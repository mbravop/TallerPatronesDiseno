package ClassesDecorator;
import BaseDecorator.Notificar;

public class WireDecorator extends NotifDecorator {

	public WireDecorator(Notificar notificacion) {
		super(notificacion);
	
	}

	@Override
	public void enviarNot(String mensaje) {
		// Codigo para enviar notificacion por Wire
		notificacion.enviarNot(mensaje);
		System.out.println("-Wire");
		
	}

}
