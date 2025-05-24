package encuentrosdeportivos;

import java.util.ArrayList;
import java.util.List;

// Observer
public class Servidor implements Observer {
    private List<String> deportesSuscriptos;
    private List<Partido> partidosNotificados = new ArrayList<>();

    public Servidor(List<String> deportesSuscriptos) {
        this.deportesSuscriptos = deportesSuscriptos;
    }

    @Override
    public void notificar(Partido partido) {
        if (deportesSuscriptos.contains(partido.getDeporte())) {
            partidosNotificados.add(partido);
        }
    }

    public List<Partido> getPartidosNotificados() {
        return partidosNotificados;
    }
}
