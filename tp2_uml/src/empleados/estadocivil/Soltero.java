package empleados.estadocivil;

public class Soltero implements EstadoCivil {

    @Override
    public double calcularAsignacionPorConyugue() {
        return 0;
    }
}
