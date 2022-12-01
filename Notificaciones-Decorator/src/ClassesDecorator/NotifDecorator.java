package ClassesDecorator;
import BaseDecorator.Notificar;

public abstract class NotifDecorator extends Notificar {

	protected Notificar notificacion;
	
	public NotifDecorator(Notificar notificacion) {
		this.notificacion=notificacion;
		
	}
}
