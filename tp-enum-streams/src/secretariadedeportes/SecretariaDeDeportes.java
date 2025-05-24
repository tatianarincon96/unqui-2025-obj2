package secretariadedeportes;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecretariaDeDeportes {
    private List<ActividadSemanal> actividades;

    public SecretariaDeDeportes(List<ActividadSemanal> actividades) {
        this.actividades = actividades;
    }

    // 1. Todas las actividades de FUTBOL
    public List<ActividadSemanal> actividadesDeFutbol() {
        return actividades.stream()
                .filter(a -> a.getDeporte() == Deporte.FUTBOL)
                .collect(Collectors.toList());
    }

    // 2. Actividades de complejidad recibida por param
    public List<ActividadSemanal> actividadesDeComplejidad(int complejidad) {
        return actividades.stream()
                .filter(a -> a.getDeporte().getComplejidad() == complejidad)
                .collect(Collectors.toList());
    }

    // 3. Cantidad de horas totales de actividades semanales que ofrece el municipio
    public int horasTotalesDeActividadesSemanales() {
        return actividades.stream()
                .mapToInt(ActividadSemanal::getDuracion)
                .sum();
    }

    // 4. Actividad semanal de menor costo para un deporte de interés recibido por param
    public Optional<ActividadSemanal> actividadDeMenorCosto(Deporte deporte) {
        return actividades.stream()
                .filter(a -> a.getDeporte() == deporte)
                .min(Comparator.comparingDouble(ActividadSemanal::costo));
    }

    // 5. Para cada deporte la actividad semanal más económica
    public Map<Deporte, ActividadSemanal> actividadSemanalMasEconomicaPorDeporte() {
        return actividades.stream()
                .collect(Collectors.groupingBy(
                        ActividadSemanal::getDeporte,
                        Collectors.collectingAndThen(
                                Collectors.minBy(Comparator.comparingDouble(ActividadSemanal::costo)),
                                Optional::get
                        )
                ));
    }

    public void imprimirActividades() {
        actividades.forEach(System.out::println);
    }
}
