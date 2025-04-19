package supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad arroz;
	private ProductoPrimeraNecesidad leche;

	@BeforeEach
	public void setUp() {
		arroz = new ProductoPrimeraNecesidad("Arroz", 10d, true, 0.08);
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 0.11);
	}

	@Test
	public void testCalcularPrecioArroz() {
		assertEquals(9.2, arroz.getPrecio());
	}

	@Test
	public void testCalcularPrecioLeche() {
		assertEquals(7.12, leche.getPrecio());
	}
}
