package reproductorMP3.state;

public class Cancion {
    private EstadoCancion estadoActual;
    private ReproductorMP3 reproductor;

    public Cancion(ReproductorMP3 reproductor) {
        this.estadoActual = new EstadoStop(this);
        this.reproductor = reproductor;
    }

    public ReproductorMP3 getReproductor() {
        return reproductor;
    }

    public void setEstadoActual(EstadoCancion estadoActual) {
        this.estadoActual = estadoActual;
    }

    public EstadoCancion getEstadoActual() {
        return estadoActual;
    }

    public void play() {
        this.estadoActual.play();
    }

    public void pause() {
        this.estadoActual.pause();
    }

    public void stop() {
        this.estadoActual.stop();
    }
}
