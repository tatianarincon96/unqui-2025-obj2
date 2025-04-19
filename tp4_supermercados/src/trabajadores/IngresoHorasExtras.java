package trabajadores;

public class IngresoHorasExtras extends Ingreso {
    private int cantHoras;

    public IngresoHorasExtras(String mesPercepcion, String concepto, double montoPercibido, int cantHoras) {
        super(mesPercepcion, concepto, montoPercibido);
        this.cantHoras = cantHoras;
    }

    @Override
    public double montoImponible() {
        return 0;
    }
}
