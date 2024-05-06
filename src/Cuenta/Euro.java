package Cuenta;
/**
 * Clase que detalla operaciones relacionadas a una moneda(euro).
 */
public class Euro implements Currency {
	/**
     * Obtiene el factor de conversión de la moneda.
     * 
     * @return El factor de conversión del euro.
     */
	@Override
	public double factorConversion() {

		return 0.00099;
	}
	/**
     * Convierte un monto de la moneda actual a euro.
     * 
     * @param monto Es el monto de dinero a convertir.
     * @return El monto convertido a euro.
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
		
		return "€";
	}

}

