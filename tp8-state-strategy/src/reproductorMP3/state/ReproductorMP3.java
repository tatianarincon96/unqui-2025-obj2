package reproductorMP3.state;

public class ReproductorMP3 {
    private Cancion cancion;
    private EstadoReproductor estado;

    public ReproductorMP3() {
        this.estado = EstadoReproductor.SELECCION_DE_CANCION;
    }

    public EstadoReproductor getEstado() {
        return estado;
    }

    public void setEstado(EstadoReproductor estado) {
        this.estado = estado;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public void play() {
        this.cancion.play();
    }

    public void pause() {
        this.cancion.pause();
    }

    public void stop() {
        this.cancion.stop();
    }
}
