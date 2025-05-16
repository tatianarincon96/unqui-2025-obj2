package videojuego.state;

import java.util.ArrayList;
import java.util.List;

public class MaquinaVideoJuegos {
    private Estado estadoActual;
    private List<Ficha> fichas;

    public MaquinaVideoJuegos() {
        this.estadoActual = new EstadoSinFicha(this);
        this.fichas = new ArrayList<>();
    }

    public Estado getEstado() {
        return estadoActual;
    }

    public void setEstado(Estado estado) {
        this.estadoActual = estado;
    }

    public void insertarFicha(Ficha ficha) {
        fichas.add(ficha);
        if (fichas.size() == 1) {
            setEstado(new EstadoConUnaFicha(this));
        } else if (fichas.size() == 2) {
            setEstado(new EstadoConDosFichas(this));
        }
    }

    public void prender() {
        System.out.println("La máquina de videojuegos está encendida.");
    }

    public void iniciar() {
        estadoActual.iniciar();
    }

    public void finalizar() {
        estadoActual = new EstadoSinFicha(this);
        fichas.clear();
        estadoActual.finalizar();
    }

    public void apagar() {
        this.finalizar();
        System.out.println("La máquina de videojuegos está apagada.");
    }
}
