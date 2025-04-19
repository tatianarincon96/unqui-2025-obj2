package trabajadores;

import java.util.ArrayList;

public class Trabajador {
    private ArrayList<Ingreso> ingresos;

    public Trabajador() {
        this.ingresos = new ArrayList<>();
    }

    public void agregarIngreso(Ingreso ingreso) {
        this.ingresos.add(ingreso);
    }

    //retornar el monto total percibido por el trabajador
    public double getTotalPercibido() {
        return ingresos.stream().reduce(0d, (total, ingreso) -> total + ingreso.getMontoPercibido(), Double::sum);
    }

    //retornar el monto imponible al impuesto al trabajador
    public double getMontoImponible() {
        return ingresos.stream().reduce(0d, (total, ingreso) -> total + ingreso.montoImponible(), Double::sum);
    }

    //retornar el monto a pagar por el trabajador, calculado como el 2% del monto imponible
    public double getImpuestoAPagar() {
        return getMontoImponible() * 0.02;
    }

}
