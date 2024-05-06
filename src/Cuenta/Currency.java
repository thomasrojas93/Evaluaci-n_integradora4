package Cuenta;

/**
 * interfaz que define operaciones relacionadas a una moneda
 */
public interface Currency {
	/**
	 * Obtiene el símbolo de la moneda.
	 * 
	 * @return El símbolo de la moneda.
	 */
	public String getSimbolo();

	
	/**
     * Obtiene el factor de conversión de la moneda.
     * 
     * @return El factor de conversión de la moneda.
     */
	double factorConversion();

	/**
     * Convierte un monto de la moneda actual a otra moneda.
     * 
     * @param monto Es el monto de dinero a convertir.
     * @return El monto convertido a la nueva moneda.
     */
	double convertir(double monto);
}
