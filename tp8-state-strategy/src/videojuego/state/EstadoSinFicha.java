package videojuego.state;

public class EstadoSinFicha extends Estado {

    public EstadoSinFicha(MaquinaVideoJuegos maquina) {
        super(maquina);
    }

    @Override
    public void iniciar() {
        System.out.println("No hay ficha. Por favor, inserte una ficha para jugar.");
    }
}
