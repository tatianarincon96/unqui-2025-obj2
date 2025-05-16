package videojuego.state;

public class EstadoConUnaFicha extends Estado {

    public EstadoConUnaFicha(MaquinaVideoJuegos maquina) {
        super(maquina);
    }

    @Override
    public void iniciar() {
        System.out.println("Comienza juega para un jugador.");
    }
}
