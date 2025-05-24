package lesionesdermatologicas;

public enum Color {
    Rojo("Lesión reciente", NivelDeRiesgo.ALTO),
    Gris("Lesión en evolución", NivelDeRiesgo.MEDIO),
    Amarillo("Lesión avanzada", NivelDeRiesgo.MEDIO),
    Miel("Lesión cicatrizando", NivelDeRiesgo.BAJO);

    private final String descripcion;
    private final NivelDeRiesgo nivelDeRiesgo;

    Color(String descripcion, NivelDeRiesgo nivelDeRiesgo) {
        this.descripcion = descripcion;
        this.nivelDeRiesgo = nivelDeRiesgo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public NivelDeRiesgo getNivelDeRiesgo() {
        return nivelDeRiesgo;
    }

    public Color proximo() {
        return values()[(this.ordinal() + 1) % values().length];
    }

    @Override
    public String toString() {
        return name() + " (" + descripcion + ", Riesgo: " + nivelDeRiesgo.getDescripcion() + ")";
    }
}