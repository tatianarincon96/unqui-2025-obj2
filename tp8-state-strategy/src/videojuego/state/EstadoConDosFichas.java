package videojuego.state;

public class EstadoConDosFichas extends Estado {

    public EstadoConDosFichas(MaquinaVideoJuegos maquina) {
        super(maquina);
    }

    @Override
    public void iniciar() {
        System.out.println("Comienza juega para dos jugadores.");
    }
}
