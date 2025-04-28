package servidor;

import correo.Correo;

import java.util.ArrayList;
import java.util.List;

public class ServidorPop implements IServidor {
	private String nombreUsuario;
	private String passusuario;

	public ServidorPop(String nombreUsuario, String passusuario) {
		this.nombreUsuario = nombreUsuario;
		this.passusuario = passusuario;
	}

	@Override
	public List<Correo> recibirNuevos() {
		List<Correo> retorno = new ArrayList<Correo>();
	  //Verificar autenticidad de usuario.
		//obtener emails Nuevos del usuario.
		//asignar a retorno la lista de los nuevos e-mails.
		return retorno;
	}

	@Override
	public void conectar() {
	   //Verifica que el usuario sea valido y establece la conexion.
		
	}

	@Override
	public void enviar(Correo correo) {
      //realiza lo necesario para enviar el correo.		
	}
}
