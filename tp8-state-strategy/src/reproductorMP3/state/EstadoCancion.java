package reproductorMP3.state;

public abstract class EstadoCancion {
    protected Cancion cancion;

    public EstadoCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public abstract void play();
    public abstract void pause();
    public abstract void stop();
}
