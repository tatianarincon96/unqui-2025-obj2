import correo.Correo;
import correo.ICorreo;
import servidor.IServidor;

public class ClienteEMail {
	 private IServidor servidor;
	 private ICorreo gestorCorreo;

	
	public ClienteEMail(IServidor servidor, ICorreo gestorCorreo){
		this.servidor=servidor;
		this.gestorCorreo=gestorCorreo;
	}
	
	public void conectar(){
		this.servidor.conectar();
	}
	
	public void borrarCorreo(Correo correo){
		this.gestorCorreo.borrarCorreo(correo);
	}
	
	public int contarBorrados(){
		return this.gestorCorreo.contarBorrados();
	}
	
	public int contarInbox(){
		return this.gestorCorreo.contarInbox();
	}
	
	public void eliminarBorrado(Correo correo){
		this.gestorCorreo.eliminarBorrado(correo);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos();
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto,destinatario,cuerpo);
		this.servidor.enviar(correo);
	}

}
