package empleados.estadocivil;

public class EstadoCivilFactory {
    public static EstadoCivil obtenerEstadoCivil(String estadoCivil) {
        switch (estadoCivil.toUpperCase()) {
            case "CASADO":
                return new Casado();
            case "SOLTERO":
                return new Soltero();
            default:
                throw new IllegalArgumentException("Estado civil no soportado: " + estadoCivil);
        }
    }

}
