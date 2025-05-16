package reproductorMP3.state;

public class Main {
    public static void main(String[] args) {
        // Crear un reproductor de MP3
        ReproductorMP3 reproductor = new ReproductorMP3();

        // Crear una canción
        Cancion cancion = new Cancion(reproductor);

        // Asignar la canción al reproductor
        reproductor.setCancion(cancion);
        // Cambiar el estado del reproductor a "Reproduciendo"
        reproductor.play();
        // Produce error porque reproductor no está en "Selección de canción"
        reproductor.play();
        // Cambiar el estado del reproductor a "Pausado"
        reproductor.pause();
        // Cambiar el estado del reproductor a "Detenido"
        reproductor.stop();
        // No se puede pausar una canción detenida
        reproductor.pause();
        // La canción ya se encuentra detenida
        reproductor.stop();
        // Cambiar el estado del reproductor a "Reproduciendo" nuevamente
        reproductor.play();
        // Cambiar el estado del reproductor a "Stop" nuevamente
        reproductor.stop();
    }
}
