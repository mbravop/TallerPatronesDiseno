package ClassesDecorator;
import BaseDecorator.Notificar;

public class TelegramDecorator extends NotifDecorator{

	public TelegramDecorator(Notificar notificacion) {
		super(notificacion);
	}

	@Override
	public void enviarNot(String mensaje) {
		// Codigo para enviar notificacion por Telegram
		notificacion.enviarNot(mensaje);
		System.out.println("-Telegram");
		
	}

	
}
