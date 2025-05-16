package cultivos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParcelaTest {
    Parcela parcela;
    Cultivo soja;
    Cultivo trigo;

    @BeforeEach
    void setUp() {
        soja = new Soja();
        trigo = new Trigo();
        parcela = new Parcela(soja, trigo, soja, trigo);
    }

    @Test
    void calcularGananciasAnuales() {
        double expectedGanancias = soja.calcularGananciasAnuales() / 4 + trigo.calcularGananciasAnuales() / 4  +
                soja.calcularGananciasAnuales() / 4 + trigo.calcularGananciasAnuales() / 4 ;
        double actualGanancias = parcela.calcularGananciasAnuales();
        assertEquals(expectedGanancias, actualGanancias);
    }
}