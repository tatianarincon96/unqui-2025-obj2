package secretariadedeportes;

import java.util.Objects;

public class ActividadSemanal {
    private DiaDeLaSemana diaDeLaSemana;
    private String horaInicio;
    private int duracion;
    private Deporte deporte;

    public ActividadSemanal(DiaDeLaSemana diaDeLaSemana, String horaInicio, int duracion, Deporte deporte) {
        this.diaDeLaSemana = diaDeLaSemana;
        this.horaInicio = horaInicio;
        this.duracion = duracion;
        this.deporte = deporte;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public int getDuracion() {
        return duracion;
    }

    public double costo() {
        double costo = switch (this.diaDeLaSemana) {
            case LUNES,
                 MARTES,
                 MIERCOLES -> 500;
            case JUEVES,
                 VIERNES,
                 SABADO,
                 DOMINGO -> 1000;
        };
        costo += this.deporte.getComplejidad() * 200;
        return costo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActividadSemanal that = (ActividadSemanal) o;
        return duracion == that.duracion &&
                diaDeLaSemana == that.diaDeLaSemana &&
                Objects.equals(horaInicio, that.horaInicio) &&
                deporte == that.deporte;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diaDeLaSemana, horaInicio, duracion, deporte);
    }

    @Override
    public String toString() {
        return "Deporte: " + deporte +
                ". Dia: " + diaDeLaSemana +
                " A LAS: " + horaInicio +
                " . Duración: " + duracion + " hora(s).";
    }
}
