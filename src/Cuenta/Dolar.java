package Cuenta;

/**
 * Clase que detalla operaciones relacionadas a una moneda(dólar).
 */
public class Dolar implements Currency {
	/**
	 * Obtiene el factor de conversión de la moneda.
	 * 
	 * @return El factor de conversión del dólar.
	 */

	@Override
	public double factorConversion() {

		return 0.0011;
	}

	/**
	 * Convierte un monto de la moneda actual a dólares.
	 * 
	 * @param monto Es el monto de dinero a convertir.
	 * @return El monto convertido a dólares.
	 */
	@Override
	public double convertir(double monto) {

		return factorConversion() * monto;
	}

	/**
	 * Obtiene el símbolo de la moneda.
	 * 
	 * @return El símbolo de la moneda.
	 */
	@Override
	public String getSimbolo() {

		return "$USD";
	}

}