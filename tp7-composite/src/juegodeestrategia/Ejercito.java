package juegodeestrategia;

import java.util.List;

public class Ejercito implements CaracterMovible {
    private List<CaracterMovible> caracteres;

    public Ejercito(List<CaracterMovible> caracteres) {
        this.caracteres = caracteres;
    }

    @Override
    public void mover() {
        for (CaracterMovible caracter : caracteres) {
            caracter.mover();
        }
    }
}
