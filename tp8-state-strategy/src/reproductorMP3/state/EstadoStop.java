package reproductorMP3.state;

public class EstadoStop extends EstadoCancion {
    public EstadoStop(Cancion cancion) {
        super(cancion);
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo la canción.");
        this.cancion.setEstadoActual(new EstadoPlay(this.cancion));
        this.cancion.getReproductor().setEstado(EstadoReproductor.REPRODUCIENDO);
    }

    @Override
    public void pause() {
        System.out.println("No se puede pausar, la canción está detenida.");
    }

    @Override
    public void stop() {
        System.out.println("La canción ya está detenida.");
    }
}
