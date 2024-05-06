package Cuenta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para la clase BankAccount que verifica los métodos depositar
 * y retirar.
 */
class BankAccountTest {
	/**
	 * Prueba el método depositar .
	 */
	@Test
	void testDepositar() {
		// Creamos una cuenta bancaria para la prueba
		BankAccount account = new BankAccount();
		// Realizamos un depósito en la cuenta
		account.depositar(100.0);
		// Verificamos que el saldo final sea el esperado después del retiro
		assertEquals(100.0, account.balanceFinal(), 0.01);
	}

	/**
	 * Prueba el método retirar teniendo el saldo suficiente .
	 */
	@Test
	public void testRetirarSaldoSuficiente() {
		// Creamos una cuenta bancaria con saldo suficiente para la prueba
		BankAccount account = new BankAccount();

		account.depositar(200.0);
		// Realizamos un retiro de la cuenta/
		account.retirar(100.0);
		// Verificamos que el saldo final sea el esperado después del retiro
		assertEquals(100.0, account.balanceFinal(), 0.01);
	}

	/**
	 * Prueba el método retirar teniendo el saldo insuficiente .
	 */
	@Test
	public void testRetirarSaldoInsuficiente() {
		// Creamos una cuenta bancaria con saldo insuficiente para la prueba
		BankAccount account = new BankAccount();
		account.depositar(50.0);
		// Intentamos realizar un retiro mayor que el saldo disponible en la cuenta
		account.retirar(100.0);
		// Verificamos que el saldo final
		assertEquals(50.0, account.balanceFinal(), 0.01);

	}
}
