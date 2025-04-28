package servidor;

public interface IServidorAvanzado extends IServidor {

	float tazaDeTransferencia();

	void resetear();
	
	void realizarBackUp();

}
