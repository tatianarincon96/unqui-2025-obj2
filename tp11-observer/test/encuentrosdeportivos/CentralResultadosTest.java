package encuentrosdeportivos;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class CentralResultadosTest {
    @Test
    public void testServidorRecibeSoloDeporteSuscripto() {
        CentralResultados central = new CentralResultados();
        Servidor servidor = new Servidor(Arrays.asList("Futbol"));
        central.suscribir(servidor);

        Partido partido1 = new Partido("2-1", Arrays.asList("EquipoA", "EquipoB"), "Futbol");
        Partido partido2 = new Partido("3-0", Arrays.asList("EquipoC", "EquipoD"), "Tenis");

        central.agregarPartido(partido1);
        central.agregarPartido(partido2);

        assertEquals(1, servidor.getPartidosNotificados().size());
        assertEquals("Futbol", servidor.getPartidosNotificados().get(0).getDeporte());
    }

    @Test
    public void testAplicacionMovilRecibePorDeporteYContrincante() {
        CentralResultados central = new CentralResultados();
        AplicacionMovil app = new AplicacionMovil(Arrays.asList("Tenis"), Arrays.asList("EquipoA"));
        central.suscribir(app);

        Partido partido1 = new Partido("2-1", Arrays.asList("EquipoA", "EquipoB"), "Futbol");
        Partido partido2 = new Partido("3-0", Arrays.asList("EquipoC", "EquipoD"), "Tenis");

        central.agregarPartido(partido1);
        central.agregarPartido(partido2);

        assertEquals(2, app.getPartidosNotificados().size());
    }
}