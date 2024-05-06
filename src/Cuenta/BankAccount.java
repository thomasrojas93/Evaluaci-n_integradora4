package Cuenta;
/*
 * 
 * Esta clase representa una cuenta bancaria que implementa operaciones básicas como depositar, retirar y consultar saldo.
 *
 */
 
 
public class BankAccount implements Transactions {
	private double saldoFinal;

	 /**
     * Deposita un monto en la cuenta.
     * 
     * @param monto  Es el monto a depositar.
     */
	@Override
	public void depositar(double monto) {
		saldoFinal += monto;

	}
	/**
     * Retira un monto de dinero en la cuenta.
     * 
     * @param monto  Es el monto a retirar.
     */
	@Override
	public void retirar(double monto) {
		if(saldoFinal>monto) {
			saldoFinal-=monto;
			System.out.println("Retiro exitoso, su nuevo saldo es de " + saldoFinal + " pesos");
		}else {
		System.out.println(" Saldo insuficiente, por favor, ingrese otra cantidad ");}
	}

	/**
	 * Obtiene el saldo actual de la cuenta.
	 * 
	 * @return saldo actual de la cuenta.
	 */
	@Override
	public double balanceFinal() {
		return saldoFinal;

	}

}


