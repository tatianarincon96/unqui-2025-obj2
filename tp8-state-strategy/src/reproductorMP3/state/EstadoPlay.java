package reproductorMP3.state;

public class EstadoPlay extends EstadoCancion {
    public EstadoPlay(Cancion cancion) {
        super(cancion);
    }

    @Override
    public void play() {
        if (this.cancion.getReproductor().getEstado() == EstadoReproductor.SELECCION_DE_CANCION) {
            System.out.println("Reproduciendo la canción.");
            this.cancion.getReproductor().setEstado(EstadoReproductor.REPRODUCIENDO);
        } else {
            //throw new IllegalStateException("El estado del reproductor no es SELECCIÓN DE CANCIÓN.");
            System.err.println("No se puede reproducir, el reproductor no está en la selección de canción.");
        }
    }

    @Override
    public void pause() {
        System.out.println("Pausando la canción.");
        this.cancion.setEstadoActual(new EstadoPause(this.cancion));
        this.cancion.getReproductor().setEstado(EstadoReproductor.PAUSADO);
    }

    @Override
    public void stop() {
        System.out.println("Deteniendo la canción.");
        this.cancion.setEstadoActual(new EstadoStop(this.cancion));
        this.cancion.getReproductor().setEstado(EstadoReproductor.SELECCION_DE_CANCION);
    }
}
