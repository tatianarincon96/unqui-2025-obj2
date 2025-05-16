package reproductorMP3.state;

public class EstadoPause extends EstadoCancion {
    public EstadoPause(Cancion cancion) {
        super(cancion);
    }

    @Override
    public void play() {
        System.out.println("Canción reanudada.");
        this.cancion.setEstadoActual(new EstadoPlay(this.cancion));
        this.cancion.getReproductor().setEstado(EstadoReproductor.REPRODUCIENDO);
    }

    @Override
    public void pause() {
        this.play();
    }

    @Override
    public void stop() {
        System.out.println("Canción detenida.");
        this.cancion.setEstadoActual(new EstadoStop(this.cancion));
        this.cancion.getReproductor().setEstado(EstadoReproductor.SELECCION_DE_CANCION);
    }
}
