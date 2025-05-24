package encuentrosdeportivos;

import java.util.ArrayList;
import java.util.List;

// Subject
public class CentralResultados {
    private List<Partido> partidos = new ArrayList<>();
    private List<Observer> suscriptores = new ArrayList<>();

    public void agregarPartido(Partido partido) {
        partidos.add(partido);
        notificarSuscriptores(partido);
    }

    public void suscribir(Observer observer) {
        suscriptores.add(observer);
    }

    private void notificarSuscriptores(Partido partido) {
        for (Observer obs : suscriptores) {
            obs.notificar(partido);
        }
    }
}