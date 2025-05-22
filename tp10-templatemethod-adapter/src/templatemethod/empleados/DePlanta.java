package templatemethod.empleados;

public class DePlanta extends Empleado {
    private int cantidadHijos;

    public DePlanta(double sueldoBasico, int cantidadHijos) {
        super(sueldoBasico, 0, 0);
        this.cantidadHijos = cantidadHijos;
    }

    @Override
    protected double sueldoPorFamilia() {
        return this.cantidadHijos * 150;
    }
}
