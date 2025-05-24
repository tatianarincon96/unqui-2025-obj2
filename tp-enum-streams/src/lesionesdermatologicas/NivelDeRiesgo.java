package lesionesdermatologicas;

public enum NivelDeRiesgo {
    ALTO("Riesgo Alto"),
    MEDIO("Riesgo medio"),
    BAJO("Riesgo bajo");

    private final String descripcion;

    NivelDeRiesgo(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}