package preguntasrespuestas;

import java.util.HashSet;
import java.util.Set;

// Observer: El jugador recibe notificaciones del juego y envía respuestas.
public class Jugador {
    private String nombre;
    private Juego juego;
    private boolean listoParaJugar = false;
    private Set<Pregunta> preguntasRecibidas;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.preguntasRecibidas = new HashSet<>();
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public void notificar(String mensaje) {
        System.out.println("[" + nombre + "] " + mensaje);
    }

    public void recibirPreguntas(Set<Pregunta> preguntas) {
        preguntasRecibidas.addAll(preguntas);
        listoParaJugar = true;
    }

    public void solicitarParticipacion() {
        if (juego != null) {
            juego.agregarParticipante(this);
        }
    }

    public void enviarRespuesta(Pregunta pregunta, String respuesta) {
        if (!listoParaJugar || juego == null) {
            notificar("Acción no permitida: aún no puedes responder.");
            return;
        }
        if (!preguntasRecibidas.contains(pregunta)) {
            notificar("Acción no permitida: pregunta no recibida.");
            return;
        }
        juego.recibirRespuesta(this, pregunta, respuesta);
    }

    public String getNombre() { return nombre; }
}