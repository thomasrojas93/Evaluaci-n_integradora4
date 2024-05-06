package Cuenta;

/**
 * 
 * Esta interfaz implementa operaciones bancarias básicas como depositar,
 * retirar y consultar saldo.
 *
 */
public interface Transactions {

	/**
	 * Deposita un monto en la cuenta.
	 * 
	 * @param monto Es el monto a depositar.
	 */
	void depositar(double monto);

	/**
	 * Retira un monto de dinero en la cuenta.
	 * 
	 * @param monto Es el monto a retirar.
	 */
	void retirar(double monto);

	/**
	 * Obtiene el saldo actual de la cuenta.
	 * 
	 */
	double balanceFinal();
}
