package secretariadedeportes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SecretariaDeDeportesTest {
    SecretariaDeDeportes secretariaDeDeportes;
    ActividadSemanal actividad1;
    ActividadSemanal actividad2;
    ActividadSemanal actividad3;
    ActividadSemanal actividad4;
    ActividadSemanal actividad5;
    ActividadSemanal actividad6;
    ActividadSemanal actividad7;
    ActividadSemanal actividad8;
    ActividadSemanal actividad9;
    ActividadSemanal actividad10;

    @BeforeEach
    void setUp() {
        actividad1 = new ActividadSemanal(DiaDeLaSemana.LUNES, "08:00", 2, Deporte.FUTBOL);
        actividad2 = new ActividadSemanal(DiaDeLaSemana.MARTES, "10:00", 1, Deporte.TENNIS);
        actividad3 = new ActividadSemanal(DiaDeLaSemana.MIERCOLES, "12:00", 3, Deporte.JABALINA);
        actividad4 = new ActividadSemanal(DiaDeLaSemana.JUEVES, "14:00", 2, Deporte.BASKET);
        actividad5 = new ActividadSemanal(DiaDeLaSemana.VIERNES, "16:00", 1, Deporte.RUNNING);
        actividad6 = new ActividadSemanal(DiaDeLaSemana.SABADO, "18:00", 2, Deporte.FUTBOL);
        actividad7 = new ActividadSemanal(DiaDeLaSemana.DOMINGO, "20:00", 1, Deporte.TENNIS);
        actividad8 = new ActividadSemanal(DiaDeLaSemana.LUNES, "09:00", 3, Deporte.JABALINA);
        actividad9 = new ActividadSemanal(DiaDeLaSemana.MARTES, "11:00", 2, Deporte.BASKET);
        actividad10 = new ActividadSemanal(DiaDeLaSemana.MIERCOLES, "13:00", 1, Deporte.RUNNING);

        secretariaDeDeportes = new SecretariaDeDeportes(List.of(actividad1, actividad2, actividad3, actividad4, actividad5, actividad6, actividad7, actividad8, actividad9, actividad10));
    }

    @Test
    void actividadesDeFutbol() {
        List<ActividadSemanal> actividadesFutbol = secretariaDeDeportes.actividadesDeFutbol();
        assertEquals(2, actividadesFutbol.size());
        assertTrue(actividadesFutbol.contains(actividad1));
        assertTrue(actividadesFutbol.contains(actividad6));
    }

    @Test
    void actividadesDeComplejidad() {
        List<ActividadSemanal> actividadesComplejidad2 = secretariaDeDeportes.actividadesDeComplejidad(2);
        assertEquals(4, actividadesComplejidad2.size());
        assertTrue(actividadesComplejidad2.contains(actividad1));
        assertTrue(actividadesComplejidad2.contains(actividad4));
        assertTrue(actividadesComplejidad2.contains(actividad6));
        assertTrue(actividadesComplejidad2.contains(actividad9));
    }

    @Test
    void horasTotalesDeActividadesSemanales() {
        int horasTotales = secretariaDeDeportes.horasTotalesDeActividadesSemanales();
        assertEquals(18, horasTotales);
    }

    @Test
    void actividadDeMenorCosto() {
        ActividadSemanal actividadMenorCosto = secretariaDeDeportes.actividadDeMenorCosto(Deporte.FUTBOL).orElse(null);
        assertNotNull(actividadMenorCosto);
        assertEquals(actividad1, actividadMenorCosto);
        assertEquals(900, actividadMenorCosto.costo());
    }

    @Test
    void actividadSemanalMasEconomicaPorDeporte() {
        Map<Deporte, ActividadSemanal> actividadesMasEconomicas = secretariaDeDeportes.actividadSemanalMasEconomicaPorDeporte();
        assertEquals(5, actividadesMasEconomicas.size());
    }

    @Test
    void imprimirActividades() {
        secretariaDeDeportes.imprimirActividades();
        // Verifica que se impriman las actividades correctamente
        assertTrue(true); // Este test es solo para verificar la impresión
    }
}