package preguntasrespuestas;

import java.util.*;

// Subject: El juego notifica a los jugadores sobre eventos (inicio, respuestas correctas, ganador, etc).
public class Juego {
    private List<Jugador> participantes = new ArrayList<>();
    private List<Pregunta> preguntas;
    private Map<Jugador, Set<Pregunta>> respuestasCorrectas = new HashMap<>();
    private boolean iniciado = false;
    private boolean terminado = false;

    public Juego(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public void agregarParticipante(Jugador jugador) {
        if (iniciado || terminado) {
            jugador.notificar("No se puede unir, la partida ya comenzó o terminó.");
            return;
        }
        if (participantes.size() < 5 && !participantes.contains(jugador)) {
            participantes.add(jugador);
            jugador.setJuego(this);
            if (participantes.size() == 5) {
                iniciar();
            }
        } else {
            jugador.notificar("No se puede unir, partida llena.");
        }
    }

    void iniciar() {
        iniciado = true;
        Set<Pregunta> preguntasSet = new HashSet<>(preguntas);
        for (Jugador j : participantes) {
            j.recibirPreguntas(preguntasSet);
            j.notificar("¡Listo para jugar! Preguntas enviadas.");
        }
    }

    public void recibirRespuesta(Jugador jugador, Pregunta pregunta, String respuesta) {
        if (!iniciado || terminado) {
            jugador.notificar("No puedes responder, la partida no está activa.");
            return;
        }
        if (!participantes.contains(jugador)) {
            jugador.notificar("No participas en esta partida.");
            return;
        }
        if (pregunta.getRespuestaCorrecta().equalsIgnoreCase(respuesta)) {
            respuestasCorrectas.putIfAbsent(jugador, new HashSet<>());
            respuestasCorrectas.get(jugador).add(pregunta);
            jugador.notificar("¡Respuesta correcta!");
            notificarTodos(jugador.getNombre() + " respondió correctamente: " + pregunta.getEnunciado());
            if (respuestasCorrectas.get(jugador).size() == preguntas.size()) {
                finalizar(jugador);
            }
        } else {
            jugador.notificar("Respuesta incorrecta.");
        }
    }

    public void notificarTodos(String mensaje) {
        for (Jugador j : participantes) {
            j.notificar(mensaje);
        }
    }

    private void finalizar(Jugador ganador) {
        terminado = true;
        notificarTodos("¡Fin del juego! Ganador: " + ganador.getNombre());
    }
}
