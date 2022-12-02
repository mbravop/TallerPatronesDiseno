package ClassesDecorator;
import BaseDecorator.Notificar;

public class SignalDeorator extends NotifDecorator{

	public SignalDeorator(Notificar notificacion) {
		super(notificacion);
	}

	@Override
	public void enviarNot(String mensaje) {
		// Codigo para enviar notificacion por Signal
		notificacion.enviarNot(mensaje);
		System.out.println("-Signal");
		
	}


}
