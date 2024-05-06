package Cuenta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para la clase Euro.
 */
class DolarTest {

	/**
	 * Prueba el método factor de conversión.
	 */
	@Test
	public void testFactorConversion() {
		Dolar dolar = new Dolar();

		// Probamos el método factorConversion
		double factor = dolar.factorConversion();

		// Verificamos que el factor de conversión sea el esperado
		assertEquals(0.0011, factor, 0.0);
	}

	/**
	 * Prueba el método convertir de la clase Dolar.
	 */
	@Test
	public void testConvertir() {
		Dolar dolar = new Dolar();

		// Definimos un monto de prueba
		double monto = 100.0;

		// Probamos el método convertir
		double montoConvertido = dolar.convertir(monto);

		// Verificamos que el monto convertido sea el esperado
		assertEquals(0.0011 * monto, montoConvertido, 0.0);
	}
	/**
	 * Prueba el método para obtener el simbolo de la moneda.
	 */
	@Test
	public void testGetSimbolo() {
		Dolar dolar = new Dolar();

		// Probamos el método getSimbolo
		String simbolo = dolar.getSimbolo();

		// Verificamos que el símbolo sea el esperado
		assertEquals("$USD", simbolo);
	}
}

