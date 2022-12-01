package BaseDecorator;
public class NotifVencimientoPlazo extends Notificar {

	@Override
	public void enviarNot(String mensaje) {
		enviarSMS(mensaje);
		enviarCE(mensaje);
	
		System.out.println("\nLa notificacion con mensaje: \n'"+mensaje +"'\nFue enviada mediante: \n-SMS\n-Correo Electronico");
		
	}

	public void enviarCE(String mensaje) {
		//codigo para enviar SMS	
		
	}

	public void enviarSMS(String mensaje) {
		//codigo para enviar Correo Electronico
		
	}

}
