package Cuenta;

import java.util.Scanner;

/**
 * Esta clase representa el menú principal que permite al usuario realizar
 * diversas acciones.
 */
public class MainMenu implements MenuInterface {

	Scanner scanner = new Scanner(System.in);
	// Instancia de la cuenta bancaria del usuario. 
	BankAccount cuenta1 = new BankAccount();
	// Instancia de la moneda Dólar. 
	Dolar dolar = new Dolar();
	// Instancia de la moneda Euro. 
	Euro euro = new Euro();
	// Opción seleccionada por el usuario. 
	int opcion;

	/**
	 * Muestra el menú principal y permite al usuario seleccionar una opción.
	 */
	@Override
	public void mostrar() {

		do {
			mostrarMenuPrincipal();
			opcion = scanner.nextInt();
			manejarOpcion(opcion);
		} while (opcion != 6);

		scanner.close();
	}

	/**
	 * Muestra el menú principal en la consola.
	 */
	@Override
	public void mostrarMenuPrincipal() {
		System.out.println("------------------------------");
		System.out.println("MENÚ PRINCIPAL:");
		System.out.println("1.CONSULTAR SALDO DISPONIBLE");
		System.out.println("2.DEPOSITAR DINERO");
		System.out.println("3.RETIRAR DINERO");
		System.out.println("4.CONVERSIÓN DE SALDO A DÓLARES");
		System.out.println("5.CONVERSIÓN DE SALDO A EUROS");
		System.out.println("6.CERRAR SESIÓN");
		System.out.println("------------------------------");
	}

	/**
	 * Maneja la opción seleccionada por el usuario.
	 * 
	 * @param opcion La opción seleccionada por el usuario.
	 */
	@Override
	public void manejarOpcion(int opcion) {
		switch (opcion) {
		case 1:
			consultarSaldo();
			break;
		case 2:
			depositarDinero();
			break;
		case 3:
			retirarDinero();
			break;
		case 4:
			convertirADolares();
			break;
		case 5:
			convertirAEuros();
			break;
		case 6:
			System.out.println("Cerrando sesión.");
			System.exit(0);
			break;
		default:
			System.out.println("Por favor, ingrese una opcion válida");
			break;
		}
	}

	/**
	 * Muestra el saldo actual de la cuenta bancaria del usuario.
	 */
	private void consultarSaldo() {
		System.out.println("Su saldo actual es de " + cuenta1.balanceFinal() + " pesos");
	}

	/**
	 * Permite al usuario depositar dinero en su cuenta bancaria.
	 */
	private void depositarDinero() {

		System.out.println("Ingrese monto a depositar");
		double monto = scanner.nextDouble();
		cuenta1.depositar(monto);
		System.out.println("Depósito exitoso, su nuevo saldo es de " + cuenta1.balanceFinal() + " pesos");
	}

	/**
	 * Permite al usuario retirar dinero de su cuenta bancaria.
	 */
	private void retirarDinero() {
		System.out.println("Ingrese monto a retirar");
		double monto = scanner.nextDouble();
		cuenta1.retirar(monto);

	}

	/**
	 * Convierte el saldo actual a dólares y muestra el resultado.
	 */
	private void convertirADolares() {
		System.out.println(
				"Su saldo en Dólares es de " + dolar.getSimbolo() + " " + dolar.convertir(cuenta1.balanceFinal()));
	}

	/**
	 * Convierte el saldo actual a euros y muestra el resultado.
	 */
	private void convertirAEuros() {
		System.out
				.println("Su saldo en Euros es de " + euro.getSimbolo() + " " + euro.convertir(cuenta1.balanceFinal()));
	}

}