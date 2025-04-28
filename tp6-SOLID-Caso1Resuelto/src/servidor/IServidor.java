package servidor;

import correo.Correo;

import java.util.List;

public interface IServidor {
	
	List<Correo> recibirNuevos();

	void conectar();

	void enviar(Correo correo);

}
