package empleados.estadocivil;

public class Casado implements EstadoCivil {

    @Override
    public double calcularAsignacionPorConyugue() {
        return 100;
    }
}
