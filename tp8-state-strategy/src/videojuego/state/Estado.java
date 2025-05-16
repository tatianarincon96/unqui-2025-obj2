package videojuego.state;

public abstract class Estado {
    private MaquinaVideoJuegos maquina;

    public Estado(MaquinaVideoJuegos maquina) {
        this.maquina = maquina;
    }

    abstract void iniciar();
    void finalizar() {
        System.out.println("Fin del juego.");
    };
}
