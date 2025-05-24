package encuentrosdeportivos;

import java.util.ArrayList;
import java.util.List;

// Observer
public class AplicacionMovil implements Observer {
    private List<String> deportesSuscriptos;
    private List<String> contrincantesSuscriptos;
    private List<Partido> partidosNotificados = new ArrayList<>();

    public AplicacionMovil(List<String> deportesSuscriptos, List<String> contrincantesSuscriptos) {
        this.deportesSuscriptos = deportesSuscriptos;
        this.contrincantesSuscriptos = contrincantesSuscriptos;
    }

    @Override
    public void notificar(Partido partido) {
        boolean deporteOk = deportesSuscriptos.contains(partido.getDeporte());
        boolean contrincanteOk = partido.getContrincantes().stream().anyMatch(contrincantesSuscriptos::contains);
        if (deporteOk || contrincanteOk) {
            partidosNotificados.add(partido);
        }
    }

    public List<Partido> getPartidosNotificados() {
        return partidosNotificados;
    }
}