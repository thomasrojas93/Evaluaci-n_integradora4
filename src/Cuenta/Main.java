package Cuenta;

import java.util.Scanner;

/**
 * Clase principal que ejecuta la aplicación Alke Wallet y gestiona el inicio de
 * sesión del usuario.
 */
public class Main {
	/**
	 * Método que inicia la aplicación Alke Wallet y gestiona el inicio de sesión .
	 * 
	 * @param args Los argumentos de la línea de comandos .
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// creacion de menú
		MainMenu menu1 = new MainMenu();
		// creación de usuario
		User newUser = new User("Paul", "1234");

		System.out.print("Ingrese su nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese su contraseña:");
		String password = scanner.nextLine();

		if (UserLogin.validarIdentidad(newUser, nombre, password)) {

			System.out.println("¡Bienvenido a Alke Wallet!");
			menu1.mostrar();

		} else {

			System.out.println("Lo siento, usted no está autorizado para acceder.");
		}

		scanner.close();
	}
}
