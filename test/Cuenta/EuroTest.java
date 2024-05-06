package Cuenta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para la clase Euro.
 */
class EuroTest {
	/**
	 * Prueba el método convertir de la clase Euro.
	 */
	@Test
	void testConvertir() {
		// Creamos una instancia de euro.

		Euro euro = new Euro();
		// Verificamos que el método convertir convierta correctamente el monto dado

		assertEquals(1.98, euro.convertir(2000));

	}

}
